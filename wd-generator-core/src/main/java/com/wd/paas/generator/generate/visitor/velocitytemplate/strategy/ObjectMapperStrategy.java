package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.common.ObjectReference;
import com.wd.paas.common.enums.ConvertTypeEnum;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.ObjectMapperNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ObjectMapperStrategy extends AbstractElementStrategy{

    private final ObjectMapperNode astObjectMapper;

    public ObjectMapperStrategy(ObjectMapperNode astObjectMapper){
        super(astObjectMapper);
        this.astObjectMapper = astObjectMapper;
    }

    @Override
    public void preHandle(TemplateContext templateContext) {
        super.preHandle(templateContext);
        // 缓存对象映射关系
        storeObjectMapper();
    }

    @Override
    public void initProperties() {
        super.initProperties();
        ObjectReference source = astObjectMapper.getSource();
        ObjectReference target = astObjectMapper.getTarget();
        if (Objects.equals(target.getType(), "dataObject") &&
                !target.getName().endsWith(ModelUrlConstant.DATA_CLASS_SUFFIX)) {
            target.setName(target.getName().concat(ModelUrlConstant.DATA_CLASS_SUFFIX));
        }
        if (Objects.equals(source.getType(), "dto") &&
                !source.getName().endsWith(ModelUrlConstant.DTO_SUFFIX)) {
            source.setName(source.getName().concat(ModelUrlConstant.DTO_SUFFIX));
        }
        source.setParent(convertAggregationName(source.getParent()));
        astObjectMapper.setEntity2DOConvertName(getEntity2DOConvertName());
        astObjectMapper.setQueryResultConvertName(getQueryResultConvertName());
    }

    private static String convertAggregationName(String aggregationName) {
        return StringUtils.isBlank(aggregationName) ? null : aggregationName.toLowerCase();
    }

    public String getEntity2DOConvertName() {
        if (!Objects.equals(astObjectMapper.getSource().getType(), "entity")) {
            return StringUtils.EMPTY;
        }
        return astObjectMapper.getSource().getName().concat("2").concat(astObjectMapper.getTarget().getName()).concat("Convert");
    }

    public String getQueryResultConvertName() {
        if (!Objects.equals(astObjectMapper.getSource().getType(), "dto")) {
            return StringUtils.EMPTY;
        }
        return astObjectMapper.getSource().getName().concat("2").concat(astObjectMapper.getTarget().getName()).concat("Convert");
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
        context.put(VelocityLabel.OBJECT_MAPPER_ID, astObjectMapper.getIdentity());
        context.put(VelocityLabel.OBJECT_MAPPER_CLASS_DESCRIPTION, astObjectMapper.getDescription());

        context.put(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT, astObjectMapper.getSource().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT, astObjectMapper.getTarget().getName());
        context.put(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT_ID, astObjectMapper.getSource().getId());
        context.put(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT_ID, astObjectMapper.getTarget().getId());

        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_TYPE, astObjectMapper.getSource().getType());
        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_AGGREGATION, astObjectMapper.getSource().getParent());
        context.put(VelocityLabel.OBJECT_MAPPER_OBJECT_FIELD_LIST, astObjectMapper.getConvertList());

        context.put(VelocityLabel.OBJECT_MAPPER_DATA_MAPPER, excludeDOSuffix());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        BusinessDomainNode businessDomain = (BusinessDomainNode) astObjectMapper.getParentNode();
        BusinessDomainStrategy businessDomainStrategy = new BusinessDomainStrategy(businessDomain);
        String outputPath = businessDomainStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.OBJECT_MAPPER_CONVERT_CLASS,
                ModelUrlConstant.OBJECT_MAPPER_REPOSITORY_CLASS,
                ModelUrlConstant.QUERY_RESULT_CONVERT_CLASS,
        };
        String[] replacementList = {
                astObjectMapper.getEntity2DOConvertName(),
                astObjectMapper.getSource().getName(),
                astObjectMapper.getQueryResultConvertName(),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String excludeDOSuffix() {
        String name = astObjectMapper.getTarget().getName();
        return name.substring(0, name.lastIndexOf(ModelUrlConstant.DATA_CLASS_SUFFIX));
    }

    /**
     * 缓存对象映射关系到上下文
     */
    public void storeObjectMapper() {
        String sourceId = astObjectMapper.getSource().getId();
        String targetId = astObjectMapper.getTarget().getId();
        String type = astObjectMapper.getSource().getType();
        ThreadContextHelper.storeObjectMapper(type, sourceId, targetId);
        ThreadContextHelper.storeObjectMapper(type, targetId, sourceId);
    }
}
