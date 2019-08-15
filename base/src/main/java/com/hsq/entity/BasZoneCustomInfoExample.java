package com.hsq.entity;

import java.util.ArrayList;
import java.util.List;

public class BasZoneCustomInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasZoneCustomInfoExample() {
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

        public Criteria andCustomcodeIsNull() {
            addCriterion("CustomCode is null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIsNotNull() {
            addCriterion("CustomCode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeEqualTo(Integer value) {
            addCriterion("CustomCode =", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotEqualTo(Integer value) {
            addCriterion("CustomCode <>", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThan(Integer value) {
            addCriterion("CustomCode >", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomCode >=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThan(Integer value) {
            addCriterion("CustomCode <", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThanOrEqualTo(Integer value) {
            addCriterion("CustomCode <=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIn(List<Integer> values) {
            addCriterion("CustomCode in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotIn(List<Integer> values) {
            addCriterion("CustomCode not in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeBetween(Integer value1, Integer value2) {
            addCriterion("CustomCode between", value1, value2, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomCode not between", value1, value2, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNull() {
            addCriterion("CustomName is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("CustomName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("CustomName =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("CustomName <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("CustomName >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomName >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("CustomName <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("CustomName <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("CustomName like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("CustomName not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("CustomName in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("CustomName not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("CustomName between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("CustomName not between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MobileNo is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("MobileNo =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("MobileNo <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("MobileNo >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("MobileNo >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("MobileNo <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("MobileNo <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("MobileNo like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("MobileNo not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("MobileNo in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("MobileNo not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("MobileNo between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("MobileNo not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCstomaddressIsNull() {
            addCriterion("CstomAddress is null");
            return (Criteria) this;
        }

        public Criteria andCstomaddressIsNotNull() {
            addCriterion("CstomAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCstomaddressEqualTo(String value) {
            addCriterion("CstomAddress =", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressNotEqualTo(String value) {
            addCriterion("CstomAddress <>", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressGreaterThan(String value) {
            addCriterion("CstomAddress >", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CstomAddress >=", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressLessThan(String value) {
            addCriterion("CstomAddress <", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressLessThanOrEqualTo(String value) {
            addCriterion("CstomAddress <=", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressLike(String value) {
            addCriterion("CstomAddress like", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressNotLike(String value) {
            addCriterion("CstomAddress not like", value, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressIn(List<String> values) {
            addCriterion("CstomAddress in", values, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressNotIn(List<String> values) {
            addCriterion("CstomAddress not in", values, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressBetween(String value1, String value2) {
            addCriterion("CstomAddress between", value1, value2, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andCstomaddressNotBetween(String value1, String value2) {
            addCriterion("CstomAddress not between", value1, value2, "cstomaddress");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidIsNull() {
            addCriterion("ZoneInfoID is null");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidIsNotNull() {
            addCriterion("ZoneInfoID is not null");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidEqualTo(Integer value) {
            addCriterion("ZoneInfoID =", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidNotEqualTo(Integer value) {
            addCriterion("ZoneInfoID <>", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidGreaterThan(Integer value) {
            addCriterion("ZoneInfoID >", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZoneInfoID >=", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidLessThan(Integer value) {
            addCriterion("ZoneInfoID <", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("ZoneInfoID <=", value, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidIn(List<Integer> values) {
            addCriterion("ZoneInfoID in", values, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidNotIn(List<Integer> values) {
            addCriterion("ZoneInfoID not in", values, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidBetween(Integer value1, Integer value2) {
            addCriterion("ZoneInfoID between", value1, value2, "zoneinfoid");
            return (Criteria) this;
        }

        public Criteria andZoneinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZoneInfoID not between", value1, value2, "zoneinfoid");
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
