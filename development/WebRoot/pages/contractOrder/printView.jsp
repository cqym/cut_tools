<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>打印预览</title>
<style media=print> 
.Noprint{display:none;} 
.PageNext{page-break-after: always;} 
</style> 

<script type="text/javascript"> 
function printit(){ 

   //将部分隐藏不打印 
    document.getElementById("no").style.display = "none"; 

window.print(); 

//部分还原回来 
document.getElementById("no").style.display = ""; 
return false; 
} 

</script> 
<style type="text/css">
<!--
.STYLE2 {font-size: 14px}
-->
</style>
</head>

<body>
<div id="no"> 
<input type=button value=打印分页 onClick="printit()"> 
</div> 
<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="100%" border="0" cellpadding="0" cellspacing="0" style="font-size:12px">
      <tr>
        <td height="47" colspan="4"><img src="1.jpg" width="100%" height="42" /></td>
        </tr>
      <tr>
        <td colspan="4" align="center"><span class="STYLE2">买卖合同</span></td>
        </tr>
      <tr>
        <td width="15%">买方(甲方):</td>
        <td width="40%"><c:out value="${order.customerName}"/></td>
        <td width="10%">合同编号:</td>
        <td width="40%"><c:out value="${order.contractCode}"/></td>
      </tr>
      <tr>
        <td>卖方(乙方):</td>
        <td><c:out value="${order.companyName}"/></td>
        <td>签订时间:</td>
        <td> <fmt:formatDate value="${order.editDate}" pattern="yyyy-MM-dd" type="date"/></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>签订地点:</td>
        <td></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>币别:</td>
        <td><c:out value="${order.currencyName}"/></td>
      </tr>
    </table></td>
  </tr>
  <tr>
  	<td>&nbsp;</td>
  </tr>
  <tr>
    <td><table width="100%" border="1" cellpadding="0" cellspacing="0" style="font-size:12px">
      <tr>
        <td colspan="10">一，产品名称，商标，型号，生产厂家，数量，金额，供货时间及数量：</td>
        </tr>
      <tr>
        <td align="center">项目</td>
        <td align="center">序号</td>
        <td align="center">名称</td>
        <td align="center">规 格 型 号</td>
        <td align="center">计量单位</td>
        <td align="center">数量</td>
        <td align="center">单价 <br />
          （未税）</td>
        <td align="center">小计<br />
          （未税）</td>
        <td align="center">交货期</td>
        <td align="center">品牌</td>
      </tr>
	 <c:if test = "${orderDetailCount <= 6}" >
		<c:forEach  items="${orderDetail}" var = "detail">
			 <tr>
				<td align="center">${detail.projectCode}</td>
				<td align="center">${detail.serialNumber}</td>
				<td align="center">${detail.productName}</td>
				<td align="center">${detail.productCode}</td>
				<td align="center">${detail.productUnit}</td>
				<td align="center">${detail.orderAmount}</td>
				<td align="center">${detail.price}</td>
				<td align="center">${detail.productMoney}</td>
				<td align="center">${detail.deliveryDate}</td>
				<td align="center">${detail.productBrand}</td>
			</tr>
		</c:forEach >
	</c:if>
	  <c:if test = "${orderDetailCount >6}" >
      <tr>
	    <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
         <td colspan="2" align="center">产品详见合同清单</td>
		 <td align="center">批</td>
        <td align="center">1</td>
        <td align="center"><c:out value="${order.productMoney}"/></td>
        <td align="center"><c:out value="${order.productMoney}"/></td>
        <td align="center">见清单</td>
        <td align="center">见清单</td>
       </tr>
	    <tr>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
        <td align="center">&nbsp;</td>
      </tr>
	   </c:if>
    
      <tr>
        <td colspan="3" align="center">货品总计：</td>
        <td colspan="7" >&nbsp;<c:out value="${order.productMoney}"/></td>
        </tr>
      <tr>
        <td colspan="3" align="center">税       率：</td>
        <td colspan="7" >&nbsp;<fmt:formatNumber value="${order.taxRate}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber> </td>
        </tr>
      <tr>
        <td colspan="3" align="center">税       金：</td>
        <td colspan="7" >&nbsp;<c:out value="${order.totalMoney - order.productMoney}"/></td>
        </tr>
      <tr>
        <td colspan="3" align="center">价税合计：</td>
        <td colspan="7" >&nbsp;<c:out value="${order.totalMoney}"/></td>
        </tr>
      <tr>
        <td colspan="3" align="center">大写金额：</td>
        <td colspan="7" >&nbsp;<c:out value="${bigWrite}"/></td>
        </tr>
      <tr>
        <td colspan="10">二，产品质量标准：<c:out value="${order.qualityStandard}"/></td>
        </tr>
      <tr>
        <td colspan="10">三，交提货地点：<c:out value="${order.deliveryAddressType}"/></td>
        </tr>
      <tr>
        <td colspan="10">四，运输方式和费用负担：<c:out value="${order.trafficMode}"/></td>
        </tr>
      <tr>
        <td colspan="10">五，包装标准及费用负担：按卖方包装标准，费用卖方负担，包装物不回收。</td>
        </tr>
      <tr>
        <td colspan="10">六，验收标准：ISO标准</td>
        </tr>
      <tr>
        <td colspan="10">七，结算方式及期限：<c:out value="${order.closingAccountMode}"/></td>
        </tr>
      <tr>
        <td colspan="10">八，其他约定事项：<c:out value="${order.otherConvention}"/></td>
        </tr>
      <tr>
        <td colspan="10">九，违约责任：<c:out value="${order.defaultDuty}"/></td>
        </tr>
		<tr>
        <td colspan="10">十，解决争议的方式：双方协商友好解决</td>
        </tr>
		<tr>
        <td colspan="10">十一，合同生效：<c:out value="${order.effectConditions}"/></td>
        </tr>
    </table></td>
  </tr>
   <tr>
  	<td>&nbsp;</td>
  </tr>
  <tr>
    <td><table width="100%" border="1" cellpadding="0" cellspacing="0" style="font-size:12px">
      <tr>
        <td align="center">买           方</td>
        <td align="center">卖           方</td>
      </tr>
      <tr>
        <td>单位名称（章）:&nbsp;<c:out value="${buyInfor.companyName}"/></td>
        <td>单位名称（章）:&nbsp;<c:out value="${salesInfor.supplierName}"/></td>
      </tr>
      <tr>
        <td>注册地址:&nbsp;<c:out value="${buyInfor.regAddress}"/></td>
        <td>注册地址:&nbsp;<c:out value="${salesInfor.contractAddress}"/></td>
      </tr>
      <tr>
        <td>法人代表:&nbsp;<c:out value="${buyInfor.contactPerson}"/></td>
        <td>法人代表:&nbsp;</td>
      </tr>
      <tr>
        <td>委托代理人:&nbsp;</td>
        <td>委托代理人:&nbsp;</td>
      </tr>
      <tr>
        <td>电      话:&nbsp;<c:out value="${buyInfor.phone}"/></td>
        <td>电      话:&nbsp;<c:out value="${salesInfor.phoneFirst}"/></td>
      </tr>
      <tr>
        <td>开  户 行:&nbsp;<c:out value="${buyInfor.bank}"/></td>
        <td>开  户 行:&nbsp;<c:out value="${salesInfor.bank}"/></td>
      </tr>
      <tr>
        <td>帐      号:&nbsp;<c:out value="${buyInfor.accountNumber}"/></td>
        <td>帐      号:&nbsp;<c:out value="${salesInfor.accountNumber}"/></td>
      </tr>
      <tr>
        <td>税      号: &nbsp;<c:out value="${buyInfor.taxCode}"/></td>
        <td>税      号: &nbsp;<c:out value="${salesInfor.taxCode}"/></td>
      </tr>
      <tr>
        <td>邮寄地址:&nbsp;<c:out value="${buyInfor.companyAddress}"/></td>
        <td>邮寄地址:&nbsp;<c:out value="${salesInfor.comAdress}"/></td>
      </tr>
      <tr>
        <td>邮政编码:&nbsp;<c:out value="${buyInfor.postcode}"/></td>
        <td>邮政编码:&nbsp;<c:out value="${salesInfor.postcode}"/></td>
      </tr>
      <tr>
        <td colspan="2">注： 	1.本合同如需变更条款，请另行签定书面变更协议，否则，不具有法律效力；</td>
        </tr>
      <tr>
        <td colspan="2"> 2.本文本合同如书写不下，请另行加纸。 </td>
        </tr>
    </table></td>
  </tr>
