package com.tl.resource.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.resource.dao.pojo.TSuppliersInfor;
import com.tl.resource.dao.pojo.TSuppliersInforExample;

public class TSuppliersInforDAOImpl extends SqlMapClientDaoSupport implements TSuppliersInforDAO {

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TSuppliersInforDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int countByExample(TSuppliersInforExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByExample(TSuppliersInforExample example) {
    int rows = getSqlMapClientTemplate().delete("t_suppliers_infor.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TSuppliersInfor key = new TSuppliersInfor();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_suppliers_infor.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insert(TSuppliersInfor record) {
    getSqlMapClientTemplate().insert("t_suppliers_infor.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public void insertSelective(TSuppliersInfor record) {
    getSqlMapClientTemplate().insert("t_suppliers_infor.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public List selectByExample(TSuppliersInforExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_suppliers_infor.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public TSuppliersInfor selectByPrimaryKey(String id) {
    TSuppliersInfor key = new TSuppliersInfor();
    key.setId(id);
    TSuppliersInfor record = (TSuppliersInfor) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExampleSelective(TSuppliersInfor record, TSuppliersInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_suppliers_infor.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByExample(TSuppliersInfor record, TSuppliersInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_suppliers_infor.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKeySelective(TSuppliersInfor record) {
    int rows = getSqlMapClientTemplate().update("t_suppliers_infor.ibatorgenerated_updateByPrimaryKeySelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  public int updateByPrimaryKey(TSuppliersInfor record) {
    int rows = getSqlMapClientTemplate().update("t_suppliers_infor.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_suppliers_infor
   * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
   */
  private static class UpdateByExampleParms extends TSuppliersInforExample {
    private Object record;

    public UpdateByExampleParms(Object record, TSuppliersInforExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<TSuppliersInfor> getSupplierList(Map<String, Object> parmMap) {
    return getSqlMapClientTemplate().queryForList("t_suppliers_infor.getSupplierList", parmMap);
  }

  @Override
  public int getSupplierListCount(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.getSupplierListCount", parmMap);
    return in.intValue();
  }

  @Override
  public List<TSuppliersInfor> getSuppliersByPage(Map<String, Object> parmMap) {
    return getSqlMapClientTemplate().queryForList("t_suppliers_infor.getSuppliersByPage", parmMap);
  }

  @Override
  public int getSuppliersTotal(Map<String, Object> parmMap) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.getSuppliersTotal", parmMap);
    return count.intValue();
  }

  @Override
  public List<TSuppliersInfor> getAllSupplierListBySupplierName(Map<String, Object> parmMap) {
    return getSqlMapClientTemplate().queryForList("t_suppliers_infor.getAllSupplierListBySupplierName", parmMap);
  }

  @Override
  public List<TSuppliersInfor> getSupplierListByQid(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_suppliers_infor.getSupplierListByQid", parmMap);
  }

  @Override
  public int getSupplierListCountByQid(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.getSupplierListCountByQid", parmMap);
    return in.intValue();
  }

  @Override
  public List<TSuppliersInfor> getPlanDetailSuppliersByPage(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return getSqlMapClientTemplate().queryForList("t_suppliers_infor.getPlanDetailSupplierList", parmMap);
  }

  @Override
  public Integer getPlanSuppliersTotal(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    Integer in = (Integer) getSqlMapClientTemplate().queryForObject("t_suppliers_infor.getPlanDetailSupplierListCount", parmMap);
    return in.intValue();
  }

}