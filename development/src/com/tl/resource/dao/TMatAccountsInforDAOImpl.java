package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TMatAccountsInfor;
import com.tl.resource.dao.pojo.TMatAccountsInforExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TMatAccountsInforDAOImpl extends SqlMapClientDaoSupport implements TMatAccountsInforDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public TMatAccountsInforDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public void insert(TMatAccountsInfor record) {
		getSqlMapClientTemplate().insert(
				"t_mat_accounts_infor.abatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int updateByPrimaryKey(TMatAccountsInfor record) {
		int rows = getSqlMapClientTemplate().update(
				"t_mat_accounts_infor.abatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int updateByPrimaryKeySelective(TMatAccountsInfor record) {
		int rows = getSqlMapClientTemplate()
				.update(
						"t_mat_accounts_infor.abatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public List selectByExample(TMatAccountsInforExample example) {
		List list = getSqlMapClientTemplate()
				.queryForList(
						"t_mat_accounts_infor.abatorgenerated_selectByExample",
						example);
		return list;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public TMatAccountsInfor selectByPrimaryKey(String id) {
		TMatAccountsInfor key = new TMatAccountsInfor();
		key.setId(id);
		TMatAccountsInfor record = (TMatAccountsInfor) getSqlMapClientTemplate()
				.queryForObject(
						"t_mat_accounts_infor.abatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int deleteByExample(TMatAccountsInforExample example) {
		int rows = getSqlMapClientTemplate()
				.delete("t_mat_accounts_infor.abatorgenerated_deleteByExample",
						example);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int deleteByPrimaryKey(String id) {
		TMatAccountsInfor key = new TMatAccountsInfor();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"t_mat_accounts_infor.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int countByExample(TMatAccountsInforExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_mat_accounts_infor.abatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int updateByExampleSelective(TMatAccountsInfor record,
			TMatAccountsInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate()
				.update(
						"t_mat_accounts_infor.abatorgenerated_updateByExampleSelective",
						parms);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	public int updateByExample(TMatAccountsInfor record,
			TMatAccountsInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_mat_accounts_infor.abatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table t_mat_accounts_infor
	 * @abatorgenerated  Sun Sep 11 15:45:49 CST 2011
	 */
	private static class UpdateByExampleParms extends TMatAccountsInforExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				TMatAccountsInforExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}