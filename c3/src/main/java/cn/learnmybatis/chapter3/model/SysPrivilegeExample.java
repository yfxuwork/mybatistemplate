package cn.learnmybatis.chapter3.model;

import java.util.ArrayList;
import java.util.List;

public class SysPrivilegeExample {
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
    public SysPrivilegeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameIsNull() {
            addCriterion("privilege_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameIsNotNull() {
            addCriterion("privilege_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameEqualTo(String value) {
            addCriterion("privilege_name =", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameNotEqualTo(String value) {
            addCriterion("privilege_name <>", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameGreaterThan(String value) {
            addCriterion("privilege_name >", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_name >=", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameLessThan(String value) {
            addCriterion("privilege_name <", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameLessThanOrEqualTo(String value) {
            addCriterion("privilege_name <=", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameLike(String value) {
            addCriterion("privilege_name like", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameNotLike(String value) {
            addCriterion("privilege_name not like", value, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameIn(List<String> values) {
            addCriterion("privilege_name in", values, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameNotIn(List<String> values) {
            addCriterion("privilege_name not in", values, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameBetween(String value1, String value2) {
            addCriterion("privilege_name between", value1, value2, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameNotBetween(String value1, String value2) {
            addCriterion("privilege_name not between", value1, value2, "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlIsNull() {
            addCriterion("privilege_url is null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlIsNotNull() {
            addCriterion("privilege_url is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlEqualTo(String value) {
            addCriterion("privilege_url =", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlNotEqualTo(String value) {
            addCriterion("privilege_url <>", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlGreaterThan(String value) {
            addCriterion("privilege_url >", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_url >=", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlLessThan(String value) {
            addCriterion("privilege_url <", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlLessThanOrEqualTo(String value) {
            addCriterion("privilege_url <=", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlLike(String value) {
            addCriterion("privilege_url like", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlNotLike(String value) {
            addCriterion("privilege_url not like", value, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlIn(List<String> values) {
            addCriterion("privilege_url in", values, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlNotIn(List<String> values) {
            addCriterion("privilege_url not in", values, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlBetween(String value1, String value2) {
            addCriterion("privilege_url between", value1, value2, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlNotBetween(String value1, String value2) {
            addCriterion("privilege_url not between", value1, value2, "privilege_url");
            return (Criteria) this;
        }

        public Criteria andPrivilege_nameLikeInsensitive(String value) {
            addCriterion("upper(privilege_name) like", value.toUpperCase(), "privilege_name");
            return (Criteria) this;
        }

        public Criteria andPrivilege_urlLikeInsensitive(String value) {
            addCriterion("upper(privilege_url) like", value.toUpperCase(), "privilege_url");
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