package com.wd.paas.generator;

import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.generator.project.ProjectGenerator;

/**
 * 代码生成服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/10/15 12:41
 * @version 1.0
 */
public class CodeGenerateServiceImpl implements CodeGenerateService {

    @Override
    public void generate(ProjectDTO projectDTO, GenerateContext context) {
        ProjectGenerator projectGenerator = projectDTO.trans2ProjectGenerator();
        projectGenerator.run(context);
    }
}
