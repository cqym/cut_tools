package com.tl.resource.dao.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TResourcePurviewExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    protected String orderByClause;

    private int startIndex;
    
    private int pageSize;
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public TResourcePurviewExample() {
        oredCriteria = new ArrayList();
    }

    public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    protected TResourcePurviewExample(TResourcePurviewExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
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
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table t_resource_purview
     *
     * @ibatorgenerated Fri Dec 25 14:16:06 CST 2009
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

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return this;
        }

        public Criteria andResourceTypeEqualTo(Integer value) {
            addCriterion("resource_type =", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeNotEqualTo(Integer value) {
            addCriterion("resource_type <>", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeGreaterThan(Integer value) {
            addCriterion("resource_type >", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_type >=", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeLessThan(Integer value) {
            addCriterion("resource_type <", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("resource_type <=", value, "resourceType");
            return this;
        }

        public Criteria andResourceTypeIn(List values) {
            addCriterion("resource_type in", values, "resourceType");
            return this;
        }

        public Criteria andResourceTypeNotIn(List values) {
            addCriterion("resource_type not in", values, "resourceType");
            return this;
        }

        public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return this;
        }

        public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return this;
        }

        public Criteria andTargetUserIdIsNull() {
            addCriterion("target_user_id is null");
            return this;
        }

        public Criteria andTargetUserIdIsNotNull() {
            addCriterion("target_user_id is not null");
            return this;
        }

        public Criteria andTargetUserIdEqualTo(String value) {
            addCriterion("target_user_id =", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdNotEqualTo(String value) {
            addCriterion("target_user_id <>", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdGreaterThan(String value) {
            addCriterion("target_user_id >", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("target_user_id >=", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdLessThan(String value) {
            addCriterion("target_user_id <", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdLessThanOrEqualTo(String value) {
            addCriterion("target_user_id <=", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdLike(String value) {
            addCriterion("target_user_id like", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdNotLike(String value) {
            addCriterion("target_user_id not like", value, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdIn(List values) {
            addCriterion("target_user_id in", values, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdNotIn(List values) {
            addCriterion("target_user_id not in", values, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdBetween(String value1, String value2) {
            addCriterion("target_user_id between", value1, value2, "targetUserId");
            return this;
        }

        public Criteria andTargetUserIdNotBetween(String value1, String value2) {
            addCriterion("target_user_id not between", value1, value2, "targetUserId");
            return this;
        }
    }
}