package com.wake.generator.application;

import com.wake.generator.core.domain.Project;

/**
 * <p>Title: </p>
 * <p>Description: 代码生成器服务</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/1/12 16:41
 */
public interface CodeGenerateService {

    /**
     * 解析 project 中的文件并执行代码生成
     *
     * @param project 代码生成的项目单元
     */
    void generateCode(Project project);

}
