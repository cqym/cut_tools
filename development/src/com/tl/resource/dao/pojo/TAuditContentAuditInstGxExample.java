package com.tl.resource.dao.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TAuditContentAuditInstGxExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public TAuditContentAuditInstGxExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected TAuditContentAuditInstGxExample(TAuditContentAuditInstGxExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
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
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_audit_content_audit_inst_gx
     *
     * @ibatorgenerated Thu Apr 22 16:34:14 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_audit_content_audit_inst_gx
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

        public Criteria andAuditInsIdIsNull() {
            addCriterion("audit_ins_id is null");
            return this;
        }

        public Criteria andAuditInsIdIsNotNull() {
            addCriterion("audit_ins_id is not null");
            return this;
        }

        public Criteria andAuditInsIdEqualTo(String value) {
            addCriterion("audit_ins_id =", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdNotEqualTo(String value) {
            addCriterion("audit_ins_id <>", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdGreaterThan(String value) {
            addCriterion("audit_ins_id >", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_ins_id >=", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdLessThan(String value) {
            addCriterion("audit_ins_id <", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdLessThanOrEqualTo(String value) {
            addCriterion("audit_ins_id <=", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdLike(String value) {
            addCriterion("audit_ins_id like", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdNotLike(String value) {
            addCriterion("audit_ins_id not like", value, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdIn(List values) {
            addCriterion("audit_ins_id in", values, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdNotIn(List values) {
            addCriterion("audit_ins_id not in", values, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdBetween(String value1, String value2) {
            addCriterion("audit_ins_id between", value1, value2, "auditInsId");
            return this;
        }

        public Criteria andAuditInsIdNotBetween(String value1, String value2) {
            addCriterion("audit_ins_id not between", value1, value2, "auditInsId");
            return this;
        }
    }
}