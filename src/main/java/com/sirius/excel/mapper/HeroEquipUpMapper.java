package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.HeroEquipUp;
import com.sirius.excel.entity.HeroEquipUpExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroEquipUpMapper extends Mapper {

    public HeroEquipUpMapper(File file, int firstRow, int keyColumn) {
        super(file,"HeroEquipUp", firstRow, keyColumn);
    }

    public int countByExample(HeroEquipUpExample example) {
        return 0;
    }

    public List<HeroEquipUp> selectByExample(HeroEquipUpExample example) {
        List<HeroEquipUp> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<HeroEquipUpExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (HeroEquipUpExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new HeroEquipUp(row));
                }
            }
        }
        return list;
    }

    public HeroEquipUp selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new HeroEquipUp(row);
    }
}