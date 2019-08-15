package com.hsq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasShuttleBusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasShuttleBusExample() {
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

        public Criteria andLinetypeIsNull() {
            addCriterion("LineType is null");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNotNull() {
            addCriterion("LineType is not null");
            return (Criteria) this;
        }

        public Criteria andLinetypeEqualTo(Boolean value) {
            addCriterion("LineType =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(Boolean value) {
            addCriterion("LineType <>", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThan(Boolean value) {
            addCriterion("LineType >", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("LineType >=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThan(Boolean value) {
            addCriterion("LineType <", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThanOrEqualTo(Boolean value) {
            addCriterion("LineType <=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<Boolean> values) {
            addCriterion("LineType in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<Boolean> values) {
            addCriterion("LineType not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeBetween(Boolean value1, Boolean value2) {
            addCriterion("LineType between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("LineType not between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLineidIsNull() {
            addCriterion("LineID is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("LineID is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(Integer value) {
            addCriterion("LineID =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(Integer value) {
            addCriterion("LineID <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(Integer value) {
            addCriterion("LineID >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LineID >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(Integer value) {
            addCriterion("LineID <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(Integer value) {
            addCriterion("LineID <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<Integer> values) {
            addCriterion("LineID in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<Integer> values) {
            addCriterion("LineID not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(Integer value1, Integer value2) {
            addCriterion("LineID between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("LineID not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintIsNull() {
            addCriterion("LicensePlateInt is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintIsNotNull() {
            addCriterion("LicensePlateInt is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintEqualTo(String value) {
            addCriterion("LicensePlateInt =", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintNotEqualTo(String value) {
            addCriterion("LicensePlateInt <>", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintGreaterThan(String value) {
            addCriterion("LicensePlateInt >", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintGreaterThanOrEqualTo(String value) {
            addCriterion("LicensePlateInt >=", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintLessThan(String value) {
            addCriterion("LicensePlateInt <", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintLessThanOrEqualTo(String value) {
            addCriterion("LicensePlateInt <=", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintLike(String value) {
            addCriterion("LicensePlateInt like", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintNotLike(String value) {
            addCriterion("LicensePlateInt not like", value, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintIn(List<String> values) {
            addCriterion("LicensePlateInt in", values, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintNotIn(List<String> values) {
            addCriterion("LicensePlateInt not in", values, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintBetween(String value1, String value2) {
            addCriterion("LicensePlateInt between", value1, value2, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andLicenseplateintNotBetween(String value1, String value2) {
            addCriterion("LicensePlateInt not between", value1, value2, "licenseplateint");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNull() {
            addCriterion("Carrier is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNotNull() {
            addCriterion("Carrier is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierEqualTo(String value) {
            addCriterion("Carrier =", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotEqualTo(String value) {
            addCriterion("Carrier <>", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThan(String value) {
            addCriterion("Carrier >", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("Carrier >=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThan(String value) {
            addCriterion("Carrier <", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThanOrEqualTo(String value) {
            addCriterion("Carrier <=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLike(String value) {
            addCriterion("Carrier like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotLike(String value) {
            addCriterion("Carrier not like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierIn(List<String> values) {
            addCriterion("Carrier in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotIn(List<String> values) {
            addCriterion("Carrier not in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierBetween(String value1, String value2) {
            addCriterion("Carrier between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotBetween(String value1, String value2) {
            addCriterion("Carrier not between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andModelsIsNull() {
            addCriterion("Models is null");
            return (Criteria) this;
        }

        public Criteria andModelsIsNotNull() {
            addCriterion("Models is not null");
            return (Criteria) this;
        }

        public Criteria andModelsEqualTo(String value) {
            addCriterion("Models =", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotEqualTo(String value) {
            addCriterion("Models <>", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsGreaterThan(String value) {
            addCriterion("Models >", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsGreaterThanOrEqualTo(String value) {
            addCriterion("Models >=", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsLessThan(String value) {
            addCriterion("Models <", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsLessThanOrEqualTo(String value) {
            addCriterion("Models <=", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsLike(String value) {
            addCriterion("Models like", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotLike(String value) {
            addCriterion("Models not like", value, "models");
            return (Criteria) this;
        }

        public Criteria andModelsIn(List<String> values) {
            addCriterion("Models in", values, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotIn(List<String> values) {
            addCriterion("Models not in", values, "models");
            return (Criteria) this;
        }

        public Criteria andModelsBetween(String value1, String value2) {
            addCriterion("Models between", value1, value2, "models");
            return (Criteria) this;
        }

        public Criteria andModelsNotBetween(String value1, String value2) {
            addCriterion("Models not between", value1, value2, "models");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("Driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("Driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("Driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("Driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("Driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("Driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("Driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("Driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("Driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("Driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("Driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("Driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("Driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("Driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTonIsNull() {
            addCriterion("Ton is null");
            return (Criteria) this;
        }

        public Criteria andTonIsNotNull() {
            addCriterion("Ton is not null");
            return (Criteria) this;
        }

        public Criteria andTonEqualTo(Integer value) {
            addCriterion("Ton =", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonNotEqualTo(Integer value) {
            addCriterion("Ton <>", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonGreaterThan(Integer value) {
            addCriterion("Ton >", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ton >=", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonLessThan(Integer value) {
            addCriterion("Ton <", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonLessThanOrEqualTo(Integer value) {
            addCriterion("Ton <=", value, "ton");
            return (Criteria) this;
        }

        public Criteria andTonIn(List<Integer> values) {
            addCriterion("Ton in", values, "ton");
            return (Criteria) this;
        }

        public Criteria andTonNotIn(List<Integer> values) {
            addCriterion("Ton not in", values, "ton");
            return (Criteria) this;
        }

        public Criteria andTonBetween(Integer value1, Integer value2) {
            addCriterion("Ton between", value1, value2, "ton");
            return (Criteria) this;
        }

        public Criteria andTonNotBetween(Integer value1, Integer value2) {
            addCriterion("Ton not between", value1, value2, "ton");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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
