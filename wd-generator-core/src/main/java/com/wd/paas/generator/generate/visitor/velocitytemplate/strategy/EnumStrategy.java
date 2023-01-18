package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EnumStrategy extends AbstractElementStrategy{

    private final ASTEnum anEnum;

    public EnumStrategy(ASTEnum anEnum) {
        this.anEnum = anEnum;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.ENUM.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENUM_CLASS_NAME, anEnum.getName());
        context.put(VelocityLabel.ENUM_CLASS_CONSTANTS, anEnum.getMemberList());
        context.put(VelocityLabel.ENUM_CLASS_DESCRIPTION, anEnum.getDescription());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.ENUM_CLASS
        };

        String[] replacementList = {
                (String) context.get(VelocityLabel.ENUM_CLASS_NAME)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
