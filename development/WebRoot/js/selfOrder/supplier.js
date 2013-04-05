
	var sOSupplierGrid = Ext.extend(Ext.grid.GridPanel,{
		store:null,
		constructor : function(_cfg){
			if(_cfg == null) {
				_cfg = {};
			}
			Ext.apply(this, _cfg);
			var proxy = new Ext.data.HttpProxy({url: PATH + "/selfOrder/supplierList.do"});
			var Bill = Ext.data.Record.create([
											{name: 'id', type: 'string',mapping:"id"},
											{name: 'supplierCode', type: 'string',mapping:"supplierCode"},
											{name: 'supplierName', type: 'string',mapping:"supplierName"},
											{name: 'supplierShortName' , type: 'string',mapping:"supplierShortName"},
											{name: 'contactPersonFirst', type: 'string',mapping:"contactPersonFirst"},
											{name: 'phoneFirst', type: 'string',mapping:"phoneFirst"},
											{name: 'faxFirst', type: 'string',mapping:"faxFirst"},
											{name: 'contactPersonSec' , type: 'string',mapping:"contactPersonSec"},
											{name: 'phoneSec', type: 'string',mapping:"phoneSec"},
											{name: 'faxSec', type: 'string',mapping:"faxSec"},
											{name: 'brandFirst', type: 'string',mapping:"brandFirst"},
											{name: 'brandSec', type: 'string',mapping:"brandSec"},
											{name: 'brandThird', type: 'string',mapping:"brandThird"},
											{name: 'brandFourth', type: 'string',mapping:"brandFourth"},
											{name: 'contractAddress', type: 'string',mapping:"contractAddress"},
											{name: 'postcode', type: 'string',mapping:"postcode"},
											{name: 'comAdress', type: 'string',mapping:"comAdress"},
											{name: 'bank', type: 'string',mapping:"bank"},
											{name: "accountNumber", type: "string", mapping: "accountNumber"},
											{name: 'homePage', type: 'string',mapping:"homePage"},
											{name: 'email', type: 'string',mapping:"email"},
											{name: 'ownContactPerson', type: 'string',mapping:"ownContactPerson"},
											{name: 'memo', type: 'string',mapping:"memo"}
											   ]);
			var reader = new Ext.data.JsonReader({ totalProperty: "totalProperty",root: "root"}, Bill);
			this.store = new Ext.data.Store({
				proxy: proxy,
				reader: reader
			});
			sOSupplierGrid.superclass.constructor.call(this, {
				height:500,
				store: this.store,
				columns: [
					 new Ext.grid.RowNumberer(),
					{header: "id",dataIndex: "id",width: 40,hidden:true},
					{header: "供货商编号",dataIndex:'supplierCode' ,width: 230,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "供货商名称",dataIndex:'supplierName',width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "简称",dataIndex:'supplierShortName',width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "联系人1",dataIndex:'contactPersonFirst',width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "电话1",dataIndex:'phoneFirst',width: 100,sortable:true},
					{header: "传真1",dataIndex:'faxFirst', width: 100,sortable:true},
					{header: "联系人2",dataIndex:'contactPersonSec',width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "电话2",dataIndex:'phoneSec' ,width: 100,sortable:true},
					{header: "传真2",dataIndex:'faxSec' ,width: 100,sortable:true},
					{header: "品牌1",dataIndex:'brandFirst' ,width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "品牌2",dataIndex:'brandSec' ,width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "品牌3",dataIndex:'brandThird'  ,width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "品牌4",dataIndex:'brandFourth', width: 100,sortable:true,renderer:function(value, cellmeta, record, rowIndex, columnIndex, store){return '<span>' + value + "</span>";}},
					{header: "合同地址",dataIndex:'contractAddress' ,width: 100,sortable:true},
					{header: "邮编",dataIndex:'postcode',width: 100,sortable:true},
					{header: "通讯地址",dataIndex:'comAdress',width: 100,sortable:true},
					{header: "开户银行",dataIndex:'bank',width: 100,sortable:true},	
					{header: "帐号",dataIndex:'accountNumber',width: 100,sortable:true},
					{header: "主页", dataIndex:'homePage',width: 100,sortable:true},
					{header: "email", dataIndex:"email",width: 100,sortable:true},
					{header: "供应商负责人", dataIndex:"ownContactPerson",width: 120,sortable:true},
					{header: "备注", dataIndex:'memo',width: 100,sortable:true}			
				],
				bbar: new Ext.PagingToolbar({
					store: this.store,
					pageSize: 15,
					displayInfo: true,
					displayMsg: "当前显示第{0}条到第{1}条，共{2}条",
					emptyMsg: "<i>没有数据</i>"
				})
			})
		}
	});

