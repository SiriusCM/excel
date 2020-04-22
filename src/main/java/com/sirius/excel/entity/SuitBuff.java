package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class SuitBuff implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 3)
    public int needNum1;  //需求数量
    @Column(column = 4)
    public int prop1;  //属性
    @Column(column = 5)
    public int value1;  //数值
    @Column(column = 8)
    public int needNum2;  //需求数量
    @Column(column = 9)
    public int prop2;  //属性
    @Column(column = 10)
    public int value2;  //数值
    @Column(column = 13)
    public int needNum3;  //需求数量
    @Column(column = 14)
    public int prop3;  //属性
    @Column(column = 15)
    public int value3;  //数值

    public SuitBuff(Row row) {
        this.sn = getValue(row, 0, "int");
        this.needNum1 = getValue(row, 3, "int");
        this.prop1 = getValue(row, 4, "int");
        this.value1 = getValue(row, 5, "int");
        this.needNum2 = getValue(row, 8, "int");
        this.prop2 = getValue(row, 9, "int");
        this.value2 = getValue(row, 10, "int");
        this.needNum3 = getValue(row, 13, "int");
        this.prop3 = getValue(row, 14, "int");
        this.value3 = getValue(row, 15, "int");
    }
}