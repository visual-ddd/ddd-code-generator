package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.util.TypeConvertor;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.DtoNode;
import com.wd.paas.generator.generate.element.QueryModelNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class DTOStrategy extends AbstractElementStrategy {

    private final DtoNode astDto;

    public DTOStrategy(DtoNode astDto) {
        super(astDto);
        this.astDto = astDto;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        initName(astDto);
        astDto.getPropertyList().forEach(propertyInfo ->
                propertyInfo.setType(TypeConvertor.convertFileType(propertyInfo.getType())));
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return Arrays.asList(projectTemplateType.queryResult());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.QUERY_RESULT_ID, astDto.getIdentity());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_NAME, astDto.getName());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_FIELDS, astDto.getPropertyList());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_DESCRIPTION, astDto.getDescription());
        context.put(VelocityLabel.QUERY_RESULT_CLASS_TITLE, astDto.getTitle());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        QueryModelNode queryModel = (QueryModelNode) astDto.getParentNode();
        BusinessDomainNode astBusinessDomain = (BusinessDomainNode) queryModel.getParentNode();
        BusinessDomainStrategy businessDomainStrategy = new BusinessDomainStrategy(astBusinessDomain);
        String outputPath = businessDomainStrategy.parseOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.QUERY_RESULT_CLASS
        };
        
        String[] replacementList = {
                astDto.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private void initName(DtoNode dtoNode) {
        String name = dtoNode.getName();
        if (name.endsWith(ModelUrlConstant.DTO_SUFFIX)) {
            dtoNode.setName(name);
            dtoNode.setDtoNoSuffixName(name.substring(0, name.lastIndexOf(ModelUrlConstant.DTO_SUFFIX)));
        } else {
            dtoNode.setDtoNoSuffixName(name);
            dtoNode.setName(name.concat(ModelUrlConstant.DTO_SUFFIX));
        }
    }
}
