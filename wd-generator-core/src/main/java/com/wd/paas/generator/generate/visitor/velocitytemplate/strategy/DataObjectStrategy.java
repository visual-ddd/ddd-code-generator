package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.DataObjectNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 10:26:28
 * describe 数据模对象处理器
 */
public class DataObjectStrategy extends AbstractElementStrategy {

    private final DataObjectNode dataObject;

    public DataObjectStrategy(DataObjectNode astDataObject) {
        this.dataObject = astDataObject;
    }

    @Override
    public void preHandle(TemplateContext templateContext) {
        dataObject.initProperties();
        super.preHandle(templateContext);
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.DATA_MODEL.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DATA_OBJECT_CLASS_NAME, dataObject.getName());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_DESCRIPTION, dataObject.getDescription());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_FIELDS, dataObject.getDataPropertyList());
        context.put(VelocityLabel.DATA_TABLE_NAME, dataObject.getTableName());

    }
    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return dataObject.getOutputPath(templateUrl, preFixOutPath);
    }
}
