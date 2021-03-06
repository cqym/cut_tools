package com.tl.resource.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.ContractInforDto;
import com.tl.resource.dao.pojo.TContractInfor;
import com.tl.resource.dao.pojo.TContractInforExample;

public interface TContractInforDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int countByExample(TContractInforExample example);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int deleteByExample(TContractInforExample example);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int deleteByPrimaryKey(String id);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  void insert(TContractInfor record);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  void insertSelective(TContractInfor record);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  List selectByExample(TContractInforExample example);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  TContractInfor selectByPrimaryKey(String id);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int updateByExampleSelective(TContractInfor record, TContractInforExample example);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int updateByExample(TContractInfor record, TContractInforExample example);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int updateByPrimaryKeySelective(TContractInfor record);

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  int updateByPrimaryKey(TContractInfor record);

  /**
   * 根据查询条件得到合同需要下订单的合同列表
   * @param parmMap
   * @return
   */
  public List<ContractInforDto> getContractList(Map<String, Object> parmMap);

  public int getContractListCount(Map<String, Object> parmMap);

  PaginationSupport findContractInfors(Map params, int startIndex, int pageSize);

  PaginationSupport findContractViewPanelInfors(Map params, int startIndex, int pageSize);

  Map getContractTotalInfor(Map params);

  public BigDecimal getContractNeedDeliveryAmount(String contractId);

  public Integer findWaitOrderContractCount(String userId);

  public List<Map<String, Object>> findWaitOrderContract(String userId, int startIndex, int pageSize);

  /**合同列表(加工订单)**/
  public List<ContractInforDto> getPOrderContractList(Map<String, Object> parmMap);

  public int getPOrderContractListCount(Map<String, Object> parmMap);

  public TContractInfor getContractByCode(String code);

  int getContractCountCouldUploadFile(Map<String, Object> params);

  void checkSetContractOver(String conId);

  void relationScheduleInfor(String conId);

  public List<Map<String, Object>> getContractMonthMoneys(Map<String, Object> parmMap);

  public List<Map<String, Object>> getContractMoneysForOwnPerson(Map<String, Object> parmMap);

  BigDecimal getSumContractMoneyByCustomerCode(String customerCode);

  List<ContractInforDto> contractInforsWaitOrder(Map<String, Object> params);

  Integer contractCountWaitOrder(Map<String, Object> params);

  List<ContractInforDto> contractInforsWaitDelivery(Map<String, Object> params);

  Integer contractCountWaitDelivery(Map<String, Object> params);

  List<ContractInforDto> contractInforsDeliveryOverDate(Map<String, Object> params);

  Integer contractCountDeliveryOverDate(Map<String, Object> params);

  String updateContractInvoiceStatus(String conId, int value);
}