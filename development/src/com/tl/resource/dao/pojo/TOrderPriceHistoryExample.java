package com.tl.resource.dao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOrderPriceHistoryExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public TOrderPriceHistoryExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	protected TOrderPriceHistoryExample(TOrderPriceHistoryExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_order_price_history
	 * @ibatorgenerated  Tue Jan 26 17:09:30 CST 2010
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return this;
		}

		public Criteria andIdIn(List values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andSuppliersInforIdIsNull() {
			addCriterion("suppliers_infor_id is null");
			return this;
		}

		public Criteria andSuppliersInforIdIsNotNull() {
			addCriterion("suppliers_infor_id is not null");
			return this;
		}

		public Criteria andSuppliersInforIdEqualTo(String value) {
			addCriterion("suppliers_infor_id =", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdNotEqualTo(String value) {
			addCriterion("suppliers_infor_id <>", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdGreaterThan(String value) {
			addCriterion("suppliers_infor_id >", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdGreaterThanOrEqualTo(String value) {
			addCriterion("suppliers_infor_id >=", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdLessThan(String value) {
			addCriterion("suppliers_infor_id <", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdLessThanOrEqualTo(String value) {
			addCriterion("suppliers_infor_id <=", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdLike(String value) {
			addCriterion("suppliers_infor_id like", value, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdNotLike(String value) {
			addCriterion("suppliers_infor_id not like", value,
					"suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdIn(List values) {
			addCriterion("suppliers_infor_id in", values, "suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdNotIn(List values) {
			addCriterion("suppliers_infor_id not in", values,
					"suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdBetween(String value1, String value2) {
			addCriterion("suppliers_infor_id between", value1, value2,
					"suppliersInforId");
			return this;
		}

		public Criteria andSuppliersInforIdNotBetween(String value1,
				String value2) {
			addCriterion("suppliers_infor_id not between", value1, value2,
					"suppliersInforId");
			return this;
		}

		public Criteria andProductToolsInforIdIsNull() {
			addCriterion("product_tools_infor_id is null");
			return this;
		}

		public Criteria andProductToolsInforIdIsNotNull() {
			addCriterion("product_tools_infor_id is not null");
			return this;
		}

		public Criteria andProductToolsInforIdEqualTo(String value) {
			addCriterion("product_tools_infor_id =", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdNotEqualTo(String value) {
			addCriterion("product_tools_infor_id <>", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdGreaterThan(String value) {
			addCriterion("product_tools_infor_id >", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdGreaterThanOrEqualTo(String value) {
			addCriterion("product_tools_infor_id >=", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdLessThan(String value) {
			addCriterion("product_tools_infor_id <", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdLessThanOrEqualTo(String value) {
			addCriterion("product_tools_infor_id <=", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdLike(String value) {
			addCriterion("product_tools_infor_id like", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdNotLike(String value) {
			addCriterion("product_tools_infor_id not like", value,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdIn(List values) {
			addCriterion("product_tools_infor_id in", values,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdNotIn(List values) {
			addCriterion("product_tools_infor_id not in", values,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdBetween(String value1,
				String value2) {
			addCriterion("product_tools_infor_id between", value1, value2,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductToolsInforIdNotBetween(String value1,
				String value2) {
			addCriterion("product_tools_infor_id not between", value1, value2,
					"productToolsInforId");
			return this;
		}

		public Criteria andProductCodeIsNull() {
			addCriterion("product_code is null");
			return this;
		}

		public Criteria andProductCodeIsNotNull() {
			addCriterion("product_code is not null");
			return this;
		}

		public Criteria andProductCodeEqualTo(String value) {
			addCriterion("product_code =", value, "productCode");
			return this;
		}

		public Criteria andProductCodeNotEqualTo(String value) {
			addCriterion("product_code <>", value, "productCode");
			return this;
		}

		public Criteria andProductCodeGreaterThan(String value) {
			addCriterion("product_code >", value, "productCode");
			return this;
		}

		public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
			addCriterion("product_code >=", value, "productCode");
			return this;
		}

		public Criteria andProductCodeLessThan(String value) {
			addCriterion("product_code <", value, "productCode");
			return this;
		}

		public Criteria andProductCodeLessThanOrEqualTo(String value) {
			addCriterion("product_code <=", value, "productCode");
			return this;
		}

		public Criteria andProductCodeLike(String value) {
			addCriterion("product_code like", value, "productCode");
			return this;
		}

		public Criteria andProductCodeNotLike(String value) {
			addCriterion("product_code not like", value, "productCode");
			return this;
		}

		public Criteria andProductCodeIn(List values) {
			addCriterion("product_code in", values, "productCode");
			return this;
		}

		public Criteria andProductCodeNotIn(List values) {
			addCriterion("product_code not in", values, "productCode");
			return this;
		}

		public Criteria andProductCodeBetween(String value1, String value2) {
			addCriterion("product_code between", value1, value2, "productCode");
			return this;
		}

		public Criteria andProductCodeNotBetween(String value1, String value2) {
			addCriterion("product_code not between", value1, value2,
					"productCode");
			return this;
		}

		public Criteria andHistoryPriceIsNull() {
			addCriterion("history_price is null");
			return this;
		}

		public Criteria andHistoryPriceIsNotNull() {
			addCriterion("history_price is not null");
			return this;
		}

		public Criteria andHistoryPriceEqualTo(BigDecimal value) {
			addCriterion("history_price =", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceNotEqualTo(BigDecimal value) {
			addCriterion("history_price <>", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceGreaterThan(BigDecimal value) {
			addCriterion("history_price >", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("history_price >=", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceLessThan(BigDecimal value) {
			addCriterion("history_price <", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("history_price <=", value, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceIn(List values) {
			addCriterion("history_price in", values, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceNotIn(List values) {
			addCriterion("history_price not in", values, "historyPrice");
			return this;
		}

		public Criteria andHistoryPriceBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_price between", value1, value2,
					"historyPrice");
			return this;
		}

		public Criteria andHistoryPriceNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_price not between", value1, value2,
					"historyPrice");
			return this;
		}

		public Criteria andBrandCodeIsNull() {
			addCriterion("brand_code is null");
			return this;
		}

		public Criteria andBrandCodeIsNotNull() {
			addCriterion("brand_code is not null");
			return this;
		}

		public Criteria andBrandCodeEqualTo(String value) {
			addCriterion("brand_code =", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeNotEqualTo(String value) {
			addCriterion("brand_code <>", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeGreaterThan(String value) {
			addCriterion("brand_code >", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
			addCriterion("brand_code >=", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeLessThan(String value) {
			addCriterion("brand_code <", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeLessThanOrEqualTo(String value) {
			addCriterion("brand_code <=", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeLike(String value) {
			addCriterion("brand_code like", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeNotLike(String value) {
			addCriterion("brand_code not like", value, "brandCode");
			return this;
		}

		public Criteria andBrandCodeIn(List values) {
			addCriterion("brand_code in", values, "brandCode");
			return this;
		}

		public Criteria andBrandCodeNotIn(List values) {
			addCriterion("brand_code not in", values, "brandCode");
			return this;
		}

		public Criteria andBrandCodeBetween(String value1, String value2) {
			addCriterion("brand_code between", value1, value2, "brandCode");
			return this;
		}

		public Criteria andBrandCodeNotBetween(String value1, String value2) {
			addCriterion("brand_code not between", value1, value2, "brandCode");
			return this;
		}

		public Criteria andEditDateIsNull() {
			addCriterion("edit_date is null");
			return this;
		}

		public Criteria andEditDateIsNotNull() {
			addCriterion("edit_date is not null");
			return this;
		}

		public Criteria andEditDateEqualTo(Date value) {
			addCriterion("edit_date =", value, "editDate");
			return this;
		}

		public Criteria andEditDateNotEqualTo(Date value) {
			addCriterion("edit_date <>", value, "editDate");
			return this;
		}

		public Criteria andEditDateGreaterThan(Date value) {
			addCriterion("edit_date >", value, "editDate");
			return this;
		}

		public Criteria andEditDateGreaterThanOrEqualTo(Date value) {
			addCriterion("edit_date >=", value, "editDate");
			return this;
		}

		public Criteria andEditDateLessThan(Date value) {
			addCriterion("edit_date <", value, "editDate");
			return this;
		}

		public Criteria andEditDateLessThanOrEqualTo(Date value) {
			addCriterion("edit_date <=", value, "editDate");
			return this;
		}

		public Criteria andEditDateIn(List values) {
			addCriterion("edit_date in", values, "editDate");
			return this;
		}

		public Criteria andEditDateNotIn(List values) {
			addCriterion("edit_date not in", values, "editDate");
			return this;
		}

		public Criteria andEditDateBetween(Date value1, Date value2) {
			addCriterion("edit_date between", value1, value2, "editDate");
			return this;
		}

		public Criteria andEditDateNotBetween(Date value1, Date value2) {
			addCriterion("edit_date not between", value1, value2, "editDate");
			return this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return this;
		}

		public Criteria andUserIdIn(List values) {
			addCriterion("user_id in", values, "userId");
			return this;
		}

		public Criteria andUserIdNotIn(List values) {
			addCriterion("user_id not in", values, "userId");
			return this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return this;
		}

		public Criteria andUserNameIn(List values) {
			addCriterion("user_name in", values, "userName");
			return this;
		}

		public Criteria andUserNameNotIn(List values) {
			addCriterion("user_name not in", values, "userName");
			return this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return this;
		}

		public Criteria andStockPriceDateIsNull() {
			addCriterion("stock_price_date is null");
			return this;
		}

		public Criteria andStockPriceDateIsNotNull() {
			addCriterion("stock_price_date is not null");
			return this;
		}

		public Criteria andStockPriceDateEqualTo(Date value) {
			addCriterion("stock_price_date =", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateNotEqualTo(Date value) {
			addCriterion("stock_price_date <>", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateGreaterThan(Date value) {
			addCriterion("stock_price_date >", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateGreaterThanOrEqualTo(Date value) {
			addCriterion("stock_price_date >=", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateLessThan(Date value) {
			addCriterion("stock_price_date <", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateLessThanOrEqualTo(Date value) {
			addCriterion("stock_price_date <=", value, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateIn(List values) {
			addCriterion("stock_price_date in", values, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateNotIn(List values) {
			addCriterion("stock_price_date not in", values, "stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateBetween(Date value1, Date value2) {
			addCriterion("stock_price_date between", value1, value2,
					"stockPriceDate");
			return this;
		}

		public Criteria andStockPriceDateNotBetween(Date value1, Date value2) {
			addCriterion("stock_price_date not between", value1, value2,
					"stockPriceDate");
			return this;
		}

		public Criteria andHistoryMarketPriceIsNull() {
			addCriterion("history_market_price is null");
			return this;
		}

		public Criteria andHistoryMarketPriceIsNotNull() {
			addCriterion("history_market_price is not null");
			return this;
		}

		public Criteria andHistoryMarketPriceEqualTo(BigDecimal value) {
			addCriterion("history_market_price =", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceNotEqualTo(BigDecimal value) {
			addCriterion("history_market_price <>", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceGreaterThan(BigDecimal value) {
			addCriterion("history_market_price >", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("history_market_price >=", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceLessThan(BigDecimal value) {
			addCriterion("history_market_price <", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("history_market_price <=", value, "historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceIn(List values) {
			addCriterion("history_market_price in", values,
					"historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceNotIn(List values) {
			addCriterion("history_market_price not in", values,
					"historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_market_price between", value1, value2,
					"historyMarketPrice");
			return this;
		}

		public Criteria andHistoryMarketPriceNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_market_price not between", value1, value2,
					"historyMarketPrice");
			return this;
		}

		public Criteria andHistoryRebateIsNull() {
			addCriterion("history_rebate is null");
			return this;
		}

		public Criteria andHistoryRebateIsNotNull() {
			addCriterion("history_rebate is not null");
			return this;
		}

		public Criteria andHistoryRebateEqualTo(BigDecimal value) {
			addCriterion("history_rebate =", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateNotEqualTo(BigDecimal value) {
			addCriterion("history_rebate <>", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateGreaterThan(BigDecimal value) {
			addCriterion("history_rebate >", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("history_rebate >=", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateLessThan(BigDecimal value) {
			addCriterion("history_rebate <", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateLessThanOrEqualTo(BigDecimal value) {
			addCriterion("history_rebate <=", value, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateIn(List values) {
			addCriterion("history_rebate in", values, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateNotIn(List values) {
			addCriterion("history_rebate not in", values, "historyRebate");
			return this;
		}

		public Criteria andHistoryRebateBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_rebate between", value1, value2,
					"historyRebate");
			return this;
		}

		public Criteria andHistoryRebateNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("history_rebate not between", value1, value2,
					"historyRebate");
			return this;
		}

		public Criteria andLeafIsNull() {
			addCriterion("leaf is null");
			return this;
		}

		public Criteria andLeafIsNotNull() {
			addCriterion("leaf is not null");
			return this;
		}

		public Criteria andLeafEqualTo(Integer value) {
			addCriterion("leaf =", value, "leaf");
			return this;
		}

		public Criteria andLeafNotEqualTo(Integer value) {
			addCriterion("leaf <>", value, "leaf");
			return this;
		}

		public Criteria andLeafGreaterThan(Integer value) {
			addCriterion("leaf >", value, "leaf");
			return this;
		}

		public Criteria andLeafGreaterThanOrEqualTo(Integer value) {
			addCriterion("leaf >=", value, "leaf");
			return this;
		}

		public Criteria andLeafLessThan(Integer value) {
			addCriterion("leaf <", value, "leaf");
			return this;
		}

		public Criteria andLeafLessThanOrEqualTo(Integer value) {
			addCriterion("leaf <=", value, "leaf");
			return this;
		}

		public Criteria andLeafIn(List values) {
			addCriterion("leaf in", values, "leaf");
			return this;
		}

		public Criteria andLeafNotIn(List values) {
			addCriterion("leaf not in", values, "leaf");
			return this;
		}

		public Criteria andLeafBetween(Integer value1, Integer value2) {
			addCriterion("leaf between", value1, value2, "leaf");
			return this;
		}

		public Criteria andLeafNotBetween(Integer value1, Integer value2) {
			addCriterion("leaf not between", value1, value2, "leaf");
			return this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return this;
		}

		public Criteria andParentIdEqualTo(String value) {
			addCriterion("parent_id =", value, "parentId");
			return this;
		}

		public Criteria andParentIdNotEqualTo(String value) {
			addCriterion("parent_id <>", value, "parentId");
			return this;
		}

		public Criteria andParentIdGreaterThan(String value) {
			addCriterion("parent_id >", value, "parentId");
			return this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(String value) {
			addCriterion("parent_id >=", value, "parentId");
			return this;
		}

		public Criteria andParentIdLessThan(String value) {
			addCriterion("parent_id <", value, "parentId");
			return this;
		}

		public Criteria andParentIdLessThanOrEqualTo(String value) {
			addCriterion("parent_id <=", value, "parentId");
			return this;
		}

		public Criteria andParentIdLike(String value) {
			addCriterion("parent_id like", value, "parentId");
			return this;
		}

		public Criteria andParentIdNotLike(String value) {
			addCriterion("parent_id not like", value, "parentId");
			return this;
		}

		public Criteria andParentIdIn(List values) {
			addCriterion("parent_id in", values, "parentId");
			return this;
		}

		public Criteria andParentIdNotIn(List values) {
			addCriterion("parent_id not in", values, "parentId");
			return this;
		}

		public Criteria andParentIdBetween(String value1, String value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return this;
		}

		public Criteria andParentIdNotBetween(String value1, String value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return this;
		}
	}
}