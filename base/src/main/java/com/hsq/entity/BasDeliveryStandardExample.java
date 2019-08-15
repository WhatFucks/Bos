package com.hsq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasDeliveryStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasDeliveryStandardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMinweightIsNull() {
            addCriterion("MinWeight is null");
            return (Criteria) this;
        }

        public Criteria andMinweightIsNotNull() {
            addCriterion("MinWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMinweightEqualTo(BigDecimal value) {
            addCriterion("MinWeight =", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotEqualTo(BigDecimal value) {
            addCriterion("MinWeight <>", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightGreaterThan(BigDecimal value) {
            addCriterion("MinWeight >", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinWeight >=", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightLessThan(BigDecimal value) {
            addCriterion("MinWeight <", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinWeight <=", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightIn(List<BigDecimal> values) {
            addCriterion("MinWeight in", values, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotIn(List<BigDecimal> values) {
            addCriterion("MinWeight not in", values, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinWeight between", value1, value2, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinWeight not between", value1, value2, "minweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightIsNull() {
            addCriterion("MaxWeight is null");
            return (Criteria) this;
        }

        public Criteria andMaxweightIsNotNull() {
            addCriterion("MaxWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMaxweightEqualTo(BigDecimal value) {
            addCriterion("MaxWeight =", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotEqualTo(BigDecimal value) {
            addCriterion("MaxWeight <>", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightGreaterThan(BigDecimal value) {
            addCriterion("MaxWeight >", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxWeight >=", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightLessThan(BigDecimal value) {
            addCriterion("MaxWeight <", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxWeight <=", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightIn(List<BigDecimal> values) {
            addCriterion("MaxWeight in", values, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotIn(List<BigDecimal> values) {
            addCriterion("MaxWeight not in", values, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxWeight between", value1, value2, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxWeight not between", value1, value2, "maxweight");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("OperatorID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(Integer value) {
            addCriterion("OperatorID =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(Integer value) {
            addCriterion("OperatorID <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(Integer value) {
            addCriterion("OperatorID >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperatorID >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(Integer value) {
            addCriterion("OperatorID <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(Integer value) {
            addCriterion("OperatorID <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<Integer> values) {
            addCriterion("OperatorID in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<Integer> values) {
            addCriterion("OperatorID not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(Integer value1, Integer value2) {
            addCriterion("OperatorID between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("OperatorID not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidIsNull() {
            addCriterion("OperationUnitID is null");
            return (Criteria) this;
        }

        public Criteria andOperationunitidIsNotNull() {
            addCriterion("OperationUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationunitidEqualTo(Integer value) {
            addCriterion("OperationUnitID =", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidNotEqualTo(Integer value) {
            addCriterion("OperationUnitID <>", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidGreaterThan(Integer value) {
            addCriterion("OperationUnitID >", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationUnitID >=", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidLessThan(Integer value) {
            addCriterion("OperationUnitID <", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidLessThanOrEqualTo(Integer value) {
            addCriterion("OperationUnitID <=", value, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidIn(List<Integer> values) {
            addCriterion("OperationUnitID in", values, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidNotIn(List<Integer> values) {
            addCriterion("OperationUnitID not in", values, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidBetween(Integer value1, Integer value2) {
            addCriterion("OperationUnitID between", value1, value2, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationUnitID not between", value1, value2, "operationunitid");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNull() {
            addCriterion("OperationTime is null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNotNull() {
            addCriterion("OperationTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeEqualTo(Date value) {
            addCriterion("OperationTime =", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotEqualTo(Date value) {
            addCriterion("OperationTime <>", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThan(Date value) {
            addCriterion("OperationTime >", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OperationTime >=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThan(Date value) {
            addCriterion("OperationTime <", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThanOrEqualTo(Date value) {
            addCriterion("OperationTime <=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIn(List<Date> values) {
            addCriterion("OperationTime in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotIn(List<Date> values) {
            addCriterion("OperationTime not in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeBetween(Date value1, Date value2) {
            addCriterion("OperationTime between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotBetween(Date value1, Date value2) {
            addCriterion("OperationTime not between", value1, value2, "operationtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
