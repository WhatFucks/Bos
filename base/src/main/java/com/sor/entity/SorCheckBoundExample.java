package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorCheckBoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorCheckBoundExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScanidIsNull() {
            addCriterion("ScanID is null");
            return (Criteria) this;
        }

        public Criteria andScanidIsNotNull() {
            addCriterion("ScanID is not null");
            return (Criteria) this;
        }

        public Criteria andScanidEqualTo(Integer value) {
            addCriterion("ScanID =", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidNotEqualTo(Integer value) {
            addCriterion("ScanID <>", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidGreaterThan(Integer value) {
            addCriterion("ScanID >", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ScanID >=", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidLessThan(Integer value) {
            addCriterion("ScanID <", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidLessThanOrEqualTo(Integer value) {
            addCriterion("ScanID <=", value, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidIn(List<Integer> values) {
            addCriterion("ScanID in", values, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidNotIn(List<Integer> values) {
            addCriterion("ScanID not in", values, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidBetween(Integer value1, Integer value2) {
            addCriterion("ScanID between", value1, value2, "scanid");
            return (Criteria) this;
        }

        public Criteria andScanidNotBetween(Integer value1, Integer value2) {
            addCriterion("ScanID not between", value1, value2, "scanid");
            return (Criteria) this;
        }

        public Criteria andCargosumIsNull() {
            addCriterion("CargoSum is null");
            return (Criteria) this;
        }

        public Criteria andCargosumIsNotNull() {
            addCriterion("CargoSum is not null");
            return (Criteria) this;
        }

        public Criteria andCargosumEqualTo(Integer value) {
            addCriterion("CargoSum =", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotEqualTo(Integer value) {
            addCriterion("CargoSum <>", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumGreaterThan(Integer value) {
            addCriterion("CargoSum >", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoSum >=", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumLessThan(Integer value) {
            addCriterion("CargoSum <", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumLessThanOrEqualTo(Integer value) {
            addCriterion("CargoSum <=", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumIn(List<Integer> values) {
            addCriterion("CargoSum in", values, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotIn(List<Integer> values) {
            addCriterion("CargoSum not in", values, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumBetween(Integer value1, Integer value2) {
            addCriterion("CargoSum between", value1, value2, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoSum not between", value1, value2, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("CheckPerson is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("CheckPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("CheckPerson =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("CheckPerson <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("CheckPerson >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CheckPerson >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("CheckPerson <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("CheckPerson <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("CheckPerson like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("CheckPerson not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("CheckPerson in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("CheckPerson not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("CheckPerson between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("CheckPerson not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("CheckDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CheckDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterion("CheckDate =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterion("CheckDate <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterion("CheckDate >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CheckDate >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterion("CheckDate <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("CheckDate <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterion("CheckDate in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterion("CheckDate not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterion("CheckDate between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("CheckDate not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyIsNull() {
            addCriterion("CheckCompany is null");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyIsNotNull() {
            addCriterion("CheckCompany is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyEqualTo(String value) {
            addCriterion("CheckCompany =", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyNotEqualTo(String value) {
            addCriterion("CheckCompany <>", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyGreaterThan(String value) {
            addCriterion("CheckCompany >", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("CheckCompany >=", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyLessThan(String value) {
            addCriterion("CheckCompany <", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyLessThanOrEqualTo(String value) {
            addCriterion("CheckCompany <=", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyLike(String value) {
            addCriterion("CheckCompany like", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyNotLike(String value) {
            addCriterion("CheckCompany not like", value, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyIn(List<String> values) {
            addCriterion("CheckCompany in", values, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyNotIn(List<String> values) {
            addCriterion("CheckCompany not in", values, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyBetween(String value1, String value2) {
            addCriterion("CheckCompany between", value1, value2, "checkcompany");
            return (Criteria) this;
        }

        public Criteria andCheckcompanyNotBetween(String value1, String value2) {
            addCriterion("CheckCompany not between", value1, value2, "checkcompany");
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