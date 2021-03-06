package com.tl.resource.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.common.util.PaginationSupport;
import com.tl.resource.business.dto.ImportSalesPriceDto;
import com.tl.resource.business.dto.TreeDto;
import com.tl.resource.dao.pojo.TProductToolsInfor;
import com.tl.resource.dao.pojo.TProductToolsInforExample;

public class TProductToolsInforDAOImpl extends SqlMapClientDaoSupport implements TProductToolsInforDAO {

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public TProductToolsInforDAOImpl() {
    super();
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int countByExample(TProductToolsInforExample example) {
    Integer count = (Integer) getSqlMapClientTemplate().queryForObject("t_product_tools_infor.ibatorgenerated_countByExample", example);
    return count.intValue();
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int deleteByExample(TProductToolsInforExample example) {
    int rows = getSqlMapClientTemplate().delete("t_product_tools_infor.ibatorgenerated_deleteByExample", example);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int deleteByPrimaryKey(String id) {
    TProductToolsInfor key = new TProductToolsInfor();
    key.setId(id);
    int rows = getSqlMapClientTemplate().delete("t_product_tools_infor.ibatorgenerated_deleteByPrimaryKey", key);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public void insert(TProductToolsInfor record) {
    getSqlMapClientTemplate().insert("t_product_tools_infor.ibatorgenerated_insert", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public void insertSelective(TProductToolsInfor record) {
    getSqlMapClientTemplate().insert("t_product_tools_infor.ibatorgenerated_insertSelective", record);
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public List selectByExample(TProductToolsInforExample example) {
    List list = getSqlMapClientTemplate().queryForList("t_product_tools_infor.ibatorgenerated_selectByExample", example);
    return list;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public TProductToolsInfor selectByPrimaryKey(String id) {
    TProductToolsInfor key = new TProductToolsInfor();
    key.setId(id);
    TProductToolsInfor record = (TProductToolsInfor) getSqlMapClientTemplate().queryForObject(
      "t_product_tools_infor.ibatorgenerated_selectByPrimaryKey", key);
    return record;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int updateByExampleSelective(TProductToolsInfor record, TProductToolsInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_product_tools_infor.ibatorgenerated_updateByExampleSelective", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int updateByExample(TProductToolsInfor record, TProductToolsInforExample example) {
    UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
    int rows = getSqlMapClientTemplate().update("t_product_tools_infor.ibatorgenerated_updateByExample", parms);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int updateByPrimaryKeySelective(TProductToolsInfor record) {
    int rows = getSqlMapClientTemplate().update("t_product_tools_infor.updateProToolsByIdSelective", record);
    return rows;
  }

  /**
   * This method was generated by Apache iBATIS ibator.
   * This method corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  public int updateByPrimaryKey(TProductToolsInfor record) {
    int rows = getSqlMapClientTemplate().update("t_product_tools_infor.ibatorgenerated_updateByPrimaryKey", record);
    return rows;
  }

  /**
   * This class was generated by Apache iBATIS ibator.
   * This class corresponds to the database table t_product_tools_infor
   *
   * @ibatorgenerated Sat Oct 10 22:46:55 CST 2009
   */
  private static class UpdateByExampleParms extends TProductToolsInforExample {
    private Object record;

    public UpdateByExampleParms(Object record, TProductToolsInforExample example) {
      super(example);
      this.record = record;
    }

    public Object getRecord() {
      return record;
    }
  }

  @Override
  public List<TProductToolsInfor> getProToolsByPage(PaginationSupport pageInfo) {
    List<TProductToolsInfor> list = new ArrayList<TProductToolsInfor>();
    list = this.getSqlMapClientTemplate().queryForList("t_product_tools_infor.getProToolsByPage", pageInfo);
    return list;
  }

  @Override
  public List<TProductToolsInfor> getProToolsByParId(String parId) {
    return this.getSqlMapClientTemplate().queryForList("t_product_tools_infor.getProToolsByParId", parId);
  }

  @Override
  public List<TreeDto> getProTreeByPage(PaginationSupport pageInfo) {
    return this.getSqlMapClientTemplate().queryForList("proTree.getProToolsByPage", pageInfo);
  }

  @Override
  public int getProToolsTotal() {
    return (Integer) this.getSqlMapClientTemplate().queryForObject("proTree.getProToolsTotal");
  }

  @Override
  public String getId(String parId) {
    return this.getSqlMapClientTemplate().queryForObject("proTree.getId", parId).toString();
  }

  @Override
  public TreeDto getProTreeById(String id) {
    return (TreeDto) this.getSqlMapClientTemplate().queryForObject("proTree.getProTreeById", id);
  }

  @Override
  public void deleteProTools(String id) {
    this.getSqlMapClientTemplate().delete("proTree.deletePorToolById", id);
  }

  @Override
  public void deleteProTools(List<TreeDto> list) {
    if (list != null && list.size() > 0) {
      for (TreeDto treeDto : list) {
        deleteProTools(treeDto.getId());
      }
    }

  }

  @Override
  public TProductToolsInfor getProToolsById(String id) {
    return (TProductToolsInfor) this.getSqlMapClientTemplate().queryForObject("t_product_tools_infor.getProToolsById", id);
  }

  @Override
  public void updateProToolsById(TProductToolsInfor proTools) {
    this.getSqlMapClientTemplate().update("t_product_tools_infor.updateProToolsByIdSelective", proTools);
  }

  @Override
  public List<TreeDto> getProToolsBySearch(Map<String, Object> parmMap) {
    List<TreeDto> list = new ArrayList<TreeDto>();
    list = this.getSqlMapClientTemplate().queryForList("proTree.getProToolsBySearch", parmMap);
    return list;
  }

  @Override
  public int getProToolsTotal(Map<String, Object> parmMap) {
    return (Integer) this.getSqlMapClientTemplate().queryForObject("proTree.getProToolsTotalBySearch", parmMap);
  }

  @Override
  public List<TreeDto> getOrderProToolsList(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return this.getSqlMapClientTemplate().queryForList("OrderProTree.getOrderProToolsList", parmMap);
  }

  @Override
  public int getOrderProToolsTotal(Map<String, Object> parmMap) {
    // TODO Auto-generated method stub
    return (Integer) this.getSqlMapClientTemplate().queryForObject("OrderProTree.getOrderProToolsListCount", parmMap);
  }

  @Override
  public TreeDto getProductToolsInfoById(String id) {
    return (TreeDto) this.getSqlMapClientTemplate().queryForObject("proTree.getProToolsById", id);
  }

  @Override
  public List<TreeDto> getTreeDto(TreeDto treeDto) {
    return this.getSqlMapClientTemplate().queryForList("proTree.getTreeDto", treeDto);
  }

  @Override
  public List<TreeDto> getToolsBySearch(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("proTree.getToolsBySearch", parmMap);
  }

  @Override
  public List<TreeDto> getToolsByRootNode(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("proTree.getToolsByRootNode", parmMap);
  }

  @Override
  public List<TreeDto> getToolsWithChildren(Map<String, Object> parmMap) {
    return this.getSqlMapClientTemplate().queryForList("proTree.getToolsWithChildren", parmMap);
  }

  @Override
  public boolean checkProToolsIsHaving(ImportSalesPriceDto imsDto) {

    Map<String, Object> parmMap = new HashMap<String, Object>();
    parmMap.put("brandCode", imsDto.getBrandCode());
    parmMap.put("productBrand", imsDto.getProductBrand());
    parmMap.put("productUnit", imsDto.getProductUnit());

    //如果存在原始牌号，用原始牌号查询
    if (imsDto.getOldBrandCode() != null) {
      parmMap.put("brandCode", imsDto.getOldBrandCode());
    }
    List<TProductToolsInfor> list = new ArrayList<TProductToolsInfor>();

    //System.out.println(list.get(0).getId() + "------------------------------");

    list = this.getSqlMapClientTemplate().queryForList("t_product_tools_infor.checkProToolsIsHaving", parmMap);
    if ((list.size() > 0) && (list.get(0) != null)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public TProductToolsInfor getProTools(ImportSalesPriceDto imsDto) {

    Map<String, Object> parmMap = new HashMap<String, Object>();
    parmMap.put("brandCode", imsDto.getBrandCode());
    parmMap.put("productBrand", imsDto.getProductBrand());
    parmMap.put("productUnit", imsDto.getProductUnit());

    //如果存在原始牌号，用原始牌号查询
    if (imsDto.getOldBrandCode() != null) {
      parmMap.put("brandCode", imsDto.getOldBrandCode());
    }
    List<TProductToolsInfor> list = new ArrayList<TProductToolsInfor>();
    list = this.getSqlMapClientTemplate().queryForList("t_product_tools_infor.checkProToolsIsHaving", parmMap);

    if ((list.size() > 0) && (list.get(0) != null)) {
      return list.get(0);
    } else {
      return null;
    }

  }

  @Override
  public List<HashMap> checkProsToolsIsHaving(List<ImportSalesPriceDto> imsDto) {
    if (imsDto == null || imsDto.size() == 0)
      return null;

    Map<String, Object> parmMap = new HashMap<String, Object>();
    parmMap.put("productBrand", imsDto.get(0).getProductBrand());
    ArrayList<String> l = new ArrayList<String>();
    for (Iterator iterator = imsDto.iterator(); iterator.hasNext();) {
      ImportSalesPriceDto dto = (ImportSalesPriceDto) iterator.next();
      l.add(dto.getBrandCode());
    }
    parmMap.put("brandCode", l);
    System.out.println(parmMap);
    List<HashMap> list = this.getSqlMapClientTemplate().queryForList("t_product_tools_infor.checkProsToolsBrandCode", parmMap);
    return list;
  }

  @Override
  public PaginationSupport findSupToolsList(Map<String, Object> params, String startIndex, String pageSize) {
    Integer startIndexi = (startIndex == null ? 0 : Integer.valueOf(startIndex));
    Integer pageSizei = (pageSize == null ? 0 : Integer.valueOf(pageSize));
    params.put("startIndex", startIndexi);
    params.put("pageSize", pageSizei);
    List list = getSqlMapClientTemplate().queryForList("t_product_tools_infor.findSupToolsList", params);
    Integer total = (Integer) getSqlMapClientTemplate().queryForObject("t_product_tools_infor.findSupToolsListCount", params);
    PaginationSupport pageInfor = new PaginationSupport(list, total, pageSizei, startIndexi);
    return pageInfor;
  }

  @Override
  public void sycNotStandardToolsInfor(String toolsId) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_product_tools_infor.sycNotStandardToolsInfor", toolsId);
  }

  @Override
  public void sycToolsInfor(String id) {
    // TODO Auto-generated method stub
    getSqlMapClientTemplate().update("t_product_tools_infor.sycToolsInfor", id);
  }
}