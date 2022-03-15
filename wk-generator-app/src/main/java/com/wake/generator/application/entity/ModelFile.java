package com.wake.generator.application.entity;

import java.util.Set;
import lombok.Data;

/**
 * <p>Title: ModelFile</p>
 * <p>Description: 模型文件信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/14 10:28
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
