package com.wd.paas.generator;

import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.generate.GenerateContext;

/**
 * 代码生成服务
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/10/15 12:43
 */
public interface CodeGenerateService {

    /**
     * 生成代码
     *
     * @param projectDTO 项目
     * @param context    生成代码所需上下文
     */
    void generate(ProjectDTO projectDTO, GenerateContext context);
}
