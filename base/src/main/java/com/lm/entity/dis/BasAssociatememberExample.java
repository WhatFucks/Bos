package com.lm.entity.dis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasAssociatememberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasAssociatememberExample() {
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

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andStandardkgIsNull() {
            addCriterion("StandardKg is null");
            return (Criteria) this;
        }

        public Criteria andStandardkgIsNotNull() {
            addCriterion("StandardKg is not null");
            return (Criteria) this;
        }

        public Criteria andStandardkgEqualTo(BigDecimal value) {
            addCriterion("StandardKg =", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotEqualTo(BigDecimal value) {
            addCriterion("StandardKg <>", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgGreaterThan(BigDecimal value) {
            addCriterion("StandardKg >", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardKg >=", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgLessThan(BigDecimal value) {
            addCriterion("StandardKg <", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardKg <=", value, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgIn(List<BigDecimal> values) {
            addCriterion("StandardKg in", values, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotIn(List<BigDecimal> values) {
            addCriterion("StandardKg not in", values, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardKg between", value1, value2, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardkgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardKg not between", value1, value2, "standardkg");
            return (Criteria) this;
        }

        public Criteria andStandardlengthIsNull() {
            addCriterion("StandardLength is null");
            return (Criteria) this;
        }

        public Criteria andStandardlengthIsNotNull() {
            addCriterion("StandardLength is not null");
            return (Criteria) this;
        }

        public Criteria andStandardlengthEqualTo(BigDecimal value) {
            addCriterion("StandardLength =", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthNotEqualTo(BigDecimal value) {
            addCriterion("StandardLength <>", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthGreaterThan(BigDecimal value) {
            addCriterion("StandardLength >", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardLength >=", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthLessThan(BigDecimal value) {
            addCriterion("StandardLength <", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardLength <=", value, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthIn(List<BigDecimal> values) {
            addCriterion("StandardLength in", values, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthNotIn(List<BigDecimal> values) {
            addCriterion("StandardLength not in", values, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardLength between", value1, value2, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardLength not between", value1, value2, "standardlength");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIsNull() {
            addCriterion("StandardTime is null");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIsNotNull() {
            addCriterion("StandardTime is not null");
            return (Criteria) this;
        }

        public Criteria andStandardtimeEqualTo(Date value) {
            addCriterion("StandardTime =", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotEqualTo(Date value) {
            addCriterion("StandardTime <>", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeGreaterThan(Date value) {
            addCriterion("StandardTime >", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StandardTime >=", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeLessThan(Date value) {
            addCriterion("StandardTime <", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeLessThanOrEqualTo(Date value) {
            addCriterion("StandardTime <=", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIn(List<Date> values) {
            addCriterion("StandardTime in", values, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotIn(List<Date> values) {
            addCriterion("StandardTime not in", values, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeBetween(Date value1, Date value2) {
            addCriterion("StandardTime between", value1, value2, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotBetween(Date value1, Date value2) {
            addCriterion("StandardTime not between", value1, value2, "standardtime");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNull() {
            addCriterion("SubordinateUnit is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNotNull() {
            addCriterion("SubordinateUnit is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitEqualTo(Integer value) {
            addCriterion("SubordinateUnit =", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotEqualTo(Integer value) {
            addCriterion("SubordinateUnit <>", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThan(Integer value) {
            addCriterion("SubordinateUnit >", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubordinateUnit >=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThan(Integer value) {
            addCriterion("SubordinateUnit <", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThanOrEqualTo(Integer value) {
            addCriterion("SubordinateUnit <=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIn(List<Integer> values) {
            addCriterion("SubordinateUnit in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotIn(List<Integer> values) {
            addCriterion("SubordinateUnit not in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitBetween(Integer value1, Integer value2) {
            addCriterion("SubordinateUnit between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotBetween(Integer value1, Integer value2) {
            addCriterion("SubordinateUnit not between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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