package com.tl.resource.dao.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TAuditContentAuditHistoryGxExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public TAuditContentAuditHistoryGxExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected TAuditContentAuditHistoryGxExample(TAuditContentAuditHistoryGxExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_audit_content_audit_history_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("content_id =", value, "contentId");
            return this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("content_id <>", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("content_id >", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("content_id >=", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("content_id <", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("content_id <=", value, "contentId");
            return this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("content_id like", value, "contentId");
            return this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("content_id not like", value, "contentId");
            return this;
        }

        public Criteria andContentIdIn(List values) {
            addCriterion("content_id in", values, "contentId");
            return this;
        }

        public Criteria andContentIdNotIn(List values) {
            addCriterion("content_id not in", values, "contentId");
            return this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return this;
        }

        public Criteria andAuditHistoryIdIsNull() {
            addCriterion("audit_history_id is null");
            return this;
        }

        public Criteria andAuditHistoryIdIsNotNull() {
            addCriterion("audit_history_id is not null");
            return this;
        }

        public Criteria andAuditHistoryIdEqualTo(String value) {
            addCriterion("audit_history_id =", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdNotEqualTo(String value) {
            addCriterion("audit_history_id <>", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdGreaterThan(String value) {
            addCriterion("audit_history_id >", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_history_id >=", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdLessThan(String value) {
            addCriterion("audit_history_id <", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("audit_history_id <=", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdLike(String value) {
            addCriterion("audit_history_id like", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdNotLike(String value) {
            addCriterion("audit_history_id not like", value, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdIn(List values) {
            addCriterion("audit_history_id in", values, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdNotIn(List values) {
            addCriterion("audit_history_id not in", values, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdBetween(String value1, String value2) {
            addCriterion("audit_history_id between", value1, value2, "auditHistoryId");
            return this;
        }

        public Criteria andAuditHistoryIdNotBetween(String value1, String value2) {
            addCriterion("audit_history_id not between", value1, value2, "auditHistoryId");
            return this;
        }
    }
}