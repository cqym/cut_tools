<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="<%=path %>/js/contractOrder/orderCommon.js"></script>
<script type="text/javascript" src="<%=path%>/js/out_stock/contract_out_stock/out_stock_edit_win.js"></script>
<script type="text/javascript" src="<%=path%>/js/delivery/consult_contract/select_contract_products.js"></script>
<script type="text/javascript" src="<%=path %>/js/trySelfOrder/product.js"></script>
<script type="text/javascript" src="<%=path %>/js/trySelfOrder/addTrySelfOrder.js"></script>
<script type="text/javascript" src="<%=path %>/js/trySelfOrder/supplier.js"></script>
<script type="text/javascript" src="<%=path %>/js/trySelfOrder/quotation.js"></script>
<script type="text/javascript" src="<%=path %>/js/trySelfOrder/trySelfOrder.js"></script>
<script type="text/javascript" src="<%=path%>/js/reserve_plan/reserve_plan_edit_win_new.js"></script>
<script type="text/javascript" src="<%=path%>/js/contractOrder/SupHisPrice_win.js"></script>

<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUpload.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/ImageView.js"></script>
<script type="text/javascript" src="<%=path%>/js/upload/SlaveManager.js"></script>
<script type="text/javascript" src="<%=path%>/extjs/plugins/SwfUploadPanel/SwfUploadPanel.js"></script>

<div id="trySelf_order"></div>


