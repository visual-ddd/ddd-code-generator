package com.wd.paas.generator.generate.generator.project.domainchart.aggregation;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
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
import java.util.Objects;

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
     * 枚举
     */
    private List<EnumGenerator> enumList;
    /**
     * 值对象列表
     */
    private List<ValueObjectGenerator> valueObjectList;
    /**
     * 指令列表
     */
    private List<CmdGenerator> cmdList;
    /**
     * 查询结果DTO列表
     */
    private List<QueryResultGenerator> queryResultList;
    /**
     * 查询对象列表
     */
    private List<QueryGenerator> queryList;
    /**
     * 分页查询对象列表
     */
    private List<PageQueryGenerator> pageQueryList;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
        valueObjectList.forEach(
            valueObjectGenerator -> valueObjectGenerator.run(generateContext));
        entityList.forEach(
            entityGenerator -> entityGenerator.run(generateContext));
        enumList.forEach(
            enumGenerator -> enumGenerator.run(generateContext));
        cmdList.forEach(
            cmdGenerator -> cmdGenerator.run(generateContext));
        // 视图
        queryResultList.forEach(
            queryResultGenerator -> queryResultGenerator.run(generateContext));
        queryList.forEach(
            queryGenerator -> queryGenerator.run(generateContext));
        pageQueryList.forEach(
            pageQueryGenerator -> pageQueryGenerator.run(generateContext));
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.AGGREGATION;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.AGGREGATION_CLASS_PACKAGE, umlClass.getClassPackage());
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, umlClass.getClassDesc());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, umlClass.getFieldList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, umlClass.getMethodList());
        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, enumList);
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, cmdList);
        context.put(VelocityLabel.AGGREGATION_QUERY_LIST, queryList);
        context.put(VelocityLabel.AGGREGATION_PAGE_QUERY_LIST, pageQueryList);
        context.put(VelocityLabel.AGGREGATION_QUERY_RESULT_LIST, queryResultList);
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER,
            umlClass.getClassName().toLowerCase());
        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN,
            CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_UNDERSCORE,
            CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_CAMEL,
            CaseFormat.UPPER_CAMEL.converterTo(CaseFormat.LOWER_CAMEL));
        context.put(VelocityLabel.AGGREGATION_GENERATOR_UTIL, new AggregationGeneratorUtil());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
            .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
            .replace(ModelUrlConstant.AGGREGATION, StringUtils.lowerCase(umlClass.getClassName()))
            .replace(ModelUrlConstant.AGGREGATION_CLASS, umlClass.getClassName());
    }

    public class AggregationGeneratorUtil {

        public String enumType2Value(String umlFieldType) {
            for (EnumGenerator enumGenerator : enumList) {
                String enumName = enumGenerator.getUmlClass().getClassName();
                if (Objects.equals(enumName, umlFieldType)) {
                    return "Integer";
                }
            }
            return umlFieldType;
        }
    }
}
