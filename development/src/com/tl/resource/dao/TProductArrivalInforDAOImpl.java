package com.tl.resource.dao;

import com.tl.resource.business.dto.ArrivalInforDto;
import com.tl.resource.dao.pojo.TProductArrivalInfor;
import com.tl.resource.dao.pojo.TProductArrivalInforExample;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TProductArrivalInforDAOImpl extends SqlMapClientDaoSupport implements TProductArrivalInforDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public TProductArrivalInforDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int countByExample(TProductArrivalInforExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"t_product_arrival_infor.ibatorgenerated_countByExample",
				example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int deleteByExample(TProductArrivalInforExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"t_product_arrival_infor.ibatorgenerated_deleteByExample",
				example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int deleteByPrimaryKey(String id) {
		TProductArrivalInfor key = new TProductArrivalInfor();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"t_product_arrival_infor.ibatorgenerated_deleteByPrimaryKey",
				key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public void insert(TProductArrivalInfor record) {
		getSqlMapClientTemplate().insert(
				"t_product_arrival_infor.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public void insertSelective(TProductArrivalInfor record) {
		getSqlMapClientTemplate().insert(
				"t_product_arrival_infor.ibatorgenerated_insertSelective",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public List selectByExample(TProductArrivalInforExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_product_arrival_infor.ibatorgenerated_selectByExample",
				example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public TProductArrivalInfor selectByPrimaryKey(String id) {
		TProductArrivalInfor key = new TProductArrivalInfor();
		key.setId(id);
		TProductArrivalInfor record = (TProductArrivalInfor) getSqlMapClientTemplate()
				.queryForObject(
						"t_product_arrival_infor.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int updateByExampleSelective(TProductArrivalInfor record,
			TProductArrivalInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate()
				.update(
						"t_product_arrival_infor.ibatorgenerated_updateByExampleSelective",
						parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int updateByExample(TProductArrivalInfor record,
			TProductArrivalInforExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_product_arrival_infor.ibatorgenerated_updateByExample",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int updateByPrimaryKeySelective(TProductArrivalInfor record) {
		int rows = getSqlMapClientTemplate()
				.update(
						"t_product_arrival_infor.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	public int updateByPrimaryKey(TProductArrivalInfor record) {
		int rows = getSqlMapClientTemplate().update(
				"t_product_arrival_infor.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_product_arrival_infor
	 * @ibatorgenerated  Fri Nov 06 19:04:07 CST 2009
	 */
	private static class UpdateByExampleParms extends
			TProductArrivalInforExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				TProductArrivalInforExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@Override
	public Integer getArrInfoTotalBySearch(Map<String, Object> paramMap) {
		return (Integer)this.getSqlMapClientTemplate().queryForObject("t_product_arrival_infor.getArrInfoTotalBySearch", paramMap);
	}

	@Override
	public List<TProductArrivalInfor> getArrivalInfoBySearch(
			Map<String, Object> paramMap) {
		return this.getSqlMapClientTemplate().queryForList("t_product_arrival_infor.getArrivalInfoBySearch", paramMap);
	}

	@Override
	public TProductArrivalInfor getArrInfoWithProById(String arrInfoId) {
		return (TProductArrivalInfor)this.getSqlMapClientTemplate().queryForObject("t_product_arrival_infor.getArrInfoWithProById", arrInfoId);
	}

	@Override
	public ArrivalInforDto getArrInfoWithOrderType(String arrInfoId) {
		return (ArrivalInforDto)this.getSqlMapClientTemplate().queryForObject("t_product_arrival_infor.getArrInfoWithOrderType", arrInfoId);
	}

	@Override
	public Integer getDirectArrTotalBySearch(Map<String, Object> paramMap) {
		return (Integer)this.getSqlMapClientTemplate().queryForObject("t_product_arrival_infor.getDirectArrTotalBySearch", paramMap);
	}

	@Override
	public List<TProductArrivalInfor> getDirectArrivalBySearch(
			Map<String, Object> paramMap) {
		return this.getSqlMapClientTemplate().queryForList("t_product_arrival_infor.getDirectArrivalBySearch", paramMap);
	}

	@Override
	public TProductArrivalInfor getDirectArrInfoById(String id) {
		return (TProductArrivalInfor)this.getSqlMapClientTemplate().queryForObject("t_product_arrival_infor.getDirectArrInfoById", id);
	}

	@Override
	public Integer updateStatus(TProductArrivalInfor arrInfo) {
		return this.getSqlMapClientTemplate().update("t_product_arrival_infor.updateStatus", arrInfo);
	}
}