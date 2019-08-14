package com.hsq.entity;

import java.util.ArrayList;
import java.util.List;

public class BasAssociatedAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasAssociatedAddressExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZonecodeIsNull() {
            addCriterion("ZoneCode is null");
            return (Criteria) this;
        }

        public Criteria andZonecodeIsNotNull() {
            addCriterion("ZoneCode is not null");
            return (Criteria) this;
        }

        public Criteria andZonecodeEqualTo(String value) {
            addCriterion("ZoneCode =", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeNotEqualTo(String value) {
            addCriterion("ZoneCode <>", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeGreaterThan(String value) {
            addCriterion("ZoneCode >", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZoneCode >=", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeLessThan(String value) {
            addCriterion("ZoneCode <", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeLessThanOrEqualTo(String value) {
            addCriterion("ZoneCode <=", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeLike(String value) {
            addCriterion("ZoneCode like", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeNotLike(String value) {
            addCriterion("ZoneCode not like", value, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeIn(List<String> values) {
            addCriterion("ZoneCode in", values, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeNotIn(List<String> values) {
            addCriterion("ZoneCode not in", values, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeBetween(String value1, String value2) {
            addCriterion("ZoneCode between", value1, value2, "zonecode");
            return (Criteria) this;
        }

        public Criteria andZonecodeNotBetween(String value1, String value2) {
            addCriterion("ZoneCode not between", value1, value2, "zonecode");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCustomaddressIsNull() {
            addCriterion("CustomAddress is null");
            return (Criteria) this;
        }

        public Criteria andCustomaddressIsNotNull() {
            addCriterion("CustomAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustomaddressEqualTo(String value) {
            addCriterion("CustomAddress =", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressNotEqualTo(String value) {
            addCriterion("CustomAddress <>", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressGreaterThan(String value) {
            addCriterion("CustomAddress >", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CustomAddress >=", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressLessThan(String value) {
            addCriterion("CustomAddress <", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressLessThanOrEqualTo(String value) {
            addCriterion("CustomAddress <=", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressLike(String value) {
            addCriterion("CustomAddress like", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressNotLike(String value) {
            addCriterion("CustomAddress not like", value, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressIn(List<String> values) {
            addCriterion("CustomAddress in", values, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressNotIn(List<String> values) {
            addCriterion("CustomAddress not in", values, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressBetween(String value1, String value2) {
            addCriterion("CustomAddress between", value1, value2, "customaddress");
            return (Criteria) this;
        }

        public Criteria andCustomaddressNotBetween(String value1, String value2) {
            addCriterion("CustomAddress not between", value1, value2, "customaddress");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsIsNull() {
            addCriterion("AssociatedPartitions is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsIsNotNull() {
            addCriterion("AssociatedPartitions is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsEqualTo(Integer value) {
            addCriterion("AssociatedPartitions =", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsNotEqualTo(Integer value) {
            addCriterion("AssociatedPartitions <>", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsGreaterThan(Integer value) {
            addCriterion("AssociatedPartitions >", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("AssociatedPartitions >=", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsLessThan(Integer value) {
            addCriterion("AssociatedPartitions <", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsLessThanOrEqualTo(Integer value) {
            addCriterion("AssociatedPartitions <=", value, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsIn(List<Integer> values) {
            addCriterion("AssociatedPartitions in", values, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsNotIn(List<Integer> values) {
            addCriterion("AssociatedPartitions not in", values, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsBetween(Integer value1, Integer value2) {
            addCriterion("AssociatedPartitions between", value1, value2, "associatedpartitions");
            return (Criteria) this;
        }

        public Criteria andAssociatedpartitionsNotBetween(Integer value1, Integer value2) {
            addCriterion("AssociatedPartitions not between", value1, value2, "associatedpartitions");
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
