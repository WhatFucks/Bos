package com.lm.entity.acc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisDispatchHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisDispatchHistoryExample() {
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

        public Criteria andDispatchsequenceIsNull() {
            addCriterion("DispatchSequence is null");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceIsNotNull() {
            addCriterion("DispatchSequence is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceEqualTo(Integer value) {
            addCriterion("DispatchSequence =", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceNotEqualTo(Integer value) {
            addCriterion("DispatchSequence <>", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceGreaterThan(Integer value) {
            addCriterion("DispatchSequence >", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("DispatchSequence >=", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceLessThan(Integer value) {
            addCriterion("DispatchSequence <", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceLessThanOrEqualTo(Integer value) {
            addCriterion("DispatchSequence <=", value, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceIn(List<Integer> values) {
            addCriterion("DispatchSequence in", values, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceNotIn(List<Integer> values) {
            addCriterion("DispatchSequence not in", values, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceBetween(Integer value1, Integer value2) {
            addCriterion("DispatchSequence between", value1, value2, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andDispatchsequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("DispatchSequence not between", value1, value2, "dispatchsequence");
            return (Criteria) this;
        }

        public Criteria andTransferredunitIsNull() {
            addCriterion("TransferredUnit is null");
            return (Criteria) this;
        }

        public Criteria andTransferredunitIsNotNull() {
            addCriterion("TransferredUnit is not null");
            return (Criteria) this;
        }

        public Criteria andTransferredunitEqualTo(Integer value) {
            addCriterion("TransferredUnit =", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitNotEqualTo(Integer value) {
            addCriterion("TransferredUnit <>", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitGreaterThan(Integer value) {
            addCriterion("TransferredUnit >", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("TransferredUnit >=", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitLessThan(Integer value) {
            addCriterion("TransferredUnit <", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitLessThanOrEqualTo(Integer value) {
            addCriterion("TransferredUnit <=", value, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitIn(List<Integer> values) {
            addCriterion("TransferredUnit in", values, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitNotIn(List<Integer> values) {
            addCriterion("TransferredUnit not in", values, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitBetween(Integer value1, Integer value2) {
            addCriterion("TransferredUnit between", value1, value2, "transferredunit");
            return (Criteria) this;
        }

        public Criteria andTransferredunitNotBetween(Integer value1, Integer value2) {
            addCriterion("TransferredUnit not between", value1, value2, "transferredunit");
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

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
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