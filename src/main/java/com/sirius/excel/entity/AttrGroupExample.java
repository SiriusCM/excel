package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class AttrGroupExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttrGroupExample() {
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
        public Criteria andNeedNumIsNull() {
            addCriterion(5, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedNumIsNotNull() {
            addCriterion(5, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNumEqualTo(int value) {
            addCriterion(5, "int", "=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotEqualTo(int value) {
            addCriterion(5, "int", "<>", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThan(int value) {
            addCriterion(5, "int", ">", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumGreaterThanOrEqualTo(int value) {
            addCriterion(5, "int", ">=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThan(int value) {
            addCriterion(5, "int", "<", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLessThanOrEqualTo(int value) {
            addCriterion(5, "int", "<=", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumLike(int value) {
            addCriterion(5, "int", "like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotLike(int value) {
            addCriterion(5, "int", "not like", value, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumIn(List<Integer> values) {
            addCriterion(5, "int", "in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotIn(List<Integer> values) {
            addCriterion(5, "int", "not in", values, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumBetween(int value1, int value2) {
            addCriterion(5, "int", "between", value1, value2, "needNum");
            return (Criteria) this;
        }

        public Criteria andNeedNumNotBetween(int value1, int value2) {
            addCriterion(5, "int", "not between", value1, value2, "needNum");
            return (Criteria) this;
        }
        public Criteria andProp1IsNull() {
            addCriterion(6, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion(6, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(int value) {
            addCriterion(6, "int", "=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(int value) {
            addCriterion(6, "int", "<>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(int value) {
            addCriterion(6, "int", ">", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(int value) {
            addCriterion(6, "int", ">=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(int value) {
            addCriterion(6, "int", "<", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(int value) {
            addCriterion(6, "int", "<=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(int value) {
            addCriterion(6, "int", "like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(int value) {
            addCriterion(6, "int", "not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<Integer> values) {
            addCriterion(6, "int", "in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<Integer> values) {
            addCriterion(6, "int", "not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(int value1, int value2) {
            addCriterion(6, "int", "between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(int value1, int value2) {
            addCriterion(6, "int", "not between", value1, value2, "prop1");
            return (Criteria) this;
        }
        public Criteria andValue1IsNull() {
            addCriterion(7, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion(7, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(int value) {
            addCriterion(7, "int", "=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(int value) {
            addCriterion(7, "int", "<>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(int value) {
            addCriterion(7, "int", ">", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(int value) {
            addCriterion(7, "int", ">=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(int value) {
            addCriterion(7, "int", "<", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(int value) {
            addCriterion(7, "int", "<=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(int value) {
            addCriterion(7, "int", "like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(int value) {
            addCriterion(7, "int", "not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<Integer> values) {
            addCriterion(7, "int", "in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<Integer> values) {
            addCriterion(7, "int", "not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(int value1, int value2) {
            addCriterion(7, "int", "between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(int value1, int value2) {
            addCriterion(7, "int", "not between", value1, value2, "value1");
            return (Criteria) this;
        }
        public Criteria andProp2IsNull() {
            addCriterion(8, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion(8, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(int value) {
            addCriterion(8, "int", "=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(int value) {
            addCriterion(8, "int", "<>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(int value) {
            addCriterion(8, "int", ">", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(int value) {
            addCriterion(8, "int", ">=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(int value) {
            addCriterion(8, "int", "<", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(int value) {
            addCriterion(8, "int", "<=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(int value) {
            addCriterion(8, "int", "like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(int value) {
            addCriterion(8, "int", "not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<Integer> values) {
            addCriterion(8, "int", "in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<Integer> values) {
            addCriterion(8, "int", "not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(int value1, int value2) {
            addCriterion(8, "int", "between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(int value1, int value2) {
            addCriterion(8, "int", "not between", value1, value2, "prop2");
            return (Criteria) this;
        }
        public Criteria andValue2IsNull() {
            addCriterion(9, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion(9, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(int value) {
            addCriterion(9, "int", "=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(int value) {
            addCriterion(9, "int", "<>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(int value) {
            addCriterion(9, "int", ">", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(int value) {
            addCriterion(9, "int", ">=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(int value) {
            addCriterion(9, "int", "<", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(int value) {
            addCriterion(9, "int", "<=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(int value) {
            addCriterion(9, "int", "like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(int value) {
            addCriterion(9, "int", "not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<Integer> values) {
            addCriterion(9, "int", "in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<Integer> values) {
            addCriterion(9, "int", "not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(int value1, int value2) {
            addCriterion(9, "int", "between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(int value1, int value2) {
            addCriterion(9, "int", "not between", value1, value2, "value2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}