var  sOSupplierSelectForm = Ext.extend(Ext.FormPanel, {
	constructor : function(_cfg) {
		if(_cfg == null) {
			_cfg = {};
		}
		Ext.apply(this, _cfg);
		sOSupplierSelectForm.superclass.constructor.call(this, {
	        labelAlign:'left',buttonAlign:'right',bodyStyle:'padding:5px;', border : false,
	        frame:true,labelWidth:70,monitorValid:false,
	        items:[
	           {layout:'column',border:false,labelSeparator:':',frame : true,
	           defaults:{layout: 'form',border:false,columnWidth:.5},
	           bbar : ['->',{
			           		text : "搜  索",
			           		iconCls : 'icon-search',
			           		handler : function() {
			           			this.fireEvent('search',this, this.getValues());
			           		},scope : this
		           		},
		           		'-',{
			           		text : "重  置",
			           		iconCls : 'icon-reset',
			           		handler : function () {
			           			this.getForm().reset();
			           		},scope : this
	           		}],
	           items:[
	              {items: [{xtype:'textfield',fieldLabel: '供货商编号',name: 'supplierCode',anchor:'90%'}]},
				  {items: [{xtype:'textfield',fieldLabel: '供货商名称',name: 'supplierName',anchor:'90%'}]},
				  {items: [{xtype:'textfield',fieldLabel: '联系人',name: 'contactPerson',anchor:'90%'}]},
				  {items: [{xtype:'textfield',fieldLabel: '品牌',name: 'brand',anchor:'90%'}]}
	           ]//items
	          }
	        ],
			keys : {
				key:Ext.EventObject.ENTER,
				fn:function(btn,e){
					this.fireEvent('search',this, this.getValues());
				},
				scope : this
			}
		})
		this.addEvents('search');
	},
	getValues : function() {
	var record = this.getForm().getValues();
	return record;
	}
})
	
	var sOSupplierWin = Ext.extend(Ext.Window,{
		supplier_grid:null,
		contract_code:null,
		selectForm2:null,
		node:null,
		ownContactPerson:null,
		contractId:null,
		flag:null,
		constructor : function(_cfg){
			if(_cfg == null) {
				_cfg = {};
			}
			Ext.apply(this, _cfg);
			this.flag = false;
//			alert(this.node);
			this.selectForm2 = new sOSupplierSelectForm();
			this.supplier_grid = new sOSupplierGrid();
			this.supplier_grid.on('rowdblclick',function(grid,rowIndex,e)
			{
				var s = grid.getStore();
				var record = s.getAt(rowIndex);
				var records = Ext.data.Record.create([
					{name: 'contractCode'},
					{name: 'supplierName'},
					{name: 'contactPerson'},
					{name: 'supplierId'},
					{name: 'ownContactPerson'},
					{name: 'supplierOwnContactPerson'},
					{name: 'mome'},
				]);
				var contractOrderRecord = new records({
					contractCode:this.contract_code,
					supplierName:record.get('supplierName'),
					contactPerson:record.get('contactPersonFirst'),
					supplierId:record.get('id'),
					mome:this.memo,
					ownContactPerson:_cfg.ownContactPerson
					//supplierOwnContactPerson:record.get('ownContactPerson')
				});
				var addParam ;
				if(this.flag)
				{
					addParam = {
						contractId:this.contractId,
						contractCode:this.contract_code,
						supplierId:record.get('id'),
						mome:this.memo,
						deliveryAddressType:this.deliveryAddressType,
						trafficMode:this.trafficMode
					};
				}
				else
				{
					addParam = {
						contractId:this.contractId,
						contractCode:this.contract_code,
						supplierId:record.get('id'),
						node:this.node,
						URL:Ext.ls.selfOrder.addUrl,
						mome:this.memo,
						deliveryAddressType:this.deliveryAddressType,
						trafficMode:this.trafficMode
					};
				}
				var win = new  Ext.ls.selfOrder.addWin(addParam);
				win.on('show',function(){
						win.form.getForm().loadRecord(contractOrderRecord);
						win.form.taxRateCombox.store.load();
					});
				var tree = win.grid;
				var tl = tree.getLoader();
				tl.on("beforeload", function(tl, node) {
					tl.baseParams.contractCode = this.contract_code;
					tl.baseParams.supplierId = record.get('id');
				}, this);
				this.close();
				win.show();
			},this);
			sOSupplierWin.superclass.constructor.call(this, {
				renderTo: Ext.getBody(),
				title:"选择供应商",  
				height:500,
				width:800,
//				modal:false,
				plain:true,
				draggable:true,
				resizable:false,
				maximizable:true,
				layout: 'border',
				listeners : {
					'render' : function() {
						//监听搜索事件。
						this.selectForm2.on({
							'search' : function(_form, _values) {
								var _grid = this.supplier_grid.store;
								var searchStr = _values;
								_grid.baseParams.searchStr = Ext.encode(searchStr);
								_grid.reload();
								this.flag = true;
							},
							scope : this
						})
					}
				},
				buttons : [{
					text : "确定",
					handler : function() {
					var selectedItem = this.supplier_grid.getSelectionModel().getCount();
					var record  = this.supplier_grid.getSelectionModel().getSelected();
						if (1!=selectedItem) {
							Ext.Msg.alert('系统提示', '请选择一条记录!');
							return;
						}
						else{
						
							var records = Ext.data.Record.create([
								{name: 'contractCode'},
								{name: 'supplierName'},
								{name: 'ownContactPerson'},
								{name: 'supplierId'},
								{name: 'mome'}
							]);
							var contractOrderRecord = new records({
								contractCode:this.contract_code,
								supplierName:record.get('supplierName'),
								ownContactPerson:this.ownContactPerson,//record.get('contactPersonFirst'),
								supplierId:record.get('id'),
								mome:this.memo
							});
							var addParam = {
								contractId:this.contractId,
								contractCode:this.contract_code,
								supplierId:record.get('id'),
								URL:Ext.ls.selfOrder.addUrl,
								mome:this.memo,
								deliveryAddressType:this.deliveryAddressType,
							  trafficMode:this.trafficMode
							};
							var win = new  Ext.ls.selfOrder.addWin(addParam);
							/**设置窗口的标题**/
							win.on('show',function(){
									win.setTitle('添加加工订单');
									win.form.getForm().loadRecord(contractOrderRecord);
									win.form.taxRateCombox.store.load();
								})	
							var tree = win.grid;
							var tl = tree.getLoader();
							tl.on("beforeload", function(tl, node) {
								tl.baseParams.contractCode = this.contract_code;
								tl.baseParams.supplierId = record.get('id');
							}, this);
							this.close();
							win.show();
							 
						}
					},
					scope : this
				 },{
					text : "取消",
					handler : function() {
					 this.close();
					},
					scope : this
				 }],
				items : [
					{
						region: 'north',
						iconCls:'icon-grid',
						title: '供应商查询',
						split: true,
						height : 140,
						minSize: 140,
						maxSize: 140,
						collapsible: true,
						margins: '5 5 5 5',
						items : [this.selectForm2]
						
					}, {
						region: 'center',
						split: true,
						minSize: 100,
						maxSize: 200,
						collapsible: true,
						layout: 'fit',
						margins: '-5 5 5 5',
						items : [this.supplier_grid]
					}		
				]
			})
		}
	})









