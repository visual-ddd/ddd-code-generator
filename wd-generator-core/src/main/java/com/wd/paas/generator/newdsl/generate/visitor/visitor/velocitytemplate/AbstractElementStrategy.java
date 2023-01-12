package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.util.FileGenerator;

import java.util.List;

/**
 * 元素生成策略抽象类（Velocity 模版生成）
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public abstract class AbstractElementStrategy implements VelocityTemplateGenerate {

    @Override
    public void codeGenerate(TemplateContext templateContext) {
        this.putVelocityContext(templateContext.getContext());
        this.generateFile(templateContext);
    }

    @Override
    public void generateFile(TemplateContext templateContext) {
        // 获取模版文件列表
        List<String> templatePathList = this.getTemplatePathList();
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getContext(),
                    templateContext.getPreFixOutPath());
            FileGenerator.run(templateContext.getContext(), templateContext.getZipOutputStream(), templateUrl, outputPath);
        }
    }
}
