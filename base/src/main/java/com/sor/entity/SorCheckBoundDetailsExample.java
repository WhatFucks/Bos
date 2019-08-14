package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorCheckBoundDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorCheckBoundDetailsExample() {
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

        public Criteria andPackageidIsNull() {
            addCriterion("PackageID is null");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNotNull() {
            addCriterion("PackageID is not null");
            return (Criteria) this;
        }

        public Criteria andPackageidEqualTo(String value) {
            addCriterion("PackageID =", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotEqualTo(String value) {
            addCriterion("PackageID <>", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThan(String value) {
            addCriterion("PackageID >", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThanOrEqualTo(String value) {
            addCriterion("PackageID >=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThan(String value) {
            addCriterion("PackageID <", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThanOrEqualTo(String value) {
            addCriterion("PackageID <=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLike(String value) {
            addCriterion("PackageID like", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotLike(String value) {
            addCriterion("PackageID not like", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidIn(List<String> values) {
            addCriterion("PackageID in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotIn(List<String> values) {
            addCriterion("PackageID not in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidBetween(String value1, String value2) {
            addCriterion("PackageID between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotBetween(String value1, String value2) {
            addCriterion("PackageID not between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andCargocountIsNull() {
            addCriterion("CargoCount is null");
            return (Criteria) this;
        }

        public Criteria andCargocountIsNotNull() {
            addCriterion("CargoCount is not null");
            return (Criteria) this;
        }

        public Criteria andCargocountEqualTo(Integer value) {
            addCriterion("CargoCount =", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotEqualTo(Integer value) {
            addCriterion("CargoCount <>", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountGreaterThan(Integer value) {
            addCriterion("CargoCount >", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoCount >=", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountLessThan(Integer value) {
            addCriterion("CargoCount <", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountLessThanOrEqualTo(Integer value) {
            addCriterion("CargoCount <=", value, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountIn(List<Integer> values) {
            addCriterion("CargoCount in", values, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotIn(List<Integer> values) {
            addCriterion("CargoCount not in", values, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountBetween(Integer value1, Integer value2) {
            addCriterion("CargoCount between", value1, value2, "cargocount");
            return (Criteria) this;
        }

        public Criteria andCargocountNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoCount not between", value1, value2, "cargocount");
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

        public Criteria andWeightEqualTo(Long value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Long value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Long value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Long value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Long value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Long value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Long> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Long> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Long value1, Long value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Long value1, Long value2) {
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

        public Criteria andVolumeEqualTo(Long value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Long value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Long value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Long value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Long value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Long> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Long> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Long value1, Long value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Long value1, Long value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andCargotypeIsNull() {
            addCriterion("CargoType is null");
            return (Criteria) this;
        }

        public Criteria andCargotypeIsNotNull() {
            addCriterion("CargoType is not null");
            return (Criteria) this;
        }

        public Criteria andCargotypeEqualTo(Boolean value) {
            addCriterion("CargoType =", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotEqualTo(Boolean value) {
            addCriterion("CargoType <>", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeGreaterThan(Boolean value) {
            addCriterion("CargoType >", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CargoType >=", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeLessThan(Boolean value) {
            addCriterion("CargoType <", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeLessThanOrEqualTo(Boolean value) {
            addCriterion("CargoType <=", value, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeIn(List<Boolean> values) {
            addCriterion("CargoType in", values, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotIn(List<Boolean> values) {
            addCriterion("CargoType not in", values, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeBetween(Boolean value1, Boolean value2) {
            addCriterion("CargoType between", value1, value2, "cargotype");
            return (Criteria) this;
        }

        public Criteria andCargotypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CargoType not between", value1, value2, "cargotype");
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

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("Direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("Direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("Direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("Direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("Direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("Direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("Direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("Direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("Direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("Direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("Direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("Direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIsNull() {
            addCriterion("StoragePerson is null");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIsNotNull() {
            addCriterion("StoragePerson is not null");
            return (Criteria) this;
        }

        public Criteria andStoragepersonEqualTo(Integer value) {
            addCriterion("StoragePerson =", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotEqualTo(Integer value) {
            addCriterion("StoragePerson <>", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonGreaterThan(Integer value) {
            addCriterion("StoragePerson >", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("StoragePerson >=", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonLessThan(Integer value) {
            addCriterion("StoragePerson <", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonLessThanOrEqualTo(Integer value) {
            addCriterion("StoragePerson <=", value, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonIn(List<Integer> values) {
            addCriterion("StoragePerson in", values, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotIn(List<Integer> values) {
            addCriterion("StoragePerson not in", values, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonBetween(Integer value1, Integer value2) {
            addCriterion("StoragePerson between", value1, value2, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragepersonNotBetween(Integer value1, Integer value2) {
            addCriterion("StoragePerson not between", value1, value2, "storageperson");
            return (Criteria) this;
        }

        public Criteria andStoragedateIsNull() {
            addCriterion("StorageDate is null");
            return (Criteria) this;
        }

        public Criteria andStoragedateIsNotNull() {
            addCriterion("StorageDate is not null");
            return (Criteria) this;
        }

        public Criteria andStoragedateEqualTo(Date value) {
            addCriterion("StorageDate =", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotEqualTo(Date value) {
            addCriterion("StorageDate <>", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThan(Date value) {
            addCriterion("StorageDate >", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThanOrEqualTo(Date value) {
            addCriterion("StorageDate >=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThan(Date value) {
            addCriterion("StorageDate <", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThanOrEqualTo(Date value) {
            addCriterion("StorageDate <=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateIn(List<Date> values) {
            addCriterion("StorageDate in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotIn(List<Date> values) {
            addCriterion("StorageDate not in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateBetween(Date value1, Date value2) {
            addCriterion("StorageDate between", value1, value2, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotBetween(Date value1, Date value2) {
            addCriterion("StorageDate not between", value1, value2, "storagedate");
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