package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TRoles;
import com.tl.resource.dao.pojo.TRolesExample;
import java.util.List;

public interface TRolesDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int countByExample(TRolesExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByExample(TRolesExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insert(TRoles record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	void insertSelective(TRoles record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	List selectByExample(TRolesExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	TRoles selectByPrimaryKey(String id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExampleSelective(TRoles record, TRolesExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByExample(TRoles record, TRolesExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKeySelective(TRoles record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	int updateByPrimaryKey(TRoles record);
}