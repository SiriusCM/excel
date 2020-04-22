package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class AttrGroup implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 2)
    public String nameSn;  //名称
    @Column(column = 3)
    public String descSn;  //描述
    @Column(column = 4)
    public int type;  //
    @Column(column = 5)
    public int needNum;  //需求数量
    @Column(column = 6)
    public int prop1;  //属性1
    @Column(column = 7)
    public int value1;  //数值1
    @Column(column = 8)
    public int prop2;  //属性2
    @Column(column = 9)
    public int value2;  //数值2

    public AttrGroup(Row row) {
        this.sn = getValue(row, 0, "int");
        this.nameSn = getValue(row, 2, "String");
        this.descSn = getValue(row, 3, "String");
        this.type = getValue(row, 4, "int");
        this.needNum = getValue(row, 5, "int");
        this.prop1 = getValue(row, 6, "int");
        this.value1 = getValue(row, 7, "int");
        this.prop2 = getValue(row, 8, "int");
        this.value2 = getValue(row, 9, "int");
    }
}