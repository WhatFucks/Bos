package com.ljw.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IaeLineresourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IaeLineresourceExample() {
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

        public Criteria andResourcetypeIsNull() {
            addCriterion("ResourceType is null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIsNotNull() {
            addCriterion("ResourceType is not null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeEqualTo(String value) {
            addCriterion("ResourceType =", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotEqualTo(String value) {
            addCriterion("ResourceType <>", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThan(String value) {
            addCriterion("ResourceType >", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ResourceType >=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThan(String value) {
            addCriterion("ResourceType <", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThanOrEqualTo(String value) {
            addCriterion("ResourceType <=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLike(String value) {
            addCriterion("ResourceType like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotLike(String value) {
            addCriterion("ResourceType not like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIn(List<String> values) {
            addCriterion("ResourceType in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotIn(List<String> values) {
            addCriterion("ResourceType not in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeBetween(String value1, String value2) {
            addCriterion("ResourceType between", value1, value2, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotBetween(String value1, String value2) {
            addCriterion("ResourceType not between", value1, value2, "resourcetype");
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

        public Criteria andDemandEqualTo(Integer value) {
            addCriterion("Demand =", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotEqualTo(Integer value) {
            addCriterion("Demand <>", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThan(Integer value) {
            addCriterion("Demand >", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThanOrEqualTo(Integer value) {
            addCriterion("Demand >=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThan(Integer value) {
            addCriterion("Demand <", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThanOrEqualTo(Integer value) {
            addCriterion("Demand <=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandIn(List<Integer> values) {
            addCriterion("Demand in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotIn(List<Integer> values) {
            addCriterion("Demand not in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandBetween(Integer value1, Integer value2) {
            addCriterion("Demand between", value1, value2, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCapacityIsNull() {
            addCriterion("Capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("Capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(String value) {
            addCriterion("Capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(String value) {
            addCriterion("Capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(String value) {
            addCriterion("Capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("Capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(String value) {
            addCriterion("Capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(String value) {
            addCriterion("Capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLike(String value) {
            addCriterion("Capacity like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotLike(String value) {
            addCriterion("Capacity not like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<String> values) {
            addCriterion("Capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<String> values) {
            addCriterion("Capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(String value1, String value2) {
            addCriterion("Capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(String value1, String value2) {
            addCriterion("Capacity not between", value1, value2, "capacity");
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

        public Criteria andTicketIsNull() {
            addCriterion("Ticket is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("Ticket is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(Integer value) {
            addCriterion("Ticket =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(Integer value) {
            addCriterion("Ticket <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(Integer value) {
            addCriterion("Ticket >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ticket >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(Integer value) {
            addCriterion("Ticket <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(Integer value) {
            addCriterion("Ticket <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<Integer> values) {
            addCriterion("Ticket in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<Integer> values) {
            addCriterion("Ticket not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(Integer value1, Integer value2) {
            addCriterion("Ticket between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(Integer value1, Integer value2) {
            addCriterion("Ticket not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andCargoIsNull() {
            addCriterion("Cargo is null");
            return (Criteria) this;
        }

        public Criteria andCargoIsNotNull() {
            addCriterion("Cargo is not null");
            return (Criteria) this;
        }

        public Criteria andCargoEqualTo(Integer value) {
            addCriterion("Cargo =", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotEqualTo(Integer value) {
            addCriterion("Cargo <>", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoGreaterThan(Integer value) {
            addCriterion("Cargo >", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cargo >=", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoLessThan(Integer value) {
            addCriterion("Cargo <", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoLessThanOrEqualTo(Integer value) {
            addCriterion("Cargo <=", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoIn(List<Integer> values) {
            addCriterion("Cargo in", values, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotIn(List<Integer> values) {
            addCriterion("Cargo not in", values, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoBetween(Integer value1, Integer value2) {
            addCriterion("Cargo between", value1, value2, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotBetween(Integer value1, Integer value2) {
            addCriterion("Cargo not between", value1, value2, "cargo");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andHandlepersonIsNull() {
            addCriterion("HandlePerson is null");
            return (Criteria) this;
        }

        public Criteria andHandlepersonIsNotNull() {
            addCriterion("HandlePerson is not null");
            return (Criteria) this;
        }

        public Criteria andHandlepersonEqualTo(String value) {
            addCriterion("HandlePerson =", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonNotEqualTo(String value) {
            addCriterion("HandlePerson <>", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonGreaterThan(String value) {
            addCriterion("HandlePerson >", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonGreaterThanOrEqualTo(String value) {
            addCriterion("HandlePerson >=", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonLessThan(String value) {
            addCriterion("HandlePerson <", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonLessThanOrEqualTo(String value) {
            addCriterion("HandlePerson <=", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonLike(String value) {
            addCriterion("HandlePerson like", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonNotLike(String value) {
            addCriterion("HandlePerson not like", value, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonIn(List<String> values) {
            addCriterion("HandlePerson in", values, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonNotIn(List<String> values) {
            addCriterion("HandlePerson not in", values, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonBetween(String value1, String value2) {
            addCriterion("HandlePerson between", value1, value2, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandlepersonNotBetween(String value1, String value2) {
            addCriterion("HandlePerson not between", value1, value2, "handleperson");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNull() {
            addCriterion("HandleDate is null");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNotNull() {
            addCriterion("HandleDate is not null");
            return (Criteria) this;
        }

        public Criteria andHandledateEqualTo(Date value) {
            addCriterion("HandleDate =", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotEqualTo(Date value) {
            addCriterion("HandleDate <>", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThan(Date value) {
            addCriterion("HandleDate >", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThanOrEqualTo(Date value) {
            addCriterion("HandleDate >=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThan(Date value) {
            addCriterion("HandleDate <", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThanOrEqualTo(Date value) {
            addCriterion("HandleDate <=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateIn(List<Date> values) {
            addCriterion("HandleDate in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotIn(List<Date> values) {
            addCriterion("HandleDate not in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateBetween(Date value1, Date value2) {
            addCriterion("HandleDate between", value1, value2, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotBetween(Date value1, Date value2) {
            addCriterion("HandleDate not between", value1, value2, "handledate");
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

        public Criteria andEntercompanyIsNull() {
            addCriterion("EnterCompany is null");
            return (Criteria) this;
        }

        public Criteria andEntercompanyIsNotNull() {
            addCriterion("EnterCompany is not null");
            return (Criteria) this;
        }

        public Criteria andEntercompanyEqualTo(String value) {
            addCriterion("EnterCompany =", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyNotEqualTo(String value) {
            addCriterion("EnterCompany <>", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyGreaterThan(String value) {
            addCriterion("EnterCompany >", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyGreaterThanOrEqualTo(String value) {
            addCriterion("EnterCompany >=", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyLessThan(String value) {
            addCriterion("EnterCompany <", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyLessThanOrEqualTo(String value) {
            addCriterion("EnterCompany <=", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyLike(String value) {
            addCriterion("EnterCompany like", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyNotLike(String value) {
            addCriterion("EnterCompany not like", value, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyIn(List<String> values) {
            addCriterion("EnterCompany in", values, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyNotIn(List<String> values) {
            addCriterion("EnterCompany not in", values, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyBetween(String value1, String value2) {
            addCriterion("EnterCompany between", value1, value2, "entercompany");
            return (Criteria) this;
        }

        public Criteria andEntercompanyNotBetween(String value1, String value2) {
            addCriterion("EnterCompany not between", value1, value2, "entercompany");
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

        public Criteria andAbnormalremarksIsNull() {
            addCriterion("AbnormalRemarks is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksIsNotNull() {
            addCriterion("AbnormalRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksEqualTo(String value) {
            addCriterion("AbnormalRemarks =", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksNotEqualTo(String value) {
            addCriterion("AbnormalRemarks <>", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksGreaterThan(String value) {
            addCriterion("AbnormalRemarks >", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksGreaterThanOrEqualTo(String value) {
            addCriterion("AbnormalRemarks >=", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksLessThan(String value) {
            addCriterion("AbnormalRemarks <", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksLessThanOrEqualTo(String value) {
            addCriterion("AbnormalRemarks <=", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksLike(String value) {
            addCriterion("AbnormalRemarks like", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksNotLike(String value) {
            addCriterion("AbnormalRemarks not like", value, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksIn(List<String> values) {
            addCriterion("AbnormalRemarks in", values, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksNotIn(List<String> values) {
            addCriterion("AbnormalRemarks not in", values, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksBetween(String value1, String value2) {
            addCriterion("AbnormalRemarks between", value1, value2, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andAbnormalremarksNotBetween(String value1, String value2) {
            addCriterion("AbnormalRemarks not between", value1, value2, "abnormalremarks");
            return (Criteria) this;
        }

        public Criteria andWorkintIsNull() {
            addCriterion("WorkInt is null");
            return (Criteria) this;
        }

        public Criteria andWorkintIsNotNull() {
            addCriterion("WorkInt is not null");
            return (Criteria) this;
        }

        public Criteria andWorkintEqualTo(String value) {
            addCriterion("WorkInt =", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintNotEqualTo(String value) {
            addCriterion("WorkInt <>", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintGreaterThan(String value) {
            addCriterion("WorkInt >", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintGreaterThanOrEqualTo(String value) {
            addCriterion("WorkInt >=", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintLessThan(String value) {
            addCriterion("WorkInt <", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintLessThanOrEqualTo(String value) {
            addCriterion("WorkInt <=", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintLike(String value) {
            addCriterion("WorkInt like", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintNotLike(String value) {
            addCriterion("WorkInt not like", value, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintIn(List<String> values) {
            addCriterion("WorkInt in", values, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintNotIn(List<String> values) {
            addCriterion("WorkInt not in", values, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintBetween(String value1, String value2) {
            addCriterion("WorkInt between", value1, value2, "workint");
            return (Criteria) this;
        }

        public Criteria andWorkintNotBetween(String value1, String value2) {
            addCriterion("WorkInt not between", value1, value2, "workint");
            return (Criteria) this;
        }

        public Criteria andTransferIsNull() {
            addCriterion("Transfer is null");
            return (Criteria) this;
        }

        public Criteria andTransferIsNotNull() {
            addCriterion("Transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEqualTo(Integer value) {
            addCriterion("Transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotEqualTo(Integer value) {
            addCriterion("Transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThan(Integer value) {
            addCriterion("Transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("Transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThan(Integer value) {
            addCriterion("Transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThanOrEqualTo(Integer value) {
            addCriterion("Transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferIn(List<Integer> values) {
            addCriterion("Transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotIn(List<Integer> values) {
            addCriterion("Transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferBetween(Integer value1, Integer value2) {
            addCriterion("Transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotBetween(Integer value1, Integer value2) {
            addCriterion("Transfer not between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andActualcountIsNull() {
            addCriterion("ActualCount is null");
            return (Criteria) this;
        }

        public Criteria andActualcountIsNotNull() {
            addCriterion("ActualCount is not null");
            return (Criteria) this;
        }

        public Criteria andActualcountEqualTo(Integer value) {
            addCriterion("ActualCount =", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotEqualTo(Integer value) {
            addCriterion("ActualCount <>", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountGreaterThan(Integer value) {
            addCriterion("ActualCount >", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActualCount >=", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountLessThan(Integer value) {
            addCriterion("ActualCount <", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountLessThanOrEqualTo(Integer value) {
            addCriterion("ActualCount <=", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountIn(List<Integer> values) {
            addCriterion("ActualCount in", values, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotIn(List<Integer> values) {
            addCriterion("ActualCount not in", values, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountBetween(Integer value1, Integer value2) {
            addCriterion("ActualCount between", value1, value2, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ActualCount not between", value1, value2, "actualcount");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("Destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("Destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("Destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("Destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("Destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("Destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("Destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("Destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("Destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("Destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("Destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("Destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("Destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("Destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andWarenameIsNull() {
            addCriterion("WareName is null");
            return (Criteria) this;
        }

        public Criteria andWarenameIsNotNull() {
            addCriterion("WareName is not null");
            return (Criteria) this;
        }

        public Criteria andWarenameEqualTo(String value) {
            addCriterion("WareName =", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotEqualTo(String value) {
            addCriterion("WareName <>", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameGreaterThan(String value) {
            addCriterion("WareName >", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameGreaterThanOrEqualTo(String value) {
            addCriterion("WareName >=", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameLessThan(String value) {
            addCriterion("WareName <", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameLessThanOrEqualTo(String value) {
            addCriterion("WareName <=", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameLike(String value) {
            addCriterion("WareName like", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotLike(String value) {
            addCriterion("WareName not like", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameIn(List<String> values) {
            addCriterion("WareName in", values, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotIn(List<String> values) {
            addCriterion("WareName not in", values, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameBetween(String value1, String value2) {
            addCriterion("WareName between", value1, value2, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotBetween(String value1, String value2) {
            addCriterion("WareName not between", value1, value2, "warename");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIsNull() {
            addCriterion("ActualVolume is null");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIsNotNull() {
            addCriterion("ActualVolume is not null");
            return (Criteria) this;
        }

        public Criteria andActualvolumeEqualTo(BigDecimal value) {
            addCriterion("ActualVolume =", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotEqualTo(BigDecimal value) {
            addCriterion("ActualVolume <>", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeGreaterThan(BigDecimal value) {
            addCriterion("ActualVolume >", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ActualVolume >=", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeLessThan(BigDecimal value) {
            addCriterion("ActualVolume <", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ActualVolume <=", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIn(List<BigDecimal> values) {
            addCriterion("ActualVolume in", values, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotIn(List<BigDecimal> values) {
            addCriterion("ActualVolume not in", values, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActualVolume between", value1, value2, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActualVolume not between", value1, value2, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNull() {
            addCriterion("TimeLimit is null");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNotNull() {
            addCriterion("TimeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelimitEqualTo(Date value) {
            addCriterion("TimeLimit =", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotEqualTo(Date value) {
            addCriterion("TimeLimit <>", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThan(Date value) {
            addCriterion("TimeLimit >", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThanOrEqualTo(Date value) {
            addCriterion("TimeLimit >=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThan(Date value) {
            addCriterion("TimeLimit <", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThanOrEqualTo(Date value) {
            addCriterion("TimeLimit <=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitIn(List<Date> values) {
            addCriterion("TimeLimit in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotIn(List<Date> values) {
            addCriterion("TimeLimit not in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitBetween(Date value1, Date value2) {
            addCriterion("TimeLimit between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotBetween(Date value1, Date value2) {
            addCriterion("TimeLimit not between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andAskIsNull() {
            addCriterion("Ask is null");
            return (Criteria) this;
        }

        public Criteria andAskIsNotNull() {
            addCriterion("Ask is not null");
            return (Criteria) this;
        }

        public Criteria andAskEqualTo(String value) {
            addCriterion("Ask =", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotEqualTo(String value) {
            addCriterion("Ask <>", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThan(String value) {
            addCriterion("Ask >", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThanOrEqualTo(String value) {
            addCriterion("Ask >=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThan(String value) {
            addCriterion("Ask <", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThanOrEqualTo(String value) {
            addCriterion("Ask <=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLike(String value) {
            addCriterion("Ask like", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotLike(String value) {
            addCriterion("Ask not like", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskIn(List<String> values) {
            addCriterion("Ask in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotIn(List<String> values) {
            addCriterion("Ask not in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskBetween(String value1, String value2) {
            addCriterion("Ask between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotBetween(String value1, String value2) {
            addCriterion("Ask not between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonIsNull() {
            addCriterion("TakeCargoPerson is null");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonIsNotNull() {
            addCriterion("TakeCargoPerson is not null");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonEqualTo(String value) {
            addCriterion("TakeCargoPerson =", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotEqualTo(String value) {
            addCriterion("TakeCargoPerson <>", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonGreaterThan(String value) {
            addCriterion("TakeCargoPerson >", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonGreaterThanOrEqualTo(String value) {
            addCriterion("TakeCargoPerson >=", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLessThan(String value) {
            addCriterion("TakeCargoPerson <", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLessThanOrEqualTo(String value) {
            addCriterion("TakeCargoPerson <=", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLike(String value) {
            addCriterion("TakeCargoPerson like", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotLike(String value) {
            addCriterion("TakeCargoPerson not like", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonIn(List<String> values) {
            addCriterion("TakeCargoPerson in", values, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotIn(List<String> values) {
            addCriterion("TakeCargoPerson not in", values, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonBetween(String value1, String value2) {
            addCriterion("TakeCargoPerson between", value1, value2, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotBetween(String value1, String value2) {
            addCriterion("TakeCargoPerson not between", value1, value2, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIsNull() {
            addCriterion("TackCargoAddress is null");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIsNotNull() {
            addCriterion("TackCargoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressEqualTo(String value) {
            addCriterion("TackCargoAddress =", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotEqualTo(String value) {
            addCriterion("TackCargoAddress <>", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressGreaterThan(String value) {
            addCriterion("TackCargoAddress >", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TackCargoAddress >=", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLessThan(String value) {
            addCriterion("TackCargoAddress <", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLessThanOrEqualTo(String value) {
            addCriterion("TackCargoAddress <=", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLike(String value) {
            addCriterion("TackCargoAddress like", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotLike(String value) {
            addCriterion("TackCargoAddress not like", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIn(List<String> values) {
            addCriterion("TackCargoAddress in", values, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotIn(List<String> values) {
            addCriterion("TackCargoAddress not in", values, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressBetween(String value1, String value2) {
            addCriterion("TackCargoAddress between", value1, value2, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotBetween(String value1, String value2) {
            addCriterion("TackCargoAddress not between", value1, value2, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("Payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("Payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("Payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("Payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("Payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("Payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("Payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("Payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("Payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("Payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("Payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andSpecialensureIsNull() {
            addCriterion("SpecialEnsure is null");
            return (Criteria) this;
        }

        public Criteria andSpecialensureIsNotNull() {
            addCriterion("SpecialEnsure is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialensureEqualTo(String value) {
            addCriterion("SpecialEnsure =", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureNotEqualTo(String value) {
            addCriterion("SpecialEnsure <>", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureGreaterThan(String value) {
            addCriterion("SpecialEnsure >", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureGreaterThanOrEqualTo(String value) {
            addCriterion("SpecialEnsure >=", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureLessThan(String value) {
            addCriterion("SpecialEnsure <", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureLessThanOrEqualTo(String value) {
            addCriterion("SpecialEnsure <=", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureLike(String value) {
            addCriterion("SpecialEnsure like", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureNotLike(String value) {
            addCriterion("SpecialEnsure not like", value, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureIn(List<String> values) {
            addCriterion("SpecialEnsure in", values, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureNotIn(List<String> values) {
            addCriterion("SpecialEnsure not in", values, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureBetween(String value1, String value2) {
            addCriterion("SpecialEnsure between", value1, value2, "specialensure");
            return (Criteria) this;
        }

        public Criteria andSpecialensureNotBetween(String value1, String value2) {
            addCriterion("SpecialEnsure not between", value1, value2, "specialensure");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIsNull() {
            addCriterion("DeliveryType is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIsNotNull() {
            addCriterion("DeliveryType is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeEqualTo(Integer value) {
            addCriterion("DeliveryType =", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotEqualTo(Integer value) {
            addCriterion("DeliveryType <>", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeGreaterThan(Integer value) {
            addCriterion("DeliveryType >", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeliveryType >=", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeLessThan(Integer value) {
            addCriterion("DeliveryType <", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeLessThanOrEqualTo(Integer value) {
            addCriterion("DeliveryType <=", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIn(List<Integer> values) {
            addCriterion("DeliveryType in", values, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotIn(List<Integer> values) {
            addCriterion("DeliveryType not in", values, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryType between", value1, value2, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryType not between", value1, value2, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andImportanthintsIsNull() {
            addCriterion("ImportantHints is null");
            return (Criteria) this;
        }

        public Criteria andImportanthintsIsNotNull() {
            addCriterion("ImportantHints is not null");
            return (Criteria) this;
        }

        public Criteria andImportanthintsEqualTo(String value) {
            addCriterion("ImportantHints =", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsNotEqualTo(String value) {
            addCriterion("ImportantHints <>", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsGreaterThan(String value) {
            addCriterion("ImportantHints >", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsGreaterThanOrEqualTo(String value) {
            addCriterion("ImportantHints >=", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsLessThan(String value) {
            addCriterion("ImportantHints <", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsLessThanOrEqualTo(String value) {
            addCriterion("ImportantHints <=", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsLike(String value) {
            addCriterion("ImportantHints like", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsNotLike(String value) {
            addCriterion("ImportantHints not like", value, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsIn(List<String> values) {
            addCriterion("ImportantHints in", values, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsNotIn(List<String> values) {
            addCriterion("ImportantHints not in", values, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsBetween(String value1, String value2) {
            addCriterion("ImportantHints between", value1, value2, "importanthints");
            return (Criteria) this;
        }

        public Criteria andImportanthintsNotBetween(String value1, String value2) {
            addCriterion("ImportantHints not between", value1, value2, "importanthints");
            return (Criteria) this;
        }

        public Criteria andSurplustimeIsNull() {
            addCriterion("SurplusTime is null");
            return (Criteria) this;
        }

        public Criteria andSurplustimeIsNotNull() {
            addCriterion("SurplusTime is not null");
            return (Criteria) this;
        }

        public Criteria andSurplustimeEqualTo(Date value) {
            addCriterion("SurplusTime =", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotEqualTo(Date value) {
            addCriterion("SurplusTime <>", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeGreaterThan(Date value) {
            addCriterion("SurplusTime >", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SurplusTime >=", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeLessThan(Date value) {
            addCriterion("SurplusTime <", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeLessThanOrEqualTo(Date value) {
            addCriterion("SurplusTime <=", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeIn(List<Date> values) {
            addCriterion("SurplusTime in", values, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotIn(List<Date> values) {
            addCriterion("SurplusTime not in", values, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeBetween(Date value1, Date value2) {
            addCriterion("SurplusTime between", value1, value2, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotBetween(Date value1, Date value2) {
            addCriterion("SurplusTime not between", value1, value2, "surplustime");
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
