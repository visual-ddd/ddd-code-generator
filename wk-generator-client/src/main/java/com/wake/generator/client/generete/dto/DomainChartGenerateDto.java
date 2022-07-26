package com.wake.generator.client.generete.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 领域图谱DTO
 * 用于生成单个领域代码
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Data
public class DomainChartGenerateDto {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目组包名
     */
    private String group;

    /**
     * 领域包名
     */
    private String filed;

    /**
     * 创建时间
     */
    private String dateTime;

    /**
     * 故事节点集
     */
    private List<StoryNodeDto> storyNodes = new ArrayList<>();

    /**
     * 聚合集
     */
    private List<DomainDto> aggregations = new ArrayList<>();

    /**
     * 值对象集
     */
    private List<DomainDto> valueObjects = new ArrayList<>();

}