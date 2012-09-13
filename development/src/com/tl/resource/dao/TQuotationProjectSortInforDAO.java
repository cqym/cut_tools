package com.tl.resource.dao;

import java.util.List;
import java.util.Map;

import com.tl.resource.dao.pojo.TQuotationProjectSortInfor;
import com.tl.resource.dao.pojo.TQuotationProjectSortInforExample;

public interface TQuotationProjectSortInforDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int countByExample(TQuotationProjectSortInforExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int deleteByExample(TQuotationProjectSortInforExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	void insert(TQuotationProjectSortInfor record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	void insertSelective(TQuotationProjectSortInfor record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	List selectByExample(TQuotationProjectSortInforExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	TQuotationProjectSortInfor selectByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int updateByExampleSelective(TQuotationProjectSortInfor record,
			TQuotationProjectSortInforExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int updateByExample(TQuotationProjectSortInfor record,
			TQuotationProjectSortInforExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int updateByPrimaryKeySelective(TQuotationProjectSortInfor record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_quotation_project_sort_infor
	 * @ibatorgenerated  Tue Jan 12 09:48:33 CST 2010
	 */
	int updateByPrimaryKey(TQuotationProjectSortInfor record);
	
	List<TQuotationProjectSortInfor> getWorkOrderList(Map<String, Object> parmMap);
	/**
	 * 删除工单按报价单Id
	 * @param quoId
	 */
	public  void deleteWorkOrderByQuoId(String quoId);
	
	/**
	 * 根据报价单编号得到分项信息
	 * @param parmMap
	 * @return
	 */
	List<TQuotationProjectSortInfor> getSPSIList(Map<String, Object> parmMap);



	
	
}