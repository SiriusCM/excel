package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class HeroEquipUp implements Entity{

    @Column(column = 0)
    public int sn;  //装备sn
    @Column(column = 1)
    public int limitLv;  //等级上限
    @Column(column = 2)
    public int gold;  //金钱
    @Column(column = 3)
    public int[] item;  //需求道具
    @Column(column = 4)
    public int[] itemNum;  //需求数量
    @Column(column = 5)
    public int upgradeProp1;  //升级生命
    @Column(column = 6)
    public int upgradeValue1;  //数值
    @Column(column = 7)
    public int upgradeProp2;  //升级攻击
    @Column(column = 8)
    public int upgradeValue2;  //数值
    @Column(column = 9)
    public int upgradeProp3;  //升级防御
    @Column(column = 10)
    public int upgradeValue3;  //数值
    @Column(column = 11)
    public int upgradeProp4;  //特殊属性1
    @Column(column = 12)
    public int upgradeValue4;  //数值
    @Column(column = 13)
    public int upgradeProp5;  //特殊属性2
    @Column(column = 14)
    public int upgradeValue5;  //数值
    @Column(column = 15)
    public int upgradeProp6;  //特殊属性3
    @Column(column = 16)
    public int upgradeValue6;  //数值

    public HeroEquipUp(Row row) {
        this.sn = getValue(row, 0, "int");
        this.limitLv = getValue(row, 1, "int");
        this.gold = getValue(row, 2, "int");
        this.item = getValue(row, 3, "int[]");
        this.itemNum = getValue(row, 4, "int[]");
        this.upgradeProp1 = getValue(row, 5, "int");
        this.upgradeValue1 = getValue(row, 6, "int");
        this.upgradeProp2 = getValue(row, 7, "int");
        this.upgradeValue2 = getValue(row, 8, "int");
        this.upgradeProp3 = getValue(row, 9, "int");
        this.upgradeValue3 = getValue(row, 10, "int");
        this.upgradeProp4 = getValue(row, 11, "int");
        this.upgradeValue4 = getValue(row, 12, "int");
        this.upgradeProp5 = getValue(row, 13, "int");
        this.upgradeValue5 = getValue(row, 14, "int");
        this.upgradeProp6 = getValue(row, 15, "int");
        this.upgradeValue6 = getValue(row, 16, "int");
    }
}