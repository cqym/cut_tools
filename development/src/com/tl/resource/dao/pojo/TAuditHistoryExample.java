package com.tl.resource.dao.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class TAuditHistoryExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public TAuditHistoryExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	protected TAuditHistoryExample(TAuditHistoryExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_audit_history
	 * @ibatorgenerated  Tue Oct 20 13:38:56 CST 2009
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

		public Criteria andBatchIdIsNull() {
			addCriterion("batch_id is null");
			return this;
		}

		public Criteria andBatchIdIsNotNull() {
			addCriterion("batch_id is not null");
			return this;
		}

		public Criteria andBatchIdEqualTo(String value) {
			addCriterion("batch_id =", value, "batchId");
			return this;
		}

		public Criteria andBatchIdNotEqualTo(String value) {
			addCriterion("batch_id <>", value, "batchId");
			return this;
		}

		public Criteria andBatchIdGreaterThan(String value) {
			addCriterion("batch_id >", value, "batchId");
			return this;
		}

		public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
			addCriterion("batch_id >=", value, "batchId");
			return this;
		}

		public Criteria andBatchIdLessThan(String value) {
			addCriterion("batch_id <", value, "batchId");
			return this;
		}

		public Criteria andBatchIdLessThanOrEqualTo(String value) {
			addCriterion("batch_id <=", value, "batchId");
			return this;
		}

		public Criteria andBatchIdLike(String value) {
			addCriterion("batch_id like", value, "batchId");
			return this;
		}

		public Criteria andBatchIdNotLike(String value) {
			addCriterion("batch_id not like", value, "batchId");
			return this;
		}

		public Criteria andBatchIdIn(List values) {
			addCriterion("batch_id in", values, "batchId");
			return this;
		}

		public Criteria andBatchIdNotIn(List values) {
			addCriterion("batch_id not in", values, "batchId");
			return this;
		}

		public Criteria andBatchIdBetween(String value1, String value2) {
			addCriterion("batch_id between", value1, value2, "batchId");
			return this;
		}

		public Criteria andBatchIdNotBetween(String value1, String value2) {
			addCriterion("batch_id not between", value1, value2, "batchId");
			return this;
		}

		public Criteria andBusinessIdIsNull() {
			addCriterion("business_id is null");
			return this;
		}

		public Criteria andBusinessIdIsNotNull() {
			addCriterion("business_id is not null");
			return this;
		}

		public Criteria andBusinessIdEqualTo(String value) {
			addCriterion("business_id =", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdNotEqualTo(String value) {
			addCriterion("business_id <>", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdGreaterThan(String value) {
			addCriterion("business_id >", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdGreaterThanOrEqualTo(String value) {
			addCriterion("business_id >=", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdLessThan(String value) {
			addCriterion("business_id <", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdLessThanOrEqualTo(String value) {
			addCriterion("business_id <=", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdLike(String value) {
			addCriterion("business_id like", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdNotLike(String value) {
			addCriterion("business_id not like", value, "businessId");
			return this;
		}

		public Criteria andBusinessIdIn(List values) {
			addCriterion("business_id in", values, "businessId");
			return this;
		}

		public Criteria andBusinessIdNotIn(List values) {
			addCriterion("business_id not in", values, "businessId");
			return this;
		}

		public Criteria andBusinessIdBetween(String value1, String value2) {
			addCriterion("business_id between", value1, value2, "businessId");
			return this;
		}

		public Criteria andBusinessIdNotBetween(String value1, String value2) {
			addCriterion("business_id not between", value1, value2,
					"businessId");
			return this;
		}

		public Criteria andAuditPersonIsNull() {
			addCriterion("audit_person is null");
			return this;
		}

		public Criteria andAuditPersonIsNotNull() {
			addCriterion("audit_person is not null");
			return this;
		}

		public Criteria andAuditPersonEqualTo(String value) {
			addCriterion("audit_person =", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonNotEqualTo(String value) {
			addCriterion("audit_person <>", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonGreaterThan(String value) {
			addCriterion("audit_person >", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonGreaterThanOrEqualTo(String value) {
			addCriterion("audit_person >=", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonLessThan(String value) {
			addCriterion("audit_person <", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonLessThanOrEqualTo(String value) {
			addCriterion("audit_person <=", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonLike(String value) {
			addCriterion("audit_person like", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonNotLike(String value) {
			addCriterion("audit_person not like", value, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonIn(List values) {
			addCriterion("audit_person in", values, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonNotIn(List values) {
			addCriterion("audit_person not in", values, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonBetween(String value1, String value2) {
			addCriterion("audit_person between", value1, value2, "auditPerson");
			return this;
		}

		public Criteria andAuditPersonNotBetween(String value1, String value2) {
			addCriterion("audit_person not between", value1, value2,
					"auditPerson");
			return this;
		}

		public Criteria andAuditPersonIdIsNull() {
			addCriterion("audit_person_id is null");
			return this;
		}

		public Criteria andAuditPersonIdIsNotNull() {
			addCriterion("audit_person_id is not null");
			return this;
		}

		public Criteria andAuditPersonIdEqualTo(String value) {
			addCriterion("audit_person_id =", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdNotEqualTo(String value) {
			addCriterion("audit_person_id <>", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdGreaterThan(String value) {
			addCriterion("audit_person_id >", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdGreaterThanOrEqualTo(String value) {
			addCriterion("audit_person_id >=", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdLessThan(String value) {
			addCriterion("audit_person_id <", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdLessThanOrEqualTo(String value) {
			addCriterion("audit_person_id <=", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdLike(String value) {
			addCriterion("audit_person_id like", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdNotLike(String value) {
			addCriterion("audit_person_id not like", value, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdIn(List values) {
			addCriterion("audit_person_id in", values, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdNotIn(List values) {
			addCriterion("audit_person_id not in", values, "auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdBetween(String value1, String value2) {
			addCriterion("audit_person_id between", value1, value2,
					"auditPersonId");
			return this;
		}

		public Criteria andAuditPersonIdNotBetween(String value1, String value2) {
			addCriterion("audit_person_id not between", value1, value2,
					"auditPersonId");
			return this;
		}

		public Criteria andAuditOrderIsNull() {
			addCriterion("audit_order is null");
			return this;
		}

		public Criteria andAuditOrderIsNotNull() {
			addCriterion("audit_order is not null");
			return this;
		}

		public Criteria andAuditOrderEqualTo(Integer value) {
			addCriterion("audit_order =", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderNotEqualTo(Integer value) {
			addCriterion("audit_order <>", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderGreaterThan(Integer value) {
			addCriterion("audit_order >", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("audit_order >=", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderLessThan(Integer value) {
			addCriterion("audit_order <", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderLessThanOrEqualTo(Integer value) {
			addCriterion("audit_order <=", value, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderIn(List values) {
			addCriterion("audit_order in", values, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderNotIn(List values) {
			addCriterion("audit_order not in", values, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderBetween(Integer value1, Integer value2) {
			addCriterion("audit_order between", value1, value2, "auditOrder");
			return this;
		}

		public Criteria andAuditOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("audit_order not between", value1, value2,
					"auditOrder");
			return this;
		}

		public Criteria andAuditDegreeIsNull() {
			addCriterion("audit_degree is null");
			return this;
		}

		public Criteria andAuditDegreeIsNotNull() {
			addCriterion("audit_degree is not null");
			return this;
		}

		public Criteria andAuditDegreeEqualTo(Integer value) {
			addCriterion("audit_degree =", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeNotEqualTo(Integer value) {
			addCriterion("audit_degree <>", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeGreaterThan(Integer value) {
			addCriterion("audit_degree >", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeGreaterThanOrEqualTo(Integer value) {
			addCriterion("audit_degree >=", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeLessThan(Integer value) {
			addCriterion("audit_degree <", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeLessThanOrEqualTo(Integer value) {
			addCriterion("audit_degree <=", value, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeIn(List values) {
			addCriterion("audit_degree in", values, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeNotIn(List values) {
			addCriterion("audit_degree not in", values, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeBetween(Integer value1, Integer value2) {
			addCriterion("audit_degree between", value1, value2, "auditDegree");
			return this;
		}

		public Criteria andAuditDegreeNotBetween(Integer value1, Integer value2) {
			addCriterion("audit_degree not between", value1, value2,
					"auditDegree");
			return this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return this;
		}

		public Criteria andRoleIdEqualTo(String value) {
			addCriterion("role_id =", value, "roleId");
			return this;
		}

		public Criteria andRoleIdNotEqualTo(String value) {
			addCriterion("role_id <>", value, "roleId");
			return this;
		}

		public Criteria andRoleIdGreaterThan(String value) {
			addCriterion("role_id >", value, "roleId");
			return this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
			addCriterion("role_id >=", value, "roleId");
			return this;
		}

		public Criteria andRoleIdLessThan(String value) {
			addCriterion("role_id <", value, "roleId");
			return this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(String value) {
			addCriterion("role_id <=", value, "roleId");
			return this;
		}

		public Criteria andRoleIdLike(String value) {
			addCriterion("role_id like", value, "roleId");
			return this;
		}

		public Criteria andRoleIdNotLike(String value) {
			addCriterion("role_id not like", value, "roleId");
			return this;
		}

		public Criteria andRoleIdIn(List values) {
			addCriterion("role_id in", values, "roleId");
			return this;
		}

		public Criteria andRoleIdNotIn(List values) {
			addCriterion("role_id not in", values, "roleId");
			return this;
		}

		public Criteria andRoleIdBetween(String value1, String value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return this;
		}

		public Criteria andRoleIdNotBetween(String value1, String value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return this;
		}

		public Criteria andAuditOpTypeIsNull() {
			addCriterion("audit_op_type is null");
			return this;
		}

		public Criteria andAuditOpTypeIsNotNull() {
			addCriterion("audit_op_type is not null");
			return this;
		}

		public Criteria andAuditOpTypeEqualTo(Integer value) {
			addCriterion("audit_op_type =", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeNotEqualTo(Integer value) {
			addCriterion("audit_op_type <>", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeGreaterThan(Integer value) {
			addCriterion("audit_op_type >", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("audit_op_type >=", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeLessThan(Integer value) {
			addCriterion("audit_op_type <", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeLessThanOrEqualTo(Integer value) {
			addCriterion("audit_op_type <=", value, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeIn(List values) {
			addCriterion("audit_op_type in", values, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeNotIn(List values) {
			addCriterion("audit_op_type not in", values, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeBetween(Integer value1, Integer value2) {
			addCriterion("audit_op_type between", value1, value2, "auditOpType");
			return this;
		}

		public Criteria andAuditOpTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("audit_op_type not between", value1, value2,
					"auditOpType");
			return this;
		}

		public Criteria andAuditCommentIsNull() {
			addCriterion("audit_comment is null");
			return this;
		}

		public Criteria andAuditCommentIsNotNull() {
			addCriterion("audit_comment is not null");
			return this;
		}

		public Criteria andAuditCommentEqualTo(String value) {
			addCriterion("audit_comment =", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentNotEqualTo(String value) {
			addCriterion("audit_comment <>", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentGreaterThan(String value) {
			addCriterion("audit_comment >", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentGreaterThanOrEqualTo(String value) {
			addCriterion("audit_comment >=", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentLessThan(String value) {
			addCriterion("audit_comment <", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentLessThanOrEqualTo(String value) {
			addCriterion("audit_comment <=", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentLike(String value) {
			addCriterion("audit_comment like", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentNotLike(String value) {
			addCriterion("audit_comment not like", value, "auditComment");
			return this;
		}

		public Criteria andAuditCommentIn(List values) {
			addCriterion("audit_comment in", values, "auditComment");
			return this;
		}

		public Criteria andAuditCommentNotIn(List values) {
			addCriterion("audit_comment not in", values, "auditComment");
			return this;
		}

		public Criteria andAuditCommentBetween(String value1, String value2) {
			addCriterion("audit_comment between", value1, value2,
					"auditComment");
			return this;
		}

		public Criteria andAuditCommentNotBetween(String value1, String value2) {
			addCriterion("audit_comment not between", value1, value2,
					"auditComment");
			return this;
		}

		public Criteria andAuditTypeIdIsNull() {
			addCriterion("audit_type_id is null");
			return this;
		}

		public Criteria andAuditTypeIdIsNotNull() {
			addCriterion("audit_type_id is not null");
			return this;
		}

		public Criteria andAuditTypeIdEqualTo(String value) {
			addCriterion("audit_type_id =", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdNotEqualTo(String value) {
			addCriterion("audit_type_id <>", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdGreaterThan(String value) {
			addCriterion("audit_type_id >", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdGreaterThanOrEqualTo(String value) {
			addCriterion("audit_type_id >=", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdLessThan(String value) {
			addCriterion("audit_type_id <", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdLessThanOrEqualTo(String value) {
			addCriterion("audit_type_id <=", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdLike(String value) {
			addCriterion("audit_type_id like", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdNotLike(String value) {
			addCriterion("audit_type_id not like", value, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdIn(List values) {
			addCriterion("audit_type_id in", values, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdNotIn(List values) {
			addCriterion("audit_type_id not in", values, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdBetween(String value1, String value2) {
			addCriterion("audit_type_id between", value1, value2, "auditTypeId");
			return this;
		}

		public Criteria andAuditTypeIdNotBetween(String value1, String value2) {
			addCriterion("audit_type_id not between", value1, value2,
					"auditTypeId");
			return this;
		}

		public Criteria andAuditTimeIsNull() {
			addCriterion("audit_time is null");
			return this;
		}

		public Criteria andAuditTimeIsNotNull() {
			addCriterion("audit_time is not null");
			return this;
		}

		public Criteria andAuditTimeEqualTo(Date value) {
			addCriterion("audit_time =", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeNotEqualTo(Date value) {
			addCriterion("audit_time <>", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeGreaterThan(Date value) {
			addCriterion("audit_time >", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("audit_time >=", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeLessThan(Date value) {
			addCriterion("audit_time <", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
			addCriterion("audit_time <=", value, "auditTime");
			return this;
		}

		public Criteria andAuditTimeIn(List values) {
			addCriterion("audit_time in", values, "auditTime");
			return this;
		}

		public Criteria andAuditTimeNotIn(List values) {
			addCriterion("audit_time not in", values, "auditTime");
			return this;
		}

		public Criteria andAuditTimeBetween(Date value1, Date value2) {
			addCriterion("audit_time between", value1, value2, "auditTime");
			return this;
		}

		public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
			addCriterion("audit_time not between", value1, value2, "auditTime");
			return this;
		}
	}
}