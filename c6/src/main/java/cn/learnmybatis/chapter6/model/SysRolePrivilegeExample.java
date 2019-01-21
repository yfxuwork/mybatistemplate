package cn.learnmybatis.chapter6.model;

import java.util.ArrayList;
import java.util.List;

public class SysRolePrivilegeExample {
    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public SysRolePrivilegeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
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

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(Long value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(Long value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(Long value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<Long> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIsNull() {
            addCriterion("privilege_id is null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIsNotNull() {
            addCriterion("privilege_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idEqualTo(Long value) {
            addCriterion("privilege_id =", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotEqualTo(Long value) {
            addCriterion("privilege_id <>", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idGreaterThan(Long value) {
            addCriterion("privilege_id >", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idGreaterThanOrEqualTo(Long value) {
            addCriterion("privilege_id >=", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idLessThan(Long value) {
            addCriterion("privilege_id <", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idLessThanOrEqualTo(Long value) {
            addCriterion("privilege_id <=", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIn(List<Long> values) {
            addCriterion("privilege_id in", values, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotIn(List<Long> values) {
            addCriterion("privilege_id not in", values, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idBetween(Long value1, Long value2) {
            addCriterion("privilege_id between", value1, value2, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotBetween(Long value1, Long value2) {
            addCriterion("privilege_id not between", value1, value2, "privilege_id");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 20 15:45:42 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
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