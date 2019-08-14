package com.ljw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IaeExtractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IaeExtractExample() {
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

        public Criteria andTransportwayIsNull() {
            addCriterion("TransportWay is null");
            return (Criteria) this;
        }

        public Criteria andTransportwayIsNotNull() {
            addCriterion("TransportWay is not null");
            return (Criteria) this;
        }

        public Criteria andTransportwayEqualTo(String value) {
            addCriterion("TransportWay =", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayNotEqualTo(String value) {
            addCriterion("TransportWay <>", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayGreaterThan(String value) {
            addCriterion("TransportWay >", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayGreaterThanOrEqualTo(String value) {
            addCriterion("TransportWay >=", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayLessThan(String value) {
            addCriterion("TransportWay <", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayLessThanOrEqualTo(String value) {
            addCriterion("TransportWay <=", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayLike(String value) {
            addCriterion("TransportWay like", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayNotLike(String value) {
            addCriterion("TransportWay not like", value, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayIn(List<String> values) {
            addCriterion("TransportWay in", values, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayNotIn(List<String> values) {
            addCriterion("TransportWay not in", values, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayBetween(String value1, String value2) {
            addCriterion("TransportWay between", value1, value2, "transportway");
            return (Criteria) this;
        }

        public Criteria andTransportwayNotBetween(String value1, String value2) {
            addCriterion("TransportWay not between", value1, value2, "transportway");
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

        public Criteria andEstimatedateIsNull() {
            addCriterion("EstimateDate is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedateIsNotNull() {
            addCriterion("EstimateDate is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedateEqualTo(Date value) {
            addCriterion("EstimateDate =", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateNotEqualTo(Date value) {
            addCriterion("EstimateDate <>", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateGreaterThan(Date value) {
            addCriterion("EstimateDate >", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("EstimateDate >=", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateLessThan(Date value) {
            addCriterion("EstimateDate <", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateLessThanOrEqualTo(Date value) {
            addCriterion("EstimateDate <=", value, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateIn(List<Date> values) {
            addCriterion("EstimateDate in", values, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateNotIn(List<Date> values) {
            addCriterion("EstimateDate not in", values, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateBetween(Date value1, Date value2) {
            addCriterion("EstimateDate between", value1, value2, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andEstimatedateNotBetween(Date value1, Date value2) {
            addCriterion("EstimateDate not between", value1, value2, "estimatedate");
            return (Criteria) this;
        }

        public Criteria andCargonIsNull() {
            addCriterion("CargoN is null");
            return (Criteria) this;
        }

        public Criteria andCargonIsNotNull() {
            addCriterion("CargoN is not null");
            return (Criteria) this;
        }

        public Criteria andCargonEqualTo(Integer value) {
            addCriterion("CargoN =", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonNotEqualTo(Integer value) {
            addCriterion("CargoN <>", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonGreaterThan(Integer value) {
            addCriterion("CargoN >", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoN >=", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonLessThan(Integer value) {
            addCriterion("CargoN <", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonLessThanOrEqualTo(Integer value) {
            addCriterion("CargoN <=", value, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonIn(List<Integer> values) {
            addCriterion("CargoN in", values, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonNotIn(List<Integer> values) {
            addCriterion("CargoN not in", values, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonBetween(Integer value1, Integer value2) {
            addCriterion("CargoN between", value1, value2, "cargon");
            return (Criteria) this;
        }

        public Criteria andCargonNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoN not between", value1, value2, "cargon");
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