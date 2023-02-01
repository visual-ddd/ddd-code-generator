package com.wd.paas.generator.generate.element;

import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.common.MetaInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 15:25:55
 * describe TODO
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTDataObject extends LeafElement{

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String tableName;

    private List<DataPropertyInfo> dataPropertyList;

    private DataIndexInfo dataIndexInfo;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
