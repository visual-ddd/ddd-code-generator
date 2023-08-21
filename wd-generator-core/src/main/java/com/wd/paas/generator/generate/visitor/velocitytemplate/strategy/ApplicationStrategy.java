package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.util.ParseStringUtil;
import com.wd.paas.generator.common.util.ParseTypeSignUtil;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class ApplicationStrategy extends AbstractElementStrategy {

    private final ApplicationNode astApplication;

    public ApplicationStrategy(ApplicationNode astApplication) {
        super(astApplication);
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
        context.put(VelocityLabel.PARSE_TYPE_UTIL, ParseTypeSignUtil.class);
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return Arrays.asList(projectTemplateType.project());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        String[] searchList = {
                ModelUrlConstant.OUTPUT_PATH,
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.VM
        };
        String[] replacementList = {
                preFixOutPath,
                astApplication.getName(),
                StringUtils.replace(astApplication.getPackageName(), ModelUrlConstant.POINT, ModelUrlConstant.SLASH),
                ModelUrlConstant.EMPTY
        };
        return StringUtils.replaceEach(templateUrl, searchList, replacementList);
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return templateContext.getIsGenerateProjectFrame();
    }
}
