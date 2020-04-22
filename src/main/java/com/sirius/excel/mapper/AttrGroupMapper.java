package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.AttrGroup;
import com.sirius.excel.entity.AttrGroupExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AttrGroupMapper extends Mapper {

    public AttrGroupMapper(File file, int firstRow, int keyColumn) {
        super(file,"AttrGroup", firstRow, keyColumn);
    }

    public int countByExample(AttrGroupExample example) {
        return 0;
    }

    public List<AttrGroup> selectByExample(AttrGroupExample example) {
        List<AttrGroup> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<AttrGroupExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (AttrGroupExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new AttrGroup(row));
                }
            }
        }
        return list;
    }

    public AttrGroup selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new AttrGroup(row);
    }
}