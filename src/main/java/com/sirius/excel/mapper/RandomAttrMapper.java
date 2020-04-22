package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.RandomAttr;
import com.sirius.excel.entity.RandomAttrExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RandomAttrMapper extends Mapper {

    public RandomAttrMapper(File file, int firstRow, int keyColumn) {
        super(file,"RandomAttr", firstRow, keyColumn);
    }

    public int countByExample(RandomAttrExample example) {
        return 0;
    }

    public List<RandomAttr> selectByExample(RandomAttrExample example) {
        List<RandomAttr> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<RandomAttrExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (RandomAttrExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new RandomAttr(row));
                }
            }
        }
        return list;
    }

    public RandomAttr selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new RandomAttr(row);
    }
}