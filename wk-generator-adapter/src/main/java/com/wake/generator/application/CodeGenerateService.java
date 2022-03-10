package com.wake.generator.application;

import com.wake.generator.core.domain.Label;
import java.util.Set;

/**
 * <p>Title: </p>
 * <p>Description: 代码生成器服务</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/1/12 16:41
 */
public interface CodeGenerateService {

    /**
     * 解析labelDTO并执行代码生成
     *
     * @param label 标签DTO
     */
    void generateCode(Label label);

    /**
     * 查询所有模板的url
     *
     * @return 模板url集合
     */
    Set<String> queryTemplateFullPath();

}
