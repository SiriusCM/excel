package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class RandomAttr implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 2)
    public String nameSn;  //名称
    @Column(column = 3)
    public String descSn;  //描述
    @Column(column = 4)
    public int type;  //词缀类型
    @Column(column = 5)
    public int prop;  //属性
    @Column(column = 6)
    public int[] value;  //数值列表

    public RandomAttr(Row row) {
        this.sn = getValue(row, 0, "int");
        this.nameSn = getValue(row, 2, "String");
        this.descSn = getValue(row, 3, "String");
        this.type = getValue(row, 4, "int");
        this.prop = getValue(row, 5, "int");
        this.value = getValue(row, 6, "int[]");
    }
}