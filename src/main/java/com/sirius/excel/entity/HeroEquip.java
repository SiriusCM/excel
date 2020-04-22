package com.sirius.excel.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

public class HeroEquip implements Entity{

    @Column(column = 0)
    public int sn;  //sn
    @Column(column = 2)
    public String nameSn;  //名称
    @Column(column = 9)
    public int burstSkill;  //愤怒盾技能Sn
    @Column(column = 10)
    public String icon;  //图标资源
    @Column(column = 11)
    public int type;  //类型
    @Column(column = 12)
    public int grade;  //品质Sn
    @Column(column = 13)
    public int profession;  //职业
    @Column(column = 14)
    public int[] feature;  //特性
    @Column(column = 15)
    public int[] mixItem;  //解锁ID
    @Column(column = 16)
    public int[] mixNum;  //解锁数量
    @Column(column = 17)
    public int level;  //阶级
    @Column(column = 18)
    public int prop1;  //生命
    @Column(column = 19)
    public int value1;  //数值1
    @Column(column = 20)
    public int prop2;  //攻击
    @Column(column = 21)
    public int value2;  //数值2
    @Column(column = 22)
    public int prop3;  //防御
    @Column(column = 23)
    public int value3;  //数值3
    @Column(column = 24)
    public int Prop4;  //特殊属性1
    @Column(column = 25)
    public int Value4;  //数值
    @Column(column = 26)
    public int Prop5;  //特殊属性2
    @Column(column = 27)
    public int Value5;  //数值
    @Column(column = 28)
    public int Prop6;  //特殊属性3
    @Column(column = 29)
    public int Value6;  //数值
    @Column(column = 30)
    public int[] attriGroup;  //词缀列表
    @Column(column = 31)
    public int[] locSkillList;  //技能列表
    @Column(column = 32)
    public int[] angerSkillList;  //怒气技能列表

    public HeroEquip(Row row) {
        this.sn = getValue(row, 0, "int");
        this.nameSn = getValue(row, 2, "String");
        this.burstSkill = getValue(row, 9, "int");
        this.icon = getValue(row, 10, "String");
        this.type = getValue(row, 11, "int");
        this.grade = getValue(row, 12, "int");
        this.profession = getValue(row, 13, "int");
        this.feature = getValue(row, 14, "int[]");
        this.mixItem = getValue(row, 15, "int[]");
        this.mixNum = getValue(row, 16, "int[]");
        this.level = getValue(row, 17, "int");
        this.prop1 = getValue(row, 18, "int");
        this.value1 = getValue(row, 19, "int");
        this.prop2 = getValue(row, 20, "int");
        this.value2 = getValue(row, 21, "int");
        this.prop3 = getValue(row, 22, "int");
        this.value3 = getValue(row, 23, "int");
        this.Prop4 = getValue(row, 24, "int");
        this.Value4 = getValue(row, 25, "int");
        this.Prop5 = getValue(row, 26, "int");
        this.Value5 = getValue(row, 27, "int");
        this.Prop6 = getValue(row, 28, "int");
        this.Value6 = getValue(row, 29, "int");
        this.attriGroup = getValue(row, 30, "int[]");
        this.locSkillList = getValue(row, 31, "int[]");
        this.angerSkillList = getValue(row, 32, "int[]");
    }
}