package com.tl.resource.dao;

import com.tl.resource.dao.pojo.TReserveInfor;
import com.tl.resource.dao.pojo.TReserveInforExample;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TReserveInforDAOImpl extends SqlMapClientDaoSupport implements TReserveInforDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public TReserveInforDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int countByExample(TReserveInforExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_reserve_infor.ibatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int deleteByExample(TReserveInforExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"t_reserve_infor.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int deleteByPrimaryKey(String id) {
		TReserveInfor key = new TReserveInfor();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"t_reserve_infor.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void insert(TReserveInfor record) {
		getSqlMapClientTemplate().insert(
				"t_reserve_infor.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void insertSelective(TReserveInfor record) {
		getSqlMapClientTemplate().insert(
				"t_reserve_infor.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public List selectByExample(TReserveInforExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_reserve_infor.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public TReserveInfor selectByPrimaryKey(String id) {
		TReserveInfor key = new TReserveInfor();
		key.setId(id);
		TReserveInfor record = (TReserveInfor) getSqlMapClientTemplate()
				.queryForObject(
						"t_reserve_infor.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByExampleSelective(TReserveInfor record,
			TReserveInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_reserve_infor.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByExample(TReserveInfor record,
			TReserveInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_reserve_infor.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByPrimaryKeySelective(TReserveInfor record) {
		int rows = getSqlMapClientTemplate().update(
				"t_reserve_infor.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public int updateByPrimaryKey(TReserveInfor record) {
		int rows = getSqlMapClientTemplate().update(
				"t_reserve_infor.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_reserve_infor
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	private static class UpdateByExampleParms extends TReserveInforExample {
		private Object record;

		public UpdateByExampleParms(Object record, TReserveInforExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@Override
	public TReserveInfor getReserveInfoByProCode(String id) {
		return (TReserveInfor)this.getSqlMapClientTemplate().queryForObject("t_reserve_infor.getReserveInfoByProCode", id);
	}

	@Override
	public int updateAmountByPrimaryKey(TReserveInfor record) {
		int rows = getSqlMapClientTemplate().update(
				"t_reserve_infor.updateReserveAmount",
				record);
		return rows;
	}

	@Override
	public List<TReserveInfor> getReserveByPage(Map<String, Object> parmMap) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_reserve_infor.getReserveByPage", parmMap);
		return list;
	}

	@Override
	public int getReserveTotal(Map<String, Object> parmMap) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_reserve_infor.getReserveTotal", parmMap);
		return count.intValue();
	}
}