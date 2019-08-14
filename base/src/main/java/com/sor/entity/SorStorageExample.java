package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorStorageExample() {
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

        public Criteria andAcceptdateIsNull() {
            addCriterion("AcceptDate is null");
            return (Criteria) this;
        }

        public Criteria andAcceptdateIsNotNull() {
            addCriterion("AcceptDate is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptdateEqualTo(Date value) {
            addCriterion("AcceptDate =", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotEqualTo(Date value) {
            addCriterion("AcceptDate <>", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateGreaterThan(Date value) {
            addCriterion("AcceptDate >", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AcceptDate >=", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateLessThan(Date value) {
            addCriterion("AcceptDate <", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateLessThanOrEqualTo(Date value) {
            addCriterion("AcceptDate <=", value, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateIn(List<Date> values) {
            addCriterion("AcceptDate in", values, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotIn(List<Date> values) {
            addCriterion("AcceptDate not in", values, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateBetween(Date value1, Date value2) {
            addCriterion("AcceptDate between", value1, value2, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptdateNotBetween(Date value1, Date value2) {
            addCriterion("AcceptDate not between", value1, value2, "acceptdate");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonIsNull() {
            addCriterion("AcceptPerson is null");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonIsNotNull() {
            addCriterion("AcceptPerson is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonEqualTo(Integer value) {
            addCriterion("AcceptPerson =", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonNotEqualTo(Integer value) {
            addCriterion("AcceptPerson <>", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonGreaterThan(Integer value) {
            addCriterion("AcceptPerson >", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("AcceptPerson >=", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonLessThan(Integer value) {
            addCriterion("AcceptPerson <", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonLessThanOrEqualTo(Integer value) {
            addCriterion("AcceptPerson <=", value, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonIn(List<Integer> values) {
            addCriterion("AcceptPerson in", values, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonNotIn(List<Integer> values) {
            addCriterion("AcceptPerson not in", values, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonBetween(Integer value1, Integer value2) {
            addCriterion("AcceptPerson between", value1, value2, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("AcceptPerson not between", value1, value2, "acceptperson");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyIsNull() {
            addCriterion("AcceptCompany is null");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyIsNotNull() {
            addCriterion("AcceptCompany is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyEqualTo(String value) {
            addCriterion("AcceptCompany =", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyNotEqualTo(String value) {
            addCriterion("AcceptCompany <>", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyGreaterThan(String value) {
            addCriterion("AcceptCompany >", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("AcceptCompany >=", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyLessThan(String value) {
            addCriterion("AcceptCompany <", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyLessThanOrEqualTo(String value) {
            addCriterion("AcceptCompany <=", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyLike(String value) {
            addCriterion("AcceptCompany like", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyNotLike(String value) {
            addCriterion("AcceptCompany not like", value, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyIn(List<String> values) {
            addCriterion("AcceptCompany in", values, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyNotIn(List<String> values) {
            addCriterion("AcceptCompany not in", values, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyBetween(String value1, String value2) {
            addCriterion("AcceptCompany between", value1, value2, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andAcceptcompanyNotBetween(String value1, String value2) {
            addCriterion("AcceptCompany not between", value1, value2, "acceptcompany");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNull() {
            addCriterion("DeliveryPerson is null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNotNull() {
            addCriterion("DeliveryPerson is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonEqualTo(Integer value) {
            addCriterion("DeliveryPerson =", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotEqualTo(Integer value) {
            addCriterion("DeliveryPerson <>", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThan(Integer value) {
            addCriterion("DeliveryPerson >", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeliveryPerson >=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThan(Integer value) {
            addCriterion("DeliveryPerson <", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThanOrEqualTo(Integer value) {
            addCriterion("DeliveryPerson <=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIn(List<Integer> values) {
            addCriterion("DeliveryPerson in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotIn(List<Integer> values) {
            addCriterion("DeliveryPerson not in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryPerson between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryPerson not between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyIsNull() {
            addCriterion("DeliveryCompany is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyIsNotNull() {
            addCriterion("DeliveryCompany is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyEqualTo(String value) {
            addCriterion("DeliveryCompany =", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyNotEqualTo(String value) {
            addCriterion("DeliveryCompany <>", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyGreaterThan(String value) {
            addCriterion("DeliveryCompany >", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryCompany >=", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyLessThan(String value) {
            addCriterion("DeliveryCompany <", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyLessThanOrEqualTo(String value) {
            addCriterion("DeliveryCompany <=", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyLike(String value) {
            addCriterion("DeliveryCompany like", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyNotLike(String value) {
            addCriterion("DeliveryCompany not like", value, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyIn(List<String> values) {
            addCriterion("DeliveryCompany in", values, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyNotIn(List<String> values) {
            addCriterion("DeliveryCompany not in", values, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyBetween(String value1, String value2) {
            addCriterion("DeliveryCompany between", value1, value2, "deliverycompany");
            return (Criteria) this;
        }

        public Criteria andDeliverycompanyNotBetween(String value1, String value2) {
            addCriterion("DeliveryCompany not between", value1, value2, "deliverycompany");
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