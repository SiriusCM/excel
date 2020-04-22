package com.sirius.excel.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import com.sirius.excel.entity.Item;
import com.sirius.excel.entity.ItemExample;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemMapper extends Mapper {

    public ItemMapper(File file, int firstRow, int keyColumn) {
        super(file,"Item", firstRow, keyColumn);
    }

    public int countByExample(ItemExample example) {
        return 0;
    }

    public List<Item> selectByExample(ItemExample example) {
        List<Item> list = new ArrayList<>();
        if (example == null) {
            return list;
        } else {
            List<ItemExample.Criteria> criteriaList = example.getOredCriteria();
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (ItemExample.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new Item(row));
                }
            }
        }
        return list;
    }

    public Item selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new Item(row);
    }
}