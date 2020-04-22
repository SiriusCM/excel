package com.sirius.excel.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class HeroEquipUpExample implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeroEquipUpExample() {
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
        public Criteria andLimitLvIsNull() {
            addCriterion(1, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andLimitLvIsNotNull() {
            addCriterion(1, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andLimitLvEqualTo(int value) {
            addCriterion(1, "int", "=", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvNotEqualTo(int value) {
            addCriterion(1, "int", "<>", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvGreaterThan(int value) {
            addCriterion(1, "int", ">", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvGreaterThanOrEqualTo(int value) {
            addCriterion(1, "int", ">=", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvLessThan(int value) {
            addCriterion(1, "int", "<", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvLessThanOrEqualTo(int value) {
            addCriterion(1, "int", "<=", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvLike(int value) {
            addCriterion(1, "int", "like", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvNotLike(int value) {
            addCriterion(1, "int", "not like", value, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvIn(List<Integer> values) {
            addCriterion(1, "int", "in", values, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvNotIn(List<Integer> values) {
            addCriterion(1, "int", "not in", values, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvBetween(int value1, int value2) {
            addCriterion(1, "int", "between", value1, value2, "limitLv");
            return (Criteria) this;
        }

        public Criteria andLimitLvNotBetween(int value1, int value2) {
            addCriterion(1, "int", "not between", value1, value2, "limitLv");
            return (Criteria) this;
        }
        public Criteria andGoldIsNull() {
            addCriterion(2, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion(2, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(int value) {
            addCriterion(2, "int", "=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(int value) {
            addCriterion(2, "int", "<>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(int value) {
            addCriterion(2, "int", ">", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(int value) {
            addCriterion(2, "int", ">=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(int value) {
            addCriterion(2, "int", "<", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(int value) {
            addCriterion(2, "int", "<=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLike(int value) {
            addCriterion(2, "int", "like", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotLike(int value) {
            addCriterion(2, "int", "not like", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion(2, "int", "in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion(2, "int", "not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(int value1, int value2) {
            addCriterion(2, "int", "between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(int value1, int value2) {
            addCriterion(2, "int", "not between", value1, value2, "gold");
            return (Criteria) this;
        }
        public Criteria andItemIsNull() {
            addCriterion(3, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion(3, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(int[] value) {
            addCriterion(3, "int[]", "=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(int[] value) {
            addCriterion(3, "int[]", "<>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(int[] value) {
            addCriterion(3, "int[]", ">", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(int[] value) {
            addCriterion(3, "int[]", ">=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(int[] value) {
            addCriterion(3, "int[]", "<", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(int[] value) {
            addCriterion(3, "int[]", "<=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(int[] value) {
            addCriterion(3, "int[]", "like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(int[] value) {
            addCriterion(3, "int[]", "not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<Integer[]> values) {
            addCriterion(3, "int[]", "in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<Integer[]> values) {
            addCriterion(3, "int[]", "not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(int[] value1, int[] value2) {
            addCriterion(3, "int[]", "between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(int[] value1, int[] value2) {
            addCriterion(3, "int[]", "not between", value1, value2, "item");
            return (Criteria) this;
        }
        public Criteria andItemNumIsNull() {
            addCriterion(4, "int[]", "is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion(4, "int[]", "is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(int[] value) {
            addCriterion(4, "int[]", "=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(int[] value) {
            addCriterion(4, "int[]", "<>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(int[] value) {
            addCriterion(4, "int[]", ">", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(int[] value) {
            addCriterion(4, "int[]", ">=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(int[] value) {
            addCriterion(4, "int[]", "<", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(int[] value) {
            addCriterion(4, "int[]", "<=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLike(int[] value) {
            addCriterion(4, "int[]", "like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotLike(int[] value) {
            addCriterion(4, "int[]", "not like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Integer[]> values) {
            addCriterion(4, "int[]", "in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Integer[]> values) {
            addCriterion(4, "int[]", "not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(int[] value1, int[] value2) {
            addCriterion(4, "int[]", "between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(int[] value1, int[] value2) {
            addCriterion(4, "int[]", "not between", value1, value2, "itemNum");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp1IsNull() {
            addCriterion(5, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1IsNotNull() {
            addCriterion(5, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1EqualTo(int value) {
            addCriterion(5, "int", "=", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1NotEqualTo(int value) {
            addCriterion(5, "int", "<>", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1GreaterThan(int value) {
            addCriterion(5, "int", ">", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1GreaterThanOrEqualTo(int value) {
            addCriterion(5, "int", ">=", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1LessThan(int value) {
            addCriterion(5, "int", "<", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1LessThanOrEqualTo(int value) {
            addCriterion(5, "int", "<=", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1Like(int value) {
            addCriterion(5, "int", "like", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1NotLike(int value) {
            addCriterion(5, "int", "not like", value, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1In(List<Integer> values) {
            addCriterion(5, "int", "in", values, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1NotIn(List<Integer> values) {
            addCriterion(5, "int", "not in", values, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1Between(int value1, int value2) {
            addCriterion(5, "int", "between", value1, value2, "upgradeProp1");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp1NotBetween(int value1, int value2) {
            addCriterion(5, "int", "not between", value1, value2, "upgradeProp1");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue1IsNull() {
            addCriterion(6, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1IsNotNull() {
            addCriterion(6, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1EqualTo(int value) {
            addCriterion(6, "int", "=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotEqualTo(int value) {
            addCriterion(6, "int", "<>", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1GreaterThan(int value) {
            addCriterion(6, "int", ">", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1GreaterThanOrEqualTo(int value) {
            addCriterion(6, "int", ">=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1LessThan(int value) {
            addCriterion(6, "int", "<", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1LessThanOrEqualTo(int value) {
            addCriterion(6, "int", "<=", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1Like(int value) {
            addCriterion(6, "int", "like", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotLike(int value) {
            addCriterion(6, "int", "not like", value, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1In(List<Integer> values) {
            addCriterion(6, "int", "in", values, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotIn(List<Integer> values) {
            addCriterion(6, "int", "not in", values, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1Between(int value1, int value2) {
            addCriterion(6, "int", "between", value1, value2, "upgradeValue1");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue1NotBetween(int value1, int value2) {
            addCriterion(6, "int", "not between", value1, value2, "upgradeValue1");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp2IsNull() {
            addCriterion(7, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2IsNotNull() {
            addCriterion(7, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2EqualTo(int value) {
            addCriterion(7, "int", "=", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2NotEqualTo(int value) {
            addCriterion(7, "int", "<>", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2GreaterThan(int value) {
            addCriterion(7, "int", ">", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2GreaterThanOrEqualTo(int value) {
            addCriterion(7, "int", ">=", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2LessThan(int value) {
            addCriterion(7, "int", "<", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2LessThanOrEqualTo(int value) {
            addCriterion(7, "int", "<=", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2Like(int value) {
            addCriterion(7, "int", "like", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2NotLike(int value) {
            addCriterion(7, "int", "not like", value, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2In(List<Integer> values) {
            addCriterion(7, "int", "in", values, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2NotIn(List<Integer> values) {
            addCriterion(7, "int", "not in", values, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2Between(int value1, int value2) {
            addCriterion(7, "int", "between", value1, value2, "upgradeProp2");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp2NotBetween(int value1, int value2) {
            addCriterion(7, "int", "not between", value1, value2, "upgradeProp2");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue2IsNull() {
            addCriterion(8, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2IsNotNull() {
            addCriterion(8, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2EqualTo(int value) {
            addCriterion(8, "int", "=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotEqualTo(int value) {
            addCriterion(8, "int", "<>", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2GreaterThan(int value) {
            addCriterion(8, "int", ">", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2GreaterThanOrEqualTo(int value) {
            addCriterion(8, "int", ">=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2LessThan(int value) {
            addCriterion(8, "int", "<", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2LessThanOrEqualTo(int value) {
            addCriterion(8, "int", "<=", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2Like(int value) {
            addCriterion(8, "int", "like", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotLike(int value) {
            addCriterion(8, "int", "not like", value, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2In(List<Integer> values) {
            addCriterion(8, "int", "in", values, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotIn(List<Integer> values) {
            addCriterion(8, "int", "not in", values, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2Between(int value1, int value2) {
            addCriterion(8, "int", "between", value1, value2, "upgradeValue2");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue2NotBetween(int value1, int value2) {
            addCriterion(8, "int", "not between", value1, value2, "upgradeValue2");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp3IsNull() {
            addCriterion(9, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3IsNotNull() {
            addCriterion(9, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3EqualTo(int value) {
            addCriterion(9, "int", "=", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3NotEqualTo(int value) {
            addCriterion(9, "int", "<>", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3GreaterThan(int value) {
            addCriterion(9, "int", ">", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3GreaterThanOrEqualTo(int value) {
            addCriterion(9, "int", ">=", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3LessThan(int value) {
            addCriterion(9, "int", "<", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3LessThanOrEqualTo(int value) {
            addCriterion(9, "int", "<=", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3Like(int value) {
            addCriterion(9, "int", "like", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3NotLike(int value) {
            addCriterion(9, "int", "not like", value, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3In(List<Integer> values) {
            addCriterion(9, "int", "in", values, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3NotIn(List<Integer> values) {
            addCriterion(9, "int", "not in", values, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3Between(int value1, int value2) {
            addCriterion(9, "int", "between", value1, value2, "upgradeProp3");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp3NotBetween(int value1, int value2) {
            addCriterion(9, "int", "not between", value1, value2, "upgradeProp3");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue3IsNull() {
            addCriterion(10, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3IsNotNull() {
            addCriterion(10, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3EqualTo(int value) {
            addCriterion(10, "int", "=", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3NotEqualTo(int value) {
            addCriterion(10, "int", "<>", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3GreaterThan(int value) {
            addCriterion(10, "int", ">", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3GreaterThanOrEqualTo(int value) {
            addCriterion(10, "int", ">=", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3LessThan(int value) {
            addCriterion(10, "int", "<", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3LessThanOrEqualTo(int value) {
            addCriterion(10, "int", "<=", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3Like(int value) {
            addCriterion(10, "int", "like", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3NotLike(int value) {
            addCriterion(10, "int", "not like", value, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3In(List<Integer> values) {
            addCriterion(10, "int", "in", values, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3NotIn(List<Integer> values) {
            addCriterion(10, "int", "not in", values, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3Between(int value1, int value2) {
            addCriterion(10, "int", "between", value1, value2, "upgradeValue3");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue3NotBetween(int value1, int value2) {
            addCriterion(10, "int", "not between", value1, value2, "upgradeValue3");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp4IsNull() {
            addCriterion(11, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4IsNotNull() {
            addCriterion(11, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4EqualTo(int value) {
            addCriterion(11, "int", "=", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4NotEqualTo(int value) {
            addCriterion(11, "int", "<>", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4GreaterThan(int value) {
            addCriterion(11, "int", ">", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4GreaterThanOrEqualTo(int value) {
            addCriterion(11, "int", ">=", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4LessThan(int value) {
            addCriterion(11, "int", "<", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4LessThanOrEqualTo(int value) {
            addCriterion(11, "int", "<=", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4Like(int value) {
            addCriterion(11, "int", "like", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4NotLike(int value) {
            addCriterion(11, "int", "not like", value, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4In(List<Integer> values) {
            addCriterion(11, "int", "in", values, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4NotIn(List<Integer> values) {
            addCriterion(11, "int", "not in", values, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4Between(int value1, int value2) {
            addCriterion(11, "int", "between", value1, value2, "upgradeProp4");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp4NotBetween(int value1, int value2) {
            addCriterion(11, "int", "not between", value1, value2, "upgradeProp4");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue4IsNull() {
            addCriterion(12, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4IsNotNull() {
            addCriterion(12, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4EqualTo(int value) {
            addCriterion(12, "int", "=", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4NotEqualTo(int value) {
            addCriterion(12, "int", "<>", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4GreaterThan(int value) {
            addCriterion(12, "int", ">", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4GreaterThanOrEqualTo(int value) {
            addCriterion(12, "int", ">=", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4LessThan(int value) {
            addCriterion(12, "int", "<", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4LessThanOrEqualTo(int value) {
            addCriterion(12, "int", "<=", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4Like(int value) {
            addCriterion(12, "int", "like", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4NotLike(int value) {
            addCriterion(12, "int", "not like", value, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4In(List<Integer> values) {
            addCriterion(12, "int", "in", values, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4NotIn(List<Integer> values) {
            addCriterion(12, "int", "not in", values, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4Between(int value1, int value2) {
            addCriterion(12, "int", "between", value1, value2, "upgradeValue4");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue4NotBetween(int value1, int value2) {
            addCriterion(12, "int", "not between", value1, value2, "upgradeValue4");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp5IsNull() {
            addCriterion(13, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5IsNotNull() {
            addCriterion(13, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5EqualTo(int value) {
            addCriterion(13, "int", "=", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5NotEqualTo(int value) {
            addCriterion(13, "int", "<>", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5GreaterThan(int value) {
            addCriterion(13, "int", ">", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5GreaterThanOrEqualTo(int value) {
            addCriterion(13, "int", ">=", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5LessThan(int value) {
            addCriterion(13, "int", "<", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5LessThanOrEqualTo(int value) {
            addCriterion(13, "int", "<=", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5Like(int value) {
            addCriterion(13, "int", "like", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5NotLike(int value) {
            addCriterion(13, "int", "not like", value, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5In(List<Integer> values) {
            addCriterion(13, "int", "in", values, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5NotIn(List<Integer> values) {
            addCriterion(13, "int", "not in", values, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5Between(int value1, int value2) {
            addCriterion(13, "int", "between", value1, value2, "upgradeProp5");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp5NotBetween(int value1, int value2) {
            addCriterion(13, "int", "not between", value1, value2, "upgradeProp5");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue5IsNull() {
            addCriterion(14, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5IsNotNull() {
            addCriterion(14, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5EqualTo(int value) {
            addCriterion(14, "int", "=", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5NotEqualTo(int value) {
            addCriterion(14, "int", "<>", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5GreaterThan(int value) {
            addCriterion(14, "int", ">", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5GreaterThanOrEqualTo(int value) {
            addCriterion(14, "int", ">=", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5LessThan(int value) {
            addCriterion(14, "int", "<", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5LessThanOrEqualTo(int value) {
            addCriterion(14, "int", "<=", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5Like(int value) {
            addCriterion(14, "int", "like", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5NotLike(int value) {
            addCriterion(14, "int", "not like", value, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5In(List<Integer> values) {
            addCriterion(14, "int", "in", values, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5NotIn(List<Integer> values) {
            addCriterion(14, "int", "not in", values, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5Between(int value1, int value2) {
            addCriterion(14, "int", "between", value1, value2, "upgradeValue5");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue5NotBetween(int value1, int value2) {
            addCriterion(14, "int", "not between", value1, value2, "upgradeValue5");
            return (Criteria) this;
        }
        public Criteria andUpgradeProp6IsNull() {
            addCriterion(15, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6IsNotNull() {
            addCriterion(15, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6EqualTo(int value) {
            addCriterion(15, "int", "=", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6NotEqualTo(int value) {
            addCriterion(15, "int", "<>", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6GreaterThan(int value) {
            addCriterion(15, "int", ">", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6GreaterThanOrEqualTo(int value) {
            addCriterion(15, "int", ">=", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6LessThan(int value) {
            addCriterion(15, "int", "<", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6LessThanOrEqualTo(int value) {
            addCriterion(15, "int", "<=", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6Like(int value) {
            addCriterion(15, "int", "like", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6NotLike(int value) {
            addCriterion(15, "int", "not like", value, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6In(List<Integer> values) {
            addCriterion(15, "int", "in", values, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6NotIn(List<Integer> values) {
            addCriterion(15, "int", "not in", values, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6Between(int value1, int value2) {
            addCriterion(15, "int", "between", value1, value2, "upgradeProp6");
            return (Criteria) this;
        }

        public Criteria andUpgradeProp6NotBetween(int value1, int value2) {
            addCriterion(15, "int", "not between", value1, value2, "upgradeProp6");
            return (Criteria) this;
        }
        public Criteria andUpgradeValue6IsNull() {
            addCriterion(16, "int", "is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6IsNotNull() {
            addCriterion(16, "int", "is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6EqualTo(int value) {
            addCriterion(16, "int", "=", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6NotEqualTo(int value) {
            addCriterion(16, "int", "<>", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6GreaterThan(int value) {
            addCriterion(16, "int", ">", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6GreaterThanOrEqualTo(int value) {
            addCriterion(16, "int", ">=", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6LessThan(int value) {
            addCriterion(16, "int", "<", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6LessThanOrEqualTo(int value) {
            addCriterion(16, "int", "<=", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6Like(int value) {
            addCriterion(16, "int", "like", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6NotLike(int value) {
            addCriterion(16, "int", "not like", value, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6In(List<Integer> values) {
            addCriterion(16, "int", "in", values, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6NotIn(List<Integer> values) {
            addCriterion(16, "int", "not in", values, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6Between(int value1, int value2) {
            addCriterion(16, "int", "between", value1, value2, "upgradeValue6");
            return (Criteria) this;
        }

        public Criteria andUpgradeValue6NotBetween(int value1, int value2) {
            addCriterion(16, "int", "not between", value1, value2, "upgradeValue6");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}