</table>
<c:if test="${pageCount>0}">
<c:forEach var ="i" begin="1" end ="${pageCount}" varStatus="status">  
<hr> 
<!--分页--> 
<div class="PageNext"></div>
  <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td colspan="2">&nbsp;</td>
    </tr>
    <tr>
      <td colspan="2"><table width="100%" border="0" cellpadding="0" cellspacing="0" style="font-size:12px">
        <tr>
          <td colspan="4" align="center">合同清单</td>
          </tr>
        <tr>
        <td width="15%">买方(甲方):</td>
        <td width="40%"><c:out value="${order.customerName}"/></td>
        <td width="10%">合同编号:</td>
        <td width="40%"><c:out value="${order.contractCode}"/></td>
      </tr>
      <tr>
        <td>卖方(乙方):</td>
        <td><c:out value="${order.companyName}"/></td>
        <td>签订时间:</td>
        <td> <fmt:formatDate value="${order.editDate}" pattern="yyyy-MM-dd" type="date"/></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>签订地点:</td>
        <td></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>币别:</td>
        <td><c:out value="${order.currencyName}"/></td>
      </tr>
      </table></td>
    </tr>
    <tr>
      <td colspan="2"><table width="100%" border="1" cellpadding="0" cellspacing="0" style="font-size:12px">
        <tr>
          <td align="center">项目</td>
          <td align="center">序号</td>
          <td align="center">名称</td>
          <td align="center">规格型号</td>
          <td align="center">计量 单位</td>
          <td align="center">数量</td>
          <td align="center">单价           (未税)</td>
          <td align="center">小计<br />
            （未税）</td>
          <td align="center">交货期</td>
          <td align="center">品牌</td>
        </tr>
        <tr>
       <c:forEach  items="${orderDetail}" var = "detail" begin = "${i*pagesize-pagesize}"  end = "${i*pagesize}">
			 <tr>
				<td align="center">${detail.projectCode}</td>
				<td align="center">${detail.serialNumber}</td>
				<td align="center">${detail.productName}</td>
				<td align="center">${detail.productCode}</td>
				<td align="center">${detail.productUnit}</td>
				<td align="center"><fmt:formatNumber value="${detail.orderAmount}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber> </td>
				<td align="center"><fmt:formatNumber value="${detail.price}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				<td align="center"><fmt:formatNumber value="${detail.productMoney}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				<td align="center">${fn:substring(detail.deliveryDate, 0, 10)}</td>
				<td align="center">${detail.productBrand}</td>
			</tr>
		</c:forEach >
        </tr>
      </table></td>
    </tr>
  </table>
  </c:forEach>
</c:if>
</body>
</html>
