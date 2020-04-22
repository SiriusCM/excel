package com.sirius.excel;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;
import java.util.*;

public class Generate {

    public Generate() {
    }

    public void generate(String excelPath, String classPath, String packName, int columnRowIndex, int typeRowIndex, int nameRowIndex, int noteRowIndex) throws IOException {
        List<Sheet> sheetList = loadXlsx(new File(excelPath));
        writeAllClass(sheetList, classPath, packName, columnRowIndex, typeRowIndex, nameRowIndex, noteRowIndex, new HashMap<>());
    }

    public void generate(String excelPath, String classPath, String packName, int columnRowIndex, int typeRowIndex, int nameRowIndex, int noteRowIndex, Map<String, String> aliasMap) throws IOException {
        List<Sheet> sheetList = loadXlsx(new File(excelPath));
        writeAllClass(sheetList, classPath, packName, columnRowIndex, typeRowIndex, nameRowIndex, noteRowIndex, aliasMap);
    }

    private void writeAllClass(List<Sheet> sheetList, String classPath, String packName,
                               int columnRowIndex, int typeRowIndex, int nameRowIndex, int noteRowIndex, Map<String, String> aliasMap) {
        File entityFile = new File(classPath + "\\entity");
        File mapperFile = new File(classPath + "\\mapper");
        if (!entityFile.exists()) {
            entityFile.mkdir();
        }
        if (!mapperFile.exists()) {
            mapperFile.mkdir();
        }
        for (Sheet sheet : sheetList) {
            String[] confName = sheet.getSheetName().split("\\|");
            if (confName.length < 2) {
                continue;
            }
            List<Field> fieldList = getFieldList(sheet, aliasMap, columnRowIndex, typeRowIndex, nameRowIndex, noteRowIndex);
            if (fieldList.isEmpty()) {
                continue;
            }
            String fileName = confName[1];
            String className = confName[1];
            Configuration configuration = new Configuration();
            String templatePath = this.getClass().getClassLoader().getResource("").getPath();
            try {
                configuration.setDirectoryForTemplateLoading(new File(templatePath));
                Template entityTemplate = configuration.getTemplate("entity.ftl");
                Template exampleTemplate = configuration.getTemplate("example.ftl");
                Template mapperTemplate = configuration.getTemplate("mapper.ftl");
                writeClass(entityTemplate, classPath + "\\entity", packName + ".entity", fileName, className, fieldList);
                writeClass(exampleTemplate, classPath + "\\entity", packName + ".entity", fileName + "Example", className, fieldList);
                writeClass(mapperTemplate, classPath + "\\mapper", packName + ".mapper", fileName + "Mapper", className, fieldList);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TemplateException e) {
                e.printStackTrace();
            }
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

    private List<Field> getFieldList(Sheet sheet, Map<String, String> aliasMap, int columnRowIndex, int typeRowIndex, int nameRowIndex, int noteRowIndex) {
        List<Field> fieldList = new ArrayList<>();
        Row columnRow = sheet.getRow(columnRowIndex);
        Row typeRow = sheet.getRow(typeRowIndex);
        Row nameRow = sheet.getRow(nameRowIndex);
        Row noteRow = sheet.getRow(noteRowIndex);
        if (columnRow == null || typeRow == null || nameRow == null || noteRow == null) {
            return fieldList;
        }
        Iterator<Cell> iterator = columnRow.cellIterator();
        while (iterator.hasNext()) {
            Cell columnCell = iterator.next();
            if (columnCell.getStringCellValue().isEmpty() || !columnCell.getStringCellValue().contains("s")) {
                continue;
            }
            int column = columnCell.getColumnIndex();
            Cell typeCell = typeRow.getCell(column);
            Cell nameCell = nameRow.getCell(column);
            Cell noteCell = noteRow.getCell(column);
            String type = typeCell.getStringCellValue();
            type = aliasMap.containsKey(type) ? aliasMap.get(type) : type;
            String name = nameCell.getStringCellValue();
            String note = noteCell.getStringCellValue().replaceAll("\n", " ");
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
            if (excelFiles.getName().endsWith("xlsx")) {
                Iterator<Sheet> iterator = WorkbookFactory.create(excelFiles).sheetIterator();
                while (iterator.hasNext()) {
                    Sheet sheet = iterator.next();
                    list.add(sheet);
                }
            }
        }
        return list;
    }
}
