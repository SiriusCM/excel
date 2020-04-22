package com.sirius.excel;

public class Field {

    private int column;
    private String type;
    private String upperType;
    private String name;
    private String upperName;
    private String note;

    public Field() {
    }

    public Field(int column, String type, String name, String note) {
        this.column = column;
        this.type = type;
        this.name = name;
        this.note = note;
        this.upperType = type;
        upperType = upperType.replaceAll("byte", "Byte");
        upperType = upperType.replaceAll("short", "Short");
        upperType = upperType.replaceAll("int", "Integer");
        upperType = upperType.replaceAll("long", "Long");
        upperType = upperType.replaceAll("float", "Float");
        upperType = upperType.replaceAll("double", "Double");
        upperType = upperType.replaceAll("double", "Double");
        upperType = upperType.replaceAll("boolean", "Boolean");
        upperType = upperType.replaceAll("char", "Character");
        upperName = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpperType() {
        return upperType;
    }

    public void setUpperType(String upperType) {
        this.upperType = upperType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpperName() {
        return upperName;
    }

    public void setUpperName(String upperName) {
        this.upperName = upperName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
