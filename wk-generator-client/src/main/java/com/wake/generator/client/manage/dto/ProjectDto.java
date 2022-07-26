package com.wake.generator.client.manage.dto;

import lombok.Data;

import java.util.List;

/**
 * 项目
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
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
     * 项目包名
     */
    private String projectPackage;

    /**
     * 项目组包名
     */
    private String groupPackage;

    /**
     * 领域图谱集
     */
    private List<ChartDto> domainCharts;

}
