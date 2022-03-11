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
            "{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\Aggregation.java.vm",
            "{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\AggregationFactory.java.vm",
            "{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\AggregationRepository.java.vm",
            "{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\IAggregation.java.vm",
            "{projectName}\\{projectName}-adapter\\src\\main\\java\\{group}\\adapter\\{classLowName}\\DomainController.java.vm",
            "{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{classLowName}\\repository\\mapper\\DomainMapper.java.vm",
            "{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{classLowName}\\repository\\model\\DomainDO.java.vm",
            "{projectName}\\{projectName}-infrastructure\\src\\main\\java\\{group}\\infrastructure\\{classLowName}\\repository\\DomainRepositoryImpl.java.vm"}),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
            "templates\\cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\ValueObject.java.vm"}),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
            "templates\\cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\{action}\\DomainCmd.java.vm",
            "templates\\cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\{action}\\DomainCmdHandler.java.vm"
    }),

    /**
     * 事件
     */
    EVENT("Event", new String[]{
            "templates\\cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\{action}\\DomainEvent.java.vm"
    }),
    ;

    private final String name;
    private final String[] templateUrlSet;

    DomainElementType(String name, String[] templateUrlSet) {
        this.name = name;
        this.templateUrlSet = templateUrlSet;
    }
}
