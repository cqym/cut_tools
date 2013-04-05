Ext.ffc.ForumMainEditWindow = Ext.extend(Ext.Window, {
		loadDataById:function(_id){
			Ext.Ajax.request({
				url: PATH + '/manage/forum/ForumAction.do',
				params: {m:"getFroumById",id:_id},
				success: function(response){
					eval("var formObj=" + response.responseText);
					var params = [];
					for(var i in formObj){
						if(!formObj[i] || !formObj[i].length){
							params.push({name:i,mapping:i});
						}
					}
					var RecordClum = Ext.data.Record.create(params);
					var recordParams = {};
					Ext.apply(recordParams,formObj);
					var myNewRecord = new RecordClum(recordParams);
					this.theForm.getForm().loadRecord(myNewRecord);
				},scope:this
			});
		},
		constructor : function(_cfg) {
			if(_cfg == null) {
				_cfg = {};
			}
			Ext.apply(this, _cfg);
			
			this.theForm= new Ext.FormPanel({
				frame:true,
				items: [
					{xtype:'textfield',fieldLabel: '待处理单号/产品',name: 'title',anchor:'90%',allowBlank:false},
					{   fieldLabel: '信息内容',
					    xtype: 'htmleditor',
		                name: 'content',
		                allowBlank:false
					},
					{xtype:'datefield',fieldLabel: '要求进度',name: 'processDate',anchor:'40%',format:'Y-m-d',allowBlank:false},
					{xtype:'textfield',fieldLabel: '接收人',name: 'acceptUserName',anchor:'40%',allowBlank:false},
					{xtype:'textfield',fieldLabel: '备注',name: 'memo',anchor:'90%'},
				    {xtype: 'hidden',name:'id'}
				]
			}); 
			if(this._id){
				this.loadDataById(this._id);
			}
			Ext.ffc.ForumMainEditWindow.superclass.constructor.call(this, {
				layout:'fit',
				width:700,
				height:500,
				items:this.theForm,
				buttons: [{
		            text: '保存',
				    handler:function(){
						var form = this.theForm.getForm();
						if(!form.isValid()){return;};
						var action = 'addTheme';
						if(form.getValues().id && form.getValues().id.length > 1){
							action = "update";
						}
						Ext.Ajax.request({
							url: PATH + '/manage/forum/ForumAction.do',
							params: {m:action,forum:Ext.encode(form.getValues())},
							success: function(response){
								if(response.responseText == 'true'){
									Ext.Msg.show({title : '系统提示', msg : "保存成功！", buttons : Ext.Msg.OK, width : 200 });
									this.close();
								}else{
								    Ext.Msg.show({title : '系统提示', msg : response.responseText, buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
								}
							},scope:this
						});
					},scope:this
				},{
		            text: '关闭',
				    handler:function(){
                        this.close();
					},scope:this
				}]
			});
		}
});

Ext.ffc.ForumMainGrid = Ext.extend(Ext.grid.GridPanel, {
	constructor : function(_cfg) {
			if(_cfg == null) {
				_cfg = {};
			}
			Ext.apply(this, _cfg);
			this.forumStore = new Ext.data.Store({
					     remoteSort : true,
					     autoLoad:true,
						 proxy: new Ext.data.HttpProxy({url:PATH + '/manage/forum/ForumAction.do?m=forumThemeList&forumType=0&limit=20'}), 
						 reader: new Ext.data.JsonReader({
						 root: 'items',  
						 totalProperty :'totalCount'
					}, 
					['id','title','userId','userName','editDate','status','parentId','forumType','content',"acceptUserName","memo","processDate"]
				 )
			});
			this.expander = new Ext.ux.grid.RowExpander({
					tpl : new Ext.Template(
						'<div>{content}</div>'
					)
			});
			Ext.ffc.ForumMainGrid.superclass.constructor.call(this, {
							ds : this.forumStore ,
							store: this.forumStore ,
							loadMask: true,
							plugins: this.expander,
							tbar:[{
								iconCls : 'icon-add',
							    text:'新建主题',
								listeners : {
								'click' : function() {
									var _this = this;
									new Ext.ffc.ForumMainEditWindow({
									    listeners : {
										    'close':function(){
											    _this.getStore().reload();
											}
										}
									}).show();
								},scope:this
							   }
							  },{xtype:'tbseparator'},{
								iconCls : 'icon-modify',
							    text:'修改主题',
								listeners : {
								'click' : function() {
									var _this = this;
									if(this.getSelectionModel().getSelections().length == 0){
									    Ext.Msg.show({title : '系统提示', msg : "请选择一个主题进行修改！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return ;
									}
									var data = this.getSelectionModel().getSelections()[0];
									if(data.data.userId != LoginInfor.user.id){
   									    Ext.Msg.show({title : '系统提示', msg : "只有发起人才可以修改！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return;
									}									
									new Ext.ffc.ForumMainEditWindow({
										_id:data.id,
									    listeners : {
										    'close':function(){
											    _this.getStore().reload();
											}
										}
									}).show();
								},scope:this}
							  },{xtype:'tbseparator'},{
								iconCls : 'icon-delete',
							    text:'删除主题',
								listeners : {
								'click' : function() {
									var _this = this;
									if(this.getSelectionModel().getSelections().length == 0){
									    Ext.Msg.show({title : '系统提示', msg : "请选择一个主题进行删除！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return ;
									}
									var data = this.getSelectionModel().getSelections()[0];
									if(data.data.userId != LoginInfor.user.id){
   									    Ext.Msg.show({title : '系统提示', msg : "只有发起人才可以删除！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return;
									}
									var _id = data.id;
									Ext.MessageBox.confirm('系统提示', '请确认是否要删除当前所选中主题!', function(btn){
										if(btn != 'yes'){return ;}
												Ext.Ajax.request({
													method: "post",
													url: PATH + '/manage/forum/ForumAction.do',
													params: {m:"deleteById",id:_id},
													success: function(response){
														_this.getStore().reload();	
													}
												});
									});
								},scope:this}
							  },{xtype:'tbseparator'},{
								iconCls : 'icon-contract-end',
							    text:'终结主题',
								listeners : {
								'click' : function() {
									var _this = this;
									if(this.getSelectionModel().getSelections().length == 0){
									    Ext.Msg.show({title : '系统提示', msg : "请选择一个主题进行终结！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return ;
									}
									var data = this.getSelectionModel().getSelections()[0];
									if(data.data.userId != LoginInfor.user.id){
   									    Ext.Msg.show({title : '系统提示', msg : "只有发起人才可以终结！", buttons : Ext.Msg.OK, width : 200, icon : Ext.MessageBox.ERROR });
										return;
									}
									var _id = data.id;
									Ext.MessageBox.confirm('系统提示', '请确认是否要终结当前所选中主题!', function(btn){
										if(btn != 'yes'){return ;}
										Ext.Ajax.request({
											method: "post",
											url: PATH + '/manage/forum/ForumAction.do',
											params: {m:"endById",id:_id},
											success: function(response){
												_this.getStore().reload();	
											}
										});
									});
								},scope:this}
							  }],
						    columns:[
								 {dataIndex: 'id',hidden:true},
  								 {dataIndex: 'userId',hidden:true},
							     this.expander,
							     {header: "发起时间", width: 80,   dataIndex: 'editDate',
									 renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){
										return Ext.util.Format.date(new Date(value.time),'Y-m-d');
								 }},
								 {header: "发起人", width: 60,   dataIndex: 'userName'},
								 {header: "待处理单号/产品", width: 180,   dataIndex: 'title'},
								 //{header: "信息内容", width: 300,   dataIndex: 'content'},
								 {header: "要求进度", width: 80,   dataIndex: 'processDate',
									 renderer:function(value){
									    if(!value || !value.time){
											return '';
										}
										return Ext.util.Format.date(new Date(value.time),'Y-m-d');
								 }},
								 {header: "状态", width: 60,   dataIndex: 'status',
									 renderer:function(value){
									    if(value == 0){
											return '<span style="color:red">待处理</span>';
										}else if(value == 1){
										    return '<span style="color:green">终结</span>';
										}
										return '待处理';
								 }},
								 {header: "接收人", width: 60,   dataIndex: 'acceptUserName'},
							     {header: "备注", width: 200,   dataIndex: 'memo'}
							],
							bbar: new Ext.PagingToolbar({
								pageSize: 8,
								store: this.forumStore,
								displayInfo: true,
								displayMsg: '显示第 {0} 条到 {1} 条记录，一共 {2} 条',
								emptyMsg: "没有记录"
							})
			})
		}
	});

