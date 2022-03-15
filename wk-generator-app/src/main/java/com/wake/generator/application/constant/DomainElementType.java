package com.wake.generator.application.constant;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * <p>Title: ElementType</p>
 * <p>Description: 元素类型</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:17
 */
@Getter
public enum DomainElementType {
    /**
     * 聚合
     */
    AGGREGATION("Aggregation", new String[]{
        // domain
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\Aggregation.java.vm",
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\AggregationFactory.java.vm",
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\AggregationRepository.java.vm",
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\IAggregation.java.vm",
        // controller
        "cola\\{projectName}\\{projectName}-adapter\\src\\main\\java\\{group}\\adapter\\{field}\\{polymerization}\\AggregationController.java.vm",
        // repository
        "cola\\{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{field}\\{polymerization}\\repository\\mapper\\AggregationMapper.java.vm",
        "cola\\{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{field}\\{polymerization}\\repository\\model\\AggregationDO.java.vm",
        "cola\\{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{field}\\{polymerization}\\repository\\AggregationRepositoryImpl.java.vm"}),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\ValueObject.java.vm"}),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\{action}\\AggregationCmd.java.vm",
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\{action}\\AggregationCmdHandler.java.vm"
    }),

    /**
     * 事件
     */
    EVENT("Event", new String[]{
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{field}\\{polymerization}\\{action}\\AggregationEvent.java.vm"
    }),

    /**
     * 规则
     */
    RULE("Rule", null),
    ;

    private final String name;
    private final String[] templateUrlSet;

    DomainElementType(String name, String[] templateUrlSet) {
        this.name = name;
        this.templateUrlSet = templateUrlSet;
    }
}
