package com.tl.resource.dao.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TExchangeRateExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public TExchangeRateExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	protected TExchangeRateExample(TExchangeRateExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_exchange_rate
	 * @ibatorgenerated  Wed Oct 14 14:13:27 CST 2009
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

		public Criteria andCurrencyNameIsNull() {
			addCriterion("currency_name is null");
			return this;
		}

		public Criteria andCurrencyNameIsNotNull() {
			addCriterion("currency_name is not null");
			return this;
		}

		public Criteria andCurrencyNameEqualTo(String value) {
			addCriterion("currency_name =", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameNotEqualTo(String value) {
			addCriterion("currency_name <>", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameGreaterThan(String value) {
			addCriterion("currency_name >", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameGreaterThanOrEqualTo(String value) {
			addCriterion("currency_name >=", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameLessThan(String value) {
			addCriterion("currency_name <", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameLessThanOrEqualTo(String value) {
			addCriterion("currency_name <=", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameLike(String value) {
			addCriterion("currency_name like", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameNotLike(String value) {
			addCriterion("currency_name not like", value, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameIn(List values) {
			addCriterion("currency_name in", values, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameNotIn(List values) {
			addCriterion("currency_name not in", values, "currencyName");
			return this;
		}

		public Criteria andCurrencyNameBetween(String value1, String value2) {
			addCriterion("currency_name between", value1, value2,
					"currencyName");
			return this;
		}

		public Criteria andCurrencyNameNotBetween(String value1, String value2) {
			addCriterion("currency_name not between", value1, value2,
					"currencyName");
			return this;
		}

		public Criteria andCurrencyMarkIsNull() {
			addCriterion("currency_mark is null");
			return this;
		}

		public Criteria andCurrencyMarkIsNotNull() {
			addCriterion("currency_mark is not null");
			return this;
		}

		public Criteria andCurrencyMarkEqualTo(String value) {
			addCriterion("currency_mark =", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkNotEqualTo(String value) {
			addCriterion("currency_mark <>", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkGreaterThan(String value) {
			addCriterion("currency_mark >", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkGreaterThanOrEqualTo(String value) {
			addCriterion("currency_mark >=", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkLessThan(String value) {
			addCriterion("currency_mark <", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkLessThanOrEqualTo(String value) {
			addCriterion("currency_mark <=", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkLike(String value) {
			addCriterion("currency_mark like", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkNotLike(String value) {
			addCriterion("currency_mark not like", value, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkIn(List values) {
			addCriterion("currency_mark in", values, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkNotIn(List values) {
			addCriterion("currency_mark not in", values, "currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkBetween(String value1, String value2) {
			addCriterion("currency_mark between", value1, value2,
					"currencyMark");
			return this;
		}

		public Criteria andCurrencyMarkNotBetween(String value1, String value2) {
			addCriterion("currency_mark not between", value1, value2,
					"currencyMark");
			return this;
		}

		public Criteria andRateIsNull() {
			addCriterion("rate is null");
			return this;
		}

		public Criteria andRateIsNotNull() {
			addCriterion("rate is not null");
			return this;
		}

		public Criteria andRateEqualTo(Integer value) {
			addCriterion("rate =", value, "rate");
			return this;
		}

		public Criteria andRateNotEqualTo(Integer value) {
			addCriterion("rate <>", value, "rate");
			return this;
		}

		public Criteria andRateGreaterThan(Integer value) {
			addCriterion("rate >", value, "rate");
			return this;
		}

		public Criteria andRateGreaterThanOrEqualTo(Integer value) {
			addCriterion("rate >=", value, "rate");
			return this;
		}

		public Criteria andRateLessThan(Integer value) {
			addCriterion("rate <", value, "rate");
			return this;
		}

		public Criteria andRateLessThanOrEqualTo(Integer value) {
			addCriterion("rate <=", value, "rate");
			return this;
		}

		public Criteria andRateIn(List values) {
			addCriterion("rate in", values, "rate");
			return this;
		}

		public Criteria andRateNotIn(List values) {
			addCriterion("rate not in", values, "rate");
			return this;
		}

		public Criteria andRateBetween(Integer value1, Integer value2) {
			addCriterion("rate between", value1, value2, "rate");
			return this;
		}

		public Criteria andRateNotBetween(Integer value1, Integer value2) {
			addCriterion("rate not between", value1, value2, "rate");
			return this;
		}
	}
}