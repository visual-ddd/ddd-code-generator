package com.wake.generator.client.generete.dto;

import com.wake.generator.client.generete.dto.shape.AggregationDto;
import com.wake.generator.client.generete.dto.shape.ValueObjectDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
     * 事件集合
     */
    private List<ActionDto> actions = new ArrayList<>();

    /**
     * 聚合集
     */
    private List<AggregationDto> aggregations = new ArrayList<>();

    /**
     * 值对象集
     */
    private List<ValueObjectDto> valueObjects = new ArrayList<>();

    /**
     * 设置action列表中的指令和事件元素的包名，并返回
     *
     * @return cmd 和 event 集合
     */
    public Set<DomainDto> getActionElements() {
        // 元素填充action包
        Set<DomainDto> actionElements = new HashSet<>();
        for (ActionDto action : this.getActions()) {
            DomainDto cmdDto = action.getCmd();
            cmdDto.setActionName(action.getPackageName());
            actionElements.add(cmdDto);
            DomainDto eventDto = action.getEvent();
            eventDto.setActionName(action.getPackageName());
            actionElements.add(eventDto);
        }
        return actionElements;
    }

}