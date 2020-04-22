package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class ExpItemExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpItemExample() {
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
        public Criteria andItemSnIsNull() {
            addCriterion(1, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andItemSnIsNotNull() {
            addCriterion(1, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andItemSnEqualTo(int value) {
            addCriterion(1, "int", "=", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnNotEqualTo(int value) {
            addCriterion(1, "int", "<>", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnGreaterThan(int value) {
            addCriterion(1, "int", ">", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnGreaterThanOrEqualTo(int value) {
            addCriterion(1, "int", ">=", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnLessThan(int value) {
            addCriterion(1, "int", "<", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnLessThanOrEqualTo(int value) {
            addCriterion(1, "int", "<=", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnLike(int value) {
            addCriterion(1, "int", "like", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnNotLike(int value) {
            addCriterion(1, "int", "not like", value, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnIn(List<Integer> values) {
            addCriterion(1, "int", "in", values, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnNotIn(List<Integer> values) {
            addCriterion(1, "int", "not in", values, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnBetween(int value1, int value2) {
            addCriterion(1, "int", "between", value1, value2, "itemSn");
            return (Criteria) this;
        }

        public Criteria andItemSnNotBetween(int value1, int value2) {
            addCriterion(1, "int", "not between", value1, value2, "itemSn");
            return (Criteria) this;
        }
        public Criteria andCardExpIsNull() {
            addCriterion(2, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andCardExpIsNotNull() {
            addCriterion(2, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andCardExpEqualTo(int value) {
            addCriterion(2, "int", "=", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpNotEqualTo(int value) {
            addCriterion(2, "int", "<>", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpGreaterThan(int value) {
            addCriterion(2, "int", ">", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpGreaterThanOrEqualTo(int value) {
            addCriterion(2, "int", ">=", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpLessThan(int value) {
            addCriterion(2, "int", "<", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpLessThanOrEqualTo(int value) {
            addCriterion(2, "int", "<=", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpLike(int value) {
            addCriterion(2, "int", "like", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpNotLike(int value) {
            addCriterion(2, "int", "not like", value, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpIn(List<Integer> values) {
            addCriterion(2, "int", "in", values, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpNotIn(List<Integer> values) {
            addCriterion(2, "int", "not in", values, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpBetween(int value1, int value2) {
            addCriterion(2, "int", "between", value1, value2, "cardExp");
            return (Criteria) this;
        }

        public Criteria andCardExpNotBetween(int value1, int value2) {
            addCriterion(2, "int", "not between", value1, value2, "cardExp");
            return (Criteria) this;
        }
        public Criteria andSkillExpIsNull() {
            addCriterion(3, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSkillExpIsNotNull() {
            addCriterion(3, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSkillExpEqualTo(int value) {
            addCriterion(3, "int", "=", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpNotEqualTo(int value) {
            addCriterion(3, "int", "<>", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpGreaterThan(int value) {
            addCriterion(3, "int", ">", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpGreaterThanOrEqualTo(int value) {
            addCriterion(3, "int", ">=", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpLessThan(int value) {
            addCriterion(3, "int", "<", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpLessThanOrEqualTo(int value) {
            addCriterion(3, "int", "<=", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpLike(int value) {
            addCriterion(3, "int", "like", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpNotLike(int value) {
            addCriterion(3, "int", "not like", value, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpIn(List<Integer> values) {
            addCriterion(3, "int", "in", values, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpNotIn(List<Integer> values) {
            addCriterion(3, "int", "not in", values, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpBetween(int value1, int value2) {
            addCriterion(3, "int", "between", value1, value2, "skillExp");
            return (Criteria) this;
        }

        public Criteria andSkillExpNotBetween(int value1, int value2) {
            addCriterion(3, "int", "not between", value1, value2, "skillExp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}