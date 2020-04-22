package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class Upgrade implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 1)
    public int rank;  //强化等级
    @Column(column = 2)
    public int level;  //装备等级
    @Column(column = 3)
    public int exp;  //需求经验

    public Upgrade(Row row) {
        this.sn = getValue(row, 0, "int");
        this.rank = getValue(row, 1, "int");
        this.level = getValue(row, 2, "int");
        this.exp = getValue(row, 3, "int");
    }
}