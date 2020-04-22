package com.sirius.excel;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, String> aliasMap = new HashMap<>();
        aliasMap.put("string", "String");
        aliasMap.put("string[]", "String[]");
        String classPath = "src/main/java/com/sirius/excel";
        String packName = "com.sirius.excel";
        Generate generate = new Generate();
        generate.generate("D:\\Code", classPath, packName, 0, 1, 2, 3, aliasMap);
    }
}