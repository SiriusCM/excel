package ${packName}.entity;

import com.sirius.excel.Column;
import com.sirius.excel.Entity;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;
import java.util.Map;

public class ${className} implements Entity{

<#list fieldList as field>
    @Column(column = ${field.column})
    public ${field.type} ${field.name};  //${field.note}
</#list>

    public ${className}(Row row) {
    <#list fieldList as field>
        this.${field.name} = getValue(row, ${field.column}, "${field.type}");
    </#list>
    }
}