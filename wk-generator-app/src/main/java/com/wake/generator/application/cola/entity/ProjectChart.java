package com.wake.generator.application.cola.entity;

import java.util.Set;
import lombok.Data;

/**
 * 项目图谱实体类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:47
 * @since 1.0
 */
@Data
public class ProjectChart {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 全局配置
     */
    private Global global;

    /**
     * 元素信息列表
     */
    private Set<DomainShape> domainShapeList;

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

}
