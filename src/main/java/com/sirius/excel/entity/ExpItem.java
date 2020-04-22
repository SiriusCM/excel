package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class ExpItem implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 1)
    public int itemSn;  //道具ID
    @Column(column = 2)
    public int cardExp;  //卡经验
    @Column(column = 3)
    public int skillExp;  //技能经验

    public ExpItem(Row row) {
        this.sn = getValue(row, 0, "int");
        this.itemSn = getValue(row, 1, "int");
        this.cardExp = getValue(row, 2, "int");
        this.skillExp = getValue(row, 3, "int");
    }
}