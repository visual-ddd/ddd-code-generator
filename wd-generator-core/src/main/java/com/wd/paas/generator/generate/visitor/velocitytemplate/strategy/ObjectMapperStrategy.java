package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.common.enums.ConvertTypeEnum;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMapperStrategy extends AbstractElementStrategy{

    private final ASTObjectMapper astObjectMapper;

    public ObjectMapperStrategy(ASTObjectMapper astObjectMapper){
        this.astObjectMapper = astObjectMapper;
    }

    @Override
    public List<String> getTemplatePathList() {
        List<String> list = new ArrayList<>();
        String type = astObjectMapper.getSource().getType();
        switch (ConvertTypeEnum.of(type)) {
            case ENTITY2DO:
                list.addAll(Arrays.asList(GenerateElementTypeEnum.OBJECT_MAPPER_MODEL.getTemplateUrls()));
                list.addAll(Arrays.asList(GenerateElementTypeEnum.OBJECT_MAPPER_MODEL_ENTITY_TO_DO.getTemplateUrls()));
                break;
            case DTO2DO:
                list.addAll(Arrays.asList(GenerateElementTypeEnum.OBJECT_MAPPER_MODEL_DTO_TO_DO.getTemplateUrls()));
                break;
        }
        return list;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.OBJECT_MAPPER_CLASS_NAME, astObjectMapper.getName());
        context.put(VelocityLabel.OBJECT_MAPPER_CLASS_DESCRIPTION, astObjectMapper.getDescription());
        context.put(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT, astObjectMapper.getSource().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT, astObjectMapper.getTarget().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_TYPE, astObjectMapper.getSource().getType());
        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_AGGREGATION, astObjectMapper.getSource().getParent());
        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_FIELD_LIST, astObjectMapper.getConvertList());

    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = BusinessDomainStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.OBJECT_MAPPER_CONVERT_CLASS,
                ModelUrlConstant.QUERY_RESULT_CLASS,
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.OBJECT_MAPPER_CLASS_NAME),
                (String) context.get(VelocityLabel.OBJECT_MAPPER_CLASS_NAME),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
