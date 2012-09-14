package com.tl.resource.dao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TInvoiceDetailExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public TInvoiceDetailExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	protected TInvoiceDetailExample(TInvoiceDetailExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_invoice_detail
	 * @ibatorgenerated  Thu Apr 08 14:48:07 CST 2010
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

		public Criteria andContractDetailIdIsNull() {
			addCriterion("contract_detail_id is null");
			return this;
		}

		public Criteria andContractDetailIdIsNotNull() {
			addCriterion("contract_detail_id is not null");
			return this;
		}

		public Criteria andContractDetailIdEqualTo(String value) {
			addCriterion("contract_detail_id =", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdNotEqualTo(String value) {
			addCriterion("contract_detail_id <>", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdGreaterThan(String value) {
			addCriterion("contract_detail_id >", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdGreaterThanOrEqualTo(String value) {
			addCriterion("contract_detail_id >=", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdLessThan(String value) {
			addCriterion("contract_detail_id <", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdLessThanOrEqualTo(String value) {
			addCriterion("contract_detail_id <=", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdLike(String value) {
			addCriterion("contract_detail_id like", value, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdNotLike(String value) {
			addCriterion("contract_detail_id not like", value,
					"contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdIn(List values) {
			addCriterion("contract_detail_id in", values, "contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdNotIn(List values) {
			addCriterion("contract_detail_id not in", values,
					"contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdBetween(String value1, String value2) {
			addCriterion("contract_detail_id between", value1, value2,
					"contractDetailId");
			return this;
		}

		public Criteria andContractDetailIdNotBetween(String value1,
				String value2) {
			addCriterion("contract_detail_id not between", value1, value2,
					"contractDetailId");
			return this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return this;
		}

		public Criteria andMoneyEqualTo(BigDecimal value) {
			addCriterion("money =", value, "money");
			return this;
		}

		public Criteria andMoneyNotEqualTo(BigDecimal value) {
			addCriterion("money <>", value, "money");
			return this;
		}

		public Criteria andMoneyGreaterThan(BigDecimal value) {
			addCriterion("money >", value, "money");
			return this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("money >=", value, "money");
			return this;
		}

		public Criteria andMoneyLessThan(BigDecimal value) {
			addCriterion("money <", value, "money");
			return this;
		}

		public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("money <=", value, "money");
			return this;
		}

		public Criteria andMoneyIn(List values) {
			addCriterion("money in", values, "money");
			return this;
		}

		public Criteria andMoneyNotIn(List values) {
			addCriterion("money not in", values, "money");
			return this;
		}

		public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("money between", value1, value2, "money");
			return this;
		}

		public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("money not between", value1, value2, "money");
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

		public Criteria andInvoiceInfoIdIsNull() {
			addCriterion("invoice_info_id is null");
			return this;
		}

		public Criteria andInvoiceInfoIdIsNotNull() {
			addCriterion("invoice_info_id is not null");
			return this;
		}

		public Criteria andInvoiceInfoIdEqualTo(String value) {
			addCriterion("invoice_info_id =", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdNotEqualTo(String value) {
			addCriterion("invoice_info_id <>", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdGreaterThan(String value) {
			addCriterion("invoice_info_id >", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdGreaterThanOrEqualTo(String value) {
			addCriterion("invoice_info_id >=", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdLessThan(String value) {
			addCriterion("invoice_info_id <", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdLessThanOrEqualTo(String value) {
			addCriterion("invoice_info_id <=", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdLike(String value) {
			addCriterion("invoice_info_id like", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdNotLike(String value) {
			addCriterion("invoice_info_id not like", value, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdIn(List values) {
			addCriterion("invoice_info_id in", values, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdNotIn(List values) {
			addCriterion("invoice_info_id not in", values, "invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdBetween(String value1, String value2) {
			addCriterion("invoice_info_id between", value1, value2,
					"invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceInfoIdNotBetween(String value1, String value2) {
			addCriterion("invoice_info_id not between", value1, value2,
					"invoiceInfoId");
			return this;
		}

		public Criteria andInvoiceDateIsNull() {
			addCriterion("invoice_date is null");
			return this;
		}

		public Criteria andInvoiceDateIsNotNull() {
			addCriterion("invoice_date is not null");
			return this;
		}

		public Criteria andInvoiceDateEqualTo(String value) {
			addCriterion("invoice_date =", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateNotEqualTo(String value) {
			addCriterion("invoice_date <>", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateGreaterThan(String value) {
			addCriterion("invoice_date >", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateGreaterThanOrEqualTo(String value) {
			addCriterion("invoice_date >=", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateLessThan(String value) {
			addCriterion("invoice_date <", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateLessThanOrEqualTo(String value) {
			addCriterion("invoice_date <=", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateLike(String value) {
			addCriterion("invoice_date like", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateNotLike(String value) {
			addCriterion("invoice_date not like", value, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateIn(List values) {
			addCriterion("invoice_date in", values, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateNotIn(List values) {
			addCriterion("invoice_date not in", values, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateBetween(String value1, String value2) {
			addCriterion("invoice_date between", value1, value2, "invoiceDate");
			return this;
		}

		public Criteria andInvoiceDateNotBetween(String value1, String value2) {
			addCriterion("invoice_date not between", value1, value2,
					"invoiceDate");
			return this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return this;
		}

		public Criteria andAmountEqualTo(BigDecimal value) {
			addCriterion("amount =", value, "amount");
			return this;
		}

		public Criteria andAmountNotEqualTo(BigDecimal value) {
			addCriterion("amount <>", value, "amount");
			return this;
		}

		public Criteria andAmountGreaterThan(BigDecimal value) {
			addCriterion("amount >", value, "amount");
			return this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("amount >=", value, "amount");
			return this;
		}

		public Criteria andAmountLessThan(BigDecimal value) {
			addCriterion("amount <", value, "amount");
			return this;
		}

		public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("amount <=", value, "amount");
			return this;
		}

		public Criteria andAmountIn(List values) {
			addCriterion("amount in", values, "amount");
			return this;
		}

		public Criteria andAmountNotIn(List values) {
			addCriterion("amount not in", values, "amount");
			return this;
		}

		public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount between", value1, value2, "amount");
			return this;
		}

		public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return this;
		}

		public Criteria andMemoIsNull() {
			addCriterion("memo is null");
			return this;
		}

		public Criteria andMemoIsNotNull() {
			addCriterion("memo is not null");
			return this;
		}

		public Criteria andMemoEqualTo(String value) {
			addCriterion("memo =", value, "memo");
			return this;
		}

		public Criteria andMemoNotEqualTo(String value) {
			addCriterion("memo <>", value, "memo");
			return this;
		}

		public Criteria andMemoGreaterThan(String value) {
			addCriterion("memo >", value, "memo");
			return this;
		}

		public Criteria andMemoGreaterThanOrEqualTo(String value) {
			addCriterion("memo >=", value, "memo");
			return this;
		}

		public Criteria andMemoLessThan(String value) {
			addCriterion("memo <", value, "memo");
			return this;
		}

		public Criteria andMemoLessThanOrEqualTo(String value) {
			addCriterion("memo <=", value, "memo");
			return this;
		}

		public Criteria andMemoLike(String value) {
			addCriterion("memo like", value, "memo");
			return this;
		}

		public Criteria andMemoNotLike(String value) {
			addCriterion("memo not like", value, "memo");
			return this;
		}

		public Criteria andMemoIn(List values) {
			addCriterion("memo in", values, "memo");
			return this;
		}

		public Criteria andMemoNotIn(List values) {
			addCriterion("memo not in", values, "memo");
			return this;
		}

		public Criteria andMemoBetween(String value1, String value2) {
			addCriterion("memo between", value1, value2, "memo");
			return this;
		}

		public Criteria andMemoNotBetween(String value1, String value2) {
			addCriterion("memo not between", value1, value2, "memo");
			return this;
		}
	}
}