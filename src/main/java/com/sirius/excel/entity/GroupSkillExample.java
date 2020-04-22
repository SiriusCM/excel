package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class GroupSkillExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupSkillExample() {
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
        public Criteria andNeedTypeIsNull() {
            addCriterion(2, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIsNotNull() {
            addCriterion(2, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedTypeEqualTo(int value) {
            addCriterion(2, "int", "=", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotEqualTo(int value) {
            addCriterion(2, "int", "<>", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeGreaterThan(int value) {
            addCriterion(2, "int", ">", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeGreaterThanOrEqualTo(int value) {
            addCriterion(2, "int", ">=", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeLessThan(int value) {
            addCriterion(2, "int", "<", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeLessThanOrEqualTo(int value) {
            addCriterion(2, "int", "<=", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeLike(int value) {
            addCriterion(2, "int", "like", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotLike(int value) {
            addCriterion(2, "int", "not like", value, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeIn(List<Integer> values) {
            addCriterion(2, "int", "in", values, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotIn(List<Integer> values) {
            addCriterion(2, "int", "not in", values, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeBetween(int value1, int value2) {
            addCriterion(2, "int", "between", value1, value2, "needType");
            return (Criteria) this;
        }

        public Criteria andNeedTypeNotBetween(int value1, int value2) {
            addCriterion(2, "int", "not between", value1, value2, "needType");
            return (Criteria) this;
        }
        public Criteria andNeedNumIsNull() {
            addCriterion(3, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNotNull() {
            addCriterion(3, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNumEqualTo(int value) {
            addCriterion(3, "int", "=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotEqualTo(int value) {
            addCriterion(3, "int", "<>", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThan(int value) {
            addCriterion(3, "int", ">", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThanOrEqualTo(int value) {
            addCriterion(3, "int", ">=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThan(int value) {
            addCriterion(3, "int", "<", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThanOrEqualTo(int value) {
            addCriterion(3, "int", "<=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLike(int value) {
            addCriterion(3, "int", "like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotLike(int value) {
            addCriterion(3, "int", "not like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumIn(List<Integer> values) {
            addCriterion(3, "int", "in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotIn(List<Integer> values) {
            addCriterion(3, "int", "not in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumBetween(int value1, int value2) {
            addCriterion(3, "int", "between", value1, value2, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotBetween(int value1, int value2) {
            addCriterion(3, "int", "not between", value1, value2, "needNum");
            return (Criteria) this;
        }
        public Criteria andSkillIsNull() {
            addCriterion(4, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion(4, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(int value) {
            addCriterion(4, "int", "=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(int value) {
            addCriterion(4, "int", "<>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(int value) {
            addCriterion(4, "int", ">", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(int value) {
            addCriterion(4, "int", ">=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(int value) {
            addCriterion(4, "int", "<", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(int value) {
            addCriterion(4, "int", "<=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(int value) {
            addCriterion(4, "int", "like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(int value) {
            addCriterion(4, "int", "not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<Integer> values) {
            addCriterion(4, "int", "in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<Integer> values) {
            addCriterion(4, "int", "not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(int value1, int value2) {
            addCriterion(4, "int", "between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(int value1, int value2) {
            addCriterion(4, "int", "not between", value1, value2, "skill");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}