package com.wd.paas.generator.generate.generator.project.domainchart.aggregation;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * 聚合生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AggregationGenerator extends AbstractGenerator {

    /**
     * uml类信息
     */
    private UmlClass umlClass;
    /**
     * 实体
     */
    private List<EntityGenerator> entityList;
    /**
     * 值对象列表
     */
    private List<ValueObjectGenerator> valueObjectList;
    /**
     * 指令列表
     */
    private List<CmdGenerator> cmdList;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
        valueObjectList.forEach(valueObjectGenerator -> valueObjectGenerator.generate(generateContext));
        entityList.forEach(entityGenerator -> entityGenerator.generate(generateContext));
        cmdList.forEach(cmdGenerator -> cmdGenerator.generate(generateContext));
        entityList.forEach(entityGenerator -> entityGenerator.generate(generateContext));
    }

    @Override
    public String[] getElementTypeUrl() {
        return GenerateElementTypeEnum.AGGREGATION.getTemplateUrls();
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        umlClass.putVelocityContext(context);
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.AGGREGATION_ALL_LOWER_NAME, umlClass.getClassName().toLowerCase());
        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN, CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CMD_LIST, cmdList);
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
                .replace(ModelUrlConstant.AGGREGATION, StringUtils.lowerCase(umlClass.getClassName()))
                .replace(ModelUrlConstant.AGGREGATION_CLASS, umlClass.getClassName());
    }
}
