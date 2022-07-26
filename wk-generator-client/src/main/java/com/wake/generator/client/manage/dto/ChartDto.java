package com.wake.generator.client.manage.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 领域图谱DTO
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Data
public class ChartDto {

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
     * 作者
     */
    private String author;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;

    /**
     * 领域包名
     */
    private String domainPackage;

    /**
     * 故事节点集
     */
    private List<StoryNodeDto> storyNodes;

    /**
     * 聚合集
     */
    private List<AggregationDto> aggregations;

    /**
     * 值对象集
     */
    private List<ValueObjectDto> valueObjects;

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

    /**
     * 项目id
     */
    private Long projectId;

}