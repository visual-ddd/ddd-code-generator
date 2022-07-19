package com.wake.generator.client.cola.dto;

import com.wake.generator.client.cola.dto.test.Aggregation;
import com.wake.generator.client.cola.dto.test.StoryNode;
import com.wake.generator.client.cola.dto.test.ValueObject;
import lombok.Data;

import java.util.List;

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

//    /**
//     * 图形对象集合
//     */
//    private Set<DomainShapeDto> domainShapeDtoSet;

    /**
     * 故事节点集合
     */
    private List<StoryNode> storyNodes;

    /**
     * 聚合集
     */
    private List<Aggregation> aggregations;

    /**
     * 值对象集
     */
    private List<ValueObject> valueObjects;

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

}