package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class HeroAngry implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 1)
    public int exp;  //需求经验

    public HeroAngry(Row row) {
        this.sn = getValue(row, 0, "int");
        this.exp = getValue(row, 1, "int");
    }
}