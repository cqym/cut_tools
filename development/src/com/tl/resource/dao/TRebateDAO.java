package com.tl.resource.dao;

import com.tl.resource.business.dto.DegreeRebateDto;
import com.tl.resource.dao.pojo.TRebate;
import com.tl.resource.dao.pojo.TRebateExample;
import java.util.List;
import java.util.Map;

public interface TRebateDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int countByExample(TRebateExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByExample(TRebateExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insert(TRebate record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insertSelective(TRebate record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	List selectByExample(TRebateExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	TRebate selectByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExampleSelective(TRebate record, TRebateExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExample(TRebate record, TRebateExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKeySelective(TRebate record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_rebate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKey(TRebate record);

	/**
	 * 等级对应折扣信息详细
	 * @param parmMap
	 * @return
	 */
	List<DegreeRebateDto> getDegreeRebateByPageAndDegreeId(
			Map<String, Object> parmMap);
	/**
	 * 等级对应折扣信息总数
	 * @param parmMap
	 * @return
	 */
	int getDegreeRebateTotalByDegreeId(Map<String, Object> parmMap);
}