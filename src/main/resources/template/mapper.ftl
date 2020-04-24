package ${packName}.mapper;

import com.sirius.excel.Criterion;
import com.sirius.excel.Mapper;
import ${packName}.entity.${className};
import ${packName}.entity.${className}Example;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ${className}Mapper extends Mapper {

    public ${className}Mapper(File file, int firstRow, int keyColumn) {
        super(file, "${className}", firstRow, keyColumn);
    }

    public ${className}Mapper(String filePath, int firstRow, int keyColumn) {
        super(new File(filePath), "${className}", firstRow, keyColumn);
    }

    public int countByExample(${className}Example example) {
        int count = 0;
        if (example == null) {
            count = sheet.getPhysicalNumberOfRows() - firstRow;
        } else {
            Iterator<Row> rowIterator = sheet.rowIterator();
            for (int i = 0; i < firstRow; i++) {
                rowIterator.next();
            }
            List<${className}Example.Criteria> criteriaList = example.getOredCriteria();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (${className}Example.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<${className}> selectByExample(${className}Example example) {
        List<${className}> list = new ArrayList<>();
        Iterator<Row> rowIterator = sheet.rowIterator();
        for (int i = 0; i < firstRow; i++) {
            rowIterator.next();
        }
        if (example == null) {
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                list.add(new ${className}(row));
            }
        } else {
            List<${className}Example.Criteria> criteriaList = example.getOredCriteria();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                boolean result = false;
                for (${className}Example.Criteria criteria : criteriaList) {
                    boolean r = true;
                    for (Criterion criterion : criteria.getAllCriteria()) {
                        r = r && judge(row, example, criterion);
                    }
                    result = result || r;
                }
                if (result) {
                    list.add(new ${className}(row));
                }
            }
        }
        return list;
    }

    public ${className} selectByPrimaryKey(int k) {
        int index = binarySearch(sheet, k, firstRow, sheet.getLastRowNum());
        Row row = sheet.getRow(index);
        return new ${className}(row);
    }
}