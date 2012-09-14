Ext.ffc.WaitOfficeChildPanel = Ext.extend(Ext.grid.GridPanel, {  
	auditType : null,
	pageInfoLabel : null,
	pageObject : {pageSize:10},
	gridCheckSele : null,
	storeDef :  null,
	view : null,
	loadData : function(pstartIndex,ppageSize){
			var gridPanel = this;
			Ext.Ajax.request({
				method: "post",
				params: { auditType: gridPanel.auditType.auditTypeId,flowInforId:gridPanel.auditType.auditFlowId,startIndex:pstartIndex,pageSize:ppageSize},
				url: PATH + "/manage/audit/auditInforMangeAction.do?ffc=findWaitAuditBusinessInfor",
				success: function(response){
					//Ext.Msg.alert("消息", response.responseText);
					//alert(response.responseText);
					eval("var pageInfor=" + response.responseText);
					var dataArray = [];
					var mappingArray = [];
					for(var i = 0 ;i < pageInfor.items.length;i++){
						if(i == 0){
							var num = 0;
							for(var j in pageInfor.items[0].properties){
								mappingArray.push({name: j,mapping:num++,type:'string'});
							}
						}
						var arr = [];
						for(var tt in pageInfor.items[i].properties){
							arr.push(pageInfor.items[i].properties[tt]);
						}
						dataArray.push(arr);
					}
					//alert(Ext.encode(dataArray));
					gridPanel.storeDef = new Ext.data.Store({
						proxy: new Ext.data.MemoryProxy(dataArray),
						//proxy: new Ext.data.HttpProxy({url:PATH + '/manage/audit/auditInforMangeAction.do?ffc=findWaitAuditBusinessInfor'}),//调用的动作 
						reader: new Ext.data.ArrayReader({}, mappingArray)
					});
					
					var pcolumns = [];
						//gridCheckSele = new Ext.grid.CheckboxSelectionModel();
						pcolumns.push(new Ext.grid.RowNumberer());
						pcolumns.push(gridPanel.gridCheckSele);
						pcolumns = pcolumns.concat(pageInfor.headers);
						pcolumns.push(
							{"dataIndex":"auditInfor","header":"查看详细","hidden":false,"sortable":false,"width":80,
								"renderer":function(value, cellmeta, record, rowIndex, columnIndex, store){
												var str = "<a href=\"javascript:loadBusinessInfor(\'" + record.get('url') + "\',\'" + record.get('id') + "\');\">查看</a>";
												return str;
											}
							}
						);
						pcolumns.push(
							{"dataIndex":"auditInfor","header":"审批信息","hidden":false,"sortable":false,"width":80,
								"renderer":function(value, cellmeta, record, rowIndex, columnIndex, store) {
												var str = "<a href=\"javascript:onAuditInfor(this,\'" + record.get('id') + "\');\">查看</a>";
												return str;
											}
							}
						);
						pcolumns.push(
							{"dataIndex":"auditInfor","header":"委托人","hidden":false,"sortable":false,"width":80,
								"renderer":function(value, cellmeta, record, rowIndex, columnIndex, store) {
												var v = record.get("trustPersonName");
												var n = (v == null ? "" : v);
												var str = "<span style=\"color:red\">" + n + "</a>";
												return str;
											}
							}
						);
					try{
						gridPanel.reconfigure(gridPanel.storeDef,new Ext.grid.ColumnModel(pcolumns));
						gridPanel.storeDef.load();
					}catch(e){
					    //alert("ssss:" + e);
					}
					gridPanel.pageObject = pageInfor;
					gridPanel.pageInfoLabel['setInfor'](gridPanel.pageObject);
				}
		   });	

	},
	constructor : function(_cfg) {
		if(_cfg == null) {
			_cfg = {};
		}
		Ext.apply(this, _cfg);
		this.gridCheckSele = new Ext.grid.CheckboxSelectionModel();
		this.storeDef =  new Ext.data.Store();
		this.view = new Ext.grid.GridView();
		this.pageInfoLabel = new Ext.form.Label();
		this.pageInfoLabel['setInfor'] = function(pageObject){
			this.setText("共[" + pageObject.totalCount + "]条记录  当前页: " + pageObject.currentPage + "/" + pageObject.pageCount);
		}
		this.loadData(0,15);
		Ext.ffc.WaitOfficeChildPanel.superclass.constructor.call(this, {
			cm : new Ext.grid.ColumnModel([]),
			store : this.storeDef,
			ds : this.storeDef,
			view : this.view,
			sm:this.gridCheckSele,
			bbar: new Ext.Toolbar({
					items: [{
						text: '首页',
						listeners : {
							'click' : function() {
								var gridP = this.ownerCt.ownerCt;
								gridP.loadData(0,15);
							}
						}
					},{
						text: '上一页',
						listeners : {
							'click' : function() {
								var gridP = this.ownerCt.ownerCt;
								gridP.loadData(gridP.pageObject.previousIndex,gridP.pageObject.pageSize);
							}
						}
					},{
						text: '下一页',
						listeners : {
							'click' : function() {
								var gridP = this.ownerCt.ownerCt;
								gridP.loadData(gridP.pageObject.nextIndex,gridP.pageObject.pageSize);
							}
						}
					},{
						text: '末页',
						listeners : {
							'click' : function() {
								var gridP = this.ownerCt.ownerCt;
								gridP.loadData(gridP.pageObject.indexes[gridP.pageObject.indexes.length - 1],gridP.pageObject.pageSize);
							}
						}
					},'->',this.pageInfoLabel]
				})
		});
	}
});  


