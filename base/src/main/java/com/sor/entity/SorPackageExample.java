package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorPackageExample() {
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

        public Criteria andPackagepersonIsNull() {
            addCriterion("PackagePerson is null");
            return (Criteria) this;
        }

        public Criteria andPackagepersonIsNotNull() {
            addCriterion("PackagePerson is not null");
            return (Criteria) this;
        }

        public Criteria andPackagepersonEqualTo(Integer value) {
            addCriterion("PackagePerson =", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonNotEqualTo(Integer value) {
            addCriterion("PackagePerson <>", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonGreaterThan(Integer value) {
            addCriterion("PackagePerson >", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackagePerson >=", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonLessThan(Integer value) {
            addCriterion("PackagePerson <", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonLessThanOrEqualTo(Integer value) {
            addCriterion("PackagePerson <=", value, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonIn(List<Integer> values) {
            addCriterion("PackagePerson in", values, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonNotIn(List<Integer> values) {
            addCriterion("PackagePerson not in", values, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonBetween(Integer value1, Integer value2) {
            addCriterion("PackagePerson between", value1, value2, "packageperson");
            return (Criteria) this;
        }

        public Criteria andPackagepersonNotBetween(Integer value1, Integer value2) {
            addCriterion("PackagePerson not between", value1, value2, "packageperson");
            return (Criteria) this;
        }

        public Criteria andSealintIsNull() {
            addCriterion("SealInt is null");
            return (Criteria) this;
        }

        public Criteria andSealintIsNotNull() {
            addCriterion("SealInt is not null");
            return (Criteria) this;
        }

        public Criteria andSealintEqualTo(String value) {
            addCriterion("SealInt =", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintNotEqualTo(String value) {
            addCriterion("SealInt <>", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintGreaterThan(String value) {
            addCriterion("SealInt >", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintGreaterThanOrEqualTo(String value) {
            addCriterion("SealInt >=", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintLessThan(String value) {
            addCriterion("SealInt <", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintLessThanOrEqualTo(String value) {
            addCriterion("SealInt <=", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintLike(String value) {
            addCriterion("SealInt like", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintNotLike(String value) {
            addCriterion("SealInt not like", value, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintIn(List<String> values) {
            addCriterion("SealInt in", values, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintNotIn(List<String> values) {
            addCriterion("SealInt not in", values, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintBetween(String value1, String value2) {
            addCriterion("SealInt between", value1, value2, "sealint");
            return (Criteria) this;
        }

        public Criteria andSealintNotBetween(String value1, String value2) {
            addCriterion("SealInt not between", value1, value2, "sealint");
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

        public Criteria andReckondesIsNull() {
            addCriterion("ReckonDes is null");
            return (Criteria) this;
        }

        public Criteria andReckondesIsNotNull() {
            addCriterion("ReckonDes is not null");
            return (Criteria) this;
        }

        public Criteria andReckondesEqualTo(String value) {
            addCriterion("ReckonDes =", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesNotEqualTo(String value) {
            addCriterion("ReckonDes <>", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesGreaterThan(String value) {
            addCriterion("ReckonDes >", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesGreaterThanOrEqualTo(String value) {
            addCriterion("ReckonDes >=", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesLessThan(String value) {
            addCriterion("ReckonDes <", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesLessThanOrEqualTo(String value) {
            addCriterion("ReckonDes <=", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesLike(String value) {
            addCriterion("ReckonDes like", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesNotLike(String value) {
            addCriterion("ReckonDes not like", value, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesIn(List<String> values) {
            addCriterion("ReckonDes in", values, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesNotIn(List<String> values) {
            addCriterion("ReckonDes not in", values, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesBetween(String value1, String value2) {
            addCriterion("ReckonDes between", value1, value2, "reckondes");
            return (Criteria) this;
        }

        public Criteria andReckondesNotBetween(String value1, String value2) {
            addCriterion("ReckonDes not between", value1, value2, "reckondes");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNull() {
            addCriterion("TimeLimit is null");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNotNull() {
            addCriterion("TimeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelimitEqualTo(Date value) {
            addCriterion("TimeLimit =", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotEqualTo(Date value) {
            addCriterion("TimeLimit <>", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThan(Date value) {
            addCriterion("TimeLimit >", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThanOrEqualTo(Date value) {
            addCriterion("TimeLimit >=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThan(Date value) {
            addCriterion("TimeLimit <", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThanOrEqualTo(Date value) {
            addCriterion("TimeLimit <=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitIn(List<Date> values) {
            addCriterion("TimeLimit in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotIn(List<Date> values) {
            addCriterion("TimeLimit not in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitBetween(Date value1, Date value2) {
            addCriterion("TimeLimit between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotBetween(Date value1, Date value2) {
            addCriterion("TimeLimit not between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTicketsumIsNull() {
            addCriterion("TicketSum is null");
            return (Criteria) this;
        }

        public Criteria andTicketsumIsNotNull() {
            addCriterion("TicketSum is not null");
            return (Criteria) this;
        }

        public Criteria andTicketsumEqualTo(Integer value) {
            addCriterion("TicketSum =", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumNotEqualTo(Integer value) {
            addCriterion("TicketSum <>", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumGreaterThan(Integer value) {
            addCriterion("TicketSum >", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TicketSum >=", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumLessThan(Integer value) {
            addCriterion("TicketSum <", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumLessThanOrEqualTo(Integer value) {
            addCriterion("TicketSum <=", value, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumIn(List<Integer> values) {
            addCriterion("TicketSum in", values, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumNotIn(List<Integer> values) {
            addCriterion("TicketSum not in", values, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumBetween(Integer value1, Integer value2) {
            addCriterion("TicketSum between", value1, value2, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andTicketsumNotBetween(Integer value1, Integer value2) {
            addCriterion("TicketSum not between", value1, value2, "ticketsum");
            return (Criteria) this;
        }

        public Criteria andCargosumIsNull() {
            addCriterion("CargoSum is null");
            return (Criteria) this;
        }

        public Criteria andCargosumIsNotNull() {
            addCriterion("CargoSum is not null");
            return (Criteria) this;
        }

        public Criteria andCargosumEqualTo(Integer value) {
            addCriterion("CargoSum =", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotEqualTo(Integer value) {
            addCriterion("CargoSum <>", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumGreaterThan(Integer value) {
            addCriterion("CargoSum >", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CargoSum >=", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumLessThan(Integer value) {
            addCriterion("CargoSum <", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumLessThanOrEqualTo(Integer value) {
            addCriterion("CargoSum <=", value, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumIn(List<Integer> values) {
            addCriterion("CargoSum in", values, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotIn(List<Integer> values) {
            addCriterion("CargoSum not in", values, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumBetween(Integer value1, Integer value2) {
            addCriterion("CargoSum between", value1, value2, "cargosum");
            return (Criteria) this;
        }

        public Criteria andCargosumNotBetween(Integer value1, Integer value2) {
            addCriterion("CargoSum not between", value1, value2, "cargosum");
            return (Criteria) this;
        }

        public Criteria andWeightsumIsNull() {
            addCriterion("WeightSum is null");
            return (Criteria) this;
        }

        public Criteria andWeightsumIsNotNull() {
            addCriterion("WeightSum is not null");
            return (Criteria) this;
        }

        public Criteria andWeightsumEqualTo(Long value) {
            addCriterion("WeightSum =", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumNotEqualTo(Long value) {
            addCriterion("WeightSum <>", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumGreaterThan(Long value) {
            addCriterion("WeightSum >", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumGreaterThanOrEqualTo(Long value) {
            addCriterion("WeightSum >=", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumLessThan(Long value) {
            addCriterion("WeightSum <", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumLessThanOrEqualTo(Long value) {
            addCriterion("WeightSum <=", value, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumIn(List<Long> values) {
            addCriterion("WeightSum in", values, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumNotIn(List<Long> values) {
            addCriterion("WeightSum not in", values, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumBetween(Long value1, Long value2) {
            addCriterion("WeightSum between", value1, value2, "weightsum");
            return (Criteria) this;
        }

        public Criteria andWeightsumNotBetween(Long value1, Long value2) {
            addCriterion("WeightSum not between", value1, value2, "weightsum");
            return (Criteria) this;
        }

        public Criteria andVolumesumIsNull() {
            addCriterion("VolumeSum is null");
            return (Criteria) this;
        }

        public Criteria andVolumesumIsNotNull() {
            addCriterion("VolumeSum is not null");
            return (Criteria) this;
        }

        public Criteria andVolumesumEqualTo(Long value) {
            addCriterion("VolumeSum =", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumNotEqualTo(Long value) {
            addCriterion("VolumeSum <>", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumGreaterThan(Long value) {
            addCriterion("VolumeSum >", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumGreaterThanOrEqualTo(Long value) {
            addCriterion("VolumeSum >=", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumLessThan(Long value) {
            addCriterion("VolumeSum <", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumLessThanOrEqualTo(Long value) {
            addCriterion("VolumeSum <=", value, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumIn(List<Long> values) {
            addCriterion("VolumeSum in", values, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumNotIn(List<Long> values) {
            addCriterion("VolumeSum not in", values, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumBetween(Long value1, Long value2) {
            addCriterion("VolumeSum between", value1, value2, "volumesum");
            return (Criteria) this;
        }

        public Criteria andVolumesumNotBetween(Long value1, Long value2) {
            addCriterion("VolumeSum not between", value1, value2, "volumesum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("State not between", value1, value2, "state");
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

        public Criteria andAskEqualTo(Integer value) {
            addCriterion("Ask =", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotEqualTo(Integer value) {
            addCriterion("Ask <>", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThan(Integer value) {
            addCriterion("Ask >", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ask >=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThan(Integer value) {
            addCriterion("Ask <", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThanOrEqualTo(Integer value) {
            addCriterion("Ask <=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskIn(List<Integer> values) {
            addCriterion("Ask in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotIn(List<Integer> values) {
            addCriterion("Ask not in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskBetween(Integer value1, Integer value2) {
            addCriterion("Ask between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotBetween(Integer value1, Integer value2) {
            addCriterion("Ask not between", value1, value2, "ask");
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