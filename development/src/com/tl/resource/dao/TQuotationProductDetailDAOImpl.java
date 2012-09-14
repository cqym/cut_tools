package com.tl.resource.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.OrderDetialsDto;
import com.tl.resource.business.dto.QuotationDetailDto;
import com.tl.resource.business.dto.QuotationDetailForOrderDto;
import com.tl.resource.business.dto.QuotationDetailOutStockDto;
import com.tl.resource.dao.pojo.TQuotationProductDetail;
import com.tl.resource.dao.pojo.TQuotationProductDetailExample;

public class TQuotationProductDetailDAOImpl extends SqlMapClientDaoSupport implements TQuotationProductDetailDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TQuotationProductDetailDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int countByExample(TQuotationProductDetailExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByExample(TQuotationProductDetailExample example) {
    int rows = getSqlMapClientTemplate().delete("t_quotation_product_detail.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TQuotationProductDetail key = new TQuotationProductDetail();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_quotation_product_detail.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insert(TQuotationProductDetail record) {
    getSqlMapClientTemplate().insert("t_quotation_product_detail.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insertSelective(TQuotationProductDetail record) {
    getSqlMapClientTemplate().insert("t_quotation_product_detail.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public List selectByExample(TQuotationProductDetailExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_quotation_product_detail.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TQuotationProductDetail selectByPrimaryKey(String id) {
    TQuotationProductDetail key = new TQuotationProductDetail();
    key.setId(id);
    TQuotationProductDetail record = (TQuotationProductDetail) getSqlMapClientTemplate().queryForObject(
      "t_quotation_product_detail.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExampleSelective(TQuotationProductDetail record, TQuotationProductDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExample(TQuotationProductDetail record, TQuotationProductDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKeySelective(TQuotationProductDetail record) {
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKey(TQuotationProductDetail record) {
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_quotation_product_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  private static class UpdateByExampleParms extends TQuotationProductDetailExample {
    private Object record;

    public UpdateByExampleParms(Object record, TQuotationProductDetailExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public void insertQuoDetail(TQuotationProductDetail quoDetail) {
    this.getSqlMapClientTemplate().insert("t_quotation_product_detail.ibatorgenerated_insertSelective", quoDetail);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetail(String quoId) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetail", quoId);
  }

  @Override
  public QuotationDetailDto getQuoDetailById(String id) {
    QuotationDetailDto quoDetail = null;
    Object obj = this.getSqlMapClientTemplate().queryForObject("quotationDetail.getQuoDetailById", id);
    if (obj != null) {
      quoDetail = (QuotationDetailDto) obj;
    }

    return quoDetail;
  }

  @Override
  public void updateQuoDetail(TQuotationProductDetail quoDetail) {
    this.getSqlMapClientTemplate().update("t_quotation_product_detail.ibatorgenerated_updateByPrimaryKeySelective", quoDetail);
  }

  @Override
  public void deleteQuoDetail(String id) {
    this.getSqlMapClientTemplate().delete("quotationDetail.deleteQuoDetailById", id);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetailByQuo(String id) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetailByQuo", id);
  }

  @Override
  public List<TQuotationProductDetail> getQuoDetailByPriChange(Map<String, String> paramMap) {
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuoDetailByPriChange", paramMap);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetailList(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getProductList", (String) parmMap.get("quotation_project_sort_id"));
  }

  @Override
  public void deleteProByQuoId(String quoId) {
    this.getSqlMapClientTemplate().delete("t_quotation_product_detail.deleteProByQuoID", quoId);

  }

  @Override
  public void deleteProByWorkId(String workOrderId) {
    this.getSqlMapClientTemplate().delete("t_quotation_product_detail.deleteProByWorkID", workOrderId);
  }

  @Override
  public PaginationSupport getProducts4OutStock(Map params, int startIndex, int pageSize) {
    params.put("startIndex", startIndex);
    params.put("pageSize", pageSize);
    List<com.tl.resource.business.dto.QuotationDetailOutStockDto> list = getSqlMapClientTemplate().queryForList(
      "quotationDetail.getQuoDetailOutStockByPage", params);
    Integer totalCount = (Integer) getSqlMapClientTemplate().queryForObject("quotationDetail.getQuoDetailOutStockByPageDataCount", params);
    PaginationSupport ps = new PaginationSupport(list, totalCount, pageSize, startIndex);
    return ps;
  }

  @Override
  public List<QuotationDetailOutStockDto> getQuotationProductionsWillOutStock(String quotationInforId) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("quotationInforId", quotationInforId);
    params.put("willOutStock", new Object());
    List<com.tl.resource.business.dto.QuotationDetailOutStockDto> list = getSqlMapClientTemplate().queryForList(
      "quotationDetail.getQuoDetailOutStockByPage", params);
    return list;
  }

  @Override
  public void deleteByQuoId(String quoId) {
    this.getSqlMapClientTemplate().delete("t_quotation_product_detail.deleteByQuoId", quoId);
  }

  @Override
  public List<TQuotationProductDetail> getQuotationDetailByInforId(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuotationDetailByInforId", parmMap);
  }

  @Override
  public int getQuotationDetailCountByInforId(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuotationDetailCountByInforId", parmMap);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> getQuotationDetailBySupplier(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuotationDetailBySupplier", parmMap);
  }

  @Override
  public int getQuotationDetailCountBySupplier(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuotationDetailCountBySupplier", parmMap);
    return in.intValue();
  }

  @Override
  public List<QuotationDetailDto> getQuoDetail(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetail4Copy", parmMap);
  }

  @Override
  public List<QuotationDetailForOrderDto> getQuoDetailById(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuoDetailById", parmMap);
  }

  @Override
  public int getQuoDetailCountById(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuoDetailCountById", parmMap);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> getQuoDetailBySupplier(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuoDetailBySupplier", parmMap);
  }

  @Override
  public int getQuoDetailCountBySupplier(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuoDetailCountBySupplier", parmMap);
    return in.intValue();
  }

  @Override
  public List<QuotationDetailDto> getProductList4Copy(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getProductList4Copy", parmMap);
  }

  @Override
  public List<QuotationDetailDto> getOrderPrice4Quo(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getOrderPrice4Quo", parmMap);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetaiByToolsId(String toolsId) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetaiByToolsId", toolsId);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetail4Reserve(String quoId) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetail4Reserve", quoId);
  }

  @Override
  public List<QuotationDetailDto> getQuoDetail4TestCut(String quoId) {
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getQuoDetail4Reserve", quoId);
  }

  /**
   * 预定报价选择报价单明细
   */
  @Override
  public int getQuotationDetailCountById(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuotationDetailCountById", parmMap);
    return in.intValue();
  }

  /**
   * 预定报价选择报价单明细
   */
  @Override
  public List<TQuotationProductDetail> getQuotationDetailByIdForScheduleOrder(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuotationDetailById", parmMap);
  }

  /**
   * 预定报价选择报价单非标明细
   */
  @Override
  public int getQuoDetailFbForScheduleSelfOrderCountById(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_quotation_product_detail.getQuoDetailFbForScheduleSelfOrderCountById",
      parmMap);
    return in.intValue();
  }

  /**
   * 预定报价选择报价单非标明细
   */
  @Override
  public List<QuotationDetailForOrderDto> getQuoDetailFbForScheduleSelfOrderById(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_quotation_product_detail.getQuoDetailFbForScheduleSelfOrderById", parmMap);
  }

  @Override
  public int updateQuotationDetailOrderAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.updateQuotationDetailOrderAmount", para);
    return rows;
  }

  @Override
  public int updateQuotationDetailArrivalAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.updateQuotationDetailArrivalAmount", para);
    return rows;
  }

  @Override
  public int updateQuotationDetailDeliveryAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.updateQuotationDetailDeliveryAmount", para);
    return rows;
  }

  @Override
  public int updateQuotationDetailOutAmount(HashMap<String, String> para) {
    // TODO Auto-generated method stub
    int rows = getSqlMapClientTemplate().update("t_quotation_product_detail.updateQuotationDetailOutAmount", para);
    return rows;
  }

  @Override
  public List<QuotationDetailDto> getYuDingQuoDetail2CreateContract(String id) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("quotationDetail.getYuDingQuoDetail2CreateContract", id);
  }
}