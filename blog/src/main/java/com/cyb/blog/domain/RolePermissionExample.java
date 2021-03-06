package com.cyb.blog.domain;

import java.util.ArrayList;
import java.util.List;

public class RolePermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    protected List<RolePermissionCriteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public RolePermissionExample() {
        oredCriteria = new ArrayList<RolePermissionCriteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public List<RolePermissionCriteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public void or(RolePermissionCriteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public RolePermissionCriteria or() {
        RolePermissionCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public RolePermissionCriteria createCriteria() {
        RolePermissionCriteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    protected RolePermissionCriteria createCriteriaInternal() {
        RolePermissionCriteria criteria = new RolePermissionCriteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public RolePermissionCriteria andIdIsNull() {
            addCriterion("id is null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdEqualTo(String value) {
            addCriterion("permission_id =", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdNotEqualTo(String value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdGreaterThan(String value) {
            addCriterion("permission_id >", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdLessThan(String value) {
            addCriterion("permission_id <", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdLike(String value) {
            addCriterion("permission_id like", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdNotLike(String value) {
            addCriterion("permission_id not like", value, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdIn(List<String> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdNotIn(List<String> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (RolePermissionCriteria) this;
        }

        public RolePermissionCriteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (RolePermissionCriteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbg.generated do_not_delete_during_merge Sat May 04 15:10:52 CST 2019
     */
    public static class RolePermissionCriteria extends GeneratedCriteria {

        protected RolePermissionCriteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_permission
     *
     * @mbg.generated Sat May 04 15:10:52 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}