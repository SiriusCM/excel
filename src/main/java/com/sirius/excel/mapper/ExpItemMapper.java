package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.ExpItem;
import com.sirius.excel.entity.ExpItemExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpItemMapper extends Mapper {

    public ExpItemMapper(File file, int firstRow, int keyColumn) {
        super(file,"ExpItem", firstRow, keyColumn);
    }

    public int countByExample(ExpItemExample example) {
        return 0;
    }

    public List<ExpItem> selectByExample(ExpItemExample example) {
        List<ExpItem> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<ExpItemExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (ExpItemExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new ExpItem(row));
                }
            }
        }
        return list;
    }

    public ExpItem selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new ExpItem(row);
    }
}