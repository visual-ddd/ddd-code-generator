package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.Application;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.constant.ModelUrlConstant;
import com.wd.paas.generator.constant.VelocityLabel;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class ApplicationStrategy extends AbstractElementStrategy {

    private final Application application;

    public ApplicationStrategy(Application application) {
        this.application = application;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.PROJECT_TITLE, application.getTitle());
        context.put(VelocityLabel.PROJECT_NAME, application.getName());
        context.put(VelocityLabel.PROJECT_DESCRIPTION, application.getDescription());
        context.put(VelocityLabel.PROJECT_PACKAGE, application.getPackageName());
        context.put(VelocityLabel.PROJECT_VERSION, application.getVersion());
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
