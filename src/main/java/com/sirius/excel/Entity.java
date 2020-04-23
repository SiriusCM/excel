package com.sirius.excel;

import org.apache.poi.ss.usermodel.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Entity {

    default <T> T getValue(Row row, int column, String type) {
        Cell cell = row.getCell(column);
        if (cell == null) {
            return (T) convert(type, null);
        }
        switch (cell.getCellType()) {
            case BOOLEAN: {
                Object value = cell.getBooleanCellValue();
                return (T) value;
            }
            case STRING: {
                String value = cell.getStringCellValue();
                return (T) convert(type, value);
            }
            case NUMERIC: {
                double value = cell.getNumericCellValue();
                return (T) convert(type, value);
            }
            case BLANK:
                return (T) convert(type, null);
            case FORMULA:
                Workbook wb = cell.getSheet().getWorkbook();
                CreationHelper crateHelper = wb.getCreationHelper();
                FormulaEvaluator evaluator = crateHelper.createFormulaEvaluator();
                CellValue cellValue = evaluator.evaluate(cell);
                switch (cellValue.getCellType()) {
                    case NUMERIC: {
                        double value = cell.getNumericCellValue();
                        return (T) convert(type, value);
                    }
                    case STRING: {
                        String value = cell.getStringCellValue();
                        return (T) convert(type, value);
                    }
                    default:
                        return null;
                }
            default:
                return null;
        }
    }

    default Object convert(String type, Object object) {
        switch (type) {
            case "byte":
            case "Byte": {
                if (object == null) {
                    return 0;
                }
                double value = (Double) object;
                return (byte) value;
            }
            case "short":
            case "Short": {
                if (object == null) {
                    return 0;
                }
                double value = (Double) object;
                return (short) value;
            }
            case "int":
            case "Integer": {
                if (object == null) {
                    return 0;
                }
                double value = (Double) object;
                return (int) value;
            }
            case "long":
            case "Long": {
                if (object == null) {
                    return 0;
                }
                double value = (Double) object;
                return (long) value;
            }
            case "float":
            case "Float": {
                if (object == null) {
                    return 0;
                }
                double value = (Double) object;
                return (float) value;
            }
            case "double":
            case "Double":
                if (object == null) {
                    return 0;
                }
                return object;
            case "boolean":
            case "Boolean":
                if (object == null) {
                    return false;
                }
                return Boolean.parseBoolean(object.toString());
            case "char":
            case "Character":
                if (object == null) {
                    return ' ';
                }
                return object.toString().charAt(0);
            case "String":
                if (object == null) {
                    return "";
                }
                return object.toString();
            case "byte[]": {
                if (object == null) {
                    return new byte[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new byte[0];
                }
                String[] array = value.split(",");
                byte[] bytes = new byte[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    bytes[i] = (byte) r;
                }
                return bytes;
            }
            case "Byte[]": {
                if (object == null) {
                    return new Byte[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Byte[0];
                }
                String[] array = value.split(",");
                Byte[] bytes = new Byte[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    bytes[i] = (byte) r;
                }
                return bytes;
            }
            case "short[]": {
                if (object == null) {
                    return new short[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new short[0];
                }
                String[] array = value.split(",");
                short[] shorts = new short[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    shorts[i] = (short) r;
                }
                return shorts;
            }
            case "Short[]": {
                if (object == null) {
                    return new Short[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Short[0];
                }
                String[] array = value.split(",");
                Short[] shorts = new Short[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    shorts[i] = (short) r;
                }
                return shorts;
            }
            case "int[]": {
                if (object == null) {
                    return new int[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new int[0];
                }
                String[] array = value.split(",");
                int[] ints = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    ints[i] = (int) r;
                }
                return ints;
            }
            case "Integer[]": {
                if (object == null) {
                    return new Integer[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Integer[0];
                }
                String[] array = value.split(",");
                Integer[] ints = new Integer[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    ints[i] = (int) r;
                }
                return ints;
            }
            case "long[]": {
                if (object == null) {
                    return new long[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new long[0];
                }
                String[] array = value.split(",");
                long[] longs = new long[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    longs[i] = (long) r;
                }
                return longs;
            }
            case "Long[]": {
                if (object == null) {
                    return new Long[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Long[0];
                }
                String[] array = value.split(",");
                Long[] longs = new Long[array.length];
                for (int i = 0; i < array.length; i++) {
                    double r = Double.parseDouble(array[i]);
                    longs[i] = (long) r;
                }
                return longs;
            }
            case "float[]": {
                if (object == null) {
                    return new float[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new float[0];
                }
                String[] array = value.split(",");
                float[] floats = new float[array.length];
                for (int i = 0; i < array.length; i++) {
                    floats[i] = Float.parseFloat(array[i]);
                }
                return floats;
            }
            case "Float[]": {
                if (object == null) {
                    return new Float[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Float[0];
                }
                String[] array = value.split(",");
                Float[] floats = new Float[array.length];
                for (int i = 0; i < array.length; i++) {
                    floats[i] = Float.parseFloat(array[i]);
                }
                return floats;
            }
            case "double[]": {
                if (object == null) {
                    return new double[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new double[0];
                }
                String[] array = value.split(",");
                double[] doubles = new double[array.length];
                for (int i = 0; i < array.length; i++) {
                    doubles[i] = Double.parseDouble(array[i]);
                }
                return doubles;
            }
            case "Double[]": {
                if (object == null) {
                    return new Double[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Double[0];
                }
                String[] array = value.split(",");
                Double[] doubles = new Double[array.length];
                for (int i = 0; i < array.length; i++) {
                    doubles[i] = Double.parseDouble(array[i]);
                }
                return doubles;
            }
            case "boolean[]": {
                if (object == null) {
                    return new boolean[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new boolean[0];
                }
                String[] array = value.split(",");
                boolean[] booleans = new boolean[array.length];
                for (int i = 0; i < array.length; i++) {
                    booleans[i] = Boolean.parseBoolean(array[i]);
                }
                return booleans;
            }
            case "Boolean[]": {
                if (object == null) {
                    return new Boolean[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Boolean[0];
                }
                String[] array = value.split(",");
                Boolean[] booleans = new Boolean[array.length];
                for (int i = 0; i < array.length; i++) {
                    booleans[i] = Boolean.parseBoolean(array[i]);
                }
                return booleans;
            }
            case "char[]": {
                if (object == null) {
                    return new char[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new char[0];
                }
                String[] array = value.split(",");
                char[] chars = new char[array.length];
                for (int i = 0; i < array.length; i++) {
                    chars[i] = array[i].charAt(0);
                }
                return chars;
            }
            case "Character[]": {
                if (object == null) {
                    return new Character[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new Character[0];
                }
                String[] array = value.split(",");
                Character[] chars = new Character[array.length];
                for (int i = 0; i < array.length; i++) {
                    chars[i] = array[i].charAt(0);
                }
                return chars;
            }
            case "String[]": {
                if (object == null) {
                    return new String[0];
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return new String[0];
                }
                return value.split(",");
            }
            case "List<Byte>": {
                List<Byte> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    double r = Double.parseDouble(v);
                    list.add((byte) r);
                }
                return list;
            }
            case "List<Short>": {
                List<Short> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    double r = Double.parseDouble(v);
                    list.add((short) r);
                }
                return list;
            }
            case "List<Integer>": {
                List<Integer> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    double r = Double.parseDouble(v);
                    list.add((int) r);
                }
                return list;
            }
            case "List<Long>": {
                List<Long> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    double r = Double.parseDouble(v);
                    list.add((long) r);
                }
                return list;
            }
            case "List<Float>": {
                List<Float> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    list.add(Float.parseFloat(v));
                }
                return list;
            }
            case "List<Double>": {
                List<Double> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    list.add(Double.parseDouble(v));
                }
                return list;
            }
            case "List<Boolean>": {
                List<Boolean> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    list.add(Boolean.parseBoolean(v));
                }
                return list;
            }
            case "List<Character>": {
                List<Character> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    list.add(v.charAt(0));
                }
                return list;
            }
            case "List<String>": {
                List<String> list = new ArrayList<>();
                if (object == null) {
                    return list;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return list;
                }
                for (String v : value.split(",")) {
                    list.add(v);
                }
                return list;
            }
            case "Map<Integer,Integer>": {
                Map<Integer, Integer> map = new HashMap<>();
                if (object == null) {
                    return map;
                }
                String value = object.toString();
                if (value.isEmpty() || value.equals(" ")) {
                    return map;
                }
                for (String entry : value.split(",")) {
                    String[] e = entry.split(":");
                    map.compute(Integer.parseInt(e[0]), (k, v) -> v == null ? Integer.parseInt(e[1]) : v + Integer.parseInt(e[1]));
                }
                return map;
            }
            default:
                return null;
        }
    }
}
