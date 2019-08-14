package com.lyb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccWorksheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccWorksheetExample() {
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

        public Criteria andWorksheetnoIsNull() {
            addCriterion("WorkSheetNo is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoIsNotNull() {
            addCriterion("WorkSheetNo is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoEqualTo(String value) {
            addCriterion("WorkSheetNo =", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotEqualTo(String value) {
            addCriterion("WorkSheetNo <>", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoGreaterThan(String value) {
            addCriterion("WorkSheetNo >", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoGreaterThanOrEqualTo(String value) {
            addCriterion("WorkSheetNo >=", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLessThan(String value) {
            addCriterion("WorkSheetNo <", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLessThanOrEqualTo(String value) {
            addCriterion("WorkSheetNo <=", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoLike(String value) {
            addCriterion("WorkSheetNo like", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotLike(String value) {
            addCriterion("WorkSheetNo not like", value, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoIn(List<String> values) {
            addCriterion("WorkSheetNo in", values, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotIn(List<String> values) {
            addCriterion("WorkSheetNo not in", values, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoBetween(String value1, String value2) {
            addCriterion("WorkSheetNo between", value1, value2, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andWorksheetnoNotBetween(String value1, String value2) {
            addCriterion("WorkSheetNo not between", value1, value2, "worksheetno");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNull() {
            addCriterion("JobNo is null");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNotNull() {
            addCriterion("JobNo is not null");
            return (Criteria) this;
        }

        public Criteria andJobnoEqualTo(String value) {
            addCriterion("JobNo =", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotEqualTo(String value) {
            addCriterion("JobNo <>", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThan(String value) {
            addCriterion("JobNo >", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("JobNo >=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThan(String value) {
            addCriterion("JobNo <", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThanOrEqualTo(String value) {
            addCriterion("JobNo <=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLike(String value) {
            addCriterion("JobNo like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotLike(String value) {
            addCriterion("JobNo not like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoIn(List<String> values) {
            addCriterion("JobNo in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotIn(List<String> values) {
            addCriterion("JobNo not in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoBetween(String value1, String value2) {
            addCriterion("JobNo between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotBetween(String value1, String value2) {
            addCriterion("JobNo not between", value1, value2, "jobno");
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

        public Criteria andProducttimeIsNull() {
            addCriterion("ProductTime is null");
            return (Criteria) this;
        }

        public Criteria andProducttimeIsNotNull() {
            addCriterion("ProductTime is not null");
            return (Criteria) this;
        }

        public Criteria andProducttimeEqualTo(String value) {
            addCriterion("ProductTime =", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotEqualTo(String value) {
            addCriterion("ProductTime <>", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThan(String value) {
            addCriterion("ProductTime >", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductTime >=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThan(String value) {
            addCriterion("ProductTime <", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThanOrEqualTo(String value) {
            addCriterion("ProductTime <=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLike(String value) {
            addCriterion("ProductTime like", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotLike(String value) {
            addCriterion("ProductTime not like", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeIn(List<String> values) {
            addCriterion("ProductTime in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotIn(List<String> values) {
            addCriterion("ProductTime not in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeBetween(String value1, String value2) {
            addCriterion("ProductTime between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotBetween(String value1, String value2) {
            addCriterion("ProductTime not between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("Total not between", value1, value2, "total");
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

        public Criteria andStowagerequirementsIsNull() {
            addCriterion("StowageRequirements is null");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsIsNotNull() {
            addCriterion("StowageRequirements is not null");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsEqualTo(String value) {
            addCriterion("StowageRequirements =", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsNotEqualTo(String value) {
            addCriterion("StowageRequirements <>", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsGreaterThan(String value) {
            addCriterion("StowageRequirements >", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("StowageRequirements >=", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsLessThan(String value) {
            addCriterion("StowageRequirements <", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsLessThanOrEqualTo(String value) {
            addCriterion("StowageRequirements <=", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsLike(String value) {
            addCriterion("StowageRequirements like", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsNotLike(String value) {
            addCriterion("StowageRequirements not like", value, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsIn(List<String> values) {
            addCriterion("StowageRequirements in", values, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsNotIn(List<String> values) {
            addCriterion("StowageRequirements not in", values, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsBetween(String value1, String value2) {
            addCriterion("StowageRequirements between", value1, value2, "stowagerequirements");
            return (Criteria) this;
        }

        public Criteria andStowagerequirementsNotBetween(String value1, String value2) {
            addCriterion("StowageRequirements not between", value1, value2, "stowagerequirements");
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