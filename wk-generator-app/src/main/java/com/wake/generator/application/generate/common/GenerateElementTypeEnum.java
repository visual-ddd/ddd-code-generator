package com.wake.generator.application.generate.common;

import lombok.Getter;

/**
 * 元素类型枚举
 * <p/>
 * 功能：用于指定元素与模板的映射关系
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:38
 * @since 1.0
 */
@Getter
public enum GenerateElementTypeEnum {

    /**
     * 项目
     */
    PROJECT("Project", new String[]{
        // domain
        "cola/{projectName}/pom.xml.vm",
        "cola/{projectName}/{projectName}-domain/pom.xml.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/package-info.java.vm",
        // adapter
        "cola/{projectName}/{projectName}-adapter/pom.xml.vm",
        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/package-info.java.vm",
        // app
        "cola/{projectName}/{projectName}-app/pom.xml.vm",
        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/package-info.java.vm",
        // client
        "cola/{projectName}/{projectName}-client/pom.xml.vm",
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/package-info.java.vm",
        // infrastructure
        "cola/{projectName}/{projectName}-infrastructure/pom.xml.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/package-info.java.vm",
        // start
        "cola/{projectName}/{projectName}-start/pom.xml.vm",
        "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/StartApplication.java.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/application.yml.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/bootstrap.yml.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/logback-spring.xml"
    }),

    /**
     * 聚合
     */
    AGGREGATION("Aggregation", new String[]{
        // domain
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Aggregation.java.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationFactory.java.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationRepository.java.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/IAggregation.java.vm",
        // controller
        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/app/{field}/{aggregation}/AppAggregationController.java.vm",
        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/web/{field}/{aggregation}/WebAggregationController.java.vm",
        // repository
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/mapper/AggregationMapper.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/AggregationDO.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/AggregationRepositoryImpl.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/resources/mapper/{field}/AggregationMapper.xml.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/convert/AggregationDoConvert.java.vm"
    }),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm"
    }),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Command.java.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/CommandHandler.java.vm"
    }),

    /**
     * 事件
     */
    EVENT("Event", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Event.java.vm"
    }),

    /**
     * 属性
     */
    FIELD("Field", null),

    /**
     * 方法
     */
    METHOD("Method", null),

    /**
     * 动作
     */
    ACTION("Action", null),
    ;

    private final String name;
    private final String[] templateUrlSet;

    GenerateElementTypeEnum(String name, String[] templateUrlSet) {
        this.name = name;
        this.templateUrlSet = templateUrlSet;
    }
}
