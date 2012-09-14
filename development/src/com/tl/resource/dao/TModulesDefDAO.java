package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TModulesDef;
import com.tl.resource.dao.pojo.TModulesDefExample;
import java.util.List;

public interface TModulesDefDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int countByExample(TModulesDefExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByExample(TModulesDefExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insert(TModulesDef record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insertSelective(TModulesDef record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	List selectByExample(TModulesDefExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	TModulesDef selectByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExampleSelective(TModulesDef record, TModulesDefExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExample(TModulesDef record, TModulesDefExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKeySelective(TModulesDef record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_modules_def
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKey(TModulesDef record);
	
	String findNewId(String pid);

	List<TModulesDef> getUsersModules(String userId, String parentId);
}