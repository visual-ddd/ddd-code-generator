package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTBusinessDomain extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String vision;

    private String document;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        ASTApplication parentNode = (ASTApplication) this.getParentNode();

        String outputPath = parentNode.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.FIELD,
                ModelUrlConstant.DOMAIN_CLASS,
        };
        String[] replacementList = {
                convertFieldUrl(name),
                name,
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    /**
     * 实现领域路径转换规则
     */
    private static String convertFieldUrl(String domainName) {
        return domainName.toLowerCase();
    }


}
