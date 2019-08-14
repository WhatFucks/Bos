package com.lm.entity.acc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccBusinessAdmissibilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccBusinessAdmissibilityExample() {
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

        public Criteria andBusinessnoticenoIsNull() {
            addCriterion("BusinessNoticeNo is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoIsNotNull() {
            addCriterion("BusinessNoticeNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoEqualTo(String value) {
            addCriterion("BusinessNoticeNo =", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotEqualTo(String value) {
            addCriterion("BusinessNoticeNo <>", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoGreaterThan(String value) {
            addCriterion("BusinessNoticeNo >", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessNoticeNo >=", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLessThan(String value) {
            addCriterion("BusinessNoticeNo <", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLessThanOrEqualTo(String value) {
            addCriterion("BusinessNoticeNo <=", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoLike(String value) {
            addCriterion("BusinessNoticeNo like", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotLike(String value) {
            addCriterion("BusinessNoticeNo not like", value, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoIn(List<String> values) {
            addCriterion("BusinessNoticeNo in", values, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotIn(List<String> values) {
            addCriterion("BusinessNoticeNo not in", values, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoBetween(String value1, String value2) {
            addCriterion("BusinessNoticeNo between", value1, value2, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoticenoNotBetween(String value1, String value2) {
            addCriterion("BusinessNoticeNo not between", value1, value2, "businessnoticeno");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIsNull() {
            addCriterion("ReservationTime is null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIsNotNull() {
            addCriterion("ReservationTime is not null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeEqualTo(Date value) {
            addCriterion("ReservationTime =", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotEqualTo(Date value) {
            addCriterion("ReservationTime <>", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThan(Date value) {
            addCriterion("ReservationTime >", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReservationTime >=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThan(Date value) {
            addCriterion("ReservationTime <", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThanOrEqualTo(Date value) {
            addCriterion("ReservationTime <=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIn(List<Date> values) {
            addCriterion("ReservationTime in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotIn(List<Date> values) {
            addCriterion("ReservationTime not in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeBetween(Date value1, Date value2) {
            addCriterion("ReservationTime between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotBetween(Date value1, Date value2) {
            addCriterion("ReservationTime not between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNull() {
            addCriterion("CustomName is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("CustomName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("CustomName =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("CustomName <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("CustomName >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomName >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("CustomName <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("CustomName <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("CustomName like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("CustomName not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("CustomName in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("CustomName not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("CustomName between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("CustomName not between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andPickupcityIsNull() {
            addCriterion("PickupCity is null");
            return (Criteria) this;
        }

        public Criteria andPickupcityIsNotNull() {
            addCriterion("PickupCity is not null");
            return (Criteria) this;
        }

        public Criteria andPickupcityEqualTo(String value) {
            addCriterion("PickupCity =", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityNotEqualTo(String value) {
            addCriterion("PickupCity <>", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityGreaterThan(String value) {
            addCriterion("PickupCity >", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityGreaterThanOrEqualTo(String value) {
            addCriterion("PickupCity >=", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityLessThan(String value) {
            addCriterion("PickupCity <", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityLessThanOrEqualTo(String value) {
            addCriterion("PickupCity <=", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityLike(String value) {
            addCriterion("PickupCity like", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityNotLike(String value) {
            addCriterion("PickupCity not like", value, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityIn(List<String> values) {
            addCriterion("PickupCity in", values, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityNotIn(List<String> values) {
            addCriterion("PickupCity not in", values, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityBetween(String value1, String value2) {
            addCriterion("PickupCity between", value1, value2, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andPickupcityNotBetween(String value1, String value2) {
            addCriterion("PickupCity not between", value1, value2, "pickupcity");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andPickupaddressIsNull() {
            addCriterion("PickupAddress is null");
            return (Criteria) this;
        }

        public Criteria andPickupaddressIsNotNull() {
            addCriterion("PickupAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPickupaddressEqualTo(String value) {
            addCriterion("PickupAddress =", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressNotEqualTo(String value) {
            addCriterion("PickupAddress <>", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressGreaterThan(String value) {
            addCriterion("PickupAddress >", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressGreaterThanOrEqualTo(String value) {
            addCriterion("PickupAddress >=", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressLessThan(String value) {
            addCriterion("PickupAddress <", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressLessThanOrEqualTo(String value) {
            addCriterion("PickupAddress <=", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressLike(String value) {
            addCriterion("PickupAddress like", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressNotLike(String value) {
            addCriterion("PickupAddress not like", value, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressIn(List<String> values) {
            addCriterion("PickupAddress in", values, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressNotIn(List<String> values) {
            addCriterion("PickupAddress not in", values, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressBetween(String value1, String value2) {
            addCriterion("PickupAddress between", value1, value2, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andPickupaddressNotBetween(String value1, String value2) {
            addCriterion("PickupAddress not between", value1, value2, "pickupaddress");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIsNull() {
            addCriterion("CustomCode is null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIsNotNull() {
            addCriterion("CustomCode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomcodeEqualTo(String value) {
            addCriterion("CustomCode =", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotEqualTo(String value) {
            addCriterion("CustomCode <>", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThan(String value) {
            addCriterion("CustomCode >", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CustomCode >=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThan(String value) {
            addCriterion("CustomCode <", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLessThanOrEqualTo(String value) {
            addCriterion("CustomCode <=", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeLike(String value) {
            addCriterion("CustomCode like", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotLike(String value) {
            addCriterion("CustomCode not like", value, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeIn(List<String> values) {
            addCriterion("CustomCode in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotIn(List<String> values) {
            addCriterion("CustomCode not in", values, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeBetween(String value1, String value2) {
            addCriterion("CustomCode between", value1, value2, "customcode");
            return (Criteria) this;
        }

        public Criteria andCustomcodeNotBetween(String value1, String value2) {
            addCriterion("CustomCode not between", value1, value2, "customcode");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("Linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("Linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("Linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("Linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("Linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("Linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("Linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("Linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("Linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("Linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("Linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("Linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("Linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("Linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("TelPhone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("TelPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("TelPhone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("TelPhone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("TelPhone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TelPhone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("TelPhone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("TelPhone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("TelPhone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("TelPhone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("TelPhone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("TelPhone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("TelPhone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("TelPhone not between", value1, value2, "telphone");
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

        public Criteria andRepickuptimeIsNull() {
            addCriterion("RePickupTime is null");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeIsNotNull() {
            addCriterion("RePickupTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeEqualTo(Date value) {
            addCriterion("RePickupTime =", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeNotEqualTo(Date value) {
            addCriterion("RePickupTime <>", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeGreaterThan(Date value) {
            addCriterion("RePickupTime >", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RePickupTime >=", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeLessThan(Date value) {
            addCriterion("RePickupTime <", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeLessThanOrEqualTo(Date value) {
            addCriterion("RePickupTime <=", value, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeIn(List<Date> values) {
            addCriterion("RePickupTime in", values, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeNotIn(List<Date> values) {
            addCriterion("RePickupTime not in", values, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeBetween(Date value1, Date value2) {
            addCriterion("RePickupTime between", value1, value2, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andRepickuptimeNotBetween(Date value1, Date value2) {
            addCriterion("RePickupTime not between", value1, value2, "repickuptime");
            return (Criteria) this;
        }

        public Criteria andArrivecityIsNull() {
            addCriterion("ArriveCity is null");
            return (Criteria) this;
        }

        public Criteria andArrivecityIsNotNull() {
            addCriterion("ArriveCity is not null");
            return (Criteria) this;
        }

        public Criteria andArrivecityEqualTo(String value) {
            addCriterion("ArriveCity =", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotEqualTo(String value) {
            addCriterion("ArriveCity <>", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityGreaterThan(String value) {
            addCriterion("ArriveCity >", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityGreaterThanOrEqualTo(String value) {
            addCriterion("ArriveCity >=", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLessThan(String value) {
            addCriterion("ArriveCity <", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLessThanOrEqualTo(String value) {
            addCriterion("ArriveCity <=", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLike(String value) {
            addCriterion("ArriveCity like", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotLike(String value) {
            addCriterion("ArriveCity not like", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityIn(List<String> values) {
            addCriterion("ArriveCity in", values, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotIn(List<String> values) {
            addCriterion("ArriveCity not in", values, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityBetween(String value1, String value2) {
            addCriterion("ArriveCity between", value1, value2, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotBetween(String value1, String value2) {
            addCriterion("ArriveCity not between", value1, value2, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andPickerinfoIsNull() {
            addCriterion("PickerInfo is null");
            return (Criteria) this;
        }

        public Criteria andPickerinfoIsNotNull() {
            addCriterion("PickerInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPickerinfoEqualTo(Integer value) {
            addCriterion("PickerInfo =", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoNotEqualTo(Integer value) {
            addCriterion("PickerInfo <>", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoGreaterThan(Integer value) {
            addCriterion("PickerInfo >", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickerInfo >=", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoLessThan(Integer value) {
            addCriterion("PickerInfo <", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoLessThanOrEqualTo(Integer value) {
            addCriterion("PickerInfo <=", value, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoIn(List<Integer> values) {
            addCriterion("PickerInfo in", values, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoNotIn(List<Integer> values) {
            addCriterion("PickerInfo not in", values, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoBetween(Integer value1, Integer value2) {
            addCriterion("PickerInfo between", value1, value2, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andPickerinfoNotBetween(Integer value1, Integer value2) {
            addCriterion("PickerInfo not between", value1, value2, "pickerinfo");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNull() {
            addCriterion("SendAddress is null");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNotNull() {
            addCriterion("SendAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddressEqualTo(String value) {
            addCriterion("SendAddress =", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotEqualTo(String value) {
            addCriterion("SendAddress <>", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThan(String value) {
            addCriterion("SendAddress >", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SendAddress >=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThan(String value) {
            addCriterion("SendAddress <", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThanOrEqualTo(String value) {
            addCriterion("SendAddress <=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLike(String value) {
            addCriterion("SendAddress like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotLike(String value) {
            addCriterion("SendAddress not like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressIn(List<String> values) {
            addCriterion("SendAddress in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotIn(List<String> values) {
            addCriterion("SendAddress not in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressBetween(String value1, String value2) {
            addCriterion("SendAddress between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotBetween(String value1, String value2) {
            addCriterion("SendAddress not between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andProcessingunitIsNull() {
            addCriterion("ProcessingUnit is null");
            return (Criteria) this;
        }

        public Criteria andProcessingunitIsNotNull() {
            addCriterion("ProcessingUnit is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingunitEqualTo(Integer value) {
            addCriterion("ProcessingUnit =", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitNotEqualTo(Integer value) {
            addCriterion("ProcessingUnit <>", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitGreaterThan(Integer value) {
            addCriterion("ProcessingUnit >", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProcessingUnit >=", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitLessThan(Integer value) {
            addCriterion("ProcessingUnit <", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitLessThanOrEqualTo(Integer value) {
            addCriterion("ProcessingUnit <=", value, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitIn(List<Integer> values) {
            addCriterion("ProcessingUnit in", values, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitNotIn(List<Integer> values) {
            addCriterion("ProcessingUnit not in", values, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitBetween(Integer value1, Integer value2) {
            addCriterion("ProcessingUnit between", value1, value2, "processingunit");
            return (Criteria) this;
        }

        public Criteria andProcessingunitNotBetween(Integer value1, Integer value2) {
            addCriterion("ProcessingUnit not between", value1, value2, "processingunit");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceIsNull() {
            addCriterion("NotificationSource is null");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceIsNotNull() {
            addCriterion("NotificationSource is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceEqualTo(Integer value) {
            addCriterion("NotificationSource =", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceNotEqualTo(Integer value) {
            addCriterion("NotificationSource <>", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceGreaterThan(Integer value) {
            addCriterion("NotificationSource >", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("NotificationSource >=", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceLessThan(Integer value) {
            addCriterion("NotificationSource <", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceLessThanOrEqualTo(Integer value) {
            addCriterion("NotificationSource <=", value, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceIn(List<Integer> values) {
            addCriterion("NotificationSource in", values, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceNotIn(List<Integer> values) {
            addCriterion("NotificationSource not in", values, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceBetween(Integer value1, Integer value2) {
            addCriterion("NotificationSource between", value1, value2, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andNotificationsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("NotificationSource not between", value1, value2, "notificationsource");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagIsNull() {
            addCriterion("CustomNoModifyFlag is null");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagIsNotNull() {
            addCriterion("CustomNoModifyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagEqualTo(Integer value) {
            addCriterion("CustomNoModifyFlag =", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagNotEqualTo(Integer value) {
            addCriterion("CustomNoModifyFlag <>", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagGreaterThan(Integer value) {
            addCriterion("CustomNoModifyFlag >", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomNoModifyFlag >=", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagLessThan(Integer value) {
            addCriterion("CustomNoModifyFlag <", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagLessThanOrEqualTo(Integer value) {
            addCriterion("CustomNoModifyFlag <=", value, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagIn(List<Integer> values) {
            addCriterion("CustomNoModifyFlag in", values, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagNotIn(List<Integer> values) {
            addCriterion("CustomNoModifyFlag not in", values, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagBetween(Integer value1, Integer value2) {
            addCriterion("CustomNoModifyFlag between", value1, value2, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andCustomnomodifyflagNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomNoModifyFlag not between", value1, value2, "customnomodifyflag");
            return (Criteria) this;
        }

        public Criteria andSingletypeIsNull() {
            addCriterion("SingleType is null");
            return (Criteria) this;
        }

        public Criteria andSingletypeIsNotNull() {
            addCriterion("SingleType is not null");
            return (Criteria) this;
        }

        public Criteria andSingletypeEqualTo(String value) {
            addCriterion("SingleType =", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeNotEqualTo(String value) {
            addCriterion("SingleType <>", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeGreaterThan(String value) {
            addCriterion("SingleType >", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeGreaterThanOrEqualTo(String value) {
            addCriterion("SingleType >=", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeLessThan(String value) {
            addCriterion("SingleType <", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeLessThanOrEqualTo(String value) {
            addCriterion("SingleType <=", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeLike(String value) {
            addCriterion("SingleType like", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeNotLike(String value) {
            addCriterion("SingleType not like", value, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeIn(List<String> values) {
            addCriterion("SingleType in", values, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeNotIn(List<String> values) {
            addCriterion("SingleType not in", values, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeBetween(String value1, String value2) {
            addCriterion("SingleType between", value1, value2, "singletype");
            return (Criteria) this;
        }

        public Criteria andSingletypeNotBetween(String value1, String value2) {
            addCriterion("SingleType not between", value1, value2, "singletype");
            return (Criteria) this;
        }

        public Criteria andPackagesnumIsNull() {
            addCriterion("PackagesNum is null");
            return (Criteria) this;
        }

        public Criteria andPackagesnumIsNotNull() {
            addCriterion("PackagesNum is not null");
            return (Criteria) this;
        }

        public Criteria andPackagesnumEqualTo(Integer value) {
            addCriterion("PackagesNum =", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumNotEqualTo(Integer value) {
            addCriterion("PackagesNum <>", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumGreaterThan(Integer value) {
            addCriterion("PackagesNum >", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackagesNum >=", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumLessThan(Integer value) {
            addCriterion("PackagesNum <", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumLessThanOrEqualTo(Integer value) {
            addCriterion("PackagesNum <=", value, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumIn(List<Integer> values) {
            addCriterion("PackagesNum in", values, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumNotIn(List<Integer> values) {
            addCriterion("PackagesNum not in", values, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumBetween(Integer value1, Integer value2) {
            addCriterion("PackagesNum between", value1, value2, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andPackagesnumNotBetween(Integer value1, Integer value2) {
            addCriterion("PackagesNum not between", value1, value2, "packagesnum");
            return (Criteria) this;
        }

        public Criteria andActualweightIsNull() {
            addCriterion("ActualWeight is null");
            return (Criteria) this;
        }

        public Criteria andActualweightIsNotNull() {
            addCriterion("ActualWeight is not null");
            return (Criteria) this;
        }

        public Criteria andActualweightEqualTo(Double value) {
            addCriterion("ActualWeight =", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightNotEqualTo(Double value) {
            addCriterion("ActualWeight <>", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightGreaterThan(Double value) {
            addCriterion("ActualWeight >", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightGreaterThanOrEqualTo(Double value) {
            addCriterion("ActualWeight >=", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightLessThan(Double value) {
            addCriterion("ActualWeight <", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightLessThanOrEqualTo(Double value) {
            addCriterion("ActualWeight <=", value, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightIn(List<Double> values) {
            addCriterion("ActualWeight in", values, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightNotIn(List<Double> values) {
            addCriterion("ActualWeight not in", values, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightBetween(Double value1, Double value2) {
            addCriterion("ActualWeight between", value1, value2, "actualweight");
            return (Criteria) this;
        }

        public Criteria andActualweightNotBetween(Double value1, Double value2) {
            addCriterion("ActualWeight not between", value1, value2, "actualweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightIsNull() {
            addCriterion("BillingWeight is null");
            return (Criteria) this;
        }

        public Criteria andBillingweightIsNotNull() {
            addCriterion("BillingWeight is not null");
            return (Criteria) this;
        }

        public Criteria andBillingweightEqualTo(Double value) {
            addCriterion("BillingWeight =", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightNotEqualTo(Double value) {
            addCriterion("BillingWeight <>", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightGreaterThan(Double value) {
            addCriterion("BillingWeight >", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightGreaterThanOrEqualTo(Double value) {
            addCriterion("BillingWeight >=", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightLessThan(Double value) {
            addCriterion("BillingWeight <", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightLessThanOrEqualTo(Double value) {
            addCriterion("BillingWeight <=", value, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightIn(List<Double> values) {
            addCriterion("BillingWeight in", values, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightNotIn(List<Double> values) {
            addCriterion("BillingWeight not in", values, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightBetween(Double value1, Double value2) {
            addCriterion("BillingWeight between", value1, value2, "billingweight");
            return (Criteria) this;
        }

        public Criteria andBillingweightNotBetween(Double value1, Double value2) {
            addCriterion("BillingWeight not between", value1, value2, "billingweight");
            return (Criteria) this;
        }

        public Criteria andPackingfeeIsNull() {
            addCriterion("PackingFee is null");
            return (Criteria) this;
        }

        public Criteria andPackingfeeIsNotNull() {
            addCriterion("PackingFee is not null");
            return (Criteria) this;
        }

        public Criteria andPackingfeeEqualTo(Float value) {
            addCriterion("PackingFee =", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeNotEqualTo(Float value) {
            addCriterion("PackingFee <>", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeGreaterThan(Float value) {
            addCriterion("PackingFee >", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("PackingFee >=", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeLessThan(Float value) {
            addCriterion("PackingFee <", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeLessThanOrEqualTo(Float value) {
            addCriterion("PackingFee <=", value, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeIn(List<Float> values) {
            addCriterion("PackingFee in", values, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeNotIn(List<Float> values) {
            addCriterion("PackingFee not in", values, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeBetween(Float value1, Float value2) {
            addCriterion("PackingFee between", value1, value2, "packingfee");
            return (Criteria) this;
        }

        public Criteria andPackingfeeNotBetween(Float value1, Float value2) {
            addCriterion("PackingFee not between", value1, value2, "packingfee");
            return (Criteria) this;
        }

        public Criteria andActualpackingIsNull() {
            addCriterion("ActualPacking is null");
            return (Criteria) this;
        }

        public Criteria andActualpackingIsNotNull() {
            addCriterion("ActualPacking is not null");
            return (Criteria) this;
        }

        public Criteria andActualpackingEqualTo(Integer value) {
            addCriterion("ActualPacking =", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingNotEqualTo(Integer value) {
            addCriterion("ActualPacking <>", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingGreaterThan(Integer value) {
            addCriterion("ActualPacking >", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActualPacking >=", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingLessThan(Integer value) {
            addCriterion("ActualPacking <", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingLessThanOrEqualTo(Integer value) {
            addCriterion("ActualPacking <=", value, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingIn(List<Integer> values) {
            addCriterion("ActualPacking in", values, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingNotIn(List<Integer> values) {
            addCriterion("ActualPacking not in", values, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingBetween(Integer value1, Integer value2) {
            addCriterion("ActualPacking between", value1, value2, "actualpacking");
            return (Criteria) this;
        }

        public Criteria andActualpackingNotBetween(Integer value1, Integer value2) {
            addCriterion("ActualPacking not between", value1, value2, "actualpacking");
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