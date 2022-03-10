package com.wake.generator.application.impl;


import com.wake.generator.application.CodeGenerateService;
import com.wake.generator.core.domain.Label;
import com.wake.generator.core.generator.CodeGenerator;
import com.wake.generator.core.util.TemplateUtil;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * <p>Title: </p>
 * <p>Description: 代码生成器服务实现类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/1/12 21:48
 */
@Service
public class CodeGenerateServiceImpl implements CodeGenerateService {

    @Override
    public void generateCode(Label label) {
        CodeGenerator codeGenerator = new CodeGenerator();
        // 执行代码生成
        codeGenerator.codeGenerate(label);
        // 保存项目列表
        codeGenerator.storeFileNames();
    }

    @Override
    public Set<String> queryTemplateFullPath() {
        return TemplateUtil.getTemplates();
    }

}
