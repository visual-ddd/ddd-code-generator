package com.wd.paas.generator.generate.generator.project.domainchart.aggregation;

import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 查询结果DTO生成器
 *
 * @author ZhuXueLiang
 * @date 2022/9/24 00:17
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryResultGenerator extends AbstractGenerator {

    /**
     * 类信息
     */
    private UmlClass umlClass;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        umlClass.putVelocityContext(context);
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.QUERY_RESULT;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
            .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
            .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_ALL_LOWER_NAME))
            .replace(ModelUrlConstant.QUERY_RESULT_CLASS, umlClass.getClassName());
    }
}
