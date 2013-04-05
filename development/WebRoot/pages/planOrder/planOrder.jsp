<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/editable-column-tree.css" />
<script type="text/javascript" src="<%=path %>/js/contractOrder/orderCommon.js"></script>
<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseProductsWindow.js"></script>
<script type="text/javascript" src="<%=path%>/js/out_stock/material_out_stock/out_stock_edit_win.js"></script>

<script type="text/javascript" src="<%=path %>/js/planOrder/planOrder.js"></script>
<script type="text/javascript" src="<%=path%>/js/contractOrder/SupHisPrice_win.js"></script>
<script type="text/javascript" src="<%=path %>/js/planOrder/select_process_plans.js"></script>


<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUpload.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/ImageView.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/SlaveManager.js"></script>
<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUploadPanel.js"></script>

<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseOrderWin.js"></script>
<script type="text/javascript" src="<%=path%>/js/purchaseOrder/purchaseSupplier.js"></script>

<div id="paln_order"></div>




