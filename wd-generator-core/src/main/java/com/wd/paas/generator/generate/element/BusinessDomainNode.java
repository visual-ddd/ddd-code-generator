package com.wd.paas.generator.generate.element;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessDomainNode extends CompositeElement {

    private String vision;

    private String document;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        ApplicationNode parentNode = (ApplicationNode) this.getParentNode();

        String outputPath = parentNode.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.FIELD,
                ModelUrlConstant.DOMAIN_CLASS,
        };
        String[] replacementList = {
                convertFieldUrl(),
                convertDomainClassName(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    /**
     * 实现领域路径转换规则
     */
    private String convertFieldUrl() {
        return this.getName().toLowerCase();
    }

    /**
     * 实现领域类名转换规则
     */
    public String convertDomainClassName() {
        return CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL).convert(this.getName());
    }
}
