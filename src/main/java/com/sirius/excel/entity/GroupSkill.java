package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class GroupSkill implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 2)
    public int needType;  //需求类型
    @Column(column = 3)
    public int needNum;  //需求数量
    @Column(column = 4)
    public int skill;  //技能ID

    public GroupSkill(Row row) {
        this.sn = getValue(row, 0, "int");
        this.needType = getValue(row, 2, "int");
        this.needNum = getValue(row, 3, "int");
        this.skill = getValue(row, 4, "int");
    }
}