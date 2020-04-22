package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.SuitBuff;
import com.sirius.excel.entity.SuitBuffExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuitBuffMapper extends Mapper {

    public SuitBuffMapper(File file, int firstRow, int keyColumn) {
        super(file,"SuitBuff", firstRow, keyColumn);
    }

    public int countByExample(SuitBuffExample example) {
        return 0;
    }

    public List<SuitBuff> selectByExample(SuitBuffExample example) {
        List<SuitBuff> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<SuitBuffExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (SuitBuffExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new SuitBuff(row));
                }
            }
        }
        return list;
    }

    public SuitBuff selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new SuitBuff(row);
    }
}