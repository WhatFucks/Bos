package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorPackageDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorPackageDetailsExample() {
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

        public Criteria andActualcargointIsNull() {
            addCriterion("ActualCargoInt is null");
            return (Criteria) this;
        }

        public Criteria andActualcargointIsNotNull() {
            addCriterion("ActualCargoInt is not null");
            return (Criteria) this;
        }

        public Criteria andActualcargointEqualTo(Integer value) {
            addCriterion("ActualCargoInt =", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointNotEqualTo(Integer value) {
            addCriterion("ActualCargoInt <>", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointGreaterThan(Integer value) {
            addCriterion("ActualCargoInt >", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActualCargoInt >=", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointLessThan(Integer value) {
            addCriterion("ActualCargoInt <", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointLessThanOrEqualTo(Integer value) {
            addCriterion("ActualCargoInt <=", value, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointIn(List<Integer> values) {
            addCriterion("ActualCargoInt in", values, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointNotIn(List<Integer> values) {
            addCriterion("ActualCargoInt not in", values, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointBetween(Integer value1, Integer value2) {
            addCriterion("ActualCargoInt between", value1, value2, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andActualcargointNotBetween(Integer value1, Integer value2) {
            addCriterion("ActualCargoInt not between", value1, value2, "actualcargoint");
            return (Criteria) this;
        }

        public Criteria andCargointIsNull() {
            addCriterion("CargoInt is null");
            return (Criteria) this;
        }

        public Criteria andCargointIsNotNull() {
            addCriterion("CargoInt is not null");
            return (Criteria) this;
        }

        public Criteria andCargointEqualTo(Integer value) {
            addCriterion("CargoInt =", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotEqualTo(Integer value) {
            addCriterion("CargoInt <>", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointGreaterThan(Integer value) {
            addCriterion("CargoInt >", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoInt >=", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointLessThan(Integer value) {
            addCriterion("CargoInt <", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointLessThanOrEqualTo(Integer value) {
            addCriterion("CargoInt <=", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointIn(List<Integer> values) {
            addCriterion("CargoInt in", values, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotIn(List<Integer> values) {
            addCriterion("CargoInt not in", values, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointBetween(Integer value1, Integer value2) {
            addCriterion("CargoInt between", value1, value2, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoInt not between", value1, value2, "cargoint");
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

        public Criteria andServiceIsNull() {
            addCriterion("Service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("Service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(Date value) {
            addCriterion("Service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(Date value) {
            addCriterion("Service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(Date value) {
            addCriterion("Service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(Date value) {
            addCriterion("Service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(Date value) {
            addCriterion("Service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(Date value) {
            addCriterion("Service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<Date> values) {
            addCriterion("Service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<Date> values) {
            addCriterion("Service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(Date value1, Date value2) {
            addCriterion("Service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(Date value1, Date value2) {
            addCriterion("Service not between", value1, value2, "service");
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

        public Criteria andInputtypeIsNull() {
            addCriterion("InputType is null");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNotNull() {
            addCriterion("InputType is not null");
            return (Criteria) this;
        }

        public Criteria andInputtypeEqualTo(String value) {
            addCriterion("InputType =", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotEqualTo(String value) {
            addCriterion("InputType <>", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThan(String value) {
            addCriterion("InputType >", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThanOrEqualTo(String value) {
            addCriterion("InputType >=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThan(String value) {
            addCriterion("InputType <", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThanOrEqualTo(String value) {
            addCriterion("InputType <=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLike(String value) {
            addCriterion("InputType like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotLike(String value) {
            addCriterion("InputType not like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeIn(List<String> values) {
            addCriterion("InputType in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotIn(List<String> values) {
            addCriterion("InputType not in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeBetween(String value1, String value2) {
            addCriterion("InputType between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotBetween(String value1, String value2) {
            addCriterion("InputType not between", value1, value2, "inputtype");
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