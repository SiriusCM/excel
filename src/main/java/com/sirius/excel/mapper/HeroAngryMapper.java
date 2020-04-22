package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.HeroAngry;
import com.sirius.excel.entity.HeroAngryExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroAngryMapper extends Mapper {

    public HeroAngryMapper(File file, int firstRow, int keyColumn) {
        super(file,"HeroAngry", firstRow, keyColumn);
    }

    public int countByExample(HeroAngryExample example) {
        return 0;
    }

    public List<HeroAngry> selectByExample(HeroAngryExample example) {
        List<HeroAngry> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<HeroAngryExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (HeroAngryExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new HeroAngry(row));
                }
            }
        }
        return list;
    }

    public HeroAngry selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new HeroAngry(row);
    }
}