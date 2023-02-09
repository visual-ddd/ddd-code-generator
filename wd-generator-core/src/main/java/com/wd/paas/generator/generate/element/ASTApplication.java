package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

/**
 * 应用元素
 *
 * @author zhuxueliang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTApplication extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String version;

    private String packageName;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        String[] searchList = {
                ModelUrlConstant.OUTPUT_PATH,
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.VM
        };
        String[] replacementList = {
                preFixOutPath,
                name,
                trans2Slash(packageName),
                ModelUrlConstant.EMPTY
        };
        return StringUtils.replaceEach(templateUrl, searchList, replacementList);
    }

    private static String trans2Slash(String target) {
        return StringUtils.replace(target, ModelUrlConstant.POINT, ModelUrlConstant.SLASH);
    }
}