Ext.ffc.AuditOfficeForm = Ext.extend(Ext.FormPanel, {
        labelWidth: 75, 
        frame:true,
        bodyStyle:'padding:5px 5px 0',
        width: 850,
        defaults: {width: 740},
        defaultType: 'textfield',
        buttons: [{
            text: '审批通过',
		    handler:function(){
				var auditForm = this.ownerCt.ownerCt;
				var auditTypes = auditForm.auditTypes;
				var grid = auditForm.ownerCt.grids[0];
				var gridCheckSele = grid.gridCheckSele;

				var auditType = grid.auditType;
				var arr = gridCheckSele.getSelections();
				if(arr.length == 0){
					Ext.MessageBox.alert('系统提示', '请选择要审批的记录!', function(){});
				    return false;
				}
				var msg = auditForm.findByType("textfield")[0].getEl().dom.value;
				if(msg == ''){
					msg = "同意";
				}
				var pbussinessIds = [];
				for(var i = 0 ;i < arr.length;i++){
				    pbussinessIds.push(arr[i].get("id"));
				}
				
			    Ext.MessageBox.confirm('系统提示', '请确认是否要要将所选记录,审批通过!', function(btn){
					if(btn != 'yes'){return ;}
					auditForm.executeAudit(grid,auditForm,pbussinessIds,auditType.auditTypeId,auditType.auditFlowId,msg,1);
				});
			}
        },{
            text: '审批退回',
		    handler:function(){
				var auditForm = this.ownerCt.ownerCt;
				var auditTypes = auditForm.auditTypes;
				var grid = auditForm.ownerCt.grids[0];
				var gridCheckSele = grid.gridCheckSele;

				var auditType = grid.auditType;
				var arr = gridCheckSele.getSelections();
				if(arr.length == 0){
					Ext.MessageBox.alert('系统提示', '请选择要审批的记录!', function(){});
				    return false;
				}
				var msg = auditForm.findByType("textfield")[0].getEl().dom.value;
				if(msg == ''){
					Ext.MessageBox.alert('系统提示', '请填写审批意见!', function(){});
				    return false;
				}
				var pbussinessIds = [];
				for(var i = 0 ;i < arr.length;i++){
				    pbussinessIds.push(arr[i].get("id"));
				}
				
				Ext.MessageBox.confirm('系统提示', '请确认是否要要将所选记录,审批退回!', function(btn){
					if(btn != 'yes'){return ;}
					auditForm.executeAudit(grid,auditForm,pbussinessIds,auditType.auditTypeId,auditType.auditFlowId,msg,0);
				});
			}
        }],
		auditTypes : null,
		executeAudit : function(grid,auditForm,pbussinessIds,auditTypeId,auditFlowId,pcomment,popType){
			Ext.Ajax.request({
					method: "post",
					params: { bussinessIds:pbussinessIds,auditType: auditTypeId,auditInforId:auditFlowId,comment:pcomment,opType:popType},
					url: PATH + "/manage/audit/auditInforMangeAction.do?ffc=executeAudit",
					success: function(response){
						Ext.MessageBox.alert('系统提示', '审批成功!', function(){
							grid.loadData(0,15);
							auditForm.findByType("textfield")[0].getEl().dom.value = '';
						});
						
					}
			});
		},
		constructor : function(_cfg) {
			if(_cfg == null) {
				_cfg = {};
			}
			Ext.apply(this, _cfg);
			this.items = new Ext.form.TextArea({
			   fieldLabel: '审批意见',
			   name:'auditMessage',
			   width: 800
			});
			Ext.ffc.AuditOfficeForm.superclass.constructor.call(this, {
				//region: 'south',
                split: true,
                height: 100,
                minSize: 100,
                maxSize: 200,
                collapsible: true,
                margins: '-5 5 5 5',
                items : this.items
			})
		}
    });


Ext.ffc.WaitOfficeWindow = Ext.extend(Ext.Window, {  
	auditTypes : null,
	waitWorks : null,
	auditTypeItems : null,
	grids : null,
	itemsDef : null,
	auditOfficeForm : null,
	loadData : function(){
	    for(var i = 0;i < this.grids.length ; i++){
			this.grids[i].loadData(0,15);
	    }
	},
	constructor : function(_cfg) {
		if(_cfg == null) {
			_cfg = {};
		}
		Ext.apply(this, _cfg);
		this.auditTypeItems = [];
		this.grids = [];
		this.itemsDef = [];
		if(this.auditTypes && this.auditTypes.length > 0){
			for(var i = 0; i < this.auditTypes.length ; i++){
				var it = new Ext.ffc.WaitOfficeChildPanel({
									auditType : this.auditTypes[i],
									height:300
								});
				this.grids.push(it);
				this.auditTypeItems.push(
					{
						id : this.auditTypes[i].auditFlowId,
						layout : 'fit',
						title : this.auditTypes[i].auditFlowName,
						items : it
					}
				);
			}
		}
		
		if(this.auditTypeItems.length == 0) {
			var template = new Ext.Template(
			      '<font size="3">&nbsp;您没有待办工作!</font>'
			)
			this.auditTypeItems.push(template);
		}
		
		if(this.auditTypes && this.auditTypes.length > 0){
			this.auditOfficeForm =  new Ext.ffc.AuditOfficeForm({auditTypes:this.auditTypes});
			this.auditTypeItems.push(this.auditOfficeForm);
		}
		
		Ext.ffc.WaitOfficeWindow.superclass.constructor.call(this, {
			constrainHeader : true,
			maximizable :true,
			width : Ext.getBody().getWidth() - 100,
			height : 500,
			title :  '待办工作',
			//layout :  'border',
			//closeAction:'hide',
			items : this.auditTypeItems
		});
	}
});  
