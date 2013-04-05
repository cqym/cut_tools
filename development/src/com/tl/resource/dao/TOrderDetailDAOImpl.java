package com.tl.resource.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.resource.business.dto.ArrivalOrderDetialsDto;
import com.tl.resource.business.dto.OrderDetialsDto;
import com.tl.resource.dao.pojo.TOrderDetail;
import com.tl.resource.dao.pojo.TOrderDetailExample;

public class TOrderDetailDAOImpl extends SqlMapClientDaoSupport implements TOrderDetailDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TOrderDetailDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int countByExample(TOrderDetailExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_order_detail.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByExample(TOrderDetailExample example) {
    int rows = getSqlMapClientTemplate().delete("t_order_detail.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TOrderDetail key = new TOrderDetail();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_order_detail.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insert(TOrderDetail record) {
    getSqlMapClientTemplate().insert("t_order_detail.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insertSelective(TOrderDetail record) {
    getSqlMapClientTemplate().insert("t_order_detail.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public List selectByExample(TOrderDetailExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_order_detail.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TOrderDetail selectByPrimaryKey(String id) {
    TOrderDetail key = new TOrderDetail();
    key.setId(id);
    TOrderDetail record = (TOrderDetail) getSqlMapClientTemplate().queryForObject("t_order_detail.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExampleSelective(TOrderDetail record, TOrderDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_order_detail.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExample(TOrderDetail record, TOrderDetailExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_order_detail.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKeySelective(TOrderDetail record) {
    int rows = getSqlMapClientTemplate().update("t_order_detail.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKey(TOrderDetail record) {
    int rows = getSqlMapClientTemplate().update("t_order_detail.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_order_detail
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  private static class UpdateByExampleParms extends TOrderDetailExample {
    private Object record;

    public UpdateByExampleParms(Object record, TOrderDetailExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<OrderDetialsDto> getOrderDetailsList(Map<String, Object> parmMap) {
    List<OrderDetialsDto> list = new ArrayList<OrderDetialsDto>();
    list = this.getSqlMapClientTemplate().queryForList("t_order_detail.getOrderDetailsByOrderId", parmMap);
    return list;
  }

  @Override
  public int getOrderDetailsTotal(String orderId) {
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getOrderDetailsTotal", orderId);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> getOrderDetailsLists(Map<String, Object> parmMap) {
    List<OrderDetialsDto> list = new ArrayList<OrderDetialsDto>();
    list = this.getSqlMapClientTemplate().queryForList("t_order_detail.getOrderDetailsList", parmMap);
    return list;
  }

  @Override
  public int getOrderDetailsListsCount(Map<String, Object> parmMap) {
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getOrderDetailsListCount", parmMap);
    return in.intValue();
  }

  @Override
  public OrderDetialsDto insertOrderDetail(OrderDetialsDto orderDetail) {
    // TODO Auto-generated method stub
    return (OrderDetialsDto) this.getSqlMapClientTemplate().insert("t_order_detail.ibatorgenerated_insertSelective", orderDetail);
  }

  @Override
  public void updateOrderDetail(OrderDetialsDto orderDetail) {
    // TODO Auto-generated method stub
    this.getSqlMapClientTemplate().update("t_order_detail.ibatorgenerated_updateByPrimaryKeySelective", orderDetail);
  }

  @Override
  public void deleteByOrderId(String id) {
    // TODO Auto-generated method stub
    this.getSqlMapClientTemplate().delete("t_order_detail.deleteByOrderId", id);
  }

  @Override
  public int getOrderDetailsTotalByOrderId(String id) {
    return (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getOrderDetailsTotalByOrderId", id);
  }

  @Override
  public List<OrderDetialsDto> getOrderDetailsHasReserveInfor1(String orderId) {
    List<OrderDetialsDto> list = new ArrayList<OrderDetialsDto>();
    list = this.getSqlMapClientTemplate().queryForList("t_order_detail.getOrderDetailsByOrderIdHasReserve", orderId);
    return list;
  }

  @Override
  public List<ArrivalOrderDetialsDto> getDetailWithHasArrivalByOrderId(String orderId) {
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getDetailWithHasArrivalByOrderId", orderId);
  }

  @Override
  public Integer getCanArrivalPro(String orderId) {
    return (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getCanArrivalPro", orderId);
  }

  /**合同订单详细**/
  @Override
  public List<OrderDetialsDto> getCOrderDetail(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getCOrderOrderDetails", parmMap);

  }

  /**储备订单详细**/
  public List<OrderDetialsDto> getROrderDetailsList(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getROrderDetailsList", parmMap);

  }

  public int getROrderDetailsListCount(Map<String, Object> parmMap) {
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getROrderDetailsListCount", parmMap);
    return in.intValue();

  }

  @Override
  public void deleteOrderDetailById(String id) {
    // TODO Auto-generated method stub
    this.getSqlMapClientTemplate().delete("t_order_detail.deleteById", id);
  }

  @Override
  public List<OrderDetialsDto> getSOrderDetailList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getSOrderDetailList", parmMap);
  }

  @Override
  public int getSOrderDetailListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getSOrderDetailListCount", parmMap);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> getSSOrderDetailsList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getSSOrderDetailsList", parmMap);
  }

  @Override
  public int getSSOrderDetailsListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getSSOrderDetailsListCount", parmMap);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> selectOrderDetailFromContract(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.selectOrderDetailFromContract", parmMap);
  }

  @Override
  public int selectOrderDetailCountFromContract(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.selectOrderDetailCountFromContract", parmMap);
    return in.intValue();
  }

  @Override
  public List<OrderDetialsDto> getOrderDetailById(String id) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.getOrderDetailById", id);
  }

  @Override
  public List<TOrderDetail> cmprStockPrice(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("t_order_detail.cmprStockPrice", parmMap);
  }

  @Override
  public Integer getNoEditPlanProductsCount(String orderInforId) {
    Integer in = (Integer) this.getSqlMapClientTemplate().queryForObject("t_order_detail.getNoEditPlanProductsCount", orderInforId);
    return in.intValue();
  }

  @Override
  public void sycArrivalDetailOrderAmount(String orderId) {
    // TODO Auto-generated method stub
    this.getSqlMapClientTemplate().update("t_order_detail.sycArrivalDetailOrderAmount", orderId);

  }
}