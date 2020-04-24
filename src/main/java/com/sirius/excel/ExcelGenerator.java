package com.sirius.excel;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.*;

public class ExcelGenerator {

    public ExcelGenerator() {
    }

    public void generate(String excelPath, String classPath, String packName, int typeRowIndex, int nameRowIndex, int noteRowIndex) throws IOException {
        List<Sheet> sheetList = loadXlsx(new File(excelPath));
        writeAllClass(sheetList, classPath, packName, typeRowIndex, nameRowIndex, noteRowIndex, new HashMap<>());
    }

    public void generate(String excelPath, String classPath, String packName, int typeRowIndex, int nameRowIndex, int noteRowIndex, Map<String, String> aliasMap) throws IOException {
        List<Sheet> sheetList = loadXlsx(new File(excelPath));
        writeAllClass(sheetList, classPath, packName, typeRowIndex, nameRowIndex, noteRowIndex, aliasMap);
    }

    private void writeAllClass(List<Sheet> sheetList, String classPath, String packName,
                               int typeRowIndex, int nameRowIndex, int noteRowIndex, Map<String, String> aliasMap) {
        File entityFile = new File(classPath + "\\entity");
        File mapperFile = new File(classPath + "\\mapper");
        if (!entityFile.exists()) {
            entityFile.mkdir();
        }
        if (!mapperFile.exists()) {
            mapperFile.mkdir();
        }
        try {
            Template entityTemplate = new Template("entity", new InputStreamReader(ExcelGenerator.class.getResourceAsStream("/template/entity.ftl")));
            Template exampleTemplate = new Template("example", new InputStreamReader(ExcelGenerator.class.getResourceAsStream("/template/example.ftl")));
            Template mapperTemplate = new Template("mapper", new InputStreamReader(ExcelGenerator.class.getResourceAsStream("/template/mapper.ftl")));
            for (Sheet sheet : sheetList) {
                List<Field> fieldList = getFieldList(sheet, aliasMap, typeRowIndex, nameRowIndex, noteRowIndex);
                if (fieldList.isEmpty()) {
                    continue;
                }
                try {
                    String className = sheet.getSheetName();
                    writeClass(entityTemplate, classPath + "\\entity", packName, className, className, fieldList);
                    writeClass(exampleTemplate, classPath + "\\entity", packName, className + "Example", className, fieldList);
                    writeClass(mapperTemplate, classPath + "\\mapper", packName, className + "Mapper", className, fieldList);
                } catch (TemplateException | IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeClass(Template template, String classPath, String packName, String fileName, String className, List<Field> fieldList) throws IOException, TemplateException {
        File docFile = new File(classPath + "\\" + fileName + ".java");
        docFile.createNewFile();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("packName", packName);
        dataMap.put("className", className);
        dataMap.put("fieldList", fieldList);
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
        template.process(dataMap, out);
    }

    private List<Field> getFieldList(Sheet sheet, Map<String, String> aliasMap, int typeRowIndex, int nameRowIndex, int noteRowIndex) {
        List<Field> fieldList = new ArrayList<>();
        Row typeRow = sheet.getRow(typeRowIndex);
        Row nameRow = sheet.getRow(nameRowIndex);
        Row noteRow = sheet.getRow(noteRowIndex);
        if (typeRow == null || nameRow == null || noteRow == null) {
            return fieldList;
        }
        Iterator<Cell> iterator = typeRow.cellIterator();
        while (iterator.hasNext()) {
            Cell columnCell = iterator.next();
            if (columnCell.getCellType() != CellType.STRING || columnCell.getStringCellValue().isEmpty()) {
                continue;
            }
            int column = columnCell.getColumnIndex();
            Cell typeCell = typeRow.getCell(column);
            Cell nameCell = nameRow.getCell(column);
            Cell noteCell = noteRow.getCell(column);
            String type = typeCell.getStringCellValue();
            type = aliasMap.containsKey(type) ? aliasMap.get(type) : type;
            String name = nameCell.getStringCellValue();
            String note = noteCell.getStringCellValue();
            fieldList.add(new Field(column, type, name, note));
        }
        return fieldList;
    }

    private List<Sheet> loadXlsx(File excelFiles) throws IOException {
        List<Sheet> list = new ArrayList<>();
        if (excelFiles.isDirectory()) {
            for (File f : excelFiles.listFiles()) {
                list.addAll(loadXlsx(f));
            }
        } else {
            if (excelFiles.getName().endsWith(".xlsx")) {
                Iterator<Sheet> iterator = WorkbookFactory.create(excelFiles).sheetIterator();
                while (iterator.hasNext()) {
                    Sheet sheet = iterator.next();
                    list.add(sheet);
                }
            }
        }
        return list;
    }

    public class Field {

        private int column;
        private String type;
        private String upperType;
        private String name;
        private String upperName;
        private String note;

        public Field() {
        }

        public Field(int column, String type, String name, String note) {
            this.column = column;
            this.type = type;
            this.name = name;
            this.note = note;
            this.upperType = type;
            upperType = upperType.replaceAll("byte", "Byte");
            upperType = upperType.replaceAll("short", "Short");
            upperType = upperType.replaceAll("int", "Integer");
            upperType = upperType.replaceAll("long", "Long");
            upperType = upperType.replaceAll("float", "Float");
            upperType = upperType.replaceAll("double", "Double");
            upperType = upperType.replaceAll("boolean", "Boolean");
            upperType = upperType.replaceAll("char", "Character");
            upperName = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUpperType() {
            return upperType;
        }

        public void setUpperType(String upperType) {
            this.upperType = upperType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUpperName() {
            return upperName;
        }

        public void setUpperName(String upperName) {
            this.upperName = upperName;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }
    }
}
