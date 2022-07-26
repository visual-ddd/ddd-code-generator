package com.wake.generator.application.generate.entity;

import lombok.Data;

import java.util.Set;

/**
 * 模型文件信息
 *
 * <p>用于存储单个需要生成的模板文件的相关信息。因此，一个.vm模板文件将对应一个ModeFile对象。
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:42
 * @since 1.0
 */
@Data
public class ModelFile {

    /**
     * 模板路径
     */
    private String templateUrl;

    /**
     * 输出路径
     */
    private String outputUrl;

    /**
     * 包路径
     */
    private String packagePath;

    /**
     * 生成类需要导入的包路径
     */
    private Set<String> importClassSet;

}
