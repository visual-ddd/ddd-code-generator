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
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\Aggregation.java.vm",
        "cola\\{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\AggregationFactory.java.vm",}),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{}),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{}),

    /**
     * 事件
     */
    EVENT("Event", new String[]{}),
    ;

    private final String name;
    private final String[] templateUrlSet;

    DomainElementType(String name, String[] templateUrlSet) {
        this.name = name;
        this.templateUrlSet = templateUrlSet;
    }
}
