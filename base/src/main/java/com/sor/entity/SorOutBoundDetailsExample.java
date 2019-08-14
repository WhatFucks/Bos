package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorOutBoundDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorOutBoundDetailsExample() {
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

        public Criteria andScandateIsNull() {
            addCriterion("ScanDate is null");
            return (Criteria) this;
        }

        public Criteria andScandateIsNotNull() {
            addCriterion("ScanDate is not null");
            return (Criteria) this;
        }

        public Criteria andScandateEqualTo(Date value) {
            addCriterion("ScanDate =", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotEqualTo(Date value) {
            addCriterion("ScanDate <>", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateGreaterThan(Date value) {
            addCriterion("ScanDate >", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateGreaterThanOrEqualTo(Date value) {
            addCriterion("ScanDate >=", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateLessThan(Date value) {
            addCriterion("ScanDate <", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateLessThanOrEqualTo(Date value) {
            addCriterion("ScanDate <=", value, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateIn(List<Date> values) {
            addCriterion("ScanDate in", values, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotIn(List<Date> values) {
            addCriterion("ScanDate not in", values, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateBetween(Date value1, Date value2) {
            addCriterion("ScanDate between", value1, value2, "scandate");
            return (Criteria) this;
        }

        public Criteria andScandateNotBetween(Date value1, Date value2) {
            addCriterion("ScanDate not between", value1, value2, "scandate");
            return (Criteria) this;
        }

        public Criteria andIsscanIsNull() {
            addCriterion("IsScan is null");
            return (Criteria) this;
        }

        public Criteria andIsscanIsNotNull() {
            addCriterion("IsScan is not null");
            return (Criteria) this;
        }

        public Criteria andIsscanEqualTo(Boolean value) {
            addCriterion("IsScan =", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanNotEqualTo(Boolean value) {
            addCriterion("IsScan <>", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanGreaterThan(Boolean value) {
            addCriterion("IsScan >", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsScan >=", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanLessThan(Boolean value) {
            addCriterion("IsScan <", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanLessThanOrEqualTo(Boolean value) {
            addCriterion("IsScan <=", value, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanIn(List<Boolean> values) {
            addCriterion("IsScan in", values, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanNotIn(List<Boolean> values) {
            addCriterion("IsScan not in", values, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanBetween(Boolean value1, Boolean value2) {
            addCriterion("IsScan between", value1, value2, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsscanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsScan not between", value1, value2, "isscan");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageIsNull() {
            addCriterion("IsNextStorage is null");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageIsNotNull() {
            addCriterion("IsNextStorage is not null");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageEqualTo(Boolean value) {
            addCriterion("IsNextStorage =", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageNotEqualTo(Boolean value) {
            addCriterion("IsNextStorage <>", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageGreaterThan(Boolean value) {
            addCriterion("IsNextStorage >", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsNextStorage >=", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageLessThan(Boolean value) {
            addCriterion("IsNextStorage <", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageLessThanOrEqualTo(Boolean value) {
            addCriterion("IsNextStorage <=", value, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageIn(List<Boolean> values) {
            addCriterion("IsNextStorage in", values, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageNotIn(List<Boolean> values) {
            addCriterion("IsNextStorage not in", values, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNextStorage between", value1, value2, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsnextstorageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNextStorage not between", value1, value2, "isnextstorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageIsNull() {
            addCriterion("IsDoubleStorage is null");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageIsNotNull() {
            addCriterion("IsDoubleStorage is not null");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageEqualTo(Boolean value) {
            addCriterion("IsDoubleStorage =", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageNotEqualTo(Boolean value) {
            addCriterion("IsDoubleStorage <>", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageGreaterThan(Boolean value) {
            addCriterion("IsDoubleStorage >", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDoubleStorage >=", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageLessThan(Boolean value) {
            addCriterion("IsDoubleStorage <", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDoubleStorage <=", value, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageIn(List<Boolean> values) {
            addCriterion("IsDoubleStorage in", values, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageNotIn(List<Boolean> values) {
            addCriterion("IsDoubleStorage not in", values, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDoubleStorage between", value1, value2, "isdoublestorage");
            return (Criteria) this;
        }

        public Criteria andIsdoublestorageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDoubleStorage not between", value1, value2, "isdoublestorage");
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