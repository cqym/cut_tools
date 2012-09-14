package com.tl.resource.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tl.resource.dao.pojo.TRolesModulesExample;
import com.tl.resource.dao.pojo.TRolesModulesKey;

public class TRolesModulesDAOImpl extends SqlMapClientDaoSupport implements TRolesModulesDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public TRolesModulesDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int countByExample(TRolesModulesExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_roles_modules.ibatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int deleteByExample(TRolesModulesExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"t_roles_modules.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int deleteByPrimaryKey(TRolesModulesKey key) {
		int rows = getSqlMapClientTemplate().delete(
				"t_roles_modules.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void insert(TRolesModulesKey record) {
		getSqlMapClientTemplate().insert(
				"t_roles_modules.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void insertSelective(TRolesModulesKey record) {
		getSqlMapClientTemplate().insert(
				"t_roles_modules.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public List selectByExample(TRolesModulesExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_roles_modules.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByExampleSelective(TRolesModulesKey record,
			TRolesModulesExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_roles_modules.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByExample(TRolesModulesKey record,
			TRolesModulesExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_roles_modules.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_roles_modules
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private static class UpdateByExampleParms extends TRolesModulesExample {
		private Object record;

		public UpdateByExampleParms(Object record, TRolesModulesExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@Override
	public List<TRolesModulesKey> selectRoleModules(String roleId) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("t_roles_modules.RoleModules", roleId);
	}

	@Override
	public List<com.tl.resource.business.dto.ModulesCheckBoxDto> getRoleCheckModulesChildren(String roleId,String parentId) {
		// TODO Auto-generated method stub
		HashMap param = new HashMap();
		param.put("parentId", parentId);
		param.put("roleId", roleId);
		return getSqlMapClientTemplate().queryForList("t_roles_modules.RoleCheckModules",param);
	}
}