package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class ApplicationStrategy extends AbstractElementStrategy {

    private final ASTApplication astApplication;

    public ApplicationStrategy(ASTApplication astApplication) {
        this.astApplication = astApplication;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.PROJECT_TITLE, astApplication.getTitle());
        context.put(VelocityLabel.PROJECT_NAME, astApplication.getName());
        context.put(VelocityLabel.PROJECT_DESCRIPTION, astApplication.getDescription());
        context.put(VelocityLabel.PROJECT_PACKAGE, astApplication.getPackageName());
        context.put(VelocityLabel.PROJECT_VERSION, astApplication.getVersion());

        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_UNDERSCORE,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_CAMEL,
                CaseFormat.UPPER_CAMEL.converterTo(CaseFormat.LOWER_CAMEL));
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.PROJECT.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return getOutputPath(templateUrl, context, preFixOutPath);
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return templateContext.getIsGenerateProjectFrame();
    }

    protected static String getOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String[] searchList = {
                ModelUrlConstant.OUTPUT_PATH,
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.VM
        };
        String projectPackage = (String) context.get(VelocityLabel.PROJECT_PACKAGE);
        String projectPath = trans2Slash(projectPackage);
        String[] replacementList = {
                preFixOutPath,
                (String) context.get(VelocityLabel.PROJECT_NAME),
                projectPath,
                ModelUrlConstant.EMPTY
        };
        return StringUtils.replaceEach(templateUrl, searchList, replacementList);
    }

    private static String trans2Slash(String target) {
        return StringUtils.replace(target, ModelUrlConstant.POINT, ModelUrlConstant.SLASH);
    }
}
