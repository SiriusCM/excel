package com.sirius.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Mapper {

    protected Sheet sheet;
    protected int firstRow;
    protected int keyColumn;

    protected Mapper(File file, String name, int firstRow, int keyColumn) {
        List<Sheet> list = connect(file, name);
        if (!list.isEmpty()) {
            sheet = list.get(0);
        }
        this.firstRow = firstRow;
        this.keyColumn = keyColumn;
    }

    private List<Sheet> connect(File file, String name) {
        List<Sheet> list = new ArrayList<>();
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                list.addAll(connect(f, name));
                if (!list.isEmpty()) {
                    return list;
                }
            }
        } else {
            if (file.getName().endsWith(".xlsx")) {
                try {
                    Workbook workbook = WorkbookFactory.create(file);
                    Iterator<Sheet> iterator = workbook.sheetIterator();
                    while (iterator.hasNext()) {
                        Sheet sheet = iterator.next();
                        String sheetName = sheet.getSheetName();
                        if (name.equals(sheetName)) {
                            list.add(sheet);
                            return list;
                        }
                    }
                    workbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    protected boolean judge(Row row, Entity entity, Criterion criterion) {
        Object value = entity.getValue(row, criterion.getColumn(), criterion.getType());
        switch (criterion.getCondition()) {
            case "is null":
                return row.getCell(criterion.getColumn()) == null;
            case "is not null":
                return row.getCell(criterion.getColumn()) != null;
            case "=":
                return value.equals(criterion.getValue());
            case "<>":
                return !value.equals(criterion.getValue());
            case ">": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte v1 = (Byte) v;
                        return (Byte) value > v1;
                    }
                    case "short":
                    case "Short": {
                        short v1 = (Short) v;
                        return (Short) value > v1;
                    }
                    case "int":
                    case "Integer": {
                        int v1 = (Integer) v;
                        return (Integer) value > v1;
                    }
                    case "long":
                    case "Long": {
                        long v1 = (Long) v;
                        return (Long) value > v1;
                    }
                    case "float":
                    case "Float": {
                        float v1 = (Float) v;
                        return (Float) value > v1;
                    }
                    case "double":
                    case "Double": {
                        double v1 = (Double) v;
                        return (Double) value > v1;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean v1 = (Boolean) v;
                        return (Boolean) value && !v1;
                    }
                    case "char":
                    case "Character": {
                        char v1 = (Character) v;
                        return (Character) value > v1;
                    }
                    default:
                        return false;
                }
            }
            case ">=": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte v1 = (Byte) v;
                        return (Byte) value >= v1;
                    }
                    case "short":
                    case "Short": {
                        short v1 = (Short) v;
                        return (Short) value >= v1;
                    }
                    case "int":
                    case "Integer": {
                        int v1 = (Integer) v;
                        return (Integer) value >= v1;
                    }
                    case "long":
                    case "Long": {
                        long v1 = (Long) v;
                        return (Long) value >= v1;
                    }
                    case "float":
                    case "Float": {
                        float v1 = (Float) v;
                        return (Float) value >= v1;
                    }
                    case "double":
                    case "Double": {
                        double v1 = (Double) v;
                        return (Double) value >= v1;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean v1 = (Boolean) v;
                        return ((Boolean) value && !v1) || ((Boolean) value == v1);
                    }
                    case "char":
                    case "Character": {
                        char v1 = (Character) v;
                        return (Character) value >= v1;
                    }
                    default:
                        return false;
                }
            }
            case "<": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte v1 = (Byte) v;
                        return (Byte) value < v1;
                    }
                    case "short":
                    case "Short": {
                        short v1 = (Short) v;
                        return (Short) value < v1;
                    }
                    case "int":
                    case "Integer": {
                        int v1 = (Integer) v;
                        return (Integer) value < v1;
                    }
                    case "long":
                    case "Long": {
                        long v1 = (Long) v;
                        return (Long) value < v1;
                    }
                    case "float":
                    case "Float": {
                        float v1 = (Float) v;
                        return (Float) value < v1;
                    }
                    case "double":
                    case "Double": {
                        double v1 = (Double) v;
                        return (Double) value < v1;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean v1 = (Boolean) v;
                        return !(Boolean) value && v1;
                    }
                    case "char":
                    case "Character": {
                        char v1 = (Character) v;
                        return (Character) value < v1;
                    }
                    default:
                        return false;
                }
            }
            case "<=": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte v1 = (Byte) v;
                        return (Byte) value <= v1;
                    }
                    case "short":
                    case "Short": {
                        short v1 = (Short) v;
                        return (Short) value <= v1;
                    }
                    case "int":
                    case "Integer": {
                        int v1 = (Integer) v;
                        return (Integer) value <= v1;
                    }
                    case "long":
                    case "Long": {
                        long v1 = (Long) v;
                        return (Long) value <= v1;
                    }
                    case "float":
                    case "Float": {
                        float v1 = (Float) v;
                        return (Float) value <= v1;
                    }
                    case "double":
                    case "Double": {
                        double v1 = (Double) v;
                        return (Double) value <= v1;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean v1 = (Boolean) v;
                        return (!(Boolean) value && v1) || ((Boolean) value == v1);
                    }
                    case "char":
                    case "Character": {
                        char v1 = (Character) v;
                        return (Character) value <= v1;
                    }
                    default:
                        return false;
                }
            }
            case "like": {
                Object o = criterion.getValue();
                return value.toString().contains(o == null ? null : o.toString());
            }
            case "not like": {
                Object o = criterion.getValue();
                return !value.toString().contains(o == null ? null : o.toString());
            }
            case "in": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                List<Object> v1 = (List<Object>) v;
                return v1.contains(value);
            }
            case "not in": {
                Object v = criterion.getValue();
                if (v == null) {
                    return false;
                }
                List<Object> v1 = (List<Object>) v;
                return !v1.contains(value);
            }
            case "between": {
                Object v1 = criterion.getValue();
                Object v2 = criterion.getSecondValue();
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte i1 = v1 == null ? Byte.MIN_VALUE : (Byte) v1;
                        byte i2 = v2 == null ? Byte.MAX_VALUE : (Byte) v2;
                        byte v = (Byte) value;
                        return v >= i1 && v <= i2;
                    }
                    case "short":
                    case "Short": {
                        short i1 = v1 == null ? Short.MIN_VALUE : (Short) v1;
                        short i2 = v2 == null ? Short.MAX_VALUE : (Short) v2;
                        short v = (Short) value;
                        return v >= i1 && v <= i2;
                    }
                    case "int":
                    case "Integer": {
                        int i1 = v1 == null ? Integer.MIN_VALUE : (Integer) v1;
                        int i2 = v2 == null ? Integer.MAX_VALUE : (Integer) v2;
                        int v = (Integer) value;
                        return v >= i1 && v <= i2;
                    }
                    case "long":
                    case "Long": {
                        long i1 = v1 == null ? Long.MIN_VALUE : (Long) v1;
                        long i2 = v2 == null ? Long.MAX_VALUE : (Long) v2;
                        long v = (Long) value;
                        return v >= i1 && v <= i2;
                    }
                    case "float":
                    case "Float": {
                        float i1 = v1 == null ? Float.MIN_VALUE : (Float) v1;
                        float i2 = v2 == null ? Float.MAX_VALUE : (Float) v2;
                        float v = (Float) value;
                        return v >= i1 && v <= i2;
                    }
                    case "double":
                    case "Double": {
                        double i1 = v1 == null ? Double.MIN_VALUE : (Double) v1;
                        double i2 = v2 == null ? Double.MAX_VALUE : (Double) v2;
                        double v = (Double) value;
                        return v >= i1 && v <= i2;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean i1 = v1 == null ? false : (Boolean) v1;
                        boolean i2 = v2 == null ? false : (Boolean) v2;
                        boolean v = (Boolean) value;
                        return v == i1 || v == i2;
                    }
                    case "char":
                    case "Character": {
                        char i1 = v1 == null ? ' ' : (Character) v1;
                        char i2 = v2 == null ? ' ' : (Character) v2;
                        char v = (Character) value;
                        return v >= i1 && v <= i2;
                    }
                    default:
                        return false;
                }
            }
            case "not between": {
                Object v1 = criterion.getValue();
                Object v2 = criterion.getSecondValue();
                switch (criterion.getType()) {
                    case "byte":
                    case "Byte": {
                        byte i1 = v1 == null ? Byte.MIN_VALUE : (Byte) v1;
                        byte i2 = v2 == null ? Byte.MAX_VALUE : (Byte) v2;
                        byte v = (Byte) value;
                        return v < i1 && v > i2;
                    }
                    case "short":
                    case "Short": {
                        short i1 = v1 == null ? Short.MIN_VALUE : (Short) v1;
                        short i2 = v2 == null ? Short.MAX_VALUE : (Short) v2;
                        short v = (Short) value;
                        return v < i1 && v > i2;
                    }
                    case "int":
                    case "Integer": {
                        int i1 = v1 == null ? Integer.MIN_VALUE : (Integer) v1;
                        int i2 = v2 == null ? Integer.MAX_VALUE : (Integer) v2;
                        int v = (Integer) value;
                        return v < i1 && v > i2;
                    }
                    case "long":
                    case "Long": {
                        long i1 = v1 == null ? Long.MIN_VALUE : (Long) v1;
                        long i2 = v2 == null ? Long.MAX_VALUE : (Long) v2;
                        long v = (Long) value;
                        return v < i1 && v > i2;
                    }
                    case "float":
                    case "Float": {
                        float i1 = v1 == null ? Float.MIN_VALUE : (Float) v1;
                        float i2 = v2 == null ? Float.MAX_VALUE : (Float) v2;
                        float v = (Float) value;
                        return v < i1 && v > i2;
                    }
                    case "double":
                    case "Double": {
                        double i1 = v1 == null ? Double.MIN_VALUE : (Double) v1;
                        double i2 = v2 == null ? Double.MAX_VALUE : (Double) v2;
                        double v = (Double) value;
                        return v < i1 && v > i2;
                    }
                    case "boolean":
                    case "Boolean": {
                        boolean i1 = v1 == null ? false : (Boolean) v1;
                        boolean i2 = v2 == null ? false : (Boolean) v2;
                        boolean v = (Boolean) value;
                        return v != i1 && v != i2;
                    }
                    case "char":
                    case "Character": {
                        char i1 = v1 == null ? ' ' : (Character) v1;
                        char i2 = v2 == null ? ' ' : (Character) v2;
                        char v = (Character) value;
                        return v < i1 && v > i2;
                    }
                    default:
                        return false;
                }
            }
            default:
                return false;
        }
    }

    protected int binarySearch(Sheet sheet, int key, int first, int last) {
        int index = (last + first) / 2;
        Row row = sheet.getRow(index);
        int sn = (int) row.getCell(keyColumn).getNumericCellValue();
        if (key > sn) {
            return binarySearch(sheet, key, index, last);
        } else if (key < sn) {
            return binarySearch(sheet, key, first, index);
        } else {
            return index;
        }
    }

    public void close() throws IOException {
        this.sheet.getWorkbook().close();
    }
}
