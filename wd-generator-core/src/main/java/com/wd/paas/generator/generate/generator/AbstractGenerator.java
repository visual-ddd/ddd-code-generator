package com.wd.paas.generator.generate.generator;

import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.util.FileGenerator;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.HashMap;

/**
 * 抽象类
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public abstract class AbstractGenerator implements CodeGenerate {

    @Override
    public void generate(GenerateContext generateContext) {
        // 填充上下文
        this.putVelocityContext(generateContext.getContext());
        // 获取模版映射表
        GenerateElementTypeEnum elementType = this.getElementTypeUrl();
        String[] templateUrls = elementType.getTemplateUrlsByWay(generateContext.getGenerateWay());
        HashMap<String, String> modelFileMap = new HashMap<>(templateUrls.length);
        // 获取模版文件列表
        for (String templateUrl : templateUrls) {
            String outputUrl = this.parseOutputPath(templateUrl, generateContext.getContext(),
                    generateContext.getOutputPath());
            modelFileMap.put(templateUrl, outputUrl);
        }
        // 文件结构及代码生成
        FileGenerator.run(generateContext.getContext(), modelFileMap, generateContext.getZipOutputStream());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        String outputUrl = templateUrl
                .replace(ModelUrlConstant.PROJECT_NAME, (String) context.get(VelocityLabel.PROJECT_NAME))
                .replace(ModelUrlConstant.GROUP, (String) context.get(VelocityLabel.PROJECT_SLASH_GROUP))
                .replace(ModelUrlConstant.VM, ModelUrlConstant.EMPTY);
        if (StringUtils.isNotBlank(targetPath)) {
            outputUrl = outputUrl.replace(ModelUrlConstant.OUTPUT_PATH, targetPath);
        }
        return outputUrl;
    }
}
