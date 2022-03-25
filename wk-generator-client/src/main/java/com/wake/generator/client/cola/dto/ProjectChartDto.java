package com.wake.generator.client.cola.dto;

import java.util.Set;
import lombok.Data;

/**
 * Uml图谱DTO
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Data
public class ProjectChartDto {

    private static final long serialVersionUID = 3411792002890207219L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 全局信息
     */
    private GlobalDto global;

    /**
     * 图形对象集合
     */
    private Set<DomainShapeDto> domainShapeDtoSet;

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

}