package com.ljw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IaeTimeinputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IaeTimeinputExample() {
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

        public Criteria andInputtypeIsNull() {
            addCriterion("InputType is null");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNotNull() {
            addCriterion("InputType is not null");
            return (Criteria) this;
        }

        public Criteria andInputtypeEqualTo(String value) {
            addCriterion("InputType =", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotEqualTo(String value) {
            addCriterion("InputType <>", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThan(String value) {
            addCriterion("InputType >", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThanOrEqualTo(String value) {
            addCriterion("InputType >=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThan(String value) {
            addCriterion("InputType <", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThanOrEqualTo(String value) {
            addCriterion("InputType <=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLike(String value) {
            addCriterion("InputType like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotLike(String value) {
            addCriterion("InputType not like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeIn(List<String> values) {
            addCriterion("InputType in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotIn(List<String> values) {
            addCriterion("InputType not in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeBetween(String value1, String value2) {
            addCriterion("InputType between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotBetween(String value1, String value2) {
            addCriterion("InputType not between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("Port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("Port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("Port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("Port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("Port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("Port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("Port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("Port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("Port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("Port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("Port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("Port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("Port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("Port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andDemandIsNull() {
            addCriterion("Demand is null");
            return (Criteria) this;
        }

        public Criteria andDemandIsNotNull() {
            addCriterion("Demand is not null");
            return (Criteria) this;
        }

        public Criteria andDemandEqualTo(Boolean value) {
            addCriterion("Demand =", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotEqualTo(Boolean value) {
            addCriterion("Demand <>", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThan(Boolean value) {
            addCriterion("Demand >", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Demand >=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThan(Boolean value) {
            addCriterion("Demand <", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThanOrEqualTo(Boolean value) {
            addCriterion("Demand <=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandIn(List<Boolean> values) {
            addCriterion("Demand in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotIn(List<Boolean> values) {
            addCriterion("Demand not in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandBetween(Boolean value1, Boolean value2) {
            addCriterion("Demand between", value1, value2, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Demand not between", value1, value2, "demand");
            return (Criteria) this;
        }

        public Criteria andVehicleintIsNull() {
            addCriterion("VehicleInt is null");
            return (Criteria) this;
        }

        public Criteria andVehicleintIsNotNull() {
            addCriterion("VehicleInt is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleintEqualTo(String value) {
            addCriterion("VehicleInt =", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintNotEqualTo(String value) {
            addCriterion("VehicleInt <>", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintGreaterThan(String value) {
            addCriterion("VehicleInt >", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintGreaterThanOrEqualTo(String value) {
            addCriterion("VehicleInt >=", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintLessThan(String value) {
            addCriterion("VehicleInt <", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintLessThanOrEqualTo(String value) {
            addCriterion("VehicleInt <=", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintLike(String value) {
            addCriterion("VehicleInt like", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintNotLike(String value) {
            addCriterion("VehicleInt not like", value, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintIn(List<String> values) {
            addCriterion("VehicleInt in", values, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintNotIn(List<String> values) {
            addCriterion("VehicleInt not in", values, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintBetween(String value1, String value2) {
            addCriterion("VehicleInt between", value1, value2, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andVehicleintNotBetween(String value1, String value2) {
            addCriterion("VehicleInt not between", value1, value2, "vehicleint");
            return (Criteria) this;
        }

        public Criteria andWaybillidIsNull() {
            addCriterion("WaybillID is null");
            return (Criteria) this;
        }

        public Criteria andWaybillidIsNotNull() {
            addCriterion("WaybillID is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillidEqualTo(String value) {
            addCriterion("WaybillID =", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotEqualTo(String value) {
            addCriterion("WaybillID <>", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidGreaterThan(String value) {
            addCriterion("WaybillID >", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidGreaterThanOrEqualTo(String value) {
            addCriterion("WaybillID >=", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLessThan(String value) {
            addCriterion("WaybillID <", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLessThanOrEqualTo(String value) {
            addCriterion("WaybillID <=", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidLike(String value) {
            addCriterion("WaybillID like", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotLike(String value) {
            addCriterion("WaybillID not like", value, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidIn(List<String> values) {
            addCriterion("WaybillID in", values, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotIn(List<String> values) {
            addCriterion("WaybillID not in", values, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidBetween(String value1, String value2) {
            addCriterion("WaybillID between", value1, value2, "waybillid");
            return (Criteria) this;
        }

        public Criteria andWaybillidNotBetween(String value1, String value2) {
            addCriterion("WaybillID not between", value1, value2, "waybillid");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIsNull() {
            addCriterion("ExpectArrivalDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIsNotNull() {
            addCriterion("ExpectArrivalDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateEqualTo(Date value) {
            addCriterion("ExpectArrivalDate =", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotEqualTo(Date value) {
            addCriterion("ExpectArrivalDate <>", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateGreaterThan(Date value) {
            addCriterion("ExpectArrivalDate >", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpectArrivalDate >=", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateLessThan(Date value) {
            addCriterion("ExpectArrivalDate <", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateLessThanOrEqualTo(Date value) {
            addCriterion("ExpectArrivalDate <=", value, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateIn(List<Date> values) {
            addCriterion("ExpectArrivalDate in", values, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotIn(List<Date> values) {
            addCriterion("ExpectArrivalDate not in", values, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateBetween(Date value1, Date value2) {
            addCriterion("ExpectArrivalDate between", value1, value2, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectarrivaldateNotBetween(Date value1, Date value2) {
            addCriterion("ExpectArrivalDate not between", value1, value2, "expectarrivaldate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIsNull() {
            addCriterion("ExpectDepartureDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIsNotNull() {
            addCriterion("ExpectDepartureDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateEqualTo(Date value) {
            addCriterion("ExpectDepartureDate =", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotEqualTo(Date value) {
            addCriterion("ExpectDepartureDate <>", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateGreaterThan(Date value) {
            addCriterion("ExpectDepartureDate >", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpectDepartureDate >=", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateLessThan(Date value) {
            addCriterion("ExpectDepartureDate <", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateLessThanOrEqualTo(Date value) {
            addCriterion("ExpectDepartureDate <=", value, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateIn(List<Date> values) {
            addCriterion("ExpectDepartureDate in", values, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotIn(List<Date> values) {
            addCriterion("ExpectDepartureDate not in", values, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateBetween(Date value1, Date value2) {
            addCriterion("ExpectDepartureDate between", value1, value2, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andExpectdeparturedateNotBetween(Date value1, Date value2) {
            addCriterion("ExpectDepartureDate not between", value1, value2, "expectdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIsNull() {
            addCriterion("ActualArrivalDate is null");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIsNotNull() {
            addCriterion("ActualArrivalDate is not null");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateEqualTo(Date value) {
            addCriterion("ActualArrivalDate =", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotEqualTo(Date value) {
            addCriterion("ActualArrivalDate <>", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateGreaterThan(Date value) {
            addCriterion("ActualArrivalDate >", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("ActualArrivalDate >=", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateLessThan(Date value) {
            addCriterion("ActualArrivalDate <", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateLessThanOrEqualTo(Date value) {
            addCriterion("ActualArrivalDate <=", value, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateIn(List<Date> values) {
            addCriterion("ActualArrivalDate in", values, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotIn(List<Date> values) {
            addCriterion("ActualArrivalDate not in", values, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateBetween(Date value1, Date value2) {
            addCriterion("ActualArrivalDate between", value1, value2, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualarrivaldateNotBetween(Date value1, Date value2) {
            addCriterion("ActualArrivalDate not between", value1, value2, "actualarrivaldate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIsNull() {
            addCriterion("ActualDepartureDate is null");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIsNotNull() {
            addCriterion("ActualDepartureDate is not null");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateEqualTo(Date value) {
            addCriterion("ActualDepartureDate =", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotEqualTo(Date value) {
            addCriterion("ActualDepartureDate <>", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateGreaterThan(Date value) {
            addCriterion("ActualDepartureDate >", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ActualDepartureDate >=", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateLessThan(Date value) {
            addCriterion("ActualDepartureDate <", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateLessThanOrEqualTo(Date value) {
            addCriterion("ActualDepartureDate <=", value, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateIn(List<Date> values) {
            addCriterion("ActualDepartureDate in", values, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotIn(List<Date> values) {
            addCriterion("ActualDepartureDate not in", values, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateBetween(Date value1, Date value2) {
            addCriterion("ActualDepartureDate between", value1, value2, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andActualdeparturedateNotBetween(Date value1, Date value2) {
            addCriterion("ActualDepartureDate not between", value1, value2, "actualdeparturedate");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("Start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("Start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("Start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("Start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("Start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("Start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("Start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("Start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("Start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("Start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("Start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("Start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("Start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("Start not between", value1, value2, "start");
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

        public Criteria andInputpersonIsNull() {
            addCriterion("InputPerson is null");
            return (Criteria) this;
        }

        public Criteria andInputpersonIsNotNull() {
            addCriterion("InputPerson is not null");
            return (Criteria) this;
        }

        public Criteria andInputpersonEqualTo(Integer value) {
            addCriterion("InputPerson =", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotEqualTo(Integer value) {
            addCriterion("InputPerson <>", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonGreaterThan(Integer value) {
            addCriterion("InputPerson >", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("InputPerson >=", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonLessThan(Integer value) {
            addCriterion("InputPerson <", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonLessThanOrEqualTo(Integer value) {
            addCriterion("InputPerson <=", value, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonIn(List<Integer> values) {
            addCriterion("InputPerson in", values, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotIn(List<Integer> values) {
            addCriterion("InputPerson not in", values, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonBetween(Integer value1, Integer value2) {
            addCriterion("InputPerson between", value1, value2, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("InputPerson not between", value1, value2, "inputperson");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("InputDate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("InputDate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("InputDate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("InputDate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("InputDate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("InputDate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("InputDate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("InputDate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("InputDate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("InputDate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("InputDate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("InputDate not between", value1, value2, "inputdate");
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