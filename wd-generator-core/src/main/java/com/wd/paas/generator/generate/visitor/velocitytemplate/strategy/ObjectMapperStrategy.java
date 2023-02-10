package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.common.enums.ConvertTypeEnum;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ObjectMapperNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMapperStrategy extends AbstractElementStrategy{

    private final ObjectMapperNode astObjectMapper;

    public ObjectMapperStrategy(ObjectMapperNode astObjectMapper){
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
    public Boolean process(TemplateContext templateContext) {
        // 缓存对象映射关系
        storeObjectMapper();
        return Boolean.TRUE;
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
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astObjectMapper.getOutputPath(templateUrl, preFixOutPath);
    }

    /**
     * 缓存对象映射关系到上下文
     */
    public void storeObjectMapper() {
        String sourceName = astObjectMapper.getSource().getName();
        String targetName = astObjectMapper.getTarget().getName();
        ThreadContextHelper.storeObjectMapper(sourceName, targetName);
        ThreadContextHelper.storeObjectMapper(targetName, sourceName);
    }

}
