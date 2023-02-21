package com.wd.paas.generator.generate.element;


import com.wd.paas.common.MethodInfo;
import com.wd.paas.common.PropertyInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EntityNode extends LeafElement{

    private Boolean isAbstract;

    private PropertyInfo id;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodInfoList;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode parentNode = (AggregateNode) this.getParentNode();
        String outputPath = parentNode.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.ENTITY_CLASS
        };

        String[] replacementList = {
                this.getName()
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

}
