package com.tl.resource.dao;

import com.tl.resource.business.dto.TreeDto;
import com.tl.resource.dao.pojo.TProductBrand;
import com.tl.resource.dao.pojo.TProductBrandExample;
import java.util.List;
import java.util.Map;

public interface TProductBrandDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int countByExample(TProductBrandExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int deleteByExample(TProductBrandExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    void insert(TProductBrand record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    void insertSelective(TProductBrand record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    List selectByExample(TProductBrandExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    TProductBrand selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int updateByExampleSelective(TProductBrand record, TProductBrandExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int updateByExample(TProductBrand record, TProductBrandExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int updateByPrimaryKeySelective(TProductBrand record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_product_brand
     *
     * @ibatorgenerated Wed Nov 25 18:10:59 CST 2009
     */
    int updateByPrimaryKey(TProductBrand record);
    
    /**
     * 根据名称获取品牌
     * @param name 品牌名称
     * @return
     */
    public List<TProductBrand> getProBrandByName(String name);
    
    /**
     * 根据来源获取品牌
     * @param sorceName
     * @return
     */
    public List<TProductBrand> getProBrandBySorce(Map<String, Object> paramMap);
    
    /**
	 * 获取品牌信息(ftl 2009-12-22)
	 * @param parmMap
	 * @return
	 */
	public List<TProductBrand> getProductBrand(Map<String, Object> parmMap);
	
	/**
	 * 获取品牌信息总数(ftl 2009-12-22)
	 * @return
	 */
	public Integer getProductBrandTotal(Map<String, Object> parmMap);

	List<TProductBrand> getRunData(Map<String, Object> paramMap);

	List<TProductBrand> getProductBrankList(Map<String, Object> parmMap);
	
	 /**
     * 根据名称 来源 获取品牌
     * @param name 品牌名称
     * @return
     */
    public List<TProductBrand> getBrand4import(TreeDto treeDto);
    
    public void updateToolsByBrand(Map<String, Object> parmMap);
}