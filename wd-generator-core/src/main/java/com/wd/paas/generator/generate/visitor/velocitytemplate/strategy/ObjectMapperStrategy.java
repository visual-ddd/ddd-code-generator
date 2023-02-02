package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class ObjectMapperStrategy extends AbstractElementStrategy{

    private final ASTObjectMapper astObjectMapper;

    public ObjectMapperStrategy(ASTObjectMapper astObjectMapper){
        this.astObjectMapper = astObjectMapper;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.OBJECT_MAPPER_MODEL.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.OBJECT_MAPPER_CLASS_NAME, astObjectMapper.getName());
        context.put(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT, astObjectMapper.getSource().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT, astObjectMapper.getTarget().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_TYPE, astObjectMapper.getSource().getType());
        context.put(VelocityLabel.OBJECT_MAPPER_AGGREGATION, astObjectMapper.getSource().getParent());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = BusinessDomainStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.OBJECT_MAPPER_CONVERT_CLASS,
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.OBJECT_MAPPER_CLASS_NAME),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
