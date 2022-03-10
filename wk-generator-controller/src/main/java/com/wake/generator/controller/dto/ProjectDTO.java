package com.wake.generator.controller.dto;

import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Project;
import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import java.util.Set;
import lombok.Data;

/**
 * <p>Title: ProjectDTO</p>
 * <p>Description: 项目单元DTO</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 17:08
 */
@Data
public class ProjectDTO {

    /**
     * 全局配置信息
     */
    private Global global;

    /**
     * 生成文件信息列表
     */
    private Set<GeneratorFileDTO> generatorFileDtoSet;

    /**
     * DTO 转 项目实体
     *
     * @return 项目实体
     */
    public Project transformToProject() {
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
