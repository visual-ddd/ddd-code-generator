package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.EnumNode;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EnumStrategy extends AbstractElementStrategy{

    private final EnumNode anEnum;

    public EnumStrategy(EnumNode anEnum) {
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
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return anEnum.getOutputPath(templateUrl, preFixOutPath);
    }

}
