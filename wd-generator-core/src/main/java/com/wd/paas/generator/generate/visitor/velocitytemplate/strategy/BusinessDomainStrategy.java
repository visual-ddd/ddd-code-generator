package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTBusinessDomain;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class BusinessDomainStrategy extends AbstractElementStrategy {

    private final ASTBusinessDomain ASTBusinessDomain;

    public BusinessDomainStrategy(ASTBusinessDomain ASTBusinessDomain) {
        this.ASTBusinessDomain = ASTBusinessDomain;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DOMAIN_NAME, ASTBusinessDomain.getName());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.DOMAIN_CHART.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return getOutputPath(templateUrl, context, preFixOutPath);
    }

    protected static String getOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = ApplicationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.FIELD
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.DOMAIN_NAME)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
