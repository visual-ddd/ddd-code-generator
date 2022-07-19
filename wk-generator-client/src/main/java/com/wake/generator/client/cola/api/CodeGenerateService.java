package com.wake.generator.client.cola.api;

import com.wake.generator.client.cola.dto.ProjectChartDto;
import org.springframework.stereotype.Service;

/**
 * 代码生成器服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:35
 * @since 1.0
 */
public interface CodeGenerateService {

    /**
     * 根据传入的DDD项目图谱生成对应的项目结构
     *
     * @param projectChartDto 项目图谱Dto
     * @return 当生成完毕时，返回true
     */
    boolean generateCode(ProjectChartDto projectChartDto);

}
