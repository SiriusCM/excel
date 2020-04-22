package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class RandomAttrExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RandomAttrExample() {
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
        public Criteria andDescSnIsNull() {
            addCriterion(3, "String", "is null");
            return (Criteria) this;
        }

        public Criteria andDescSnIsNotNull() {
            addCriterion(3, "String", "is not null");
            return (Criteria) this;
        }

        public Criteria andDescSnEqualTo(String value) {
            addCriterion(3, "String", "=", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnNotEqualTo(String value) {
            addCriterion(3, "String", "<>", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnGreaterThan(String value) {
            addCriterion(3, "String", ">", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnGreaterThanOrEqualTo(String value) {
            addCriterion(3, "String", ">=", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnLessThan(String value) {
            addCriterion(3, "String", "<", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnLessThanOrEqualTo(String value) {
            addCriterion(3, "String", "<=", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnLike(String value) {
            addCriterion(3, "String", "like", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnNotLike(String value) {
            addCriterion(3, "String", "not like", value, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnIn(List<String> values) {
            addCriterion(3, "String", "in", values, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnNotIn(List<String> values) {
            addCriterion(3, "String", "not in", values, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnBetween(String value1, String value2) {
            addCriterion(3, "String", "between", value1, value2, "descSn");
            return (Criteria) this;
        }

        public Criteria andDescSnNotBetween(String value1, String value2) {
            addCriterion(3, "String", "not between", value1, value2, "descSn");
            return (Criteria) this;
        }
        public Criteria andTypeIsNull() {
            addCriterion(4, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion(4, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(int value) {
            addCriterion(4, "int", "=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(int value) {
            addCriterion(4, "int", "<>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(int value) {
            addCriterion(4, "int", ">", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(int value) {
            addCriterion(4, "int", ">=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(int value) {
            addCriterion(4, "int", "<", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(int value) {
            addCriterion(4, "int", "<=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(int value) {
            addCriterion(4, "int", "like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(int value) {
            addCriterion(4, "int", "not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion(4, "int", "in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion(4, "int", "not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(int value1, int value2) {
            addCriterion(4, "int", "between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(int value1, int value2) {
            addCriterion(4, "int", "not between", value1, value2, "type");
            return (Criteria) this;
        }
        public Criteria andPropIsNull() {
            addCriterion(5, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andPropIsNotNull() {
            addCriterion(5, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andPropEqualTo(int value) {
            addCriterion(5, "int", "=", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotEqualTo(int value) {
            addCriterion(5, "int", "<>", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropGreaterThan(int value) {
            addCriterion(5, "int", ">", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropGreaterThanOrEqualTo(int value) {
            addCriterion(5, "int", ">=", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLessThan(int value) {
            addCriterion(5, "int", "<", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLessThanOrEqualTo(int value) {
            addCriterion(5, "int", "<=", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropLike(int value) {
            addCriterion(5, "int", "like", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotLike(int value) {
            addCriterion(5, "int", "not like", value, "prop");
            return (Criteria) this;
        }

        public Criteria andPropIn(List<Integer> values) {
            addCriterion(5, "int", "in", values, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotIn(List<Integer> values) {
            addCriterion(5, "int", "not in", values, "prop");
            return (Criteria) this;
        }

        public Criteria andPropBetween(int value1, int value2) {
            addCriterion(5, "int", "between", value1, value2, "prop");
            return (Criteria) this;
        }

        public Criteria andPropNotBetween(int value1, int value2) {
            addCriterion(5, "int", "not between", value1, value2, "prop");
            return (Criteria) this;
        }
        public Criteria andValueIsNull() {
            addCriterion(6, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion(6, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(int[] value) {
            addCriterion(6, "int[]", "=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(int[] value) {
            addCriterion(6, "int[]", "<>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(int[] value) {
            addCriterion(6, "int[]", ">", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(int[] value) {
            addCriterion(6, "int[]", ">=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(int[] value) {
            addCriterion(6, "int[]", "<", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(int[] value) {
            addCriterion(6, "int[]", "<=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(int[] value) {
            addCriterion(6, "int[]", "like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(int[] value) {
            addCriterion(6, "int[]", "not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer[]> values) {
            addCriterion(6, "int[]", "in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer[]> values) {
            addCriterion(6, "int[]", "not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(int[] value1, int[] value2) {
            addCriterion(6, "int[]", "between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(int[] value1, int[] value2) {
            addCriterion(6, "int[]", "not between", value1, value2, "value");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}