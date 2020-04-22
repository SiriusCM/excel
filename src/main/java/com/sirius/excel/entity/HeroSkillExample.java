package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class HeroSkillExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroSkillExample() {
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
        public Criteria andExpIsNull() {
            addCriterion(1, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion(1, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(int[] value) {
            addCriterion(1, "int[]", "=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(int[] value) {
            addCriterion(1, "int[]", "<>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(int[] value) {
            addCriterion(1, "int[]", ">", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(int[] value) {
            addCriterion(1, "int[]", ">=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(int[] value) {
            addCriterion(1, "int[]", "<", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(int[] value) {
            addCriterion(1, "int[]", "<=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLike(int[] value) {
            addCriterion(1, "int[]", "like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotLike(int[] value) {
            addCriterion(1, "int[]", "not like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer[]> values) {
            addCriterion(1, "int[]", "in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer[]> values) {
            addCriterion(1, "int[]", "not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(int[] value1, int[] value2) {
            addCriterion(1, "int[]", "between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(int[] value1, int[] value2) {
            addCriterion(1, "int[]", "not between", value1, value2, "exp");
            return (Criteria) this;
        }
        public Criteria andDeblockingNumIsNull() {
            addCriterion(2, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumIsNotNull() {
            addCriterion(2, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumEqualTo(int[] value) {
            addCriterion(2, "int[]", "=", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumNotEqualTo(int[] value) {
            addCriterion(2, "int[]", "<>", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumGreaterThan(int[] value) {
            addCriterion(2, "int[]", ">", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumGreaterThanOrEqualTo(int[] value) {
            addCriterion(2, "int[]", ">=", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumLessThan(int[] value) {
            addCriterion(2, "int[]", "<", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumLessThanOrEqualTo(int[] value) {
            addCriterion(2, "int[]", "<=", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumLike(int[] value) {
            addCriterion(2, "int[]", "like", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumNotLike(int[] value) {
            addCriterion(2, "int[]", "not like", value, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumIn(List<Integer[]> values) {
            addCriterion(2, "int[]", "in", values, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumNotIn(List<Integer[]> values) {
            addCriterion(2, "int[]", "not in", values, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumBetween(int[] value1, int[] value2) {
            addCriterion(2, "int[]", "between", value1, value2, "deblockingNum");
            return (Criteria) this;
        }

        public Criteria andDeblockingNumNotBetween(int[] value1, int[] value2) {
            addCriterion(2, "int[]", "not between", value1, value2, "deblockingNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}