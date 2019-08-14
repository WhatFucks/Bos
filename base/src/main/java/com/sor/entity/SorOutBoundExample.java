package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorOutBoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorOutBoundExample() {
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

        public Criteria andHandovertypeIsNull() {
            addCriterion("HandoverType is null");
            return (Criteria) this;
        }

        public Criteria andHandovertypeIsNotNull() {
            addCriterion("HandoverType is not null");
            return (Criteria) this;
        }

        public Criteria andHandovertypeEqualTo(Boolean value) {
            addCriterion("HandoverType =", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeNotEqualTo(Boolean value) {
            addCriterion("HandoverType <>", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeGreaterThan(Boolean value) {
            addCriterion("HandoverType >", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HandoverType >=", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeLessThan(Boolean value) {
            addCriterion("HandoverType <", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeLessThanOrEqualTo(Boolean value) {
            addCriterion("HandoverType <=", value, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeIn(List<Boolean> values) {
            addCriterion("HandoverType in", values, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeNotIn(List<Boolean> values) {
            addCriterion("HandoverType not in", values, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeBetween(Boolean value1, Boolean value2) {
            addCriterion("HandoverType between", value1, value2, "handovertype");
            return (Criteria) this;
        }

        public Criteria andHandovertypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HandoverType not between", value1, value2, "handovertype");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("Line is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("Line is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(String value) {
            addCriterion("Line =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(String value) {
            addCriterion("Line <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(String value) {
            addCriterion("Line >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(String value) {
            addCriterion("Line >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(String value) {
            addCriterion("Line <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(String value) {
            addCriterion("Line <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLike(String value) {
            addCriterion("Line like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotLike(String value) {
            addCriterion("Line not like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<String> values) {
            addCriterion("Line in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<String> values) {
            addCriterion("Line not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(String value1, String value2) {
            addCriterion("Line between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(String value1, String value2) {
            addCriterion("Line not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("Direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("Direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Integer value) {
            addCriterion("Direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Integer value) {
            addCriterion("Direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Integer value) {
            addCriterion("Direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Integer value) {
            addCriterion("Direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("Direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Integer> values) {
            addCriterion("Direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Integer> values) {
            addCriterion("Direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Integer value1, Integer value2) {
            addCriterion("Direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("Direction not between", value1, value2, "direction");
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

        public Criteria andCarriersIsNull() {
            addCriterion("Carriers is null");
            return (Criteria) this;
        }

        public Criteria andCarriersIsNotNull() {
            addCriterion("Carriers is not null");
            return (Criteria) this;
        }

        public Criteria andCarriersEqualTo(Integer value) {
            addCriterion("Carriers =", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotEqualTo(Integer value) {
            addCriterion("Carriers <>", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersGreaterThan(Integer value) {
            addCriterion("Carriers >", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Carriers >=", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersLessThan(Integer value) {
            addCriterion("Carriers <", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersLessThanOrEqualTo(Integer value) {
            addCriterion("Carriers <=", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersIn(List<Integer> values) {
            addCriterion("Carriers in", values, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotIn(List<Integer> values) {
            addCriterion("Carriers not in", values, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersBetween(Integer value1, Integer value2) {
            addCriterion("Carriers between", value1, value2, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotBetween(Integer value1, Integer value2) {
            addCriterion("Carriers not between", value1, value2, "carriers");
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

        public Criteria andDeliverydateIsNull() {
            addCriterion("DeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DeliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DeliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DeliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DeliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DeliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DeliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate not between", value1, value2, "deliverydate");
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

        public Criteria andEnterpersonIsNull() {
            addCriterion("EnterPerson is null");
            return (Criteria) this;
        }

        public Criteria andEnterpersonIsNotNull() {
            addCriterion("EnterPerson is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpersonEqualTo(Integer value) {
            addCriterion("EnterPerson =", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonNotEqualTo(Integer value) {
            addCriterion("EnterPerson <>", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonGreaterThan(Integer value) {
            addCriterion("EnterPerson >", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("EnterPerson >=", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonLessThan(Integer value) {
            addCriterion("EnterPerson <", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonLessThanOrEqualTo(Integer value) {
            addCriterion("EnterPerson <=", value, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonIn(List<Integer> values) {
            addCriterion("EnterPerson in", values, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonNotIn(List<Integer> values) {
            addCriterion("EnterPerson not in", values, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonBetween(Integer value1, Integer value2) {
            addCriterion("EnterPerson between", value1, value2, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("EnterPerson not between", value1, value2, "enterperson");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNull() {
            addCriterion("EnterDate is null");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNotNull() {
            addCriterion("EnterDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdateEqualTo(Date value) {
            addCriterion("EnterDate =", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotEqualTo(Date value) {
            addCriterion("EnterDate <>", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThan(Date value) {
            addCriterion("EnterDate >", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EnterDate >=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThan(Date value) {
            addCriterion("EnterDate <", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThanOrEqualTo(Date value) {
            addCriterion("EnterDate <=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateIn(List<Date> values) {
            addCriterion("EnterDate in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotIn(List<Date> values) {
            addCriterion("EnterDate not in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateBetween(Date value1, Date value2) {
            addCriterion("EnterDate between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotBetween(Date value1, Date value2) {
            addCriterion("EnterDate not between", value1, value2, "enterdate");
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