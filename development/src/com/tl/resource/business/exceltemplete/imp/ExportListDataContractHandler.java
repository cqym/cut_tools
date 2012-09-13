package com.tl.resource.business.exceltemplete.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.tl.common.context.SystemInstance;
import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.contract.ContractEditService;
import com.tl.resource.business.dto.ContractInforDto;
import com.tl.resource.business.exceltemplete.IExportListDataBusinessHandler;

public class ExportListDataContractHandler implements IExportListDataBusinessHandler {
  private ContractEditService contractEditService = (ContractEditService) SystemInstance.getInstance().getBean("contractEditService");

  @Override
  public Map<String, Object> getBusinessData(Map para) {
    // TODO Auto-generated method stub
    PaginationSupport inforPage = contractEditService.findContractInfors(para, 0, Integer.MAX_VALUE);
    List inforList = inforPage.getItems();
    List detail = new ArrayList();
    for (Iterator iterator = inforList.iterator(); iterator.hasNext();) {
      ContractInforDto conInfor = (ContractInforDto) iterator.next();
      detail.add(contractEditService.getContractInforById(conInfor.getId()));
    }
    Map<String, Object> rt = new HashMap<String, Object>();
    rt.put("list", detail);
    return rt;
  }

  @Override
  public String getMainCode() {
    // TODO Auto-generated method stub
    return "contractDetail";
  }

}
