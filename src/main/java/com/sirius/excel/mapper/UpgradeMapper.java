package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.Upgrade;
import com.sirius.excel.entity.UpgradeExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpgradeMapper extends Mapper {

    public UpgradeMapper(File file, int firstRow, int keyColumn) {
        super(file,"Upgrade", firstRow, keyColumn);
    }

    public int countByExample(UpgradeExample example) {
        return 0;
    }

    public List<Upgrade> selectByExample(UpgradeExample example) {
        List<Upgrade> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<UpgradeExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (UpgradeExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new Upgrade(row));
                }
            }
        }
        return list;
    }

    public Upgrade selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new Upgrade(row);
    }
}