package com.wake.generator.client.generete.dto;

import lombok.Data;

import java.util.List;

/**
 * 项目信息
 * 用于生成项目
 *
 * @author ZhuXueLiang
 * @date 2022/7/22
 * @since 1.0
 */
@Data
public class ProjectDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 项目组包名
     */
    private String groupPackage;

    /**
     * 领域图谱集合
     */
    private List<DomainChartGenerateDto> domainChartGenerateDtoList;

}
