package com.sirius.excel;

import java.util.List;

public class Criterion {

    private int column;

    private String type;

    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public int getColumn() {
        return column;
    }

    public String getType() {
        return type;
    }

    public String getCondition() {
        return condition;
    }

    public Object getValue() {
        return value;
    }

    public Object getSecondValue() {
        return secondValue;
    }

    public boolean isNoValue() {
        return noValue;
    }

    public boolean isSingleValue() {
        return singleValue;
    }

    public boolean isBetweenValue() {
        return betweenValue;
    }

    public boolean isListValue() {
        return listValue;
    }

    public String getTypeHandler() {
        return typeHandler;
    }

    public Criterion(int column, String type, String condition) {
        super();
        this.column = column;
        this.type = type;
        this.condition = condition;
        this.typeHandler = null;
        this.noValue = true;
    }

    public Criterion(int column, String type, String condition, Object value, String typeHandler) {
        super();
        this.column = column;
        this.type = type;
        this.condition = condition;
        this.value = value;
        this.typeHandler = typeHandler;
        if (value instanceof List<?>) {
            this.listValue = true;
        } else {
            this.singleValue = true;
        }
    }

    public Criterion(int column, String type, String condition, Object value) {
        this(column, type, condition, value, null);
    }

    public Criterion(int column, String type, String condition, Object value, Object secondValue, String typeHandler) {
        super();
        this.column = column;
        this.type = type;
        this.condition = condition;
        this.value = value;
        this.secondValue = secondValue;
        this.typeHandler = typeHandler;
        this.betweenValue = true;
    }

    public Criterion(int column, String type, String condition, Object value, Object secondValue) {
        this(column, type, condition, value, secondValue, null);
    }
}
