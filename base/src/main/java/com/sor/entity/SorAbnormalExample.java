package com.sor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SorAbnormalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SorAbnormalExample() {
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

        public Criteria andLaunchdateIsNull() {
            addCriterion("LaunchDate is null");
            return (Criteria) this;
        }

        public Criteria andLaunchdateIsNotNull() {
            addCriterion("LaunchDate is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchdateEqualTo(Date value) {
            addCriterion("LaunchDate =", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotEqualTo(Date value) {
            addCriterion("LaunchDate <>", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateGreaterThan(Date value) {
            addCriterion("LaunchDate >", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LaunchDate >=", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateLessThan(Date value) {
            addCriterion("LaunchDate <", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateLessThanOrEqualTo(Date value) {
            addCriterion("LaunchDate <=", value, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateIn(List<Date> values) {
            addCriterion("LaunchDate in", values, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotIn(List<Date> values) {
            addCriterion("LaunchDate not in", values, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateBetween(Date value1, Date value2) {
            addCriterion("LaunchDate between", value1, value2, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchdateNotBetween(Date value1, Date value2) {
            addCriterion("LaunchDate not between", value1, value2, "launchdate");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonIsNull() {
            addCriterion("LaunchPerson is null");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonIsNotNull() {
            addCriterion("LaunchPerson is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonEqualTo(String value) {
            addCriterion("LaunchPerson =", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonNotEqualTo(String value) {
            addCriterion("LaunchPerson <>", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonGreaterThan(String value) {
            addCriterion("LaunchPerson >", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonGreaterThanOrEqualTo(String value) {
            addCriterion("LaunchPerson >=", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonLessThan(String value) {
            addCriterion("LaunchPerson <", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonLessThanOrEqualTo(String value) {
            addCriterion("LaunchPerson <=", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonLike(String value) {
            addCriterion("LaunchPerson like", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonNotLike(String value) {
            addCriterion("LaunchPerson not like", value, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonIn(List<String> values) {
            addCriterion("LaunchPerson in", values, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonNotIn(List<String> values) {
            addCriterion("LaunchPerson not in", values, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonBetween(String value1, String value2) {
            addCriterion("LaunchPerson between", value1, value2, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchpersonNotBetween(String value1, String value2) {
            addCriterion("LaunchPerson not between", value1, value2, "launchperson");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyIsNull() {
            addCriterion("LaunchCompany is null");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyIsNotNull() {
            addCriterion("LaunchCompany is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyEqualTo(String value) {
            addCriterion("LaunchCompany =", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyNotEqualTo(String value) {
            addCriterion("LaunchCompany <>", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyGreaterThan(String value) {
            addCriterion("LaunchCompany >", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("LaunchCompany >=", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyLessThan(String value) {
            addCriterion("LaunchCompany <", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyLessThanOrEqualTo(String value) {
            addCriterion("LaunchCompany <=", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyLike(String value) {
            addCriterion("LaunchCompany like", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyNotLike(String value) {
            addCriterion("LaunchCompany not like", value, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyIn(List<String> values) {
            addCriterion("LaunchCompany in", values, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyNotIn(List<String> values) {
            addCriterion("LaunchCompany not in", values, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyBetween(String value1, String value2) {
            addCriterion("LaunchCompany between", value1, value2, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andLaunchcompanyNotBetween(String value1, String value2) {
            addCriterion("LaunchCompany not between", value1, value2, "launchcompany");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeIsNull() {
            addCriterion("AbnormalType is null");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeIsNotNull() {
            addCriterion("AbnormalType is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeEqualTo(Boolean value) {
            addCriterion("AbnormalType =", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeNotEqualTo(Boolean value) {
            addCriterion("AbnormalType <>", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeGreaterThan(Boolean value) {
            addCriterion("AbnormalType >", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AbnormalType >=", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeLessThan(Boolean value) {
            addCriterion("AbnormalType <", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeLessThanOrEqualTo(Boolean value) {
            addCriterion("AbnormalType <=", value, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeIn(List<Boolean> values) {
            addCriterion("AbnormalType in", values, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeNotIn(List<Boolean> values) {
            addCriterion("AbnormalType not in", values, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeBetween(Boolean value1, Boolean value2) {
            addCriterion("AbnormalType between", value1, value2, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andAbnormaltypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AbnormalType not between", value1, value2, "abnormaltype");
            return (Criteria) this;
        }

        public Criteria andTransferintIsNull() {
            addCriterion("TransferInt is null");
            return (Criteria) this;
        }

        public Criteria andTransferintIsNotNull() {
            addCriterion("TransferInt is not null");
            return (Criteria) this;
        }

        public Criteria andTransferintEqualTo(String value) {
            addCriterion("TransferInt =", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotEqualTo(String value) {
            addCriterion("TransferInt <>", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintGreaterThan(String value) {
            addCriterion("TransferInt >", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintGreaterThanOrEqualTo(String value) {
            addCriterion("TransferInt >=", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLessThan(String value) {
            addCriterion("TransferInt <", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLessThanOrEqualTo(String value) {
            addCriterion("TransferInt <=", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintLike(String value) {
            addCriterion("TransferInt like", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotLike(String value) {
            addCriterion("TransferInt not like", value, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintIn(List<String> values) {
            addCriterion("TransferInt in", values, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotIn(List<String> values) {
            addCriterion("TransferInt not in", values, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintBetween(String value1, String value2) {
            addCriterion("TransferInt between", value1, value2, "transferint");
            return (Criteria) this;
        }

        public Criteria andTransferintNotBetween(String value1, String value2) {
            addCriterion("TransferInt not between", value1, value2, "transferint");
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

        public Criteria andCargointEqualTo(String value) {
            addCriterion("CargoInt =", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotEqualTo(String value) {
            addCriterion("CargoInt <>", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointGreaterThan(String value) {
            addCriterion("CargoInt >", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointGreaterThanOrEqualTo(String value) {
            addCriterion("CargoInt >=", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointLessThan(String value) {
            addCriterion("CargoInt <", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointLessThanOrEqualTo(String value) {
            addCriterion("CargoInt <=", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointLike(String value) {
            addCriterion("CargoInt like", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotLike(String value) {
            addCriterion("CargoInt not like", value, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointIn(List<String> values) {
            addCriterion("CargoInt in", values, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotIn(List<String> values) {
            addCriterion("CargoInt not in", values, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointBetween(String value1, String value2) {
            addCriterion("CargoInt between", value1, value2, "cargoint");
            return (Criteria) this;
        }

        public Criteria andCargointNotBetween(String value1, String value2) {
            addCriterion("CargoInt not between", value1, value2, "cargoint");
            return (Criteria) this;
        }

        public Criteria andPackageintIsNull() {
            addCriterion("PackageInt is null");
            return (Criteria) this;
        }

        public Criteria andPackageintIsNotNull() {
            addCriterion("PackageInt is not null");
            return (Criteria) this;
        }

        public Criteria andPackageintEqualTo(String value) {
            addCriterion("PackageInt =", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintNotEqualTo(String value) {
            addCriterion("PackageInt <>", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintGreaterThan(String value) {
            addCriterion("PackageInt >", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintGreaterThanOrEqualTo(String value) {
            addCriterion("PackageInt >=", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintLessThan(String value) {
            addCriterion("PackageInt <", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintLessThanOrEqualTo(String value) {
            addCriterion("PackageInt <=", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintLike(String value) {
            addCriterion("PackageInt like", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintNotLike(String value) {
            addCriterion("PackageInt not like", value, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintIn(List<String> values) {
            addCriterion("PackageInt in", values, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintNotIn(List<String> values) {
            addCriterion("PackageInt not in", values, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintBetween(String value1, String value2) {
            addCriterion("PackageInt between", value1, value2, "packageint");
            return (Criteria) this;
        }

        public Criteria andPackageintNotBetween(String value1, String value2) {
            addCriterion("PackageInt not between", value1, value2, "packageint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintIsNull() {
            addCriterion("HedgeAbnInt is null");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintIsNotNull() {
            addCriterion("HedgeAbnInt is not null");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintEqualTo(Integer value) {
            addCriterion("HedgeAbnInt =", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintNotEqualTo(Integer value) {
            addCriterion("HedgeAbnInt <>", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintGreaterThan(Integer value) {
            addCriterion("HedgeAbnInt >", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintGreaterThanOrEqualTo(Integer value) {
            addCriterion("HedgeAbnInt >=", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintLessThan(Integer value) {
            addCriterion("HedgeAbnInt <", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintLessThanOrEqualTo(Integer value) {
            addCriterion("HedgeAbnInt <=", value, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintIn(List<Integer> values) {
            addCriterion("HedgeAbnInt in", values, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintNotIn(List<Integer> values) {
            addCriterion("HedgeAbnInt not in", values, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintBetween(Integer value1, Integer value2) {
            addCriterion("HedgeAbnInt between", value1, value2, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andHedgeabnintNotBetween(Integer value1, Integer value2) {
            addCriterion("HedgeAbnInt not between", value1, value2, "hedgeabnint");
            return (Criteria) this;
        }

        public Criteria andAbostateIsNull() {
            addCriterion("AboState is null");
            return (Criteria) this;
        }

        public Criteria andAbostateIsNotNull() {
            addCriterion("AboState is not null");
            return (Criteria) this;
        }

        public Criteria andAbostateEqualTo(Boolean value) {
            addCriterion("AboState =", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateNotEqualTo(Boolean value) {
            addCriterion("AboState <>", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateGreaterThan(Boolean value) {
            addCriterion("AboState >", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AboState >=", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateLessThan(Boolean value) {
            addCriterion("AboState <", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateLessThanOrEqualTo(Boolean value) {
            addCriterion("AboState <=", value, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateIn(List<Boolean> values) {
            addCriterion("AboState in", values, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateNotIn(List<Boolean> values) {
            addCriterion("AboState not in", values, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateBetween(Boolean value1, Boolean value2) {
            addCriterion("AboState between", value1, value2, "abostate");
            return (Criteria) this;
        }

        public Criteria andAbostateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AboState not between", value1, value2, "abostate");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNull() {
            addCriterion("HandleDate is null");
            return (Criteria) this;
        }

        public Criteria andHandledateIsNotNull() {
            addCriterion("HandleDate is not null");
            return (Criteria) this;
        }

        public Criteria andHandledateEqualTo(Date value) {
            addCriterion("HandleDate =", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotEqualTo(Date value) {
            addCriterion("HandleDate <>", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThan(Date value) {
            addCriterion("HandleDate >", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateGreaterThanOrEqualTo(Date value) {
            addCriterion("HandleDate >=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThan(Date value) {
            addCriterion("HandleDate <", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateLessThanOrEqualTo(Date value) {
            addCriterion("HandleDate <=", value, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateIn(List<Date> values) {
            addCriterion("HandleDate in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotIn(List<Date> values) {
            addCriterion("HandleDate not in", values, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateBetween(Date value1, Date value2) {
            addCriterion("HandleDate between", value1, value2, "handledate");
            return (Criteria) this;
        }

        public Criteria andHandledateNotBetween(Date value1, Date value2) {
            addCriterion("HandleDate not between", value1, value2, "handledate");
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