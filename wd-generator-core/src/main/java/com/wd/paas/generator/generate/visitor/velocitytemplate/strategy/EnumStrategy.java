package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.common.EnumMemberInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EnumNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EnumStrategy extends AbstractElementStrategy {

    private final EnumNode anEnum;

    public EnumStrategy(EnumNode enumNode) {
        super(enumNode);
        this.anEnum = enumNode;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        for (EnumMemberInfo enumMemberInfo : anEnum.getMemberList()) {
            if (StringUtils.isBlank(enumMemberInfo.getDescription())) {
                enumMemberInfo.setDescription(enumMemberInfo.getTitle());
            }
            parseByBaseType(anEnum.getBaseType(), enumMemberInfo);
        }
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return Arrays.asList(projectTemplateType.enums());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENUM_ID, anEnum.getIdentity());
        context.put(VelocityLabel.ENUM_CLASS_NAME, anEnum.getName());
        context.put(VelocityLabel.ENUM_CODE_TYPE, baseType2CodeType(anEnum.getBaseType()));
        context.put(VelocityLabel.ENUM_CLASS_CONSTANTS, anEnum.getMemberList());
        context.put(VelocityLabel.ENUM_CLASS_DESCRIPTION, anEnum.getDescription());
        context.put(VelocityLabel.ENUM_CLASS_TITLE, anEnum.getTitle());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode parentNode = (AggregateNode) anEnum.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(parentNode);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.ENUM_CLASS
        };

        String[] replacementList = {
                anEnum.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private static String baseType2CodeType(String baseType) {
        switch (baseType) {
            case "number":
                return "Integer";
            case "string":
                return "String";
        }
        return null;
    }

    private void parseByBaseType(String baseType, EnumMemberInfo enumMemberInfo) {
        String code = enumMemberInfo.getCode();
        switch (baseType) {
            case "number":
                try {
                    Integer.parseInt(code);
                } catch (NumberFormatException e) {
                    enumMemberInfo.setCode("\"" + code + "\"" );
                }
                break;
            case "string":
            default:
                enumMemberInfo.setCode("\"" + code + "\"" );
                break;
        }
    }
}
