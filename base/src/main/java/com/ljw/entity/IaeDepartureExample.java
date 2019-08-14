package com.ljw.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IaeDepartureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IaeDepartureExample() {
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

        public Criteria andPackingidIsNull() {
            addCriterion("PackingID is null");
            return (Criteria) this;
        }

        public Criteria andPackingidIsNotNull() {
            addCriterion("PackingID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingidEqualTo(String value) {
            addCriterion("PackingID =", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidNotEqualTo(String value) {
            addCriterion("PackingID <>", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidGreaterThan(String value) {
            addCriterion("PackingID >", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidGreaterThanOrEqualTo(String value) {
            addCriterion("PackingID >=", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidLessThan(String value) {
            addCriterion("PackingID <", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidLessThanOrEqualTo(String value) {
            addCriterion("PackingID <=", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidLike(String value) {
            addCriterion("PackingID like", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidNotLike(String value) {
            addCriterion("PackingID not like", value, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidIn(List<String> values) {
            addCriterion("PackingID in", values, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidNotIn(List<String> values) {
            addCriterion("PackingID not in", values, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidBetween(String value1, String value2) {
            addCriterion("PackingID between", value1, value2, "packingid");
            return (Criteria) this;
        }

        public Criteria andPackingidNotBetween(String value1, String value2) {
            addCriterion("PackingID not between", value1, value2, "packingid");
            return (Criteria) this;
        }

        public Criteria andTransferIsNull() {
            addCriterion("Transfer is null");
            return (Criteria) this;
        }

        public Criteria andTransferIsNotNull() {
            addCriterion("Transfer is not null");
            return (Criteria) this;
        }

        public Criteria andTransferEqualTo(Boolean value) {
            addCriterion("Transfer =", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotEqualTo(Boolean value) {
            addCriterion("Transfer <>", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThan(Boolean value) {
            addCriterion("Transfer >", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Transfer >=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThan(Boolean value) {
            addCriterion("Transfer <", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferLessThanOrEqualTo(Boolean value) {
            addCriterion("Transfer <=", value, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferIn(List<Boolean> values) {
            addCriterion("Transfer in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotIn(List<Boolean> values) {
            addCriterion("Transfer not in", values, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferBetween(Boolean value1, Boolean value2) {
            addCriterion("Transfer between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andTransferNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Transfer not between", value1, value2, "transfer");
            return (Criteria) this;
        }

        public Criteria andActualcountIsNull() {
            addCriterion("ActualCount is null");
            return (Criteria) this;
        }

        public Criteria andActualcountIsNotNull() {
            addCriterion("ActualCount is not null");
            return (Criteria) this;
        }

        public Criteria andActualcountEqualTo(Integer value) {
            addCriterion("ActualCount =", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotEqualTo(Integer value) {
            addCriterion("ActualCount <>", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountGreaterThan(Integer value) {
            addCriterion("ActualCount >", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActualCount >=", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountLessThan(Integer value) {
            addCriterion("ActualCount <", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountLessThanOrEqualTo(Integer value) {
            addCriterion("ActualCount <=", value, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountIn(List<Integer> values) {
            addCriterion("ActualCount in", values, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotIn(List<Integer> values) {
            addCriterion("ActualCount not in", values, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountBetween(Integer value1, Integer value2) {
            addCriterion("ActualCount between", value1, value2, "actualcount");
            return (Criteria) this;
        }

        public Criteria andActualcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ActualCount not between", value1, value2, "actualcount");
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

        public Criteria andWarenameIsNull() {
            addCriterion("WareName is null");
            return (Criteria) this;
        }

        public Criteria andWarenameIsNotNull() {
            addCriterion("WareName is not null");
            return (Criteria) this;
        }

        public Criteria andWarenameEqualTo(Integer value) {
            addCriterion("WareName =", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotEqualTo(Integer value) {
            addCriterion("WareName <>", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameGreaterThan(Integer value) {
            addCriterion("WareName >", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameGreaterThanOrEqualTo(Integer value) {
            addCriterion("WareName >=", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameLessThan(Integer value) {
            addCriterion("WareName <", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameLessThanOrEqualTo(Integer value) {
            addCriterion("WareName <=", value, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameIn(List<Integer> values) {
            addCriterion("WareName in", values, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotIn(List<Integer> values) {
            addCriterion("WareName not in", values, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameBetween(Integer value1, Integer value2) {
            addCriterion("WareName between", value1, value2, "warename");
            return (Criteria) this;
        }

        public Criteria andWarenameNotBetween(Integer value1, Integer value2) {
            addCriterion("WareName not between", value1, value2, "warename");
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

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIsNull() {
            addCriterion("ActualVolume is null");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIsNotNull() {
            addCriterion("ActualVolume is not null");
            return (Criteria) this;
        }

        public Criteria andActualvolumeEqualTo(BigDecimal value) {
            addCriterion("ActualVolume =", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotEqualTo(BigDecimal value) {
            addCriterion("ActualVolume <>", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeGreaterThan(BigDecimal value) {
            addCriterion("ActualVolume >", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ActualVolume >=", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeLessThan(BigDecimal value) {
            addCriterion("ActualVolume <", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ActualVolume <=", value, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeIn(List<BigDecimal> values) {
            addCriterion("ActualVolume in", values, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotIn(List<BigDecimal> values) {
            addCriterion("ActualVolume not in", values, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActualVolume between", value1, value2, "actualvolume");
            return (Criteria) this;
        }

        public Criteria andActualvolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActualVolume not between", value1, value2, "actualvolume");
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

        public Criteria andTakecargopersonIsNull() {
            addCriterion("TakeCargoPerson is null");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonIsNotNull() {
            addCriterion("TakeCargoPerson is not null");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonEqualTo(String value) {
            addCriterion("TakeCargoPerson =", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotEqualTo(String value) {
            addCriterion("TakeCargoPerson <>", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonGreaterThan(String value) {
            addCriterion("TakeCargoPerson >", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonGreaterThanOrEqualTo(String value) {
            addCriterion("TakeCargoPerson >=", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLessThan(String value) {
            addCriterion("TakeCargoPerson <", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLessThanOrEqualTo(String value) {
            addCriterion("TakeCargoPerson <=", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonLike(String value) {
            addCriterion("TakeCargoPerson like", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotLike(String value) {
            addCriterion("TakeCargoPerson not like", value, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonIn(List<String> values) {
            addCriterion("TakeCargoPerson in", values, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotIn(List<String> values) {
            addCriterion("TakeCargoPerson not in", values, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonBetween(String value1, String value2) {
            addCriterion("TakeCargoPerson between", value1, value2, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTakecargopersonNotBetween(String value1, String value2) {
            addCriterion("TakeCargoPerson not between", value1, value2, "takecargoperson");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIsNull() {
            addCriterion("TackCargoAddress is null");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIsNotNull() {
            addCriterion("TackCargoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressEqualTo(String value) {
            addCriterion("TackCargoAddress =", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotEqualTo(String value) {
            addCriterion("TackCargoAddress <>", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressGreaterThan(String value) {
            addCriterion("TackCargoAddress >", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TackCargoAddress >=", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLessThan(String value) {
            addCriterion("TackCargoAddress <", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLessThanOrEqualTo(String value) {
            addCriterion("TackCargoAddress <=", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressLike(String value) {
            addCriterion("TackCargoAddress like", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotLike(String value) {
            addCriterion("TackCargoAddress not like", value, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressIn(List<String> values) {
            addCriterion("TackCargoAddress in", values, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotIn(List<String> values) {
            addCriterion("TackCargoAddress not in", values, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressBetween(String value1, String value2) {
            addCriterion("TackCargoAddress between", value1, value2, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andTackcargoaddressNotBetween(String value1, String value2) {
            addCriterion("TackCargoAddress not between", value1, value2, "tackcargoaddress");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("Payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("Payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("Payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("Payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("Payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("Payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("Payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("Payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("Payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("Payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("Payment not between", value1, value2, "payment");
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

        public Criteria andSurplustimeIsNull() {
            addCriterion("SurplusTime is null");
            return (Criteria) this;
        }

        public Criteria andSurplustimeIsNotNull() {
            addCriterion("SurplusTime is not null");
            return (Criteria) this;
        }

        public Criteria andSurplustimeEqualTo(Date value) {
            addCriterion("SurplusTime =", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotEqualTo(Date value) {
            addCriterion("SurplusTime <>", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeGreaterThan(Date value) {
            addCriterion("SurplusTime >", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SurplusTime >=", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeLessThan(Date value) {
            addCriterion("SurplusTime <", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeLessThanOrEqualTo(Date value) {
            addCriterion("SurplusTime <=", value, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeIn(List<Date> values) {
            addCriterion("SurplusTime in", values, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotIn(List<Date> values) {
            addCriterion("SurplusTime not in", values, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeBetween(Date value1, Date value2) {
            addCriterion("SurplusTime between", value1, value2, "surplustime");
            return (Criteria) this;
        }

        public Criteria andSurplustimeNotBetween(Date value1, Date value2) {
            addCriterion("SurplusTime not between", value1, value2, "surplustime");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyIsNull() {
            addCriterion("EntrustCompany is null");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyIsNotNull() {
            addCriterion("EntrustCompany is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyEqualTo(String value) {
            addCriterion("EntrustCompany =", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyNotEqualTo(String value) {
            addCriterion("EntrustCompany <>", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyGreaterThan(String value) {
            addCriterion("EntrustCompany >", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("EntrustCompany >=", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyLessThan(String value) {
            addCriterion("EntrustCompany <", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyLessThanOrEqualTo(String value) {
            addCriterion("EntrustCompany <=", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyLike(String value) {
            addCriterion("EntrustCompany like", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyNotLike(String value) {
            addCriterion("EntrustCompany not like", value, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyIn(List<String> values) {
            addCriterion("EntrustCompany in", values, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyNotIn(List<String> values) {
            addCriterion("EntrustCompany not in", values, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyBetween(String value1, String value2) {
            addCriterion("EntrustCompany between", value1, value2, "entrustcompany");
            return (Criteria) this;
        }

        public Criteria andEntrustcompanyNotBetween(String value1, String value2) {
            addCriterion("EntrustCompany not between", value1, value2, "entrustcompany");
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