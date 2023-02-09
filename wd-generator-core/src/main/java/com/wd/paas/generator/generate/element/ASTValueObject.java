package com.wd.paas.generator.generate.element;


import com.wd.paas.common.MethodInfo;
import com.wd.paas.common.PropertyInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/***
 * @author  wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTValueObject extends LeafElement {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodList;


    public String getOutputPath(String templateUrl, String preFixOutPath) {
        ASTAggregate astAggregate = (ASTAggregate)this.getParentNode();
        String outputPath = astAggregate.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.VALUE_OBJECT_CLASS
        };
        String[] replacementList = {
                name
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
