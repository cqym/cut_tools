package com.tl.resource.dao;

import com.tl.resource.business.dto.OrderPriceHistoryDto;
import com.tl.resource.dao.pojo.TOrderPriceHistory;
import com.tl.resource.dao.pojo.TOrderPriceHistoryExample;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TOrderPriceHistoryDAOImpl extends SqlMapClientDaoSupport implements
		TOrderPriceHistoryDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public TOrderPriceHistoryDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int countByExample(TOrderPriceHistoryExample example) {
		Integer count = (Integer) getSqlMapClientTemplate()
				.queryForObject(
						"t_order_price_history.ibatorgenerated_countByExample",
						example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int deleteByExample(TOrderPriceHistoryExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"t_order_price_history.ibatorgenerated_deleteByExample",
				example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int deleteByPrimaryKey(String id) {
		TOrderPriceHistory key = new TOrderPriceHistory();
		key.setId(id);
		int rows = getSqlMapClientTemplate()
				.delete(
						"t_order_price_history.ibatorgenerated_deleteByPrimaryKey",
						key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public void insert(TOrderPriceHistory record) {
		getSqlMapClientTemplate().insert(
				"t_order_price_history.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public void insertSelective(TOrderPriceHistory record) {
		getSqlMapClientTemplate()
				.insert(
						"t_order_price_history.ibatorgenerated_insertSelective",
						record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public List selectByExample(TOrderPriceHistoryExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"t_order_price_history.ibatorgenerated_selectByExample",
				example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public TOrderPriceHistory selectByPrimaryKey(String id) {
		TOrderPriceHistory key = new TOrderPriceHistory();
		key.setId(id);
		TOrderPriceHistory record = (TOrderPriceHistory) getSqlMapClientTemplate()
				.queryForObject(
						"t_order_price_history.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int updateByExampleSelective(TOrderPriceHistory record,
			TOrderPriceHistoryExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate()
				.update(
						"t_order_price_history.ibatorgenerated_updateByExampleSelective",
						parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int updateByExample(TOrderPriceHistory record,
			TOrderPriceHistoryExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"t_order_price_history.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int updateByPrimaryKeySelective(TOrderPriceHistory record) {
		int rows = getSqlMapClientTemplate()
				.update(
						"t_order_price_history.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	public int updateByPrimaryKey(TOrderPriceHistory record) {
		int rows = getSqlMapClientTemplate().update(
				"t_order_price_history.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds
	 * to the database table t_order_price_history
	 * 
	 * @ibatorgenerated Fri Oct 16 10:53:02 CST 2009
	 */
	private static class UpdateByExampleParms extends TOrderPriceHistoryExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				TOrderPriceHistoryExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@Override
	public List<OrderPriceHistoryDto> getOrderPriceHistoryProductByPage(
			Map<String, Object> parmMap) {
		List<OrderPriceHistoryDto> list = getSqlMapClientTemplate().queryForList(
				"orderPriceHistory.getOrderPriceHistoryProductByPage",
				parmMap);
		return list;
	}

	@Override
	public int getOrderPriceHistoryProductTotal(Map<String, Object> parmMap) {
		Integer count = (Integer) getSqlMapClientTemplate()
				.queryForObject(
						"orderPriceHistory.getOrderPriceHistoryProductTotal",parmMap);
		return count.intValue();
	}

	@Override
	public List<OrderPriceHistoryDto> getOrderHistoryProductByPageAndProductId(
			Map<String, Object> parmMap) {
		List<OrderPriceHistoryDto> list = getSqlMapClientTemplate().queryForList(
				"orderPriceHistory.getOrderHistoryProductByPageAndProductId",
				parmMap);
		return list;
	}

	@Override
	public int getOrderHistoryProductTotalByProductId(
			Map<String, Object> parmMap) {
		
		Integer count = (Integer) getSqlMapClientTemplate()
		.queryForObject(
				"orderPriceHistory.getOrderHistoryProductTotalByProductId");
		
		return count.intValue();
	}
}