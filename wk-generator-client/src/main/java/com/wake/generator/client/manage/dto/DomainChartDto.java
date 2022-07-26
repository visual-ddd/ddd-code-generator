package com.wake.generator.client.manage.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wake.generator.client.generete.dto.DomainDto;
import com.wake.generator.client.generete.dto.StoryNodeDto;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 项目图谱实体类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:47
 * @since 1.0
 */
@Data
public class DomainChartDto {

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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

    /**
     * 项目id
     */
    private Long projectId;

    /**
     * 故事节点集
     */
    private List<StoryNodeDto> storyNodes;

    /**
     * 聚合集
     */
    private List<DomainDto> aggregations;

    /**
     * 值对象集
     */
    private List<DomainDto> valueObjects;

}
