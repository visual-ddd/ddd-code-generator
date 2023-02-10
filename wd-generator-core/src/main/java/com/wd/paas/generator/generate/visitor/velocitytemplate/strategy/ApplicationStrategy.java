package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.common.util.ParseStringUtil;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class ApplicationStrategy extends AbstractElementStrategy {

    private final ApplicationNode astApplication;

    public ApplicationStrategy(ApplicationNode astApplication) {
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
        context.put(VelocityLabel.CASE_FORMAT_UPPER_CAMEL,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL));

        context.put(VelocityLabel.IMPORT_PACKAGE_MAP, ThreadLocalUtil.getThreadLocal());
        context.put(VelocityLabel.PARSE_STRING_UTIL, ParseStringUtil.class);
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.PROJECT.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astApplication.getOutputPath(templateUrl, preFixOutPath);
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return templateContext.getIsGenerateProjectFrame();
    }
}
