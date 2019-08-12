package com.lyb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RetReturnlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RetReturnlistExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andApplicationnoIsNull() {
            addCriterion("ApplicationNo is null");
            return (Criteria) this;
        }

        public Criteria andApplicationnoIsNotNull() {
            addCriterion("ApplicationNo is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationnoEqualTo(String value) {
            addCriterion("ApplicationNo =", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotEqualTo(String value) {
            addCriterion("ApplicationNo <>", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoGreaterThan(String value) {
            addCriterion("ApplicationNo >", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicationNo >=", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoLessThan(String value) {
            addCriterion("ApplicationNo <", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoLessThanOrEqualTo(String value) {
            addCriterion("ApplicationNo <=", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoLike(String value) {
            addCriterion("ApplicationNo like", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotLike(String value) {
            addCriterion("ApplicationNo not like", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoIn(List<String> values) {
            addCriterion("ApplicationNo in", values, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotIn(List<String> values) {
            addCriterion("ApplicationNo not in", values, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoBetween(String value1, String value2) {
            addCriterion("ApplicationNo between", value1, value2, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotBetween(String value1, String value2) {
            addCriterion("ApplicationNo not between", value1, value2, "applicationno");
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

        public Criteria andReturntypeIsNull() {
            addCriterion("ReturnType is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("ReturnType is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(Integer value) {
            addCriterion("ReturnType =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(Integer value) {
            addCriterion("ReturnType <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(Integer value) {
            addCriterion("ReturnType >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnType >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(Integer value) {
            addCriterion("ReturnType <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnType <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<Integer> values) {
            addCriterion("ReturnType in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<Integer> values) {
            addCriterion("ReturnType not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(Integer value1, Integer value2) {
            addCriterion("ReturnType between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnType not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andApremarkIsNull() {
            addCriterion("ApRemark is null");
            return (Criteria) this;
        }

        public Criteria andApremarkIsNotNull() {
            addCriterion("ApRemark is not null");
            return (Criteria) this;
        }

        public Criteria andApremarkEqualTo(String value) {
            addCriterion("ApRemark =", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkNotEqualTo(String value) {
            addCriterion("ApRemark <>", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkGreaterThan(String value) {
            addCriterion("ApRemark >", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkGreaterThanOrEqualTo(String value) {
            addCriterion("ApRemark >=", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkLessThan(String value) {
            addCriterion("ApRemark <", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkLessThanOrEqualTo(String value) {
            addCriterion("ApRemark <=", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkLike(String value) {
            addCriterion("ApRemark like", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkNotLike(String value) {
            addCriterion("ApRemark not like", value, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkIn(List<String> values) {
            addCriterion("ApRemark in", values, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkNotIn(List<String> values) {
            addCriterion("ApRemark not in", values, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkBetween(String value1, String value2) {
            addCriterion("ApRemark between", value1, value2, "apremark");
            return (Criteria) this;
        }

        public Criteria andApremarkNotBetween(String value1, String value2) {
            addCriterion("ApRemark not between", value1, value2, "apremark");
            return (Criteria) this;
        }

        public Criteria andAplossIsNull() {
            addCriterion("ApLoss is null");
            return (Criteria) this;
        }

        public Criteria andAplossIsNotNull() {
            addCriterion("ApLoss is not null");
            return (Criteria) this;
        }

        public Criteria andAplossEqualTo(Integer value) {
            addCriterion("ApLoss =", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossNotEqualTo(Integer value) {
            addCriterion("ApLoss <>", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossGreaterThan(Integer value) {
            addCriterion("ApLoss >", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApLoss >=", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossLessThan(Integer value) {
            addCriterion("ApLoss <", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossLessThanOrEqualTo(Integer value) {
            addCriterion("ApLoss <=", value, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossIn(List<Integer> values) {
            addCriterion("ApLoss in", values, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossNotIn(List<Integer> values) {
            addCriterion("ApLoss not in", values, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossBetween(Integer value1, Integer value2) {
            addCriterion("ApLoss between", value1, value2, "aploss");
            return (Criteria) this;
        }

        public Criteria andAplossNotBetween(Integer value1, Integer value2) {
            addCriterion("ApLoss not between", value1, value2, "aploss");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNull() {
            addCriterion("EntryTime is null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNotNull() {
            addCriterion("EntryTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeEqualTo(Date value) {
            addCriterion("EntryTime =", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotEqualTo(Date value) {
            addCriterion("EntryTime <>", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThan(Date value) {
            addCriterion("EntryTime >", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EntryTime >=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThan(Date value) {
            addCriterion("EntryTime <", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("EntryTime <=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIn(List<Date> values) {
            addCriterion("EntryTime in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotIn(List<Date> values) {
            addCriterion("EntryTime not in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeBetween(Date value1, Date value2) {
            addCriterion("EntryTime between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("EntryTime not between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andReceivegunitIsNull() {
            addCriterion("ReceivegUnit is null");
            return (Criteria) this;
        }

        public Criteria andReceivegunitIsNotNull() {
            addCriterion("ReceivegUnit is not null");
            return (Criteria) this;
        }

        public Criteria andReceivegunitEqualTo(Integer value) {
            addCriterion("ReceivegUnit =", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitNotEqualTo(Integer value) {
            addCriterion("ReceivegUnit <>", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitGreaterThan(Integer value) {
            addCriterion("ReceivegUnit >", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivegUnit >=", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitLessThan(Integer value) {
            addCriterion("ReceivegUnit <", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivegUnit <=", value, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitIn(List<Integer> values) {
            addCriterion("ReceivegUnit in", values, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitNotIn(List<Integer> values) {
            addCriterion("ReceivegUnit not in", values, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitBetween(Integer value1, Integer value2) {
            addCriterion("ReceivegUnit between", value1, value2, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andReceivegunitNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivegUnit not between", value1, value2, "receivegunit");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignIsNull() {
            addCriterion("InvalidateSign is null");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignIsNotNull() {
            addCriterion("InvalidateSign is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignEqualTo(Integer value) {
            addCriterion("InvalidateSign =", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignNotEqualTo(Integer value) {
            addCriterion("InvalidateSign <>", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignGreaterThan(Integer value) {
            addCriterion("InvalidateSign >", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("InvalidateSign >=", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignLessThan(Integer value) {
            addCriterion("InvalidateSign <", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignLessThanOrEqualTo(Integer value) {
            addCriterion("InvalidateSign <=", value, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignIn(List<Integer> values) {
            addCriterion("InvalidateSign in", values, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignNotIn(List<Integer> values) {
            addCriterion("InvalidateSign not in", values, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateSign between", value1, value2, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andInvalidatesignNotBetween(Integer value1, Integer value2) {
            addCriterion("InvalidateSign not between", value1, value2, "invalidatesign");
            return (Criteria) this;
        }

        public Criteria andReturnunitIsNull() {
            addCriterion("ReturnUnit is null");
            return (Criteria) this;
        }

        public Criteria andReturnunitIsNotNull() {
            addCriterion("ReturnUnit is not null");
            return (Criteria) this;
        }

        public Criteria andReturnunitEqualTo(Integer value) {
            addCriterion("ReturnUnit =", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitNotEqualTo(Integer value) {
            addCriterion("ReturnUnit <>", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitGreaterThan(Integer value) {
            addCriterion("ReturnUnit >", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnUnit >=", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitLessThan(Integer value) {
            addCriterion("ReturnUnit <", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnUnit <=", value, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitIn(List<Integer> values) {
            addCriterion("ReturnUnit in", values, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitNotIn(List<Integer> values) {
            addCriterion("ReturnUnit not in", values, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitBetween(Integer value1, Integer value2) {
            addCriterion("ReturnUnit between", value1, value2, "returnunit");
            return (Criteria) this;
        }

        public Criteria andReturnunitNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnUnit not between", value1, value2, "returnunit");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeIsNull() {
            addCriterion("RecordingTime is null");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeIsNotNull() {
            addCriterion("RecordingTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("RecordingTime =", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RecordingTime <>", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RecordingTime >", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RecordingTime >=", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeLessThan(Date value) {
            addCriterionForJDBCDate("RecordingTime <", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RecordingTime <=", value, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("RecordingTime in", values, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RecordingTime not in", values, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RecordingTime between", value1, value2, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andRecordingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RecordingTime not between", value1, value2, "recordingtime");
            return (Criteria) this;
        }

        public Criteria andEntryunitIsNull() {
            addCriterion("EntryUnit is null");
            return (Criteria) this;
        }

        public Criteria andEntryunitIsNotNull() {
            addCriterion("EntryUnit is not null");
            return (Criteria) this;
        }

        public Criteria andEntryunitEqualTo(Integer value) {
            addCriterion("EntryUnit =", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitNotEqualTo(Integer value) {
            addCriterion("EntryUnit <>", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitGreaterThan(Integer value) {
            addCriterion("EntryUnit >", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("EntryUnit >=", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitLessThan(Integer value) {
            addCriterion("EntryUnit <", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitLessThanOrEqualTo(Integer value) {
            addCriterion("EntryUnit <=", value, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitIn(List<Integer> values) {
            addCriterion("EntryUnit in", values, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitNotIn(List<Integer> values) {
            addCriterion("EntryUnit not in", values, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitBetween(Integer value1, Integer value2) {
            addCriterion("EntryUnit between", value1, value2, "entryunit");
            return (Criteria) this;
        }

        public Criteria andEntryunitNotBetween(Integer value1, Integer value2) {
            addCriterion("EntryUnit not between", value1, value2, "entryunit");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNull() {
            addCriterion("PersonName is null");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNotNull() {
            addCriterion("PersonName is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnameEqualTo(String value) {
            addCriterion("PersonName =", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotEqualTo(String value) {
            addCriterion("PersonName <>", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThan(String value) {
            addCriterion("PersonName >", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("PersonName >=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThan(String value) {
            addCriterion("PersonName <", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThanOrEqualTo(String value) {
            addCriterion("PersonName <=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLike(String value) {
            addCriterion("PersonName like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotLike(String value) {
            addCriterion("PersonName not like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameIn(List<String> values) {
            addCriterion("PersonName in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotIn(List<String> values) {
            addCriterion("PersonName not in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameBetween(String value1, String value2) {
            addCriterion("PersonName between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotBetween(String value1, String value2) {
            addCriterion("PersonName not between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeIsNull() {
            addCriterion("ConfirmationTime is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeIsNotNull() {
            addCriterion("ConfirmationTime is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeEqualTo(Date value) {
            addCriterion("ConfirmationTime =", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeNotEqualTo(Date value) {
            addCriterion("ConfirmationTime <>", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeGreaterThan(Date value) {
            addCriterion("ConfirmationTime >", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ConfirmationTime >=", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeLessThan(Date value) {
            addCriterion("ConfirmationTime <", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeLessThanOrEqualTo(Date value) {
            addCriterion("ConfirmationTime <=", value, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeIn(List<Date> values) {
            addCriterion("ConfirmationTime in", values, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeNotIn(List<Date> values) {
            addCriterion("ConfirmationTime not in", values, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeBetween(Date value1, Date value2) {
            addCriterion("ConfirmationTime between", value1, value2, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationtimeNotBetween(Date value1, Date value2) {
            addCriterion("ConfirmationTime not between", value1, value2, "confirmationtime");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitIsNull() {
            addCriterion("ConfirmationUnit is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitIsNotNull() {
            addCriterion("ConfirmationUnit is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitEqualTo(Integer value) {
            addCriterion("ConfirmationUnit =", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitNotEqualTo(Integer value) {
            addCriterion("ConfirmationUnit <>", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitGreaterThan(Integer value) {
            addCriterion("ConfirmationUnit >", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConfirmationUnit >=", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitLessThan(Integer value) {
            addCriterion("ConfirmationUnit <", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitLessThanOrEqualTo(Integer value) {
            addCriterion("ConfirmationUnit <=", value, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitIn(List<Integer> values) {
            addCriterion("ConfirmationUnit in", values, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitNotIn(List<Integer> values) {
            addCriterion("ConfirmationUnit not in", values, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitBetween(Integer value1, Integer value2) {
            addCriterion("ConfirmationUnit between", value1, value2, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationunitNotBetween(Integer value1, Integer value2) {
            addCriterion("ConfirmationUnit not between", value1, value2, "confirmationunit");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameIsNull() {
            addCriterion("ConfirmationPersonName is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameIsNotNull() {
            addCriterion("ConfirmationPersonName is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameEqualTo(String value) {
            addCriterion("ConfirmationPersonName =", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameNotEqualTo(String value) {
            addCriterion("ConfirmationPersonName <>", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameGreaterThan(String value) {
            addCriterion("ConfirmationPersonName >", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("ConfirmationPersonName >=", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameLessThan(String value) {
            addCriterion("ConfirmationPersonName <", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameLessThanOrEqualTo(String value) {
            addCriterion("ConfirmationPersonName <=", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameLike(String value) {
            addCriterion("ConfirmationPersonName like", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameNotLike(String value) {
            addCriterion("ConfirmationPersonName not like", value, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameIn(List<String> values) {
            addCriterion("ConfirmationPersonName in", values, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameNotIn(List<String> values) {
            addCriterion("ConfirmationPersonName not in", values, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameBetween(String value1, String value2) {
            addCriterion("ConfirmationPersonName between", value1, value2, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andConfirmationpersonnameNotBetween(String value1, String value2) {
            addCriterion("ConfirmationPersonName not between", value1, value2, "confirmationpersonname");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateIsNull() {
            addCriterion("TreatmentState is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateIsNotNull() {
            addCriterion("TreatmentState is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateEqualTo(Integer value) {
            addCriterion("TreatmentState =", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateNotEqualTo(Integer value) {
            addCriterion("TreatmentState <>", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateGreaterThan(Integer value) {
            addCriterion("TreatmentState >", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("TreatmentState >=", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateLessThan(Integer value) {
            addCriterion("TreatmentState <", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateLessThanOrEqualTo(Integer value) {
            addCriterion("TreatmentState <=", value, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateIn(List<Integer> values) {
            addCriterion("TreatmentState in", values, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateNotIn(List<Integer> values) {
            addCriterion("TreatmentState not in", values, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateBetween(Integer value1, Integer value2) {
            addCriterion("TreatmentState between", value1, value2, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andTreatmentstateNotBetween(Integer value1, Integer value2) {
            addCriterion("TreatmentState not between", value1, value2, "treatmentstate");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusIsNull() {
            addCriterion("ApReturnStatus is null");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusIsNotNull() {
            addCriterion("ApReturnStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusEqualTo(Integer value) {
            addCriterion("ApReturnStatus =", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusNotEqualTo(Integer value) {
            addCriterion("ApReturnStatus <>", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusGreaterThan(Integer value) {
            addCriterion("ApReturnStatus >", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApReturnStatus >=", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusLessThan(Integer value) {
            addCriterion("ApReturnStatus <", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ApReturnStatus <=", value, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusIn(List<Integer> values) {
            addCriterion("ApReturnStatus in", values, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusNotIn(List<Integer> values) {
            addCriterion("ApReturnStatus not in", values, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusBetween(Integer value1, Integer value2) {
            addCriterion("ApReturnStatus between", value1, value2, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andApreturnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ApReturnStatus not between", value1, value2, "apreturnstatus");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignIsNull() {
            addCriterion("IdentificationSign is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignIsNotNull() {
            addCriterion("IdentificationSign is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignEqualTo(Integer value) {
            addCriterion("IdentificationSign =", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignNotEqualTo(Integer value) {
            addCriterion("IdentificationSign <>", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignGreaterThan(Integer value) {
            addCriterion("IdentificationSign >", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdentificationSign >=", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignLessThan(Integer value) {
            addCriterion("IdentificationSign <", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignLessThanOrEqualTo(Integer value) {
            addCriterion("IdentificationSign <=", value, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignIn(List<Integer> values) {
            addCriterion("IdentificationSign in", values, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignNotIn(List<Integer> values) {
            addCriterion("IdentificationSign not in", values, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignBetween(Integer value1, Integer value2) {
            addCriterion("IdentificationSign between", value1, value2, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andIdentificationsignNotBetween(Integer value1, Integer value2) {
            addCriterion("IdentificationSign not between", value1, value2, "identificationsign");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsIsNull() {
            addCriterion("HandlingOpinions is null");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsIsNotNull() {
            addCriterion("HandlingOpinions is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsEqualTo(String value) {
            addCriterion("HandlingOpinions =", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsNotEqualTo(String value) {
            addCriterion("HandlingOpinions <>", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsGreaterThan(String value) {
            addCriterion("HandlingOpinions >", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsGreaterThanOrEqualTo(String value) {
            addCriterion("HandlingOpinions >=", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsLessThan(String value) {
            addCriterion("HandlingOpinions <", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsLessThanOrEqualTo(String value) {
            addCriterion("HandlingOpinions <=", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsLike(String value) {
            addCriterion("HandlingOpinions like", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsNotLike(String value) {
            addCriterion("HandlingOpinions not like", value, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsIn(List<String> values) {
            addCriterion("HandlingOpinions in", values, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsNotIn(List<String> values) {
            addCriterion("HandlingOpinions not in", values, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsBetween(String value1, String value2) {
            addCriterion("HandlingOpinions between", value1, value2, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andHandlingopinionsNotBetween(String value1, String value2) {
            addCriterion("HandlingOpinions not between", value1, value2, "handlingopinions");
            return (Criteria) this;
        }

        public Criteria andDenialtypeIsNull() {
            addCriterion("DenialType is null");
            return (Criteria) this;
        }

        public Criteria andDenialtypeIsNotNull() {
            addCriterion("DenialType is not null");
            return (Criteria) this;
        }

        public Criteria andDenialtypeEqualTo(String value) {
            addCriterion("DenialType =", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeNotEqualTo(String value) {
            addCriterion("DenialType <>", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeGreaterThan(String value) {
            addCriterion("DenialType >", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeGreaterThanOrEqualTo(String value) {
            addCriterion("DenialType >=", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeLessThan(String value) {
            addCriterion("DenialType <", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeLessThanOrEqualTo(String value) {
            addCriterion("DenialType <=", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeLike(String value) {
            addCriterion("DenialType like", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeNotLike(String value) {
            addCriterion("DenialType not like", value, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeIn(List<String> values) {
            addCriterion("DenialType in", values, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeNotIn(List<String> values) {
            addCriterion("DenialType not in", values, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeBetween(String value1, String value2) {
            addCriterion("DenialType between", value1, value2, "denialtype");
            return (Criteria) this;
        }

        public Criteria andDenialtypeNotBetween(String value1, String value2) {
            addCriterion("DenialType not between", value1, value2, "denialtype");
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