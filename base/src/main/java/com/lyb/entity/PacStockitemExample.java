package com.lyb.entity;

import java.util.ArrayList;
import java.util.List;

public class PacStockitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacStockitemExample() {
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

        public Criteria andGoodscodeIsNull() {
            addCriterion("GoodsCode is null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIsNotNull() {
            addCriterion("GoodsCode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeEqualTo(String value) {
            addCriterion("GoodsCode =", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotEqualTo(String value) {
            addCriterion("GoodsCode <>", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThan(String value) {
            addCriterion("GoodsCode >", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsCode >=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThan(String value) {
            addCriterion("GoodsCode <", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThanOrEqualTo(String value) {
            addCriterion("GoodsCode <=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLike(String value) {
            addCriterion("GoodsCode like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotLike(String value) {
            addCriterion("GoodsCode not like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIn(List<String> values) {
            addCriterion("GoodsCode in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotIn(List<String> values) {
            addCriterion("GoodsCode not in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeBetween(String value1, String value2) {
            addCriterion("GoodsCode between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotBetween(String value1, String value2) {
            addCriterion("GoodsCode not between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNull() {
            addCriterion("StorageNum is null");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNotNull() {
            addCriterion("StorageNum is not null");
            return (Criteria) this;
        }

        public Criteria andStoragenumEqualTo(Integer value) {
            addCriterion("StorageNum =", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotEqualTo(Integer value) {
            addCriterion("StorageNum <>", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThan(Integer value) {
            addCriterion("StorageNum >", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("StorageNum >=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThan(Integer value) {
            addCriterion("StorageNum <", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThanOrEqualTo(Integer value) {
            addCriterion("StorageNum <=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumIn(List<Integer> values) {
            addCriterion("StorageNum in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotIn(List<Integer> values) {
            addCriterion("StorageNum not in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumBetween(Integer value1, Integer value2) {
            addCriterion("StorageNum between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotBetween(Integer value1, Integer value2) {
            addCriterion("StorageNum not between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andActualnumIsNull() {
            addCriterion("ActualNum is null");
            return (Criteria) this;
        }

        public Criteria andActualnumIsNotNull() {
            addCriterion("ActualNum is not null");
            return (Criteria) this;
        }

        public Criteria andActualnumEqualTo(Integer value) {
            addCriterion("ActualNum =", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumNotEqualTo(Integer value) {
            addCriterion("ActualNum <>", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumGreaterThan(Integer value) {
            addCriterion("ActualNum >", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActualNum >=", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumLessThan(Integer value) {
            addCriterion("ActualNum <", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumLessThanOrEqualTo(Integer value) {
            addCriterion("ActualNum <=", value, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumIn(List<Integer> values) {
            addCriterion("ActualNum in", values, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumNotIn(List<Integer> values) {
            addCriterion("ActualNum not in", values, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumBetween(Integer value1, Integer value2) {
            addCriterion("ActualNum between", value1, value2, "actualnum");
            return (Criteria) this;
        }

        public Criteria andActualnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ActualNum not between", value1, value2, "actualnum");
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