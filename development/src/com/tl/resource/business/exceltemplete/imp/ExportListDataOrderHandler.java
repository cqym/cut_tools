package com.tl.resource.business.exceltemplete.imp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.tl.common.context.SystemInstance;
import com.tl.resource.business.contractOrder.ContractOrderService;
import com.tl.resource.business.dto.OrderInfoDto;
import com.tl.resource.business.exceltemplete.IExportListDataBusinessHandler;
import com.tl.resource.business.reserveOrder.ReserveOrderService;
import com.tl.resource.business.scheduleOrder.ScheduleOrderService;
import com.tl.resource.dao.pojo.TOrderInfor;

public class ExportListDataOrderHandler implements IExportListDataBusinessHandler {
  private ContractOrderService contractOrderService = (ContractOrderService) SystemInstance.getInstance().getBean("ContractOrderServiceImpl");

  private ScheduleOrderService scheduleOrderService = (ScheduleOrderService) SystemInstance.getInstance().getBean("ScheduleOrderServiceImpl");

  private ReserveOrderService reserveOrderService = (ReserveOrderService) SystemInstance.getInstance().getBean("ReserveOrderServiceImpl");

  private String orderType = null;

  @Override
  public Map<String, Object> getBusinessData(Map para) {
    // TODO Auto-generated method stub
    para.put("startIndex", 0);
    para.put("pageSize", Integer.MAX_VALUE);
    orderType = (String) para.get("orderType");
    List inforList = contractOrderService.getContractOrderList(para);
    for (Iterator iterator = inforList.iterator(); iterator.hasNext();) {
      TOrderInfor orderInfor = (TOrderInfor) iterator.next();

      orderInfor.setDetail(getDetail(orderInfor));
    }
    Map<String, Object> rt = new HashMap<String, Object>();
    rt.put("list", inforList);
    return rt;
  }

  private List getDetail(TOrderInfor orderInfor) {
    if (Integer.valueOf(OrderInfoDto.ORDER_TYPE_CONTRACT).equals(orderInfor.getOrderType())
      || Integer.valueOf(OrderInfoDto.ORDER_TYPE_CONTRACT_SELF).equals(orderInfor.getOrderType())) {
      Map<String, Object> parmMap = new HashMap<String, Object>();
      parmMap.put("orderId", orderInfor.getId());
      parmMap.put("startIndex", 0);
      parmMap.put("pageSize", Integer.MAX_VALUE);
      return (contractOrderService.getOrderDetailsList(parmMap));
    } else if (Integer.valueOf(OrderInfoDto.ORDER_TYPE_RESERVE).equals(orderInfor.getOrderType())
      || Integer.valueOf(OrderInfoDto.ORDER_TYPE_MAT_RESERVE).equals(orderInfor.getOrderType())) {
      Map<String, Object> parmMap = new HashMap<String, Object>();
      parmMap.put("orderId", orderInfor.getId());
      parmMap.put("startIndex", 0);
      parmMap.put("pageSize", Integer.MAX_VALUE);
      return (reserveOrderService.getOrderDetailsLists(parmMap));
    } else {
      Map<String, Object> parmMap = new HashMap<String, Object>();
      parmMap.put("orderId", orderInfor.getId());
      parmMap.put("startIndex", 0);
      parmMap.put("pageSize", Integer.MAX_VALUE);
      parmMap.put("outStockType", orderInfor.getOrderType());
      return (scheduleOrderService.getOrderDetailList(parmMap));
    }
  }

  @Override
  public String getMainCode() {
    // TODO Auto-generated method stub
    if ("3".equals(orderType) || "8".equals(orderType) || "7".equals(orderType)) {
      return "orderSelfDetail";
    }
    return "orderDetail";
  }
}
