package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class Item implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 1)
    public String desc;  //注释用
    @Column(column = 6)
    public String icon;  //图标资源
    @Column(column = 7)
    public int grade;  //品质Sn
    @Column(column = 8)
    public int type;  //类型
    @Column(column = 9)
    public int bagType;  //背包类型
    @Column(column = 10)
    public int subType;  //子类型
    @Column(column = 11)
    public int pos;  //装备位置
    @Column(column = 12)
    public int level;  //装备等级
    @Column(column = 13)
    public int stackLimit;  //叠加上限
    @Column(column = 14)
    public int sellGold;  //出售金币
    @Column(column = 15)
    public String output;  //物品来源
    @Column(column = 16)
    public int prop1;  //属性1
    @Column(column = 17)
    public int value1;  //数值1
    @Column(column = 18)
    public int upgradeValue1;  //属性增量1
    @Column(column = 19)
    public int prop2;  //属性2
    @Column(column = 20)
    public int value2;  //数值2
    @Column(column = 21)
    public int upgradeValue2;  //属性增量2
    @Column(column = 22)
    public int isUse;  //是否可使用
    @Column(column = 23)
    public int use;  //使用效果
    @Column(column = 24)
    public int useValue;  //效果值
    @Column(column = 25)
    public boolean autoUse;  //自动使用
    @Column(column = 26)
    public int suitSn;  //套装ID
    @Column(column = 27)
    public int lvExp;  //升级经验
    @Column(column = 28)
    public int rankLimit;  //强化上限
    @Column(column = 29)
    public int[] attriGroup;  //词缀列表
    @Column(column = 30)
    public int[] groupWeight;  //词缀权重
    @Column(column = 31)
    public int[] attriActiveRank;  //词缀激活条件

    public Item(Row row) {
        this.sn = getValue(row, 0, "int");
        this.desc = getValue(row, 1, "String");
        this.icon = getValue(row, 6, "String");
        this.grade = getValue(row, 7, "int");
        this.type = getValue(row, 8, "int");
        this.bagType = getValue(row, 9, "int");
        this.subType = getValue(row, 10, "int");
        this.pos = getValue(row, 11, "int");
        this.level = getValue(row, 12, "int");
        this.stackLimit = getValue(row, 13, "int");
        this.sellGold = getValue(row, 14, "int");
        this.output = getValue(row, 15, "String");
        this.prop1 = getValue(row, 16, "int");
        this.value1 = getValue(row, 17, "int");
        this.upgradeValue1 = getValue(row, 18, "int");
        this.prop2 = getValue(row, 19, "int");
        this.value2 = getValue(row, 20, "int");
        this.upgradeValue2 = getValue(row, 21, "int");
        this.isUse = getValue(row, 22, "int");
        this.use = getValue(row, 23, "int");
        this.useValue = getValue(row, 24, "int");
        this.autoUse = getValue(row, 25, "boolean");
        this.suitSn = getValue(row, 26, "int");
        this.lvExp = getValue(row, 27, "int");
        this.rankLimit = getValue(row, 28, "int");
        this.attriGroup = getValue(row, 29, "int[]");
        this.groupWeight = getValue(row, 30, "int[]");
        this.attriActiveRank = getValue(row, 31, "int[]");
    }
}