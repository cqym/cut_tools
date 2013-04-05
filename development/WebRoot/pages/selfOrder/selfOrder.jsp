<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="<%=path %>/js/contractOrder/orderCommon.js"></script>
<script type="text/javascript" src="<%=path%>/js/out_stock/contract_out_stock/out_stock_edit_win.js"></script>
<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseProductsWindow.js"></script>

<script type="text/javascript" src="<%=path %>/js/selfOrder/selfOrder.js"></script>
<script type="text/javascript" src="<%=path%>/js/reserve_plan/reserve_plan_edit_win_new.js"></script>
<script type="text/javascript" src="<%=path%>/js/contractOrder/SupHisPrice_win.js"></script>

<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUpload.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/ImageView.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/SlaveManager.js"></script>
<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUploadPanel.js"></script>

<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseOrderWin.js"></script>
<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseSupplier.js"></script>
<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseSelectContract.js"></script>

<div id="self_order"></div>


