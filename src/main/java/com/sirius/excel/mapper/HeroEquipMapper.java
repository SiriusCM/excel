package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.HeroEquip;
import com.sirius.excel.entity.HeroEquipExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroEquipMapper extends Mapper {

    public HeroEquipMapper(File file, int firstRow, int keyColumn) {
        super(file,"HeroEquip", firstRow, keyColumn);
    }

    public int countByExample(HeroEquipExample example) {
        return 0;
    }

    public List<HeroEquip> selectByExample(HeroEquipExample example) {
        List<HeroEquip> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<HeroEquipExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (HeroEquipExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new HeroEquip(row));
                }
            }
        }
        return list;
    }

    public HeroEquip selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new HeroEquip(row);
    }
}