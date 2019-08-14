package com.ljw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacStockoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacStockoutExample() {
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

        public Criteria andWarehouseordernoIsNull() {
            addCriterion("WarehouseOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoIsNotNull() {
            addCriterion("WarehouseOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoEqualTo(String value) {
            addCriterion("WarehouseOrderNo =", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoNotEqualTo(String value) {
            addCriterion("WarehouseOrderNo <>", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoGreaterThan(String value) {
            addCriterion("WarehouseOrderNo >", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseOrderNo >=", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoLessThan(String value) {
            addCriterion("WarehouseOrderNo <", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoLessThanOrEqualTo(String value) {
            addCriterion("WarehouseOrderNo <=", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoLike(String value) {
            addCriterion("WarehouseOrderNo like", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoNotLike(String value) {
            addCriterion("WarehouseOrderNo not like", value, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoIn(List<String> values) {
            addCriterion("WarehouseOrderNo in", values, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoNotIn(List<String> values) {
            addCriterion("WarehouseOrderNo not in", values, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoBetween(String value1, String value2) {
            addCriterion("WarehouseOrderNo between", value1, value2, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehouseordernoNotBetween(String value1, String value2) {
            addCriterion("WarehouseOrderNo not between", value1, value2, "warehouseorderno");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNull() {
            addCriterion("WarehouseType is null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNotNull() {
            addCriterion("WarehouseType is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeEqualTo(Integer value) {
            addCriterion("WarehouseType =", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotEqualTo(Integer value) {
            addCriterion("WarehouseType <>", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThan(Integer value) {
            addCriterion("WarehouseType >", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WarehouseType >=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThan(Integer value) {
            addCriterion("WarehouseType <", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThanOrEqualTo(Integer value) {
            addCriterion("WarehouseType <=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIn(List<Integer> values) {
            addCriterion("WarehouseType in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotIn(List<Integer> values) {
            addCriterion("WarehouseType not in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseType between", value1, value2, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseType not between", value1, value2, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoIsNull() {
            addCriterion("transportationOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoIsNotNull() {
            addCriterion("transportationOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoEqualTo(String value) {
            addCriterion("transportationOrderNo =", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoNotEqualTo(String value) {
            addCriterion("transportationOrderNo <>", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoGreaterThan(String value) {
            addCriterion("transportationOrderNo >", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoGreaterThanOrEqualTo(String value) {
            addCriterion("transportationOrderNo >=", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoLessThan(String value) {
            addCriterion("transportationOrderNo <", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoLessThanOrEqualTo(String value) {
            addCriterion("transportationOrderNo <=", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoLike(String value) {
            addCriterion("transportationOrderNo like", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoNotLike(String value) {
            addCriterion("transportationOrderNo not like", value, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoIn(List<String> values) {
            addCriterion("transportationOrderNo in", values, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoNotIn(List<String> values) {
            addCriterion("transportationOrderNo not in", values, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoBetween(String value1, String value2) {
            addCriterion("transportationOrderNo between", value1, value2, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andTransportationordernoNotBetween(String value1, String value2) {
            addCriterion("transportationOrderNo not between", value1, value2, "transportationorderno");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitIsNull() {
            addCriterion("affiliatedUnit is null");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitIsNotNull() {
            addCriterion("affiliatedUnit is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitEqualTo(String value) {
            addCriterion("affiliatedUnit =", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitNotEqualTo(String value) {
            addCriterion("affiliatedUnit <>", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitGreaterThan(String value) {
            addCriterion("affiliatedUnit >", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitGreaterThanOrEqualTo(String value) {
            addCriterion("affiliatedUnit >=", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitLessThan(String value) {
            addCriterion("affiliatedUnit <", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitLessThanOrEqualTo(String value) {
            addCriterion("affiliatedUnit <=", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitLike(String value) {
            addCriterion("affiliatedUnit like", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitNotLike(String value) {
            addCriterion("affiliatedUnit not like", value, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitIn(List<String> values) {
            addCriterion("affiliatedUnit in", values, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitNotIn(List<String> values) {
            addCriterion("affiliatedUnit not in", values, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitBetween(String value1, String value2) {
            addCriterion("affiliatedUnit between", value1, value2, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andAffiliatedunitNotBetween(String value1, String value2) {
            addCriterion("affiliatedUnit not between", value1, value2, "affiliatedunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitIsNull() {
            addCriterion("IssuedByTheUnit is null");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitIsNotNull() {
            addCriterion("IssuedByTheUnit is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitEqualTo(String value) {
            addCriterion("IssuedByTheUnit =", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitNotEqualTo(String value) {
            addCriterion("IssuedByTheUnit <>", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitGreaterThan(String value) {
            addCriterion("IssuedByTheUnit >", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitGreaterThanOrEqualTo(String value) {
            addCriterion("IssuedByTheUnit >=", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitLessThan(String value) {
            addCriterion("IssuedByTheUnit <", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitLessThanOrEqualTo(String value) {
            addCriterion("IssuedByTheUnit <=", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitLike(String value) {
            addCriterion("IssuedByTheUnit like", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitNotLike(String value) {
            addCriterion("IssuedByTheUnit not like", value, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitIn(List<String> values) {
            addCriterion("IssuedByTheUnit in", values, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitNotIn(List<String> values) {
            addCriterion("IssuedByTheUnit not in", values, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitBetween(String value1, String value2) {
            addCriterion("IssuedByTheUnit between", value1, value2, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andIssuedbytheunitNotBetween(String value1, String value2) {
            addCriterion("IssuedByTheUnit not between", value1, value2, "issuedbytheunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitIsNull() {
            addCriterion("HandlingUnit is null");
            return (Criteria) this;
        }

        public Criteria andHandlingunitIsNotNull() {
            addCriterion("HandlingUnit is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingunitEqualTo(String value) {
            addCriterion("HandlingUnit =", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitNotEqualTo(String value) {
            addCriterion("HandlingUnit <>", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitGreaterThan(String value) {
            addCriterion("HandlingUnit >", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitGreaterThanOrEqualTo(String value) {
            addCriterion("HandlingUnit >=", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitLessThan(String value) {
            addCriterion("HandlingUnit <", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitLessThanOrEqualTo(String value) {
            addCriterion("HandlingUnit <=", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitLike(String value) {
            addCriterion("HandlingUnit like", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitNotLike(String value) {
            addCriterion("HandlingUnit not like", value, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitIn(List<String> values) {
            addCriterion("HandlingUnit in", values, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitNotIn(List<String> values) {
            addCriterion("HandlingUnit not in", values, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitBetween(String value1, String value2) {
            addCriterion("HandlingUnit between", value1, value2, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingunitNotBetween(String value1, String value2) {
            addCriterion("HandlingUnit not between", value1, value2, "handlingunit");
            return (Criteria) this;
        }

        public Criteria andHandlingnameIsNull() {
            addCriterion("HandlingName is null");
            return (Criteria) this;
        }

        public Criteria andHandlingnameIsNotNull() {
            addCriterion("HandlingName is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingnameEqualTo(String value) {
            addCriterion("HandlingName =", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameNotEqualTo(String value) {
            addCriterion("HandlingName <>", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameGreaterThan(String value) {
            addCriterion("HandlingName >", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameGreaterThanOrEqualTo(String value) {
            addCriterion("HandlingName >=", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameLessThan(String value) {
            addCriterion("HandlingName <", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameLessThanOrEqualTo(String value) {
            addCriterion("HandlingName <=", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameLike(String value) {
            addCriterion("HandlingName like", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameNotLike(String value) {
            addCriterion("HandlingName not like", value, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameIn(List<String> values) {
            addCriterion("HandlingName in", values, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameNotIn(List<String> values) {
            addCriterion("HandlingName not in", values, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameBetween(String value1, String value2) {
            addCriterion("HandlingName between", value1, value2, "handlingname");
            return (Criteria) this;
        }

        public Criteria andHandlingnameNotBetween(String value1, String value2) {
            addCriterion("HandlingName not between", value1, value2, "handlingname");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIsNull() {
            addCriterion("CustomCode is null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIsNotNull() {
            addCriterion("CustomCode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeEqualTo(String value) {
            addCriterion("CustomCode =", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotEqualTo(String value) {
            addCriterion("CustomCode <>", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThan(String value) {
            addCriterion("CustomCode >", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CustomCode >=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThan(String value) {
            addCriterion("CustomCode <", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThanOrEqualTo(String value) {
            addCriterion("CustomCode <=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLike(String value) {
            addCriterion("CustomCode like", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotLike(String value) {
            addCriterion("CustomCode not like", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIn(List<String> values) {
            addCriterion("CustomCode in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotIn(List<String> values) {
            addCriterion("CustomCode not in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeBetween(String value1, String value2) {
            addCriterion("CustomCode between", value1, value2, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotBetween(String value1, String value2) {
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

        public Criteria andRecipientjobnumberIsNull() {
            addCriterion("recipientJobNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberIsNotNull() {
            addCriterion("recipientJobNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberEqualTo(String value) {
            addCriterion("recipientJobNumber =", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberNotEqualTo(String value) {
            addCriterion("recipientJobNumber <>", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberGreaterThan(String value) {
            addCriterion("recipientJobNumber >", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("recipientJobNumber >=", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberLessThan(String value) {
            addCriterion("recipientJobNumber <", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberLessThanOrEqualTo(String value) {
            addCriterion("recipientJobNumber <=", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberLike(String value) {
            addCriterion("recipientJobNumber like", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberNotLike(String value) {
            addCriterion("recipientJobNumber not like", value, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberIn(List<String> values) {
            addCriterion("recipientJobNumber in", values, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberNotIn(List<String> values) {
            addCriterion("recipientJobNumber not in", values, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberBetween(String value1, String value2) {
            addCriterion("recipientJobNumber between", value1, value2, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientjobnumberNotBetween(String value1, String value2) {
            addCriterion("recipientJobNumber not between", value1, value2, "recipientjobnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIsNull() {
            addCriterion("recipientName is null");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIsNotNull() {
            addCriterion("recipientName is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientnameEqualTo(String value) {
            addCriterion("recipientName =", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotEqualTo(String value) {
            addCriterion("recipientName <>", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameGreaterThan(String value) {
            addCriterion("recipientName >", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameGreaterThanOrEqualTo(String value) {
            addCriterion("recipientName >=", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLessThan(String value) {
            addCriterion("recipientName <", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLessThanOrEqualTo(String value) {
            addCriterion("recipientName <=", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLike(String value) {
            addCriterion("recipientName like", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotLike(String value) {
            addCriterion("recipientName not like", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIn(List<String> values) {
            addCriterion("recipientName in", values, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotIn(List<String> values) {
            addCriterion("recipientName not in", values, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameBetween(String value1, String value2) {
            addCriterion("recipientName between", value1, value2, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotBetween(String value1, String value2) {
            addCriterion("recipientName not between", value1, value2, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeIsNull() {
            addCriterion("recipientTime is null");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeIsNotNull() {
            addCriterion("recipientTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeEqualTo(Date value) {
            addCriterion("recipientTime =", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeNotEqualTo(Date value) {
            addCriterion("recipientTime <>", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeGreaterThan(Date value) {
            addCriterion("recipientTime >", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recipientTime >=", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeLessThan(Date value) {
            addCriterion("recipientTime <", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeLessThanOrEqualTo(Date value) {
            addCriterion("recipientTime <=", value, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeIn(List<Date> values) {
            addCriterion("recipientTime in", values, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeNotIn(List<Date> values) {
            addCriterion("recipientTime not in", values, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeBetween(Date value1, Date value2) {
            addCriterion("recipientTime between", value1, value2, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andRecipienttimeNotBetween(Date value1, Date value2) {
            addCriterion("recipientTime not between", value1, value2, "recipienttime");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberIsNull() {
            addCriterion("BillingJobNumber is null");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberIsNotNull() {
            addCriterion("BillingJobNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberEqualTo(String value) {
            addCriterion("BillingJobNumber =", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberNotEqualTo(String value) {
            addCriterion("BillingJobNumber <>", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberGreaterThan(String value) {
            addCriterion("BillingJobNumber >", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BillingJobNumber >=", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberLessThan(String value) {
            addCriterion("BillingJobNumber <", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberLessThanOrEqualTo(String value) {
            addCriterion("BillingJobNumber <=", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberLike(String value) {
            addCriterion("BillingJobNumber like", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberNotLike(String value) {
            addCriterion("BillingJobNumber not like", value, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberIn(List<String> values) {
            addCriterion("BillingJobNumber in", values, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberNotIn(List<String> values) {
            addCriterion("BillingJobNumber not in", values, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberBetween(String value1, String value2) {
            addCriterion("BillingJobNumber between", value1, value2, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingjobnumberNotBetween(String value1, String value2) {
            addCriterion("BillingJobNumber not between", value1, value2, "billingjobnumber");
            return (Criteria) this;
        }

        public Criteria andBillingnameIsNull() {
            addCriterion("BillingName is null");
            return (Criteria) this;
        }

        public Criteria andBillingnameIsNotNull() {
            addCriterion("BillingName is not null");
            return (Criteria) this;
        }

        public Criteria andBillingnameEqualTo(String value) {
            addCriterion("BillingName =", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameNotEqualTo(String value) {
            addCriterion("BillingName <>", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameGreaterThan(String value) {
            addCriterion("BillingName >", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameGreaterThanOrEqualTo(String value) {
            addCriterion("BillingName >=", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameLessThan(String value) {
            addCriterion("BillingName <", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameLessThanOrEqualTo(String value) {
            addCriterion("BillingName <=", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameLike(String value) {
            addCriterion("BillingName like", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameNotLike(String value) {
            addCriterion("BillingName not like", value, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameIn(List<String> values) {
            addCriterion("BillingName in", values, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameNotIn(List<String> values) {
            addCriterion("BillingName not in", values, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameBetween(String value1, String value2) {
            addCriterion("BillingName between", value1, value2, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingnameNotBetween(String value1, String value2) {
            addCriterion("BillingName not between", value1, value2, "billingname");
            return (Criteria) this;
        }

        public Criteria andBillingtimeIsNull() {
            addCriterion("BillingTime is null");
            return (Criteria) this;
        }

        public Criteria andBillingtimeIsNotNull() {
            addCriterion("BillingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBillingtimeEqualTo(Date value) {
            addCriterion("BillingTime =", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeNotEqualTo(Date value) {
            addCriterion("BillingTime <>", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeGreaterThan(Date value) {
            addCriterion("BillingTime >", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BillingTime >=", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeLessThan(Date value) {
            addCriterion("BillingTime <", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeLessThanOrEqualTo(Date value) {
            addCriterion("BillingTime <=", value, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeIn(List<Date> values) {
            addCriterion("BillingTime in", values, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeNotIn(List<Date> values) {
            addCriterion("BillingTime not in", values, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeBetween(Date value1, Date value2) {
            addCriterion("BillingTime between", value1, value2, "billingtime");
            return (Criteria) this;
        }

        public Criteria andBillingtimeNotBetween(Date value1, Date value2) {
            addCriterion("BillingTime not between", value1, value2, "billingtime");
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