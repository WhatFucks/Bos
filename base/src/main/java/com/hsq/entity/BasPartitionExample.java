package com.hsq.entity;

import java.util.ArrayList;
import java.util.List;

public class BasPartitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasPartitionExample() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("Province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("Province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("Province not between", value1, value2, "province");
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

        public Criteria andCountyIsNull() {
            addCriterion("County is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("County is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("County =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("County <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("County >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("County >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("County <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("County <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("County like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("County not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("County in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("County not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("County between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("County not between", value1, value2, "county");
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

        public Criteria andKeywordIsNull() {
            addCriterion("Keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("Keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("Keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("Keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("Keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("Keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("Keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("Keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("Keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("Keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("Keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("Keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("Keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("Keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andStartintIsNull() {
            addCriterion("StartInt is null");
            return (Criteria) this;
        }

        public Criteria andStartintIsNotNull() {
            addCriterion("StartInt is not null");
            return (Criteria) this;
        }

        public Criteria andStartintEqualTo(Integer value) {
            addCriterion("StartInt =", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintNotEqualTo(Integer value) {
            addCriterion("StartInt <>", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintGreaterThan(Integer value) {
            addCriterion("StartInt >", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintGreaterThanOrEqualTo(Integer value) {
            addCriterion("StartInt >=", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintLessThan(Integer value) {
            addCriterion("StartInt <", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintLessThanOrEqualTo(Integer value) {
            addCriterion("StartInt <=", value, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintIn(List<Integer> values) {
            addCriterion("StartInt in", values, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintNotIn(List<Integer> values) {
            addCriterion("StartInt not in", values, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintBetween(Integer value1, Integer value2) {
            addCriterion("StartInt between", value1, value2, "startint");
            return (Criteria) this;
        }

        public Criteria andStartintNotBetween(Integer value1, Integer value2) {
            addCriterion("StartInt not between", value1, value2, "startint");
            return (Criteria) this;
        }

        public Criteria andTerminateintIsNull() {
            addCriterion("TerminateInt is null");
            return (Criteria) this;
        }

        public Criteria andTerminateintIsNotNull() {
            addCriterion("TerminateInt is not null");
            return (Criteria) this;
        }

        public Criteria andTerminateintEqualTo(Integer value) {
            addCriterion("TerminateInt =", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintNotEqualTo(Integer value) {
            addCriterion("TerminateInt <>", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintGreaterThan(Integer value) {
            addCriterion("TerminateInt >", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintGreaterThanOrEqualTo(Integer value) {
            addCriterion("TerminateInt >=", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintLessThan(Integer value) {
            addCriterion("TerminateInt <", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintLessThanOrEqualTo(Integer value) {
            addCriterion("TerminateInt <=", value, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintIn(List<Integer> values) {
            addCriterion("TerminateInt in", values, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintNotIn(List<Integer> values) {
            addCriterion("TerminateInt not in", values, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintBetween(Integer value1, Integer value2) {
            addCriterion("TerminateInt between", value1, value2, "terminateint");
            return (Criteria) this;
        }

        public Criteria andTerminateintNotBetween(Integer value1, Integer value2) {
            addCriterion("TerminateInt not between", value1, value2, "terminateint");
            return (Criteria) this;
        }

        public Criteria andSdintIsNull() {
            addCriterion("SDInt is null");
            return (Criteria) this;
        }

        public Criteria andSdintIsNotNull() {
            addCriterion("SDInt is not null");
            return (Criteria) this;
        }

        public Criteria andSdintEqualTo(Boolean value) {
            addCriterion("SDInt =", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintNotEqualTo(Boolean value) {
            addCriterion("SDInt <>", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintGreaterThan(Boolean value) {
            addCriterion("SDInt >", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SDInt >=", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintLessThan(Boolean value) {
            addCriterion("SDInt <", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintLessThanOrEqualTo(Boolean value) {
            addCriterion("SDInt <=", value, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintIn(List<Boolean> values) {
            addCriterion("SDInt in", values, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintNotIn(List<Boolean> values) {
            addCriterion("SDInt not in", values, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintBetween(Boolean value1, Boolean value2) {
            addCriterion("SDInt between", value1, value2, "sdint");
            return (Criteria) this;
        }

        public Criteria andSdintNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SDInt not between", value1, value2, "sdint");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIsNull() {
            addCriterion("SortingCode is null");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIsNotNull() {
            addCriterion("SortingCode is not null");
            return (Criteria) this;
        }

        public Criteria andSortingcodeEqualTo(String value) {
            addCriterion("SortingCode =", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotEqualTo(String value) {
            addCriterion("SortingCode <>", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeGreaterThan(String value) {
            addCriterion("SortingCode >", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SortingCode >=", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLessThan(String value) {
            addCriterion("SortingCode <", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLessThanOrEqualTo(String value) {
            addCriterion("SortingCode <=", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeLike(String value) {
            addCriterion("SortingCode like", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotLike(String value) {
            addCriterion("SortingCode not like", value, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeIn(List<String> values) {
            addCriterion("SortingCode in", values, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotIn(List<String> values) {
            addCriterion("SortingCode not in", values, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeBetween(String value1, String value2) {
            addCriterion("SortingCode between", value1, value2, "sortingcode");
            return (Criteria) this;
        }

        public Criteria andSortingcodeNotBetween(String value1, String value2) {
            addCriterion("SortingCode not between", value1, value2, "sortingcode");
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
