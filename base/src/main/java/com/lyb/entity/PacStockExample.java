package com.lyb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacStockExample() {
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

        public Criteria andWarehousenoIsNull() {
            addCriterion("WarehouseNo is null");
            return (Criteria) this;
        }

        public Criteria andWarehousenoIsNotNull() {
            addCriterion("WarehouseNo is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousenoEqualTo(String value) {
            addCriterion("WarehouseNo =", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoNotEqualTo(String value) {
            addCriterion("WarehouseNo <>", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoGreaterThan(String value) {
            addCriterion("WarehouseNo >", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseNo >=", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoLessThan(String value) {
            addCriterion("WarehouseNo <", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoLessThanOrEqualTo(String value) {
            addCriterion("WarehouseNo <=", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoLike(String value) {
            addCriterion("WarehouseNo like", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoNotLike(String value) {
            addCriterion("WarehouseNo not like", value, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoIn(List<String> values) {
            addCriterion("WarehouseNo in", values, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoNotIn(List<String> values) {
            addCriterion("WarehouseNo not in", values, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoBetween(String value1, String value2) {
            addCriterion("WarehouseNo between", value1, value2, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andWarehousenoNotBetween(String value1, String value2) {
            addCriterion("WarehouseNo not between", value1, value2, "warehouseno");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeIsNull() {
            addCriterion("ReservoirType is null");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeIsNotNull() {
            addCriterion("ReservoirType is not null");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeEqualTo(Integer value) {
            addCriterion("ReservoirType =", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeNotEqualTo(Integer value) {
            addCriterion("ReservoirType <>", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeGreaterThan(Integer value) {
            addCriterion("ReservoirType >", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReservoirType >=", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeLessThan(Integer value) {
            addCriterion("ReservoirType <", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ReservoirType <=", value, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeIn(List<Integer> values) {
            addCriterion("ReservoirType in", values, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeNotIn(List<Integer> values) {
            addCriterion("ReservoirType not in", values, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeBetween(Integer value1, Integer value2) {
            addCriterion("ReservoirType between", value1, value2, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andReservoirtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ReservoirType not between", value1, value2, "reservoirtype");
            return (Criteria) this;
        }

        public Criteria andTransportIsNull() {
            addCriterion("Transport is null");
            return (Criteria) this;
        }

        public Criteria andTransportIsNotNull() {
            addCriterion("Transport is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEqualTo(String value) {
            addCriterion("Transport =", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotEqualTo(String value) {
            addCriterion("Transport <>", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThan(String value) {
            addCriterion("Transport >", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThanOrEqualTo(String value) {
            addCriterion("Transport >=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThan(String value) {
            addCriterion("Transport <", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThanOrEqualTo(String value) {
            addCriterion("Transport <=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLike(String value) {
            addCriterion("Transport like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotLike(String value) {
            addCriterion("Transport not like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportIn(List<String> values) {
            addCriterion("Transport in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotIn(List<String> values) {
            addCriterion("Transport not in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportBetween(String value1, String value2) {
            addCriterion("Transport between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotBetween(String value1, String value2) {
            addCriterion("Transport not between", value1, value2, "transport");
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

        public Criteria andSubordinateunitEqualTo(String value) {
            addCriterion("SubordinateUnit =", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotEqualTo(String value) {
            addCriterion("SubordinateUnit <>", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThan(String value) {
            addCriterion("SubordinateUnit >", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThanOrEqualTo(String value) {
            addCriterion("SubordinateUnit >=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThan(String value) {
            addCriterion("SubordinateUnit <", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThanOrEqualTo(String value) {
            addCriterion("SubordinateUnit <=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLike(String value) {
            addCriterion("SubordinateUnit like", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotLike(String value) {
            addCriterion("SubordinateUnit not like", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIn(List<String> values) {
            addCriterion("SubordinateUnit in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotIn(List<String> values) {
            addCriterion("SubordinateUnit not in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitBetween(String value1, String value2) {
            addCriterion("SubordinateUnit between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotBetween(String value1, String value2) {
            addCriterion("SubordinateUnit not between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andDrawernoIsNull() {
            addCriterion("DrawerNo is null");
            return (Criteria) this;
        }

        public Criteria andDrawernoIsNotNull() {
            addCriterion("DrawerNo is not null");
            return (Criteria) this;
        }

        public Criteria andDrawernoEqualTo(String value) {
            addCriterion("DrawerNo =", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoNotEqualTo(String value) {
            addCriterion("DrawerNo <>", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoGreaterThan(String value) {
            addCriterion("DrawerNo >", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoGreaterThanOrEqualTo(String value) {
            addCriterion("DrawerNo >=", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoLessThan(String value) {
            addCriterion("DrawerNo <", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoLessThanOrEqualTo(String value) {
            addCriterion("DrawerNo <=", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoLike(String value) {
            addCriterion("DrawerNo like", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoNotLike(String value) {
            addCriterion("DrawerNo not like", value, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoIn(List<String> values) {
            addCriterion("DrawerNo in", values, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoNotIn(List<String> values) {
            addCriterion("DrawerNo not in", values, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoBetween(String value1, String value2) {
            addCriterion("DrawerNo between", value1, value2, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernoNotBetween(String value1, String value2) {
            addCriterion("DrawerNo not between", value1, value2, "drawerno");
            return (Criteria) this;
        }

        public Criteria andDrawernameIsNull() {
            addCriterion("DrawerName is null");
            return (Criteria) this;
        }

        public Criteria andDrawernameIsNotNull() {
            addCriterion("DrawerName is not null");
            return (Criteria) this;
        }

        public Criteria andDrawernameEqualTo(String value) {
            addCriterion("DrawerName =", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotEqualTo(String value) {
            addCriterion("DrawerName <>", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameGreaterThan(String value) {
            addCriterion("DrawerName >", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameGreaterThanOrEqualTo(String value) {
            addCriterion("DrawerName >=", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLessThan(String value) {
            addCriterion("DrawerName <", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLessThanOrEqualTo(String value) {
            addCriterion("DrawerName <=", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLike(String value) {
            addCriterion("DrawerName like", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotLike(String value) {
            addCriterion("DrawerName not like", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameIn(List<String> values) {
            addCriterion("DrawerName in", values, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotIn(List<String> values) {
            addCriterion("DrawerName not in", values, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameBetween(String value1, String value2) {
            addCriterion("DrawerName between", value1, value2, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotBetween(String value1, String value2) {
            addCriterion("DrawerName not between", value1, value2, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawertimeIsNull() {
            addCriterion("DrawerTime is null");
            return (Criteria) this;
        }

        public Criteria andDrawertimeIsNotNull() {
            addCriterion("DrawerTime is not null");
            return (Criteria) this;
        }

        public Criteria andDrawertimeEqualTo(Date value) {
            addCriterion("DrawerTime =", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeNotEqualTo(Date value) {
            addCriterion("DrawerTime <>", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeGreaterThan(Date value) {
            addCriterion("DrawerTime >", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DrawerTime >=", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeLessThan(Date value) {
            addCriterion("DrawerTime <", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeLessThanOrEqualTo(Date value) {
            addCriterion("DrawerTime <=", value, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeIn(List<Date> values) {
            addCriterion("DrawerTime in", values, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeNotIn(List<Date> values) {
            addCriterion("DrawerTime not in", values, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeBetween(Date value1, Date value2) {
            addCriterion("DrawerTime between", value1, value2, "drawertime");
            return (Criteria) this;
        }

        public Criteria andDrawertimeNotBetween(Date value1, Date value2) {
            addCriterion("DrawerTime not between", value1, value2, "drawertime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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