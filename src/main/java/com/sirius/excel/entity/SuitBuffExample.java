package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class SuitBuffExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuitBuffExample() {
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
        public Criteria andNeedNum1IsNull() {
            addCriterion(3, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedNum1IsNotNull() {
            addCriterion(3, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNum1EqualTo(int value) {
            addCriterion(3, "int", "=", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1NotEqualTo(int value) {
            addCriterion(3, "int", "<>", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1GreaterThan(int value) {
            addCriterion(3, "int", ">", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1GreaterThanOrEqualTo(int value) {
            addCriterion(3, "int", ">=", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1LessThan(int value) {
            addCriterion(3, "int", "<", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1LessThanOrEqualTo(int value) {
            addCriterion(3, "int", "<=", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1Like(int value) {
            addCriterion(3, "int", "like", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1NotLike(int value) {
            addCriterion(3, "int", "not like", value, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1In(List<Integer> values) {
            addCriterion(3, "int", "in", values, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1NotIn(List<Integer> values) {
            addCriterion(3, "int", "not in", values, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1Between(int value1, int value2) {
            addCriterion(3, "int", "between", value1, value2, "needNum1");
            return (Criteria) this;
        }

        public Criteria andNeedNum1NotBetween(int value1, int value2) {
            addCriterion(3, "int", "not between", value1, value2, "needNum1");
            return (Criteria) this;
        }
        public Criteria andProp1IsNull() {
            addCriterion(4, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion(4, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(int value) {
            addCriterion(4, "int", "=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(int value) {
            addCriterion(4, "int", "<>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(int value) {
            addCriterion(4, "int", ">", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(int value) {
            addCriterion(4, "int", ">=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(int value) {
            addCriterion(4, "int", "<", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(int value) {
            addCriterion(4, "int", "<=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(int value) {
            addCriterion(4, "int", "like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(int value) {
            addCriterion(4, "int", "not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<Integer> values) {
            addCriterion(4, "int", "in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<Integer> values) {
            addCriterion(4, "int", "not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(int value1, int value2) {
            addCriterion(4, "int", "between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(int value1, int value2) {
            addCriterion(4, "int", "not between", value1, value2, "prop1");
            return (Criteria) this;
        }
        public Criteria andValue1IsNull() {
            addCriterion(5, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion(5, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(int value) {
            addCriterion(5, "int", "=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(int value) {
            addCriterion(5, "int", "<>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(int value) {
            addCriterion(5, "int", ">", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(int value) {
            addCriterion(5, "int", ">=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(int value) {
            addCriterion(5, "int", "<", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(int value) {
            addCriterion(5, "int", "<=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(int value) {
            addCriterion(5, "int", "like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(int value) {
            addCriterion(5, "int", "not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<Integer> values) {
            addCriterion(5, "int", "in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<Integer> values) {
            addCriterion(5, "int", "not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(int value1, int value2) {
            addCriterion(5, "int", "between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(int value1, int value2) {
            addCriterion(5, "int", "not between", value1, value2, "value1");
            return (Criteria) this;
        }
        public Criteria andNeedNum2IsNull() {
            addCriterion(8, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedNum2IsNotNull() {
            addCriterion(8, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNum2EqualTo(int value) {
            addCriterion(8, "int", "=", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2NotEqualTo(int value) {
            addCriterion(8, "int", "<>", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2GreaterThan(int value) {
            addCriterion(8, "int", ">", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2GreaterThanOrEqualTo(int value) {
            addCriterion(8, "int", ">=", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2LessThan(int value) {
            addCriterion(8, "int", "<", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2LessThanOrEqualTo(int value) {
            addCriterion(8, "int", "<=", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2Like(int value) {
            addCriterion(8, "int", "like", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2NotLike(int value) {
            addCriterion(8, "int", "not like", value, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2In(List<Integer> values) {
            addCriterion(8, "int", "in", values, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2NotIn(List<Integer> values) {
            addCriterion(8, "int", "not in", values, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2Between(int value1, int value2) {
            addCriterion(8, "int", "between", value1, value2, "needNum2");
            return (Criteria) this;
        }

        public Criteria andNeedNum2NotBetween(int value1, int value2) {
            addCriterion(8, "int", "not between", value1, value2, "needNum2");
            return (Criteria) this;
        }
        public Criteria andProp2IsNull() {
            addCriterion(9, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion(9, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(int value) {
            addCriterion(9, "int", "=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(int value) {
            addCriterion(9, "int", "<>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(int value) {
            addCriterion(9, "int", ">", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(int value) {
            addCriterion(9, "int", ">=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(int value) {
            addCriterion(9, "int", "<", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(int value) {
            addCriterion(9, "int", "<=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(int value) {
            addCriterion(9, "int", "like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(int value) {
            addCriterion(9, "int", "not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<Integer> values) {
            addCriterion(9, "int", "in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<Integer> values) {
            addCriterion(9, "int", "not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(int value1, int value2) {
            addCriterion(9, "int", "between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(int value1, int value2) {
            addCriterion(9, "int", "not between", value1, value2, "prop2");
            return (Criteria) this;
        }
        public Criteria andValue2IsNull() {
            addCriterion(10, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion(10, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(int value) {
            addCriterion(10, "int", "=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(int value) {
            addCriterion(10, "int", "<>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(int value) {
            addCriterion(10, "int", ">", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(int value) {
            addCriterion(10, "int", ">=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(int value) {
            addCriterion(10, "int", "<", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(int value) {
            addCriterion(10, "int", "<=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(int value) {
            addCriterion(10, "int", "like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(int value) {
            addCriterion(10, "int", "not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<Integer> values) {
            addCriterion(10, "int", "in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<Integer> values) {
            addCriterion(10, "int", "not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(int value1, int value2) {
            addCriterion(10, "int", "between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(int value1, int value2) {
            addCriterion(10, "int", "not between", value1, value2, "value2");
            return (Criteria) this;
        }
        public Criteria andNeedNum3IsNull() {
            addCriterion(13, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andNeedNum3IsNotNull() {
            addCriterion(13, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andNeedNum3EqualTo(int value) {
            addCriterion(13, "int", "=", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3NotEqualTo(int value) {
            addCriterion(13, "int", "<>", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3GreaterThan(int value) {
            addCriterion(13, "int", ">", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3GreaterThanOrEqualTo(int value) {
            addCriterion(13, "int", ">=", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3LessThan(int value) {
            addCriterion(13, "int", "<", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3LessThanOrEqualTo(int value) {
            addCriterion(13, "int", "<=", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3Like(int value) {
            addCriterion(13, "int", "like", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3NotLike(int value) {
            addCriterion(13, "int", "not like", value, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3In(List<Integer> values) {
            addCriterion(13, "int", "in", values, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3NotIn(List<Integer> values) {
            addCriterion(13, "int", "not in", values, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3Between(int value1, int value2) {
            addCriterion(13, "int", "between", value1, value2, "needNum3");
            return (Criteria) this;
        }

        public Criteria andNeedNum3NotBetween(int value1, int value2) {
            addCriterion(13, "int", "not between", value1, value2, "needNum3");
            return (Criteria) this;
        }
        public Criteria andProp3IsNull() {
            addCriterion(14, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andProp3IsNotNull() {
            addCriterion(14, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andProp3EqualTo(int value) {
            addCriterion(14, "int", "=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotEqualTo(int value) {
            addCriterion(14, "int", "<>", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThan(int value) {
            addCriterion(14, "int", ">", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThanOrEqualTo(int value) {
            addCriterion(14, "int", ">=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThan(int value) {
            addCriterion(14, "int", "<", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThanOrEqualTo(int value) {
            addCriterion(14, "int", "<=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Like(int value) {
            addCriterion(14, "int", "like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotLike(int value) {
            addCriterion(14, "int", "not like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3In(List<Integer> values) {
            addCriterion(14, "int", "in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotIn(List<Integer> values) {
            addCriterion(14, "int", "not in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Between(int value1, int value2) {
            addCriterion(14, "int", "between", value1, value2, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotBetween(int value1, int value2) {
            addCriterion(14, "int", "not between", value1, value2, "prop3");
            return (Criteria) this;
        }
        public Criteria andValue3IsNull() {
            addCriterion(15, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andValue3IsNotNull() {
            addCriterion(15, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andValue3EqualTo(int value) {
            addCriterion(15, "int", "=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotEqualTo(int value) {
            addCriterion(15, "int", "<>", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThan(int value) {
            addCriterion(15, "int", ">", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThanOrEqualTo(int value) {
            addCriterion(15, "int", ">=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThan(int value) {
            addCriterion(15, "int", "<", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThanOrEqualTo(int value) {
            addCriterion(15, "int", "<=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Like(int value) {
            addCriterion(15, "int", "like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotLike(int value) {
            addCriterion(15, "int", "not like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3In(List<Integer> values) {
            addCriterion(15, "int", "in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotIn(List<Integer> values) {
            addCriterion(15, "int", "not in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Between(int value1, int value2) {
            addCriterion(15, "int", "between", value1, value2, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotBetween(int value1, int value2) {
            addCriterion(15, "int", "not between", value1, value2, "value3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}