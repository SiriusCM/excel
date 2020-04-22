package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class ItemExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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
        public Criteria andDescIsNull() {
            addCriterion(1, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion(1, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion(1, "String", "=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion(1, "String", "<>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion(1, "String", ">", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion(1, "String", ">=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion(1, "String", "<", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion(1, "String", "<=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion(1, "String", "like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion(1, "String", "not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion(1, "String", "in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion(1, "String", "not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion(1, "String", "between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion(1, "String", "not between", value1, value2, "desc");
            return (Criteria) this;
        }
        public Criteria andIconIsNull() {
            addCriterion(6, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion(6, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion(6, "String", "=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion(6, "String", "<>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion(6, "String", ">", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion(6, "String", ">=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion(6, "String", "<", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion(6, "String", "<=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion(6, "String", "like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion(6, "String", "not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion(6, "String", "in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion(6, "String", "not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion(6, "String", "between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion(6, "String", "not between", value1, value2, "icon");
            return (Criteria) this;
        }
        public Criteria andGradeIsNull() {
            addCriterion(7, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion(7, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(int value) {
            addCriterion(7, "int", "=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(int value) {
            addCriterion(7, "int", "<>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(int value) {
            addCriterion(7, "int", ">", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(int value) {
            addCriterion(7, "int", ">=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(int value) {
            addCriterion(7, "int", "<", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(int value) {
            addCriterion(7, "int", "<=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(int value) {
            addCriterion(7, "int", "like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(int value) {
            addCriterion(7, "int", "not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion(7, "int", "in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion(7, "int", "not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(int value1, int value2) {
            addCriterion(7, "int", "between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(int value1, int value2) {
            addCriterion(7, "int", "not between", value1, value2, "grade");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion(8, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion(8, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(int value) {
            addCriterion(8, "int", "=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(int value) {
            addCriterion(8, "int", "<>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(int value) {
            addCriterion(8, "int", ">", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(int value) {
            addCriterion(8, "int", ">=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(int value) {
            addCriterion(8, "int", "<", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(int value) {
            addCriterion(8, "int", "<=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(int value) {
            addCriterion(8, "int", "like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(int value) {
            addCriterion(8, "int", "not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion(8, "int", "in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion(8, "int", "not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(int value1, int value2) {
            addCriterion(8, "int", "between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(int value1, int value2) {
            addCriterion(8, "int", "not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andBagTypeIsNull() {
            addCriterion(9, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andBagTypeIsNotNull() {
            addCriterion(9, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andBagTypeEqualTo(int value) {
            addCriterion(9, "int", "=", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeNotEqualTo(int value) {
            addCriterion(9, "int", "<>", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeGreaterThan(int value) {
            addCriterion(9, "int", ">", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeGreaterThanOrEqualTo(int value) {
            addCriterion(9, "int", ">=", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeLessThan(int value) {
            addCriterion(9, "int", "<", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeLessThanOrEqualTo(int value) {
            addCriterion(9, "int", "<=", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeLike(int value) {
            addCriterion(9, "int", "like", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeNotLike(int value) {
            addCriterion(9, "int", "not like", value, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeIn(List<Integer> values) {
            addCriterion(9, "int", "in", values, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeNotIn(List<Integer> values) {
            addCriterion(9, "int", "not in", values, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeBetween(int value1, int value2) {
            addCriterion(9, "int", "between", value1, value2, "bagType");
            return (Criteria) this;
        }

        public Criteria andBagTypeNotBetween(int value1, int value2) {
            addCriterion(9, "int", "not between", value1, value2, "bagType");
            return (Criteria) this;
        }
        public Criteria andSubTypeIsNull() {
            addCriterion(10, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion(10, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(int value) {
            addCriterion(10, "int", "=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(int value) {
            addCriterion(10, "int", "<>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(int value) {
            addCriterion(10, "int", ">", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(int value) {
            addCriterion(10, "int", ">=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(int value) {
            addCriterion(10, "int", "<", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(int value) {
            addCriterion(10, "int", "<=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLike(int value) {
            addCriterion(10, "int", "like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotLike(int value) {
            addCriterion(10, "int", "not like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<Integer> values) {
            addCriterion(10, "int", "in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<Integer> values) {
            addCriterion(10, "int", "not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(int value1, int value2) {
            addCriterion(10, "int", "between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(int value1, int value2) {
            addCriterion(10, "int", "not between", value1, value2, "subType");
            return (Criteria) this;
        }
        public Criteria andPosIsNull() {
            addCriterion(11, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andPosIsNotNull() {
            addCriterion(11, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andPosEqualTo(int value) {
            addCriterion(11, "int", "=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotEqualTo(int value) {
            addCriterion(11, "int", "<>", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThan(int value) {
            addCriterion(11, "int", ">", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThanOrEqualTo(int value) {
            addCriterion(11, "int", ">=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThan(int value) {
            addCriterion(11, "int", "<", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThanOrEqualTo(int value) {
            addCriterion(11, "int", "<=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLike(int value) {
            addCriterion(11, "int", "like", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotLike(int value) {
            addCriterion(11, "int", "not like", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosIn(List<Integer> values) {
            addCriterion(11, "int", "in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotIn(List<Integer> values) {
            addCriterion(11, "int", "not in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosBetween(int value1, int value2) {
            addCriterion(11, "int", "between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotBetween(int value1, int value2) {
            addCriterion(11, "int", "not between", value1, value2, "pos");
            return (Criteria) this;
        }
        public Criteria andLevelIsNull() {
            addCriterion(12, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion(12, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(int value) {
            addCriterion(12, "int", "=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(int value) {
            addCriterion(12, "int", "<>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(int value) {
            addCriterion(12, "int", ">", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(int value) {
            addCriterion(12, "int", ">=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(int value) {
            addCriterion(12, "int", "<", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(int value) {
            addCriterion(12, "int", "<=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(int value) {
            addCriterion(12, "int", "like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(int value) {
            addCriterion(12, "int", "not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion(12, "int", "in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion(12, "int", "not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(int value1, int value2) {
            addCriterion(12, "int", "between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(int value1, int value2) {
            addCriterion(12, "int", "not between", value1, value2, "level");
            return (Criteria) this;
        }
        public Criteria andStackLimitIsNull() {
            addCriterion(13, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andStackLimitIsNotNull() {
            addCriterion(13, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andStackLimitEqualTo(int value) {
            addCriterion(13, "int", "=", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitNotEqualTo(int value) {
            addCriterion(13, "int", "<>", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitGreaterThan(int value) {
            addCriterion(13, "int", ">", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitGreaterThanOrEqualTo(int value) {
            addCriterion(13, "int", ">=", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitLessThan(int value) {
            addCriterion(13, "int", "<", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitLessThanOrEqualTo(int value) {
            addCriterion(13, "int", "<=", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitLike(int value) {
            addCriterion(13, "int", "like", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitNotLike(int value) {
            addCriterion(13, "int", "not like", value, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitIn(List<Integer> values) {
            addCriterion(13, "int", "in", values, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitNotIn(List<Integer> values) {
            addCriterion(13, "int", "not in", values, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitBetween(int value1, int value2) {
            addCriterion(13, "int", "between", value1, value2, "stackLimit");
            return (Criteria) this;
        }

        public Criteria andStackLimitNotBetween(int value1, int value2) {
            addCriterion(13, "int", "not between", value1, value2, "stackLimit");
            return (Criteria) this;
        }
        public Criteria andSellGoldIsNull() {
            addCriterion(14, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSellGoldIsNotNull() {
            addCriterion(14, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSellGoldEqualTo(int value) {
            addCriterion(14, "int", "=", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldNotEqualTo(int value) {
            addCriterion(14, "int", "<>", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldGreaterThan(int value) {
            addCriterion(14, "int", ">", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldGreaterThanOrEqualTo(int value) {
            addCriterion(14, "int", ">=", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldLessThan(int value) {
            addCriterion(14, "int", "<", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldLessThanOrEqualTo(int value) {
            addCriterion(14, "int", "<=", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldLike(int value) {
            addCriterion(14, "int", "like", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldNotLike(int value) {
            addCriterion(14, "int", "not like", value, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldIn(List<Integer> values) {
            addCriterion(14, "int", "in", values, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldNotIn(List<Integer> values) {
            addCriterion(14, "int", "not in", values, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldBetween(int value1, int value2) {
            addCriterion(14, "int", "between", value1, value2, "sellGold");
            return (Criteria) this;
        }

        public Criteria andSellGoldNotBetween(int value1, int value2) {
            addCriterion(14, "int", "not between", value1, value2, "sellGold");
            return (Criteria) this;
        }
        public Criteria andOutputIsNull() {
            addCriterion(15, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andOutputIsNotNull() {
            addCriterion(15, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andOutputEqualTo(String value) {
            addCriterion(15, "String", "=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotEqualTo(String value) {
            addCriterion(15, "String", "<>", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThan(String value) {
            addCriterion(15, "String", ">", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThanOrEqualTo(String value) {
            addCriterion(15, "String", ">=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThan(String value) {
            addCriterion(15, "String", "<", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThanOrEqualTo(String value) {
            addCriterion(15, "String", "<=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLike(String value) {
            addCriterion(15, "String", "like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotLike(String value) {
            addCriterion(15, "String", "not like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputIn(List<String> values) {
            addCriterion(15, "String", "in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotIn(List<String> values) {
            addCriterion(15, "String", "not in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputBetween(String value1, String value2) {
            addCriterion(15, "String", "between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotBetween(String value1, String value2) {
            addCriterion(15, "String", "not between", value1, value2, "output");
            return (Criteria) this;
        }
        public Criteria andProp1IsNull() {
            addCriterion(16, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion(16, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(int value) {
            addCriterion(16, "int", "=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(int value) {
            addCriterion(16, "int", "<>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(int value) {
            addCriterion(16, "int", ">", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(int value) {
            addCriterion(16, "int", ">=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(int value) {
            addCriterion(16, "int", "<", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(int value) {
            addCriterion(16, "int", "<=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(int value) {
            addCriterion(16, "int", "like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(int value) {
            addCriterion(16, "int", "not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<Integer> values) {
            addCriterion(16, "int", "in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<Integer> values) {
            addCriterion(16, "int", "not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(int value1, int value2) {
            addCriterion(16, "int", "between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(int value1, int value2) {
            addCriterion(16, "int", "not between", value1, value2, "prop1");
            return (Criteria) this;
        }
        public Criteria andValue1IsNull() {
            addCriterion(17, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion(17, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(int value) {
            addCriterion(17, "int", "=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(int value) {
            addCriterion(17, "int", "<>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(int value) {
            addCriterion(17, "int", ">", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(int value) {
            addCriterion(17, "int", ">=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(int value) {
            addCriterion(17, "int", "<", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(int value) {
            addCriterion(17, "int", "<=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(int value) {
            addCriterion(17, "int", "like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(int value) {
            addCriterion(17, "int", "not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<Integer> values) {
            addCriterion(17, "int", "in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<Integer> values) {
            addCriterion(17, "int", "not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(int value1, int value2) {
            addCriterion(17, "int", "between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(int value1, int value2) {
            addCriterion(17, "int", "not between", value1, value2, "value1");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue1IsNull() {
            addCriterion(18, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1IsNotNull() {
            addCriterion(18, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1EqualTo(int value) {
            addCriterion(18, "int", "=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotEqualTo(int value) {
            addCriterion(18, "int", "<>", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1GreaterThan(int value) {
            addCriterion(18, "int", ">", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1GreaterThanOrEqualTo(int value) {
            addCriterion(18, "int", ">=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1LessThan(int value) {
            addCriterion(18, "int", "<", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1LessThanOrEqualTo(int value) {
            addCriterion(18, "int", "<=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1Like(int value) {
            addCriterion(18, "int", "like", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotLike(int value) {
            addCriterion(18, "int", "not like", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1In(List<Integer> values) {
            addCriterion(18, "int", "in", values, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotIn(List<Integer> values) {
            addCriterion(18, "int", "not in", values, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1Between(int value1, int value2) {
            addCriterion(18, "int", "between", value1, value2, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotBetween(int value1, int value2) {
            addCriterion(18, "int", "not between", value1, value2, "upgradeValue1");
            return (Criteria) this;
        }
        public Criteria andProp2IsNull() {
            addCriterion(19, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion(19, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(int value) {
            addCriterion(19, "int", "=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(int value) {
            addCriterion(19, "int", "<>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(int value) {
            addCriterion(19, "int", ">", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(int value) {
            addCriterion(19, "int", ">=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(int value) {
            addCriterion(19, "int", "<", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(int value) {
            addCriterion(19, "int", "<=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(int value) {
            addCriterion(19, "int", "like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(int value) {
            addCriterion(19, "int", "not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<Integer> values) {
            addCriterion(19, "int", "in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<Integer> values) {
            addCriterion(19, "int", "not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(int value1, int value2) {
            addCriterion(19, "int", "between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(int value1, int value2) {
            addCriterion(19, "int", "not between", value1, value2, "prop2");
            return (Criteria) this;
        }
        public Criteria andValue2IsNull() {
            addCriterion(20, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion(20, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(int value) {
            addCriterion(20, "int", "=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(int value) {
            addCriterion(20, "int", "<>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(int value) {
            addCriterion(20, "int", ">", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(int value) {
            addCriterion(20, "int", ">=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(int value) {
            addCriterion(20, "int", "<", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(int value) {
            addCriterion(20, "int", "<=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(int value) {
            addCriterion(20, "int", "like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(int value) {
            addCriterion(20, "int", "not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<Integer> values) {
            addCriterion(20, "int", "in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<Integer> values) {
            addCriterion(20, "int", "not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(int value1, int value2) {
            addCriterion(20, "int", "between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(int value1, int value2) {
            addCriterion(20, "int", "not between", value1, value2, "value2");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue2IsNull() {
            addCriterion(21, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2IsNotNull() {
            addCriterion(21, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2EqualTo(int value) {
            addCriterion(21, "int", "=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotEqualTo(int value) {
            addCriterion(21, "int", "<>", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2GreaterThan(int value) {
            addCriterion(21, "int", ">", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2GreaterThanOrEqualTo(int value) {
            addCriterion(21, "int", ">=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2LessThan(int value) {
            addCriterion(21, "int", "<", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2LessThanOrEqualTo(int value) {
            addCriterion(21, "int", "<=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2Like(int value) {
            addCriterion(21, "int", "like", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotLike(int value) {
            addCriterion(21, "int", "not like", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2In(List<Integer> values) {
            addCriterion(21, "int", "in", values, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotIn(List<Integer> values) {
            addCriterion(21, "int", "not in", values, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2Between(int value1, int value2) {
            addCriterion(21, "int", "between", value1, value2, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotBetween(int value1, int value2) {
            addCriterion(21, "int", "not between", value1, value2, "upgradeValue2");
            return (Criteria) this;
        }
        public Criteria andIsUseIsNull() {
            addCriterion(22, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion(22, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(int value) {
            addCriterion(22, "int", "=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(int value) {
            addCriterion(22, "int", "<>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(int value) {
            addCriterion(22, "int", ">", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(int value) {
            addCriterion(22, "int", ">=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(int value) {
            addCriterion(22, "int", "<", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(int value) {
            addCriterion(22, "int", "<=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLike(int value) {
            addCriterion(22, "int", "like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotLike(int value) {
            addCriterion(22, "int", "not like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion(22, "int", "in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion(22, "int", "not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(int value1, int value2) {
            addCriterion(22, "int", "between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(int value1, int value2) {
            addCriterion(22, "int", "not between", value1, value2, "isUse");
            return (Criteria) this;
        }
        public Criteria andUseIsNull() {
            addCriterion(23, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion(23, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(int value) {
            addCriterion(23, "int", "=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(int value) {
            addCriterion(23, "int", "<>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(int value) {
            addCriterion(23, "int", ">", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(int value) {
            addCriterion(23, "int", ">=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(int value) {
            addCriterion(23, "int", "<", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(int value) {
            addCriterion(23, "int", "<=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLike(int value) {
            addCriterion(23, "int", "like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotLike(int value) {
            addCriterion(23, "int", "not like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<Integer> values) {
            addCriterion(23, "int", "in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<Integer> values) {
            addCriterion(23, "int", "not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(int value1, int value2) {
            addCriterion(23, "int", "between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(int value1, int value2) {
            addCriterion(23, "int", "not between", value1, value2, "use");
            return (Criteria) this;
        }
        public Criteria andUseValueIsNull() {
            addCriterion(24, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUseValueIsNotNull() {
            addCriterion(24, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUseValueEqualTo(int value) {
            addCriterion(24, "int", "=", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueNotEqualTo(int value) {
            addCriterion(24, "int", "<>", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueGreaterThan(int value) {
            addCriterion(24, "int", ">", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueGreaterThanOrEqualTo(int value) {
            addCriterion(24, "int", ">=", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueLessThan(int value) {
            addCriterion(24, "int", "<", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueLessThanOrEqualTo(int value) {
            addCriterion(24, "int", "<=", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueLike(int value) {
            addCriterion(24, "int", "like", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueNotLike(int value) {
            addCriterion(24, "int", "not like", value, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueIn(List<Integer> values) {
            addCriterion(24, "int", "in", values, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueNotIn(List<Integer> values) {
            addCriterion(24, "int", "not in", values, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueBetween(int value1, int value2) {
            addCriterion(24, "int", "between", value1, value2, "useValue");
            return (Criteria) this;
        }

        public Criteria andUseValueNotBetween(int value1, int value2) {
            addCriterion(24, "int", "not between", value1, value2, "useValue");
            return (Criteria) this;
        }
        public Criteria andAutoUseIsNull() {
            addCriterion(25, "boolean", "is null");
            return (Criteria) this;
        }

        public Criteria andAutoUseIsNotNull() {
            addCriterion(25, "boolean", "is not null");
            return (Criteria) this;
        }

        public Criteria andAutoUseEqualTo(boolean value) {
            addCriterion(25, "boolean", "=", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseNotEqualTo(boolean value) {
            addCriterion(25, "boolean", "<>", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseGreaterThan(boolean value) {
            addCriterion(25, "boolean", ">", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseGreaterThanOrEqualTo(boolean value) {
            addCriterion(25, "boolean", ">=", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseLessThan(boolean value) {
            addCriterion(25, "boolean", "<", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseLessThanOrEqualTo(boolean value) {
            addCriterion(25, "boolean", "<=", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseLike(boolean value) {
            addCriterion(25, "boolean", "like", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseNotLike(boolean value) {
            addCriterion(25, "boolean", "not like", value, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseIn(List<Boolean> values) {
            addCriterion(25, "boolean", "in", values, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseNotIn(List<Boolean> values) {
            addCriterion(25, "boolean", "not in", values, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseBetween(boolean value1, boolean value2) {
            addCriterion(25, "boolean", "between", value1, value2, "autoUse");
            return (Criteria) this;
        }

        public Criteria andAutoUseNotBetween(boolean value1, boolean value2) {
            addCriterion(25, "boolean", "not between", value1, value2, "autoUse");
            return (Criteria) this;
        }
        public Criteria andSuitSnIsNull() {
            addCriterion(26, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSuitSnIsNotNull() {
            addCriterion(26, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSuitSnEqualTo(int value) {
            addCriterion(26, "int", "=", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnNotEqualTo(int value) {
            addCriterion(26, "int", "<>", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnGreaterThan(int value) {
            addCriterion(26, "int", ">", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnGreaterThanOrEqualTo(int value) {
            addCriterion(26, "int", ">=", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnLessThan(int value) {
            addCriterion(26, "int", "<", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnLessThanOrEqualTo(int value) {
            addCriterion(26, "int", "<=", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnLike(int value) {
            addCriterion(26, "int", "like", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnNotLike(int value) {
            addCriterion(26, "int", "not like", value, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnIn(List<Integer> values) {
            addCriterion(26, "int", "in", values, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnNotIn(List<Integer> values) {
            addCriterion(26, "int", "not in", values, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnBetween(int value1, int value2) {
            addCriterion(26, "int", "between", value1, value2, "suitSn");
            return (Criteria) this;
        }

        public Criteria andSuitSnNotBetween(int value1, int value2) {
            addCriterion(26, "int", "not between", value1, value2, "suitSn");
            return (Criteria) this;
        }
        public Criteria andLvExpIsNull() {
            addCriterion(27, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andLvExpIsNotNull() {
            addCriterion(27, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andLvExpEqualTo(int value) {
            addCriterion(27, "int", "=", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpNotEqualTo(int value) {
            addCriterion(27, "int", "<>", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpGreaterThan(int value) {
            addCriterion(27, "int", ">", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpGreaterThanOrEqualTo(int value) {
            addCriterion(27, "int", ">=", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpLessThan(int value) {
            addCriterion(27, "int", "<", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpLessThanOrEqualTo(int value) {
            addCriterion(27, "int", "<=", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpLike(int value) {
            addCriterion(27, "int", "like", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpNotLike(int value) {
            addCriterion(27, "int", "not like", value, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpIn(List<Integer> values) {
            addCriterion(27, "int", "in", values, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpNotIn(List<Integer> values) {
            addCriterion(27, "int", "not in", values, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpBetween(int value1, int value2) {
            addCriterion(27, "int", "between", value1, value2, "lvExp");
            return (Criteria) this;
        }

        public Criteria andLvExpNotBetween(int value1, int value2) {
            addCriterion(27, "int", "not between", value1, value2, "lvExp");
            return (Criteria) this;
        }
        public Criteria andRankLimitIsNull() {
            addCriterion(28, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andRankLimitIsNotNull() {
            addCriterion(28, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andRankLimitEqualTo(int value) {
            addCriterion(28, "int", "=", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitNotEqualTo(int value) {
            addCriterion(28, "int", "<>", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitGreaterThan(int value) {
            addCriterion(28, "int", ">", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitGreaterThanOrEqualTo(int value) {
            addCriterion(28, "int", ">=", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitLessThan(int value) {
            addCriterion(28, "int", "<", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitLessThanOrEqualTo(int value) {
            addCriterion(28, "int", "<=", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitLike(int value) {
            addCriterion(28, "int", "like", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitNotLike(int value) {
            addCriterion(28, "int", "not like", value, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitIn(List<Integer> values) {
            addCriterion(28, "int", "in", values, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitNotIn(List<Integer> values) {
            addCriterion(28, "int", "not in", values, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitBetween(int value1, int value2) {
            addCriterion(28, "int", "between", value1, value2, "rankLimit");
            return (Criteria) this;
        }

        public Criteria andRankLimitNotBetween(int value1, int value2) {
            addCriterion(28, "int", "not between", value1, value2, "rankLimit");
            return (Criteria) this;
        }
        public Criteria andAttriGroupIsNull() {
            addCriterion(29, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andAttriGroupIsNotNull() {
            addCriterion(29, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andAttriGroupEqualTo(int[] value) {
            addCriterion(29, "int[]", "=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotEqualTo(int[] value) {
            addCriterion(29, "int[]", "<>", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupGreaterThan(int[] value) {
            addCriterion(29, "int[]", ">", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupGreaterThanOrEqualTo(int[] value) {
            addCriterion(29, "int[]", ">=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLessThan(int[] value) {
            addCriterion(29, "int[]", "<", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLessThanOrEqualTo(int[] value) {
            addCriterion(29, "int[]", "<=", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupLike(int[] value) {
            addCriterion(29, "int[]", "like", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotLike(int[] value) {
            addCriterion(29, "int[]", "not like", value, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupIn(List<Integer[]> values) {
            addCriterion(29, "int[]", "in", values, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotIn(List<Integer[]> values) {
            addCriterion(29, "int[]", "not in", values, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupBetween(int[] value1, int[] value2) {
            addCriterion(29, "int[]", "between", value1, value2, "attriGroup");
            return (Criteria) this;
        }

        public Criteria andAttriGroupNotBetween(int[] value1, int[] value2) {
            addCriterion(29, "int[]", "not between", value1, value2, "attriGroup");
            return (Criteria) this;
        }
        public Criteria andGroupWeightIsNull() {
            addCriterion(30, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andGroupWeightIsNotNull() {
            addCriterion(30, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andGroupWeightEqualTo(int[] value) {
            addCriterion(30, "int[]", "=", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightNotEqualTo(int[] value) {
            addCriterion(30, "int[]", "<>", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightGreaterThan(int[] value) {
            addCriterion(30, "int[]", ">", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightGreaterThanOrEqualTo(int[] value) {
            addCriterion(30, "int[]", ">=", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightLessThan(int[] value) {
            addCriterion(30, "int[]", "<", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightLessThanOrEqualTo(int[] value) {
            addCriterion(30, "int[]", "<=", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightLike(int[] value) {
            addCriterion(30, "int[]", "like", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightNotLike(int[] value) {
            addCriterion(30, "int[]", "not like", value, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightIn(List<Integer[]> values) {
            addCriterion(30, "int[]", "in", values, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightNotIn(List<Integer[]> values) {
            addCriterion(30, "int[]", "not in", values, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightBetween(int[] value1, int[] value2) {
            addCriterion(30, "int[]", "between", value1, value2, "groupWeight");
            return (Criteria) this;
        }

        public Criteria andGroupWeightNotBetween(int[] value1, int[] value2) {
            addCriterion(30, "int[]", "not between", value1, value2, "groupWeight");
            return (Criteria) this;
        }
        public Criteria andAttriActiveRankIsNull() {
            addCriterion(31, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankIsNotNull() {
            addCriterion(31, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankEqualTo(int[] value) {
            addCriterion(31, "int[]", "=", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankNotEqualTo(int[] value) {
            addCriterion(31, "int[]", "<>", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankGreaterThan(int[] value) {
            addCriterion(31, "int[]", ">", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankGreaterThanOrEqualTo(int[] value) {
            addCriterion(31, "int[]", ">=", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankLessThan(int[] value) {
            addCriterion(31, "int[]", "<", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankLessThanOrEqualTo(int[] value) {
            addCriterion(31, "int[]", "<=", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankLike(int[] value) {
            addCriterion(31, "int[]", "like", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankNotLike(int[] value) {
            addCriterion(31, "int[]", "not like", value, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankIn(List<Integer[]> values) {
            addCriterion(31, "int[]", "in", values, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankNotIn(List<Integer[]> values) {
            addCriterion(31, "int[]", "not in", values, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankBetween(int[] value1, int[] value2) {
            addCriterion(31, "int[]", "between", value1, value2, "attriActiveRank");
            return (Criteria) this;
        }

        public Criteria andAttriActiveRankNotBetween(int[] value1, int[] value2) {
            addCriterion(31, "int[]", "not between", value1, value2, "attriActiveRank");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}