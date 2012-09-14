package com.tl.resource.business.exceltemplete.imp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.tl.common.context.SystemInstance;
import com.tl.resource.business.contractOrder.ContractOrderService;
import com.tl.resource.business.dto.OrderDetialsDto;
import com.tl.resource.business.exceltemplete.IExportListDataBusinessHandler;
import com.tl.resource.dao.pojo.TOrderInfor;

public class ExportListDataOrderHandler implements IExportListDataBusinessHandler {
  private ContractOrderService contractOrderService = (ContractOrderService) SystemInstance.getInstance().getBean("ContractOrderServiceImpl");

  @Override
  public Map<String, Object> getBusinessData(Map para) {
    // TODO Auto-generated method stub
    para.put("startIndex", 0);
    para.put("pageSize", Integer.MAX_VALUE);
    List inforList = contractOrderService.getContractOrderList(para);
    for (Iterator iterator = inforList.iterator(); iterator.hasNext();) {
      TOrderInfor orderInfor = (TOrderInfor) iterator.next();
      Map<String, Object> parmMap = new HashMap<String, Object>();
      parmMap.put("orderId", orderInfor.getId());
      parmMap.put("startIndex", 0);
      parmMap.put("pageSize", Integer.MAX_VALUE);
      List<OrderDetialsDto> orderDetail = contractOrderService.getOrderDetailsList(parmMap);
      orderInfor.setDetail(orderDetail);
    }
    Map<String, Object> rt = new HashMap<String, Object>();
    rt.put("list", inforList);
    return rt;
  }

  @Override
  public String getMainCode() {
    // TODO Auto-generated method stub
    return "orderDetail";
  }

}
