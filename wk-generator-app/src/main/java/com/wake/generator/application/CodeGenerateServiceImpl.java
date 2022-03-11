package com.wake.generator.application;

import com.wake.generator.application.handler.CodeGenerator;
import com.wake.generator.application.util.TemplateUtil;
import com.wake.generator.client.CodeGenerateService;
import com.wake.generator.application.domain.Project;
import java.util.Set;

/**
 * <p>Title: CodeGenerateServiceImpl</p>
 * <p>Description: 代码生成器服务实现类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:57
 */
public class CodeGenerateServiceImpl implements CodeGenerateService {

    public void generateCode(Project project) {
        CodeGenerator codeGenerator = new CodeGenerator();
        // 执行代码生成
        codeGenerator.codeGenerate(project);
        // 保存项目列表
        codeGenerator.storeFileNames();
    }

    public Set<String> queryTemplateFullPath() {
        return TemplateUtil.getTemplates();
    }

}
