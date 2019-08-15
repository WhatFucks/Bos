package com.hsq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogTrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogTrackExample() {
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

        public Criteria andLinetypeEqualTo(String value) {
            addCriterion("LineType =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(String value) {
            addCriterion("LineType <>", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThan(String value) {
            addCriterion("LineType >", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LineType >=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThan(String value) {
            addCriterion("LineType <", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThanOrEqualTo(String value) {
            addCriterion("LineType <=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLike(String value) {
            addCriterion("LineType like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotLike(String value) {
            addCriterion("LineType not like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<String> values) {
            addCriterion("LineType in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<String> values) {
            addCriterion("LineType not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeBetween(String value1, String value2) {
            addCriterion("LineType between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotBetween(String value1, String value2) {
            addCriterion("LineType not between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNull() {
            addCriterion("LineName is null");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNotNull() {
            addCriterion("LineName is not null");
            return (Criteria) this;
        }

        public Criteria andLinenameEqualTo(String value) {
            addCriterion("LineName =", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotEqualTo(String value) {
            addCriterion("LineName <>", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThan(String value) {
            addCriterion("LineName >", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThanOrEqualTo(String value) {
            addCriterion("LineName >=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThan(String value) {
            addCriterion("LineName <", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThanOrEqualTo(String value) {
            addCriterion("LineName <=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLike(String value) {
            addCriterion("LineName like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotLike(String value) {
            addCriterion("LineName not like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameIn(List<String> values) {
            addCriterion("LineName in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotIn(List<String> values) {
            addCriterion("LineName not in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameBetween(String value1, String value2) {
            addCriterion("LineName between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotBetween(String value1, String value2) {
            addCriterion("LineName not between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLogisticscarIsNull() {
            addCriterion("LogisticsCar is null");
            return (Criteria) this;
        }

        public Criteria andLogisticscarIsNotNull() {
            addCriterion("LogisticsCar is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticscarEqualTo(String value) {
            addCriterion("LogisticsCar =", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarNotEqualTo(String value) {
            addCriterion("LogisticsCar <>", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarGreaterThan(String value) {
            addCriterion("LogisticsCar >", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarGreaterThanOrEqualTo(String value) {
            addCriterion("LogisticsCar >=", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarLessThan(String value) {
            addCriterion("LogisticsCar <", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarLessThanOrEqualTo(String value) {
            addCriterion("LogisticsCar <=", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarLike(String value) {
            addCriterion("LogisticsCar like", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarNotLike(String value) {
            addCriterion("LogisticsCar not like", value, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarIn(List<String> values) {
            addCriterion("LogisticsCar in", values, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarNotIn(List<String> values) {
            addCriterion("LogisticsCar not in", values, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarBetween(String value1, String value2) {
            addCriterion("LogisticsCar between", value1, value2, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLogisticscarNotBetween(String value1, String value2) {
            addCriterion("LogisticsCar not between", value1, value2, "logisticscar");
            return (Criteria) this;
        }

        public Criteria andLinestateIsNull() {
            addCriterion("LineState is null");
            return (Criteria) this;
        }

        public Criteria andLinestateIsNotNull() {
            addCriterion("LineState is not null");
            return (Criteria) this;
        }

        public Criteria andLinestateEqualTo(Boolean value) {
            addCriterion("LineState =", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotEqualTo(Boolean value) {
            addCriterion("LineState <>", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateGreaterThan(Boolean value) {
            addCriterion("LineState >", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("LineState >=", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateLessThan(Boolean value) {
            addCriterion("LineState <", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateLessThanOrEqualTo(Boolean value) {
            addCriterion("LineState <=", value, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateIn(List<Boolean> values) {
            addCriterion("LineState in", values, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotIn(List<Boolean> values) {
            addCriterion("LineState not in", values, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateBetween(Boolean value1, Boolean value2) {
            addCriterion("LineState between", value1, value2, "linestate");
            return (Criteria) this;
        }

        public Criteria andLinestateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("LineState not between", value1, value2, "linestate");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNull() {
            addCriterion("NodeName is null");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNotNull() {
            addCriterion("NodeName is not null");
            return (Criteria) this;
        }

        public Criteria andNodenameEqualTo(String value) {
            addCriterion("NodeName =", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotEqualTo(String value) {
            addCriterion("NodeName <>", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThan(String value) {
            addCriterion("NodeName >", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("NodeName >=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThan(String value) {
            addCriterion("NodeName <", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThanOrEqualTo(String value) {
            addCriterion("NodeName <=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLike(String value) {
            addCriterion("NodeName like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotLike(String value) {
            addCriterion("NodeName not like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameIn(List<String> values) {
            addCriterion("NodeName in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotIn(List<String> values) {
            addCriterion("NodeName not in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameBetween(String value1, String value2) {
            addCriterion("NodeName between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotBetween(String value1, String value2) {
            addCriterion("NodeName not between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNull() {
            addCriterion("ArrivalTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNotNull() {
            addCriterion("ArrivalTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeEqualTo(Date value) {
            addCriterion("ArrivalTime =", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotEqualTo(Date value) {
            addCriterion("ArrivalTime <>", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThan(Date value) {
            addCriterion("ArrivalTime >", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ArrivalTime >=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThan(Date value) {
            addCriterion("ArrivalTime <", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
            addCriterion("ArrivalTime <=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIn(List<Date> values) {
            addCriterion("ArrivalTime in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotIn(List<Date> values) {
            addCriterion("ArrivalTime not in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeBetween(Date value1, Date value2) {
            addCriterion("ArrivalTime between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
            addCriterion("ArrivalTime not between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andCarintIsNull() {
            addCriterion("CarInt is null");
            return (Criteria) this;
        }

        public Criteria andCarintIsNotNull() {
            addCriterion("CarInt is not null");
            return (Criteria) this;
        }

        public Criteria andCarintEqualTo(String value) {
            addCriterion("CarInt =", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotEqualTo(String value) {
            addCriterion("CarInt <>", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintGreaterThan(String value) {
            addCriterion("CarInt >", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintGreaterThanOrEqualTo(String value) {
            addCriterion("CarInt >=", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLessThan(String value) {
            addCriterion("CarInt <", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLessThanOrEqualTo(String value) {
            addCriterion("CarInt <=", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintLike(String value) {
            addCriterion("CarInt like", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotLike(String value) {
            addCriterion("CarInt not like", value, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintIn(List<String> values) {
            addCriterion("CarInt in", values, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotIn(List<String> values) {
            addCriterion("CarInt not in", values, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintBetween(String value1, String value2) {
            addCriterion("CarInt between", value1, value2, "carint");
            return (Criteria) this;
        }

        public Criteria andCarintNotBetween(String value1, String value2) {
            addCriterion("CarInt not between", value1, value2, "carint");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadIsNull() {
            addCriterion("NextNodeLoad is null");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadIsNotNull() {
            addCriterion("NextNodeLoad is not null");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadEqualTo(String value) {
            addCriterion("NextNodeLoad =", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadNotEqualTo(String value) {
            addCriterion("NextNodeLoad <>", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadGreaterThan(String value) {
            addCriterion("NextNodeLoad >", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadGreaterThanOrEqualTo(String value) {
            addCriterion("NextNodeLoad >=", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadLessThan(String value) {
            addCriterion("NextNodeLoad <", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadLessThanOrEqualTo(String value) {
            addCriterion("NextNodeLoad <=", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadLike(String value) {
            addCriterion("NextNodeLoad like", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadNotLike(String value) {
            addCriterion("NextNodeLoad not like", value, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadIn(List<String> values) {
            addCriterion("NextNodeLoad in", values, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadNotIn(List<String> values) {
            addCriterion("NextNodeLoad not in", values, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadBetween(String value1, String value2) {
            addCriterion("NextNodeLoad between", value1, value2, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andNextnodeloadNotBetween(String value1, String value2) {
            addCriterion("NextNodeLoad not between", value1, value2, "nextnodeload");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("Describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("Describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("Describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("Describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("Describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("Describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("Describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("Describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("Describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("Describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("Describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("Describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("Describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("Describe not between", value1, value2, "describe");
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