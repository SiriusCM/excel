package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.GroupSkill;
import com.sirius.excel.entity.GroupSkillExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupSkillMapper extends Mapper {

    public GroupSkillMapper(File file, int firstRow, int keyColumn) {
        super(file,"GroupSkill", firstRow, keyColumn);
    }

    public int countByExample(GroupSkillExample example) {
        return 0;
    }

    public List<GroupSkill> selectByExample(GroupSkillExample example) {
        List<GroupSkill> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<GroupSkillExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (GroupSkillExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new GroupSkill(row));
                }
            }
        }
        return list;
    }

    public GroupSkill selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new GroupSkill(row);
    }
}