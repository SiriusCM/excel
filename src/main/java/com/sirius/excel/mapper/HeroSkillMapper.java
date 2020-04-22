package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.HeroSkill;
import com.sirius.excel.entity.HeroSkillExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroSkillMapper extends Mapper {

    public HeroSkillMapper(File file, int firstRow, int keyColumn) {
        super(file,"HeroSkill", firstRow, keyColumn);
    }

    public int countByExample(HeroSkillExample example) {
        return 0;
    }

    public List<HeroSkill> selectByExample(HeroSkillExample example) {
        List<HeroSkill> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<HeroSkillExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (HeroSkillExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new HeroSkill(row));
                }
            }
        }
        return list;
    }

    public HeroSkill selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new HeroSkill(row);
    }
}