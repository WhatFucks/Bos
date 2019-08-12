package com.lyb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacPackagingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacPackagingExample() {
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

        public Criteria andItemcodeIsNull() {
            addCriterion("ItemCode is null");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNotNull() {
            addCriterion("ItemCode is not null");
            return (Criteria) this;
        }

        public Criteria andItemcodeEqualTo(String value) {
            addCriterion("ItemCode =", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotEqualTo(String value) {
            addCriterion("ItemCode <>", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThan(String value) {
            addCriterion("ItemCode >", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ItemCode >=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThan(String value) {
            addCriterion("ItemCode <", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThanOrEqualTo(String value) {
            addCriterion("ItemCode <=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLike(String value) {
            addCriterion("ItemCode like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotLike(String value) {
            addCriterion("ItemCode not like", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeIn(List<String> values) {
            addCriterion("ItemCode in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotIn(List<String> values) {
            addCriterion("ItemCode not in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeBetween(String value1, String value2) {
            addCriterion("ItemCode between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotBetween(String value1, String value2) {
            addCriterion("ItemCode not between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("ItemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ItemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ItemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ItemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ItemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ItemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ItemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ItemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ItemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ItemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ItemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ItemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ItemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceIsNull() {
            addCriterion("PlannedPrice is null");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceIsNotNull() {
            addCriterion("PlannedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceEqualTo(Float value) {
            addCriterion("PlannedPrice =", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceNotEqualTo(Float value) {
            addCriterion("PlannedPrice <>", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceGreaterThan(Float value) {
            addCriterion("PlannedPrice >", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PlannedPrice >=", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceLessThan(Float value) {
            addCriterion("PlannedPrice <", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceLessThanOrEqualTo(Float value) {
            addCriterion("PlannedPrice <=", value, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceIn(List<Float> values) {
            addCriterion("PlannedPrice in", values, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceNotIn(List<Float> values) {
            addCriterion("PlannedPrice not in", values, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceBetween(Float value1, Float value2) {
            addCriterion("PlannedPrice between", value1, value2, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andPlannedpriceNotBetween(Float value1, Float value2) {
            addCriterion("PlannedPrice not between", value1, value2, "plannedprice");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("Specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("Specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("Specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("Specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("Specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("Specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("Specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("Specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("Specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("Specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("Specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("Specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("Specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("Specifications not between", value1, value2, "specifications");
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

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitIsNull() {
            addCriterion("MeasurementUnit is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitIsNotNull() {
            addCriterion("MeasurementUnit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitEqualTo(String value) {
            addCriterion("MeasurementUnit =", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitNotEqualTo(String value) {
            addCriterion("MeasurementUnit <>", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitGreaterThan(String value) {
            addCriterion("MeasurementUnit >", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitGreaterThanOrEqualTo(String value) {
            addCriterion("MeasurementUnit >=", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitLessThan(String value) {
            addCriterion("MeasurementUnit <", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitLessThanOrEqualTo(String value) {
            addCriterion("MeasurementUnit <=", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitLike(String value) {
            addCriterion("MeasurementUnit like", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitNotLike(String value) {
            addCriterion("MeasurementUnit not like", value, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitIn(List<String> values) {
            addCriterion("MeasurementUnit in", values, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitNotIn(List<String> values) {
            addCriterion("MeasurementUnit not in", values, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitBetween(String value1, String value2) {
            addCriterion("MeasurementUnit between", value1, value2, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andMeasurementunitNotBetween(String value1, String value2) {
            addCriterion("MeasurementUnit not between", value1, value2, "measurementunit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Status not between", value1, value2, "status");
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

        public Criteria andInvalidatejobintIsNull() {
            addCriterion("InvalidateJobInt is null");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintIsNotNull() {
            addCriterion("InvalidateJobInt is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintEqualTo(Integer value) {
            addCriterion("InvalidateJobInt =", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintNotEqualTo(Integer value) {
            addCriterion("InvalidateJobInt <>", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintGreaterThan(Integer value) {
            addCriterion("InvalidateJobInt >", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintGreaterThanOrEqualTo(Integer value) {
            addCriterion("InvalidateJobInt >=", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintLessThan(Integer value) {
            addCriterion("InvalidateJobInt <", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintLessThanOrEqualTo(Integer value) {
            addCriterion("InvalidateJobInt <=", value, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintIn(List<Integer> values) {
            addCriterion("InvalidateJobInt in", values, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintNotIn(List<Integer> values) {
            addCriterion("InvalidateJobInt not in", values, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateJobInt between", value1, value2, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatejobintNotBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateJobInt not between", value1, value2, "invalidatejobint");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameIsNull() {
            addCriterion("InvalidateName is null");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameIsNotNull() {
            addCriterion("InvalidateName is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameEqualTo(Integer value) {
            addCriterion("InvalidateName =", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameNotEqualTo(Integer value) {
            addCriterion("InvalidateName <>", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameGreaterThan(Integer value) {
            addCriterion("InvalidateName >", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameGreaterThanOrEqualTo(Integer value) {
            addCriterion("InvalidateName >=", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameLessThan(Integer value) {
            addCriterion("InvalidateName <", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameLessThanOrEqualTo(Integer value) {
            addCriterion("InvalidateName <=", value, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameIn(List<Integer> values) {
            addCriterion("InvalidateName in", values, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameNotIn(List<Integer> values) {
            addCriterion("InvalidateName not in", values, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateName between", value1, value2, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatenameNotBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateName not between", value1, value2, "invalidatename");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeIsNull() {
            addCriterion("InvalidateTime is null");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeIsNotNull() {
            addCriterion("InvalidateTime is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeEqualTo(Date value) {
            addCriterion("InvalidateTime =", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeNotEqualTo(Date value) {
            addCriterion("InvalidateTime <>", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeGreaterThan(Date value) {
            addCriterion("InvalidateTime >", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InvalidateTime >=", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeLessThan(Date value) {
            addCriterion("InvalidateTime <", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeLessThanOrEqualTo(Date value) {
            addCriterion("InvalidateTime <=", value, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeIn(List<Date> values) {
            addCriterion("InvalidateTime in", values, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeNotIn(List<Date> values) {
            addCriterion("InvalidateTime not in", values, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeBetween(Date value1, Date value2) {
            addCriterion("InvalidateTime between", value1, value2, "invalidatetime");
            return (Criteria) this;
        }

        public Criteria andInvalidatetimeNotBetween(Date value1, Date value2) {
            addCriterion("InvalidateTime not between", value1, value2, "invalidatetime");
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