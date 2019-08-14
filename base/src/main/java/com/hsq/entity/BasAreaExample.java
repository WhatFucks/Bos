package com.hsq.entity;

import java.util.ArrayList;
import java.util.List;

public class BasAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasAreaExample() {
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

        public Criteria andPostalcodeIsNull() {
            addCriterion("PostalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("PostalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(Integer value) {
            addCriterion("PostalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(Integer value) {
            addCriterion("PostalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(Integer value) {
            addCriterion("PostalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PostalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(Integer value) {
            addCriterion("PostalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(Integer value) {
            addCriterion("PostalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<Integer> values) {
            addCriterion("PostalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<Integer> values) {
            addCriterion("PostalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(Integer value1, Integer value2) {
            addCriterion("PostalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PostalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIsNull() {
            addCriterion("SimpleCode is null");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIsNotNull() {
            addCriterion("SimpleCode is not null");
            return (Criteria) this;
        }

        public Criteria andSimplecodeEqualTo(String value) {
            addCriterion("SimpleCode =", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotEqualTo(String value) {
            addCriterion("SimpleCode <>", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeGreaterThan(String value) {
            addCriterion("SimpleCode >", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SimpleCode >=", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLessThan(String value) {
            addCriterion("SimpleCode <", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLessThanOrEqualTo(String value) {
            addCriterion("SimpleCode <=", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLike(String value) {
            addCriterion("SimpleCode like", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotLike(String value) {
            addCriterion("SimpleCode not like", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIn(List<String> values) {
            addCriterion("SimpleCode in", values, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotIn(List<String> values) {
            addCriterion("SimpleCode not in", values, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeBetween(String value1, String value2) {
            addCriterion("SimpleCode between", value1, value2, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotBetween(String value1, String value2) {
            addCriterion("SimpleCode not between", value1, value2, "simplecode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andEntryunitidIsNull() {
            addCriterion("EntryUnitID is null");
            return (Criteria) this;
        }

        public Criteria andEntryunitidIsNotNull() {
            addCriterion("EntryUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andEntryunitidEqualTo(String value) {
            addCriterion("EntryUnitID =", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidNotEqualTo(String value) {
            addCriterion("EntryUnitID <>", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidGreaterThan(String value) {
            addCriterion("EntryUnitID >", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidGreaterThanOrEqualTo(String value) {
            addCriterion("EntryUnitID >=", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidLessThan(String value) {
            addCriterion("EntryUnitID <", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidLessThanOrEqualTo(String value) {
            addCriterion("EntryUnitID <=", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidLike(String value) {
            addCriterion("EntryUnitID like", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidNotLike(String value) {
            addCriterion("EntryUnitID not like", value, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidIn(List<String> values) {
            addCriterion("EntryUnitID in", values, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidNotIn(List<String> values) {
            addCriterion("EntryUnitID not in", values, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidBetween(String value1, String value2) {
            addCriterion("EntryUnitID between", value1, value2, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andEntryunitidNotBetween(String value1, String value2) {
            addCriterion("EntryUnitID not between", value1, value2, "entryunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidIsNull() {
            addCriterion("ComplementUnitID is null");
            return (Criteria) this;
        }

        public Criteria andComplementunitidIsNotNull() {
            addCriterion("ComplementUnitID is not null");
            return (Criteria) this;
        }

        public Criteria andComplementunitidEqualTo(String value) {
            addCriterion("ComplementUnitID =", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidNotEqualTo(String value) {
            addCriterion("ComplementUnitID <>", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidGreaterThan(String value) {
            addCriterion("ComplementUnitID >", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidGreaterThanOrEqualTo(String value) {
            addCriterion("ComplementUnitID >=", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidLessThan(String value) {
            addCriterion("ComplementUnitID <", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidLessThanOrEqualTo(String value) {
            addCriterion("ComplementUnitID <=", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidLike(String value) {
            addCriterion("ComplementUnitID like", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidNotLike(String value) {
            addCriterion("ComplementUnitID not like", value, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidIn(List<String> values) {
            addCriterion("ComplementUnitID in", values, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidNotIn(List<String> values) {
            addCriterion("ComplementUnitID not in", values, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidBetween(String value1, String value2) {
            addCriterion("ComplementUnitID between", value1, value2, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andComplementunitidNotBetween(String value1, String value2) {
            addCriterion("ComplementUnitID not between", value1, value2, "complementunitid");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("Nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("Nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Boolean value) {
            addCriterion("Nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Boolean value) {
            addCriterion("Nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Boolean value) {
            addCriterion("Nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Boolean value) {
            addCriterion("Nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Boolean value) {
            addCriterion("Nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Boolean> values) {
            addCriterion("Nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Boolean> values) {
            addCriterion("Nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Boolean value1, Boolean value2) {
            addCriterion("Nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andTheareaIsNull() {
            addCriterion("TheArea is null");
            return (Criteria) this;
        }

        public Criteria andTheareaIsNotNull() {
            addCriterion("TheArea is not null");
            return (Criteria) this;
        }

        public Criteria andTheareaEqualTo(Boolean value) {
            addCriterion("TheArea =", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaNotEqualTo(Boolean value) {
            addCriterion("TheArea <>", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaGreaterThan(Boolean value) {
            addCriterion("TheArea >", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TheArea >=", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaLessThan(Boolean value) {
            addCriterion("TheArea <", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaLessThanOrEqualTo(Boolean value) {
            addCriterion("TheArea <=", value, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaIn(List<Boolean> values) {
            addCriterion("TheArea in", values, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaNotIn(List<Boolean> values) {
            addCriterion("TheArea not in", values, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaBetween(Boolean value1, Boolean value2) {
            addCriterion("TheArea between", value1, value2, "thearea");
            return (Criteria) this;
        }

        public Criteria andTheareaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TheArea not between", value1, value2, "thearea");
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
