<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="<%=path %>/js/contractOrder/orderCommon.js"></script>
<script type="text/javascript" src="<%=path%>/js/out_stock/quotation_out_stock/out_stock_edit_win.js"></script>
<script type="text/javascript" src="<%=path%>/js/delivery/consult_contract/select_contract_products.js"></script>

<script type="text/javascript" src="<%=path %>/js/scheduleOrder/product.js"></script>
<script type="text/javascript" src="<%=path %>/js/scheduleOrder/addScheduleOrder.js"></script>
<script type="text/javascript" src="<%=path %>/js/scheduleOrder/supplier.js"></script>
<script type="text/javascript" src="<%=path %>/js/scheduleOrder/quotation.js"></script>
<script type="text/javascript" src="<%=path %>/js/scheduleOrder/scheduleOrder.js"></script>
<script type="text/javascript" src="<%=path%>/js/contractOrder/SupHisPrice_win.js"></script>

<script type="text/javascript" src="<%=path%>/js/contract/invoiceEdit.js"></script>
<script type="text/javascript" src="<%=path%>/js/contract/contract_account_edit.js"></script>
<script type="text/javascript" src="<%=path%>/js/contract/contract_accounts.js"></script>


<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUpload.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/ImageView.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/SlaveManager.js"></script>
<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUploadPanel.js"></script>

<div id="q_orders"></div>

	


