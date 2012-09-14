package com.tl.resource.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.ContractProductDetailDto;
import com.tl.resource.business.dto.OrderDetialsDto;
import com.tl.resource.dao.pojo.TContractProductDetail;
import com.tl.resource.dao.pojo.TContractProductDetailExample;

public class TContractProductDetailDAOImpl extends SqlMapClientDaoSupport implements TContractProductDetailDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TContractProductDetailDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int countByExample(TContractProductDetailExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByExample(TContractProductDetailExample example) {
    int rows = getSqlMapClientTemplate().delete("t_contract_product_detail.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TContractProductDetail key = new TContractProductDetail();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_contract_product_detail.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insert(TContractProductDetail record) {
    getSqlMapClientTemplate().insert("t_contract_product_detail.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insertSelective(TContractProductDetail record) {
    getSqlMapClientTemplate().insert("t_contract_product_detail.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public List selectByExample(TContractProductDetailExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_contract_product_detail.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TContractProductDetail selectByPrimaryKey(String id) {
    TContractProductDetail key = new TContractProductDetail();
    key.setId(id);
    TContractProductDetail record = (TContractProductDetail) getSqlMapClientTemplate().queryForObject(
      "t_contract_product_detail.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExampleSelective(TContractProductDetail record, TContractProductDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExample(TContractProductDetail record, TContractProductDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKeySelective(TContractProductDetail record) {
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKey(TContractProductDetail record) {
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_contract_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  private static class UpdateByExampleParms extends TContractProductDetailExample {
    private Object record;

    public UpdateByExampleParms(Object record, TContractProductDetailExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<ContractProductDetailDto> getProductDetail(String contractId, String contractSortId) {
    // TODO Auto-generated method stub
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("contractId", contractId);
    params.put("contractSortId", contractSortId);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("t_contract_product_detail.getProductDetail", params);
    return list;
  }

  @Override
  public List<ContractProductDetailDto> getProductDetail4Page(String contractId, String contractSortId, int startIndex, int pageSize) {
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("contractId", contractId);
    params.put("contractSortId", contractSortId);
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("t_contract_product_detail.getProductDetail", params);
    return list;
  }

  @Override
  public List<OrderDetialsDto> getContractDetailList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_product_detail.getPartContractDetailList", parmMap);
  }

  @Override
  public Integer getContractDetailListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.getPartContractDetailListCount", parmMap);
  }

  @Override
  public List<ContractProductDetailDto> getConProductArrivalDeliveryDetail(String contractId, String contractSortId) {
    // TODO Auto-generated method stub
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("contractId", contractId);
    params.put("contractSortId", contractSortId);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("t_contract_product_detail.getProductArrivalDeliveryDetail", params);
    return list;
  }

  @Override
  public PaginationSupport findContractDetail(Map params, int startIndex, int pageSize) {
    // TODO Auto-generated method stub
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("contract_product_detail.getProductArrivalDeliveryRootDetail",
      params);
    Integer totalCount = (Integer) getSqlMapClientTemplate().queryForObject("contract_product_detail.getProductArrivalDeliveryRootDetailCount",
      params);
    PaginationSupport ps = new PaginationSupport(list, totalCount, pageSize, startIndex);
    return ps;
  }

  @Override
  public PaginationSupport getConProductArrivalDeliveryDetail4Page(Map params, int startIndex, int pageSize) {
    // TODO Auto-generated method stub
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("t_contract_product_detail.getProductArrivalDeliveryDetail", params);
    Integer totalCount = (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.getProductArrivalDeliveryDetailCount", params);
    PaginationSupport ps = new PaginationSupport(list, totalCount, pageSize, startIndex);
    return ps;
  }

  @Override
  public List<ContractProductDetailDto> getContractDetail(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_product_detail.getContractDetail", parmMap);
  }

  @Override
  public Integer getContractDetailCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.getContractDetailCount", parmMap);
  }

  @Override
  public List<ContractProductDetailDto> getWillOutStockContractDetail(String contractId) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("willOutStock", new Object());
    params.put("contractId", contractId);
    List<ContractProductDetailDto> list = getSqlMapClientTemplate().queryForList("contract_product_detail.getProductArrivalDeliveryRootDetail",
      params);
    return list;
  }

  /**合同订单**/
  @Override
  public List<ContractProductDetailDto> getCOrderContractDetailList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_product_detail.getCOrderContractDetailList", parmMap);
  }

  @Override
  public Integer getCOrderContractDetailListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.getCOrderContractDetailListCount", parmMap);
  }

  @Override
  public List<ContractProductDetailDto> getCOrderContractDetail(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_product_detail.getCOrderContractDetail", parmMap);
  }

  @Override
  public Integer getCOrderContractDetailCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return (Integer) getSqlMapClientTemplate().queryForObject("t_contract_product_detail.getCOrderContractDetailCount", parmMap);
  }

  @Override
  public List<OrderDetialsDto> getPartContractDetail(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_contract_product_detail.getPartContractDetailList", parmMap);
  }

  @Override
  public int updateContractDetailOrderAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.updateContractDetailOrderAmount", para);
    return rows;
  }

  @Override
  public int updateContractDetailArrivalAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.updateContractDetailArrivalAmount", para);
    return rows;
  }

  @Override
  public int updateContractDetailDeliveryAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.updateContractDetailDeliveryAmount", para);
    return rows;
  }

  @Override
  public int updateContractDetailOutAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_contract_product_detail.updateContractDetailOutAmount", para);
    return rows;
  }

  @Override
  public void sycContractArrivalDetail(String quoCode) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_product_detail.sycContractArrivalDetail", quoCode);
  }

  @Override
  public void sycContractDeliveryDetail(String quoCode) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_product_detail.sycContractDeliveryDetail", quoCode);
  }

  @Override
  public void sycContractOrderDetail(String quoCode) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_product_detail.sycContractOrderDetail", quoCode);
  }

  @Override
  public void sycContractOutDetail(String quoCode) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_contract_product_detail.sycContractOutDetail", quoCode);
  }

}