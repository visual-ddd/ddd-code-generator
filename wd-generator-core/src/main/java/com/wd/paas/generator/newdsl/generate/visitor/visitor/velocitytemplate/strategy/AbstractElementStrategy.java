package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.VelocityTemplateGenerate;
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
    public void execute(TemplateContext templateContext){
        this.putVelocityContext(templateContext.getContext());
        if (Boolean.TRUE.equals(this.process(templateContext))){
            this.generateFile(templateContext);
        }
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return Boolean.TRUE;
    }

    /**
     * 生成代码模板文件
     *
     * @param templateContext 上下文信息
     */
    protected void generateFile(TemplateContext templateContext) {
        // 获取模版文件列表
        List<String> templatePathList = this.getTemplatePathList();
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getContext(),
                    templateContext.getPreFixOutPath());
            FileGenerator.run(templateContext.getContext(), templateContext.getZipOutputStream(), templateUrl, outputPath);
        }
    }
}
