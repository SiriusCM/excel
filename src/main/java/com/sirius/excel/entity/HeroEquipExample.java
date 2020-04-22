package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class HeroEquipExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroEquipExample() {
        oredCriteria = new ArrayList<>();
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

        protected void addCriterion(int column, String type, String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(column, type, condition));
        }

        protected void addCriterion(int column, String type, String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(column, type, condition, value));
        }

        protected void addCriterion(int column, String type, String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(column, type, condition, value1, value2));
        }

        public Criteria andSnIsNull() {
            addCriterion(0, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion(0, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(int value) {
            addCriterion(0, "int", "=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(int value) {
            addCriterion(0, "int", "<>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(int value) {
            addCriterion(0, "int", ">", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(int value) {
            addCriterion(0, "int", ">=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(int value) {
            addCriterion(0, "int", "<", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(int value) {
            addCriterion(0, "int", "<=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(int value) {
            addCriterion(0, "int", "like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(int value) {
            addCriterion(0, "int", "not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<Integer> values) {
            addCriterion(0, "int", "in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<Integer> values) {
            addCriterion(0, "int", "not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(int value1, int value2) {
            addCriterion(0, "int", "between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(int value1, int value2) {
            addCriterion(0, "int", "not between", value1, value2, "sn");
            return (Criteria) this;
        }
        public Criteria andNameSnIsNull() {
            addCriterion(2, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andNameSnIsNotNull() {
            addCriterion(2, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andNameSnEqualTo(String value) {
            addCriterion(2, "String", "=", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnNotEqualTo(String value) {
            addCriterion(2, "String", "<>", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnGreaterThan(String value) {
            addCriterion(2, "String", ">", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnGreaterThanOrEqualTo(String value) {
            addCriterion(2, "String", ">=", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnLessThan(String value) {
            addCriterion(2, "String", "<", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnLessThanOrEqualTo(String value) {
            addCriterion(2, "String", "<=", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnLike(String value) {
            addCriterion(2, "String", "like", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnNotLike(String value) {
            addCriterion(2, "String", "not like", value, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnIn(List<String> values) {
            addCriterion(2, "String", "in", values, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnNotIn(List<String> values) {
            addCriterion(2, "String", "not in", values, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnBetween(String value1, String value2) {
            addCriterion(2, "String", "between", value1, value2, "nameSn");
            return (Criteria) this;
        }

        public Criteria andNameSnNotBetween(String value1, String value2) {
            addCriterion(2, "String", "not between", value1, value2, "nameSn");
            return (Criteria) this;
        }
        public Criteria andBurstSkillIsNull() {
            addCriterion(9, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andBurstSkillIsNotNull() {
            addCriterion(9, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andBurstSkillEqualTo(int value) {
            addCriterion(9, "int", "=", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillNotEqualTo(int value) {
            addCriterion(9, "int", "<>", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillGreaterThan(int value) {
            addCriterion(9, "int", ">", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillGreaterThanOrEqualTo(int value) {
            addCriterion(9, "int", ">=", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillLessThan(int value) {
            addCriterion(9, "int", "<", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillLessThanOrEqualTo(int value) {
            addCriterion(9, "int", "<=", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillLike(int value) {
            addCriterion(9, "int", "like", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillNotLike(int value) {
            addCriterion(9, "int", "not like", value, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillIn(List<Integer> values) {
            addCriterion(9, "int", "in", values, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillNotIn(List<Integer> values) {
            addCriterion(9, "int", "not in", values, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillBetween(int value1, int value2) {
            addCriterion(9, "int", "between", value1, value2, "burstSkill");
            return (Criteria) this;
        }

        public Criteria andBurstSkillNotBetween(int value1, int value2) {
            addCriterion(9, "int", "not between", value1, value2, "burstSkill");
            return (Criteria) this;
        }
        public Criteria andIconIsNull() {
            addCriterion(10, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion(10, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion(10, "String", "=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion(10, "String", "<>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion(10, "String", ">", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion(10, "String", ">=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion(10, "String", "<", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion(10, "String", "<=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion(10, "String", "like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion(10, "String", "not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion(10, "String", "in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion(10, "String", "not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion(10, "String", "between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion(10, "String", "not between", value1, value2, "icon");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion(11, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion(11, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(int value) {
            addCriterion(11, "int", "=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(int value) {
            addCriterion(11, "int", "<>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(int value) {
            addCriterion(11, "int", ">", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(int value) {
            addCriterion(11, "int", ">=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(int value) {
            addCriterion(11, "int", "<", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(int value) {
            addCriterion(11, "int", "<=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(int value) {
            addCriterion(11, "int", "like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(int value) {
            addCriterion(11, "int", "not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion(11, "int", "in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion(11, "int", "not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(int value1, int value2) {
            addCriterion(11, "int", "between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(int value1, int value2) {
            addCriterion(11, "int", "not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andGradeIsNull() {
            addCriterion(12, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion(12, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(int value) {
            addCriterion(12, "int", "=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(int value) {
            addCriterion(12, "int", "<>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(int value) {
            addCriterion(12, "int", ">", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(int value) {
            addCriterion(12, "int", ">=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(int value) {
            addCriterion(12, "int", "<", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(int value) {
            addCriterion(12, "int", "<=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(int value) {
            addCriterion(12, "int", "like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(int value) {
            addCriterion(12, "int", "not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion(12, "int", "in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion(12, "int", "not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(int value1, int value2) {
            addCriterion(12, "int", "between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(int value1, int value2) {
            addCriterion(12, "int", "not between", value1, value2, "grade");
            return (Criteria) this;
        }
        public Criteria andProfessionIsNull() {
            addCriterion(13, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion(13, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(int value) {
            addCriterion(13, "int", "=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(int value) {
            addCriterion(13, "int", "<>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(int value) {
            addCriterion(13, "int", ">", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(int value) {
            addCriterion(13, "int", ">=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(int value) {
            addCriterion(13, "int", "<", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(int value) {
            addCriterion(13, "int", "<=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(int value) {
            addCriterion(13, "int", "like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(int value) {
            addCriterion(13, "int", "not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<Integer> values) {
            addCriterion(13, "int", "in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<Integer> values) {
            addCriterion(13, "int", "not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(int value1, int value2) {
            addCriterion(13, "int", "between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(int value1, int value2) {
            addCriterion(13, "int", "not between", value1, value2, "profession");
            return (Criteria) this;
        }
        public Criteria andFeatureIsNull() {
            addCriterion(14, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion(14, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(int[] value) {
            addCriterion(14, "int[]", "=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(int[] value) {
            addCriterion(14, "int[]", "<>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(int[] value) {
            addCriterion(14, "int[]", ">", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(int[] value) {
            addCriterion(14, "int[]", ">=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(int[] value) {
            addCriterion(14, "int[]", "<", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(int[] value) {
            addCriterion(14, "int[]", "<=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(int[] value) {
            addCriterion(14, "int[]", "like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(int[] value) {
            addCriterion(14, "int[]", "not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<Integer[]> values) {
            addCriterion(14, "int[]", "in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<Integer[]> values) {
            addCriterion(14, "int[]", "not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(int[] value1, int[] value2) {
            addCriterion(14, "int[]", "between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(int[] value1, int[] value2) {
            addCriterion(14, "int[]", "not between", value1, value2, "feature");
            return (Criteria) this;
        }
        public Criteria andMixItemIsNull() {
            addCriterion(15, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andMixItemIsNotNull() {
            addCriterion(15, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andMixItemEqualTo(int[] value) {
            addCriterion(15, "int[]", "=", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemNotEqualTo(int[] value) {
            addCriterion(15, "int[]", "<>", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemGreaterThan(int[] value) {
            addCriterion(15, "int[]", ">", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemGreaterThanOrEqualTo(int[] value) {
            addCriterion(15, "int[]", ">=", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemLessThan(int[] value) {
            addCriterion(15, "int[]", "<", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemLessThanOrEqualTo(int[] value) {
            addCriterion(15, "int[]", "<=", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemLike(int[] value) {
            addCriterion(15, "int[]", "like", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemNotLike(int[] value) {
            addCriterion(15, "int[]", "not like", value, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemIn(List<Integer[]> values) {
            addCriterion(15, "int[]", "in", values, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemNotIn(List<Integer[]> values) {
            addCriterion(15, "int[]", "not in", values, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemBetween(int[] value1, int[] value2) {
            addCriterion(15, "int[]", "between", value1, value2, "mixItem");
            return (Criteria) this;
        }

        public Criteria andMixItemNotBetween(int[] value1, int[] value2) {
            addCriterion(15, "int[]", "not between", value1, value2, "mixItem");
            return (Criteria) this;
        }
        public Criteria andMixNumIsNull() {
            addCriterion(16, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andMixNumIsNotNull() {
            addCriterion(16, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andMixNumEqualTo(int[] value) {
            addCriterion(16, "int[]", "=", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumNotEqualTo(int[] value) {
            addCriterion(16, "int[]", "<>", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumGreaterThan(int[] value) {
            addCriterion(16, "int[]", ">", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumGreaterThanOrEqualTo(int[] value) {
            addCriterion(16, "int[]", ">=", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumLessThan(int[] value) {
            addCriterion(16, "int[]", "<", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumLessThanOrEqualTo(int[] value) {
            addCriterion(16, "int[]", "<=", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumLike(int[] value) {
            addCriterion(16, "int[]", "like", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumNotLike(int[] value) {
            addCriterion(16, "int[]", "not like", value, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumIn(List<Integer[]> values) {
            addCriterion(16, "int[]", "in", values, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumNotIn(List<Integer[]> values) {
            addCriterion(16, "int[]", "not in", values, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumBetween(int[] value1, int[] value2) {
            addCriterion(16, "int[]", "between", value1, value2, "mixNum");
            return (Criteria) this;
        }

        public Criteria andMixNumNotBetween(int[] value1, int[] value2) {
            addCriterion(16, "int[]", "not between", value1, value2, "mixNum");
            return (Criteria) this;
        }
        public Criteria andLevelIsNull() {
            addCriterion(17, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion(17, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(int value) {
            addCriterion(17, "int", "=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(int value) {
            addCriterion(17, "int", "<>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(int value) {
            addCriterion(17, "int", ">", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(int value) {
            addCriterion(17, "int", ">=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(int value) {
            addCriterion(17, "int", "<", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(int value) {
            addCriterion(17, "int", "<=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(int value) {
            addCriterion(17, "int", "like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(int value) {
            addCriterion(17, "int", "not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion(17, "int", "in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion(17, "int", "not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(int value1, int value2) {
            addCriterion(17, "int", "between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(int value1, int value2) {
            addCriterion(17, "int", "not between", value1, value2, "level");
            return (Criteria) this;
        }
        public Criteria andProp1IsNull() {
            addCriterion(18, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion(18, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(int value) {
            addCriterion(18, "int", "=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(int value) {
            addCriterion(18, "int", "<>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(int value) {
            addCriterion(18, "int", ">", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(int value) {
            addCriterion(18, "int", ">=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(int value) {
            addCriterion(18, "int", "<", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(int value) {
            addCriterion(18, "int", "<=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(int value) {
            addCriterion(18, "int", "like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(int value) {
            addCriterion(18, "int", "not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<Integer> values) {
            addCriterion(18, "int", "in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<Integer> values) {
            addCriterion(18, "int", "not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(int value1, int value2) {
            addCriterion(18, "int", "between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(int value1, int value2) {
            addCriterion(18, "int", "not between", value1, value2, "prop1");
            return (Criteria) this;
        }
        public Criteria andValue1IsNull() {
            addCriterion(19, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion(19, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(int value) {
            addCriterion(19, "int", "=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(int value) {
            addCriterion(19, "int", "<>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(int value) {
            addCriterion(19, "int", ">", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(int value) {
            addCriterion(19, "int", ">=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(int value) {
            addCriterion(19, "int", "<", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(int value) {
            addCriterion(19, "int", "<=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(int value) {
            addCriterion(19, "int", "like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(int value) {
            addCriterion(19, "int", "not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<Integer> values) {
            addCriterion(19, "int", "in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<Integer> values) {
            addCriterion(19, "int", "not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(int value1, int value2) {
            addCriterion(19, "int", "between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(int value1, int value2) {
            addCriterion(19, "int", "not between", value1, value2, "value1");
            return (Criteria) this;
        }
        public Criteria andProp2IsNull() {
            addCriterion(20, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion(20, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(int value) {
            addCriterion(20, "int", "=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(int value) {
            addCriterion(20, "int", "<>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(int value) {
            addCriterion(20, "int", ">", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(int value) {
            addCriterion(20, "int", ">=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(int value) {
            addCriterion(20, "int", "<", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(int value) {
            addCriterion(20, "int", "<=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(int value) {
            addCriterion(20, "int", "like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(int value) {
            addCriterion(20, "int", "not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<Integer> values) {
            addCriterion(20, "int", "in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<Integer> values) {
            addCriterion(20, "int", "not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(int value1, int value2) {
            addCriterion(20, "int", "between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(int value1, int value2) {
            addCriterion(20, "int", "not between", value1, value2, "prop2");
            return (Criteria) this;
        }
        public Criteria andValue2IsNull() {
            addCriterion(21, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion(21, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(int value) {
            addCriterion(21, "int", "=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(int value) {
            addCriterion(21, "int", "<>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(int value) {
            addCriterion(21, "int", ">", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(int value) {
            addCriterion(21, "int", ">=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(int value) {
            addCriterion(21, "int", "<", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(int value) {
            addCriterion(21, "int", "<=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(int value) {
            addCriterion(21, "int", "like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(int value) {
            addCriterion(21, "int", "not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<Integer> values) {
            addCriterion(21, "int", "in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<Integer> values) {
            addCriterion(21, "int", "not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(int value1, int value2) {
            addCriterion(21, "int", "between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(int value1, int value2) {
            addCriterion(21, "int", "not between", value1, value2, "value2");
            return (Criteria) this;
        }
        public Criteria andProp3IsNull() {
            addCriterion(22, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp3IsNotNull() {
            addCriterion(22, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp3EqualTo(int value) {
            addCriterion(22, "int", "=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotEqualTo(int value) {
            addCriterion(22, "int", "<>", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThan(int value) {
            addCriterion(22, "int", ">", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThanOrEqualTo(int value) {
            addCriterion(22, "int", ">=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThan(int value) {
            addCriterion(22, "int", "<", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThanOrEqualTo(int value) {
            addCriterion(22, "int", "<=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Like(int value) {
            addCriterion(22, "int", "like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotLike(int value) {
            addCriterion(22, "int", "not like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3In(List<Integer> values) {
            addCriterion(22, "int", "in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotIn(List<Integer> values) {
            addCriterion(22, "int", "not in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Between(int value1, int value2) {
            addCriterion(22, "int", "between", value1, value2, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotBetween(int value1, int value2) {
            addCriterion(22, "int", "not between", value1, value2, "prop3");
            return (Criteria) this;
        }
        public Criteria andValue3IsNull() {
            addCriterion(23, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue3IsNotNull() {
            addCriterion(23, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue3EqualTo(int value) {
            addCriterion(23, "int", "=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotEqualTo(int value) {
            addCriterion(23, "int", "<>", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThan(int value) {
            addCriterion(23, "int", ">", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThanOrEqualTo(int value) {
            addCriterion(23, "int", ">=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThan(int value) {
            addCriterion(23, "int", "<", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThanOrEqualTo(int value) {
            addCriterion(23, "int", "<=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Like(int value) {
            addCriterion(23, "int", "like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotLike(int value) {
            addCriterion(23, "int", "not like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3In(List<Integer> values) {
            addCriterion(23, "int", "in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotIn(List<Integer> values) {
            addCriterion(23, "int", "not in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Between(int value1, int value2) {
            addCriterion(23, "int", "between", value1, value2, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotBetween(int value1, int value2) {
            addCriterion(23, "int", "not between", value1, value2, "value3");
            return (Criteria) this;
        }
        public Criteria andProp4IsNull() {
            addCriterion(24, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp4IsNotNull() {
            addCriterion(24, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp4EqualTo(int value) {
            addCriterion(24, "int", "=", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotEqualTo(int value) {
            addCriterion(24, "int", "<>", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4GreaterThan(int value) {
            addCriterion(24, "int", ">", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4GreaterThanOrEqualTo(int value) {
            addCriterion(24, "int", ">=", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4LessThan(int value) {
            addCriterion(24, "int", "<", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4LessThanOrEqualTo(int value) {
            addCriterion(24, "int", "<=", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4Like(int value) {
            addCriterion(24, "int", "like", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotLike(int value) {
            addCriterion(24, "int", "not like", value, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4In(List<Integer> values) {
            addCriterion(24, "int", "in", values, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotIn(List<Integer> values) {
            addCriterion(24, "int", "not in", values, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4Between(int value1, int value2) {
            addCriterion(24, "int", "between", value1, value2, "Prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotBetween(int value1, int value2) {
            addCriterion(24, "int", "not between", value1, value2, "Prop4");
            return (Criteria) this;
        }
        public Criteria andValue4IsNull() {
            addCriterion(25, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue4IsNotNull() {
            addCriterion(25, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue4EqualTo(int value) {
            addCriterion(25, "int", "=", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotEqualTo(int value) {
            addCriterion(25, "int", "<>", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4GreaterThan(int value) {
            addCriterion(25, "int", ">", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4GreaterThanOrEqualTo(int value) {
            addCriterion(25, "int", ">=", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4LessThan(int value) {
            addCriterion(25, "int", "<", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4LessThanOrEqualTo(int value) {
            addCriterion(25, "int", "<=", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4Like(int value) {
            addCriterion(25, "int", "like", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotLike(int value) {
            addCriterion(25, "int", "not like", value, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4In(List<Integer> values) {
            addCriterion(25, "int", "in", values, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotIn(List<Integer> values) {
            addCriterion(25, "int", "not in", values, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4Between(int value1, int value2) {
            addCriterion(25, "int", "between", value1, value2, "Value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotBetween(int value1, int value2) {
            addCriterion(25, "int", "not between", value1, value2, "Value4");
            return (Criteria) this;
        }
        public Criteria andProp5IsNull() {
            addCriterion(26, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp5IsNotNull() {
            addCriterion(26, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp5EqualTo(int value) {
            addCriterion(26, "int", "=", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotEqualTo(int value) {
            addCriterion(26, "int", "<>", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5GreaterThan(int value) {
            addCriterion(26, "int", ">", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5GreaterThanOrEqualTo(int value) {
            addCriterion(26, "int", ">=", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5LessThan(int value) {
            addCriterion(26, "int", "<", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5LessThanOrEqualTo(int value) {
            addCriterion(26, "int", "<=", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5Like(int value) {
            addCriterion(26, "int", "like", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotLike(int value) {
            addCriterion(26, "int", "not like", value, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5In(List<Integer> values) {
            addCriterion(26, "int", "in", values, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotIn(List<Integer> values) {
            addCriterion(26, "int", "not in", values, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5Between(int value1, int value2) {
            addCriterion(26, "int", "between", value1, value2, "Prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotBetween(int value1, int value2) {
            addCriterion(26, "int", "not between", value1, value2, "Prop5");
            return (Criteria) this;
        }
        public Criteria andValue5IsNull() {
            addCriterion(27, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue5IsNotNull() {
            addCriterion(27, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue5EqualTo(int value) {
            addCriterion(27, "int", "=", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotEqualTo(int value) {
            addCriterion(27, "int", "<>", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5GreaterThan(int value) {
            addCriterion(27, "int", ">", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5GreaterThanOrEqualTo(int value) {
            addCriterion(27, "int", ">=", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5LessThan(int value) {
            addCriterion(27, "int", "<", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5LessThanOrEqualTo(int value) {
            addCriterion(27, "int", "<=", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5Like(int value) {
            addCriterion(27, "int", "like", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotLike(int value) {
            addCriterion(27, "int", "not like", value, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5In(List<Integer> values) {
            addCriterion(27, "int", "in", values, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotIn(List<Integer> values) {
            addCriterion(27, "int", "not in", values, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5Between(int value1, int value2) {
            addCriterion(27, "int", "between", value1, value2, "Value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotBetween(int value1, int value2) {
            addCriterion(27, "int", "not between", value1, value2, "Value5");
            return (Criteria) this;
        }
        public Criteria andProp6IsNull() {
            addCriterion(28, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp6IsNotNull() {
            addCriterion(28, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp6EqualTo(int value) {
            addCriterion(28, "int", "=", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotEqualTo(int value) {
            addCriterion(28, "int", "<>", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6GreaterThan(int value) {
            addCriterion(28, "int", ">", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6GreaterThanOrEqualTo(int value) {
            addCriterion(28, "int", ">=", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6LessThan(int value) {
            addCriterion(28, "int", "<", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6LessThanOrEqualTo(int value) {
            addCriterion(28, "int", "<=", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6Like(int value) {
            addCriterion(28, "int", "like", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotLike(int value) {
            addCriterion(28, "int", "not like", value, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6In(List<Integer> values) {
            addCriterion(28, "int", "in", values, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotIn(List<Integer> values) {
            addCriterion(28, "int", "not in", values, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6Between(int value1, int value2) {
            addCriterion(28, "int", "between", value1, value2, "Prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotBetween(int value1, int value2) {
            addCriterion(28, "int", "not between", value1, value2, "Prop6");
            return (Criteria) this;
        }
        public Criteria andValue6IsNull() {
            addCriterion(29, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue6IsNotNull() {
            addCriterion(29, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue6EqualTo(int value) {
            addCriterion(29, "int", "=", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotEqualTo(int value) {
            addCriterion(29, "int", "<>", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6GreaterThan(int value) {
            addCriterion(29, "int", ">", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6GreaterThanOrEqualTo(int value) {
            addCriterion(29, "int", ">=", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6LessThan(int value) {
            addCriterion(29, "int", "<", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6LessThanOrEqualTo(int value) {
            addCriterion(29, "int", "<=", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6Like(int value) {
            addCriterion(29, "int", "like", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotLike(int value) {
            addCriterion(29, "int", "not like", value, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6In(List<Integer> values) {
            addCriterion(29, "int", "in", values, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotIn(List<Integer> values) {
            addCriterion(29, "int", "not in", values, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6Between(int value1, int value2) {
            addCriterion(29, "int", "between", value1, value2, "Value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotBetween(int value1, int value2) {
            addCriterion(29, "int", "not between", value1, value2, "Value6");
            return (Criteria) this;
        }
        public Criteria andAttriGroupIsNull() {
            addCriterion(30, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andAttriGroupIsNotNull() {
            addCriterion(30, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andAttriGroupEqualTo(int[] value) {
            addCriterion(30, "int[]", "=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotEqualTo(int[] value) {
            addCriterion(30, "int[]", "<>", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupGreaterThan(int[] value) {
            addCriterion(30, "int[]", ">", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupGreaterThanOrEqualTo(int[] value) {
            addCriterion(30, "int[]", ">=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLessThan(int[] value) {
            addCriterion(30, "int[]", "<", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLessThanOrEqualTo(int[] value) {
            addCriterion(30, "int[]", "<=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLike(int[] value) {
            addCriterion(30, "int[]", "like", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotLike(int[] value) {
            addCriterion(30, "int[]", "not like", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupIn(List<Integer[]> values) {
            addCriterion(30, "int[]", "in", values, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotIn(List<Integer[]> values) {
            addCriterion(30, "int[]", "not in", values, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupBetween(int[] value1, int[] value2) {
            addCriterion(30, "int[]", "between", value1, value2, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotBetween(int[] value1, int[] value2) {
            addCriterion(30, "int[]", "not between", value1, value2, "attriGroup");
            return (Criteria) this;
        }
        public Criteria andLocSkillListIsNull() {
            addCriterion(31, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andLocSkillListIsNotNull() {
            addCriterion(31, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andLocSkillListEqualTo(int[] value) {
            addCriterion(31, "int[]", "=", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListNotEqualTo(int[] value) {
            addCriterion(31, "int[]", "<>", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListGreaterThan(int[] value) {
            addCriterion(31, "int[]", ">", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListGreaterThanOrEqualTo(int[] value) {
            addCriterion(31, "int[]", ">=", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListLessThan(int[] value) {
            addCriterion(31, "int[]", "<", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListLessThanOrEqualTo(int[] value) {
            addCriterion(31, "int[]", "<=", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListLike(int[] value) {
            addCriterion(31, "int[]", "like", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListNotLike(int[] value) {
            addCriterion(31, "int[]", "not like", value, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListIn(List<Integer[]> values) {
            addCriterion(31, "int[]", "in", values, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListNotIn(List<Integer[]> values) {
            addCriterion(31, "int[]", "not in", values, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListBetween(int[] value1, int[] value2) {
            addCriterion(31, "int[]", "between", value1, value2, "locSkillList");
            return (Criteria) this;
        }

        public Criteria andLocSkillListNotBetween(int[] value1, int[] value2) {
            addCriterion(31, "int[]", "not between", value1, value2, "locSkillList");
            return (Criteria) this;
        }
        public Criteria andAngerSkillListIsNull() {
            addCriterion(32, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListIsNotNull() {
            addCriterion(32, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListEqualTo(int[] value) {
            addCriterion(32, "int[]", "=", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListNotEqualTo(int[] value) {
            addCriterion(32, "int[]", "<>", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListGreaterThan(int[] value) {
            addCriterion(32, "int[]", ">", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListGreaterThanOrEqualTo(int[] value) {
            addCriterion(32, "int[]", ">=", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListLessThan(int[] value) {
            addCriterion(32, "int[]", "<", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListLessThanOrEqualTo(int[] value) {
            addCriterion(32, "int[]", "<=", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListLike(int[] value) {
            addCriterion(32, "int[]", "like", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListNotLike(int[] value) {
            addCriterion(32, "int[]", "not like", value, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListIn(List<Integer[]> values) {
            addCriterion(32, "int[]", "in", values, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListNotIn(List<Integer[]> values) {
            addCriterion(32, "int[]", "not in", values, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListBetween(int[] value1, int[] value2) {
            addCriterion(32, "int[]", "between", value1, value2, "angerSkillList");
            return (Criteria) this;
        }

        public Criteria andAngerSkillListNotBetween(int[] value1, int[] value2) {
            addCriterion(32, "int[]", "not between", value1, value2, "angerSkillList");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}