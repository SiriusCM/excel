package ${packName}.entity;

import com.sirius.excel.Criterion;
import com.sirius.excel.Entity;

import java.util.ArrayList;
import java.util.List;

public class ${className}Example implements Entity {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ${className}Example() {
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

    <#list fieldList as field>
        public Criteria and${field.upperName}IsNull() {
            addCriterion(${field.column}, "${field.type}", "is null");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}IsNotNull() {
            addCriterion(${field.column}, "${field.type}", "is not null");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}EqualTo(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "=", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}NotEqualTo(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "<>", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}GreaterThan(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", ">", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}GreaterThanOrEqualTo(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", ">=", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}LessThan(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "<", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}LessThanOrEqualTo(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "<=", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}Like(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "like", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}NotLike(${field.type} value) {
            addCriterion(${field.column}, "${field.type}", "not like", value, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}In(List<${field.upperType}> values) {
            addCriterion(${field.column}, "${field.type}", "in", values, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}NotIn(List<${field.upperType}> values) {
            addCriterion(${field.column}, "${field.type}", "not in", values, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}Between(${field.type} value1, ${field.type} value2) {
            addCriterion(${field.column}, "${field.type}", "between", value1, value2, "${field.name}");
            return (Criteria) this;
        }

        public Criteria and${field.upperName}NotBetween(${field.type} value1, ${field.type} value2) {
            addCriterion(${field.column}, "${field.type}", "not between", value1, value2, "${field.name}");
            return (Criteria) this;
        }
    </#list>
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}