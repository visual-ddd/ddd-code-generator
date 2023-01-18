package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTDto;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class DTOStrategy extends AbstractElementStrategy {

    private final ASTDto astDto;

    public DTOStrategy(ASTDto astDto) {
        this.astDto = astDto;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.QUERY_RESULT.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.QUERY_RESULT_CLASS_NAME, astDto.getName());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_DESCRIPTION, astDto.getDescription());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_FIELDS, astDto.getPropertyList());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_METHODS, astDto.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = BusinessDomainStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.QUERY_RESULT_CLASS
        };

        String[] replacementList = {
                (String) context.get(VelocityLabel.QUERY_RESULT_CLASS_NAME)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
