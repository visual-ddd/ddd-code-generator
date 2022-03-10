package com.wake.generator.controller.dto;

import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Project;
import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import java.util.Set;
import lombok.Data;

/**
 * <p>Title: LabelDto</p>
 * <p>Description: 标签信息DTO</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 17:08
 */
@Data
public class LabelDTO {

    /**
     * 全局配置信息
     */
    private Global global;

    /**
     * 生成文件信息列表
     */
    private Set<GeneratorFileDTO> generatorFileDtoSet;

    /**
     * DTO 转 Label标签实体
     *
     * @return Label标签实体
     */
    public Project transformToLabel() {
        Project result = new Project();
        result.setGlobal(global);
        Set<AbstractGeneratorFile> generatorFiles = result.getGeneratorFiles();
        for (GeneratorFileDTO generatorFileDTO : generatorFileDtoSet) {
            AbstractGeneratorFile generatorFile = generatorFileDTO.transformToGeneratorFile();
            generatorFiles.add(generatorFile);
        }
        return result;
    }
}
