package com.wake.generator.client.generete.api;

import com.wake.generator.client.generete.dto.DomainChartGenerateDto;

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
     * @param domainChartGenerateDto 项目图谱Dto
     * @return 当生成完毕时，返回true
     */
    boolean generateCode(DomainChartGenerateDto domainChartGenerateDto);

}
