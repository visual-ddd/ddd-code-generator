package com.wake.generator.core.domain;

import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/**
 * <p>Title: LabelDTO</p>
 * <p>Description: 项目信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/23 12:04
 */
@Data
public class Project {

    /**
     * 全局配置信息
     */
    private Global global;

    /**
     * 生成文件信息列表
     */
    private Set<AbstractGeneratorFile> generatorFiles = new HashSet<>();

}
