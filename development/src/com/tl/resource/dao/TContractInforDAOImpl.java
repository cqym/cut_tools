package com.tl.resource.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.ContractInforDto;
import com.tl.resource.dao.pojo.TContractInfor;
import com.tl.resource.dao.pojo.TContractInforExample;

public class TContractInforDAOImpl extends SqlMapClientDaoSupport implements TContractInforDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TContractInforDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int countByExample(TContractInforExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByExample(TContractInforExample example) {
    int rows = getSqlMapClientTemplate().delete("t_contract_infor.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TContractInfor key = new TContractInfor();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_contract_infor.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insert(TContractInfor record) {
    getSqlMapClientTemplate().insert("t_contract_infor.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insertSelective(TContractInfor record) {
    getSqlMapClientTemplate().insert("t_contract_infor.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public List selectByExample(TContractInforExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_contract_infor.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TContractInfor selectByPrimaryKey(String id) {
    TContractInfor key = new TContractInfor();
    key.setId(id);
    TContractInfor record = (TContractInfor) getSqlMapClientTemplate().queryForObject("t_contract_infor.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExampleSelective(TContractInfor record, TContractInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_contract_infor.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExample(TContractInfor record, TContractInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_contract_infor.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKeySelective(TContractInfor record) {
    int rows = getSqlMapClientTemplate().update("t_contract_infor.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKey(TContractInfor record) {
    int rows = getSqlMapClientTemplate().update("t_contract_infor.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_contract_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  private static class UpdateByExampleParms extends TContractInforExample {
    private Object record;

    public UpdateByExampleParms(Object record, TContractInforExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<ContractInforDto> getContractList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_infor.getContractList", parmMap);

  }

  @Override
  public int getContractListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.getContractListCount", parmMap);
    return in.intValue();
  }

  @Override
  public PaginationSupport findContractInfors(Map params, int startIndex, int pageSize) {
    // TODO Auto-generated method stub
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List list = getSqlMapClientTemplate().queryForList("t_contract_infor.getContractList", params);
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.getContractListCount", params);
    PaginationSupport pageInfor = new PaginationSupport(list, count, pageSize, startIndex);
    return pageInfor;
  }

  @Override
  public PaginationSupport findContractViewPanelInfors(Map params, int startIndex, int pageSize) {
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List list = getSqlMapClientTemplate().queryForList("contract_view_panel.contractInforViewSql", params);
    Map totalMap = (Map) getSqlMapClientTemplate().queryForObject("contract_view_panel.contractInforViewCountSql", params);
    //		params.clear();
    //		params.put("final_money", totalMap.get("final_money"));
    //		params.put("delivery_money", totalMap.get("delivery_money"));
    //		params.put("invoice_money", totalMap.get("invoice_money"));
    //		params.put("money", totalMap.get("money"));
    PaginationSupport pageInfor = new PaginationSupport(list, ((Long) (totalMap.get("cnt"))).intValue(), pageSize, startIndex);
    return pageInfor;
  }

  @Override
  public BigDecimal getContractNeedDeliveryAmount(String contractId) {
    BigDecimal count = (BigDecimal) getSqlMapClientTemplate().queryForObject("t_contract_infor.getContractNeedDeliveryAmount", contractId);
    return count;
  }

  @Override
  public Integer findWaitOrderContractCount(String userId) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("userId", userId);
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.findWaitOrderContractCount", params);
    return count;
  }

  /**合同列表(加工订单)**/
  @Override
  public List<ContractInforDto> getPOrderContractList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_infor.getPOrderContractList", parmMap);

  }

  @Override
  public int getPOrderContractListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.getPOrderContractListCount", parmMap);
    return in.intValue();
  }

  @Override
  public List<Map<String, Object>> findWaitOrderContract(String userId, int startIndex, int pageSize) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("userId", userId);
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List list = getSqlMapClientTemplate().queryForList("t_contract_infor.findWaitOrderContract", params);
    return list;
  }

  @Override
  public TContractInfor getContractByCode(String code) {
    return (TContractInfor) this.getSqlMapClientTemplate().queryForObject("t_contract_infor.getContractByCode", code);
  }

  @Override
  public Map getContractTotalInfor(Map params) {
    Map totalMap = (Map) getSqlMapClientTemplate().queryForObject("contract_view_panel.contractInforViewCountSql", params);
    return totalMap;
  }

  @Override
  public int getContractCountCouldUploadFile(Map<String, Object> params) {

    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_infor.getContractCountCouldUploadFile", params);
    return in.intValue();
  }

  @Override
  public void checkSetContractOver(String conId) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_infor.checkSetContractOver", conId);
  }

  @Override
  public void relationScheduleInfor(String conId) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_infor.relationScheduleInfor", conId);
  }

  @Override
  public List<Map<String, Object>> getContractMonthMoneys(Map<String, Object> parmMap) {
    List<Map<String, Object>> list = (List) getSqlMapClientTemplate().queryForList("t_contract_infor.getContractMonthMoneys", parmMap);
    return list;
  }

  @Override
  public List<Map<String, Object>> getContractMoneysForOwnPerson(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    List<Map<String, Object>> list = (List) getSqlMapClientTemplate().queryForList("t_contract_infor.getContractMoneysForOwnPerson", parmMap);
    return list;
  }

  @Override
  public BigDecimal getSumContractMoneyByCustomerCode(String customerCode) {
    // TODO Auto-generated method stub
    BigDecimal m = (BigDecimal) getSqlMapClientTemplate().queryForObject("t_contract_infor.getSumContractMoneyByCustomerCode", customerCode);
    return m;
  }

  @Override
  public List<ContractInforDto> contractInforsWaitOrder(Map<String, Object> params) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("contract_view_panel.contractInforsWaitOrderSql", params);
  }

  @Override
  public Integer contractCountWaitOrder(Map<String, Object> params) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("contract_view_panel.contractCountWaitOrderSql", params);
    return count;
  }

  @Override
  public List<ContractInforDto> contractInforsWaitDelivery(Map<String, Object> params) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("contract_view_panel.contractInforsWaitDeliverySql", params);
  }

  @Override
  public Integer contractCountWaitDelivery(Map<String, Object> params) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("contract_view_panel.contractCountWaitDeliverySql", params);
    return count;
  }

  @Override
  public List<ContractInforDto> contractInforsDeliveryOverDate(Map<String, Object> params) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("contract_view_panel.contractInforsDeliveryOverDateSql", params);
  }

  @Override
  public Integer contractCountDeliveryOverDate(Map<String, Object> params) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("contract_view_panel.contractCountDeliveryOverDateSql", params);
    return count;
  }

  @Override
  public String updateContractInvoiceStatus(String conId, int value) {
    // TODO Auto-generated method stub
    HashMap p = new HashMap();
    p.put("conId", conId);
    p.put("v", value);
    getSqlMapClientTemplate().update("t_contract_infor.updateContractInvoiceStatus", p);
    return null;
  }
}