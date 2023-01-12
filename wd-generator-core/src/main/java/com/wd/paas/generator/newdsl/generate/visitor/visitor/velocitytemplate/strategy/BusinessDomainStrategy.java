package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class BusinessDomainStrategy extends AbstractElementStrategy {

    private final BusinessDomain businessDomain;

    public BusinessDomainStrategy(BusinessDomain businessDomain) {
        this.businessDomain = businessDomain;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DOMAIN_NAME, businessDomain.getInfo().getName());
        context.put(VelocityLabel.DOMAIN_AUTHOR, "businessDomain.getAuthor()");
        context.put(VelocityLabel.DOMAIN_DATE_TIME, "businessDomain.getDateTime()");
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.DOMAIN_CHART.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String[] searchList = {
                ModelUrlConstant.OUTPUT_PATH,
                ModelUrlConstant.FIELD,
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.VM
        };
        String[] replacementList = {
                preFixOutPath,
                (String) context.get(VelocityLabel.DOMAIN_NAME),
                (String) context.get(VelocityLabel.PROJECT_NAME),
                (String) context.get(VelocityLabel.PROJECT_SLASH_GROUP),
                ModelUrlConstant.EMPTY
        };
        return StringUtils.replaceEach(templateUrl, searchList, replacementList);
    }
}
