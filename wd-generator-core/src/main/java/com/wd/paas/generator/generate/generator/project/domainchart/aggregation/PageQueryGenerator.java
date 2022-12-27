package com.wd.paas.generator.generate.generator.project.domainchart.aggregation;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 分页查询对象生成器
 *
 * @author ZhuXueLiang
 * @date 2022/9/24 00:17
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PageQueryGenerator extends AbstractGenerator {

    /**
     * 类信息
     */
    private UmlClass umlClass;
    /**
     * 查询结果集类型
     */
    private String queryResultType;

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.PAGE_QUERY_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.PAGE_QUERY_CLASS_PACKAGE, umlClass.getClassPackage());
        context.put(VelocityLabel.PAGE_QUERY_CLASS_DESCRIPTION, umlClass.getClassDesc());
        context.put(VelocityLabel.PAGE_QUERY_CLASS_FIELDS, umlClass.getFieldList());
        context.put(VelocityLabel.PAGE_QUERY_CLASS_METHODS, umlClass.getMethodList());
        context.put(VelocityLabel.QUERY_RESULT_TYPE, queryResultType);
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.PAGE_QUERY;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
            .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
            .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER))
            .replace(ModelUrlConstant.PAGE_QUERY_CLASS, umlClass.getClassName());
    }
}
