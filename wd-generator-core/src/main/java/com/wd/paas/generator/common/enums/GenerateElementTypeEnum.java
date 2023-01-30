package com.wd.paas.generator.common.enums;

import lombok.Getter;

/**
 * 元素类型枚举
 * <p/>
 * 功能：用于指定元素与模板的映射关系
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
@Getter
public enum GenerateElementTypeEnum {

    /**
     * 项目
     */
    PROJECT("Project", new String[]{
            // project
            "cola/{projectName}/pom.xml.vm",
            // domain
            "cola/{projectName}/{projectName}-domain/pom.xml.vm",
//        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/package-info.java.vm",
            // adapter
            "cola/{projectName}/{projectName}-adapter/pom.xml.vm",
            "cola/{projectName}/{projectName}-adapter/src/resources/i18n/messages_zh_CN.properties",
            "cola/{projectName}/{projectName}-adapter/src/resources/i18n/messages_en_US.properties",
//        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/package-info.java.vm",
            // app
            "cola/{projectName}/{projectName}-app/pom.xml.vm",
//        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/package-info.java.vm",
            // client
            "cola/{projectName}/{projectName}-client/pom.xml.vm",
//        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/package-info.java.vm",
            // infrastructure
            "cola/{projectName}/{projectName}-infrastructure/pom.xml.vm",
//        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/package-info.java.vm",
            // start
            "cola/{projectName}/{projectName}-start/pom.xml.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/StartApplication.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/application.yml.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/bootstrap.yml.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/logback-spring.xml.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/Knife4jConfiguration.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/ProjectExceptionHandler.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/docker/Dockerfile",
    }),

    /**
     * 业务域
     */
    DOMAIN_CHART("DomainChart", new String[]{
            // domain
            // "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/DomainEntity.java.vm",
            // controller
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/app/DomainAppController.java.vm",
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/web/DomainWebController.java.vm",
            // repository
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJpaAggregate.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseConvert.java.vm",
            // app
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/JsonConverter.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/DomainRpcServiceImpl.java.vm",
            // client
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/DomainRpcService.java.vm",
    }),

    /**
     * 聚合
     */
    AGGREGATION("Aggregation", new String[]{
            // domain
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AbstractAggregation.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationFactory.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationRepository.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Aggregation.java.vm",
            // controller
//            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/app/DomainAppController.java.vm",
//            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/web/DomainWebController.java.vm",
            // repository
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/mapper/AggregationMapper.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/AggregationDO.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/AggregationRepositoryImpl.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/assembler/AggregationDoConvert.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/resources/mapper/{field}/AggregationMapper.xml.vm",
            // app
//            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/DomainRpcServiceImpl.java.vm",
            // client
//            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/DomainRpcService.java.vm",
    }),

    /**
     * 实体
     */
    ENTITY("Entity", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Entity.java.vm",
    }),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm"
    }),

    /**
     * 枚举
     */
    ENUM("Enum", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Enum.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/EnumConverter.java.vm",
    }),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Command.java.vm",
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/dto/CommandDTO.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/CommandDTOConvert.java.vm",
    }),

    /**
     * 指令处理器
     */
    COMMAND_HANDLER("CommandHandler", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/CommandHandler.java.vm",
    }),

    /**
     * 新增指令处理器
     */
    ADD_COMMAND_HANDLER("AddCommandHandler", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/AddCommandHandler.java.vm",
    }),

    /**
     * 更新指令处理器
     */
    UPDATE_COMMAND_HANDLER("UpdateCommandHandler", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/UpdateCommandHandler.java.vm",
    }),

    /**
     * 删除指令处理器
     */
    DELETE_COMMAND_HANDLER("DeleteCommandHandler", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/DeleteCommandHandler.java.vm",
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
    FIELD("Field", new String[]{}),

    /**
     * 常量字段
     */
    CONSTANT("Constant", new String[]{}),

    /**
     * 方法
     */
    METHOD("Method", new String[]{}),

    /**
     * 查询对象
     */
    QUERY("Query", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/Query.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/view/QueryExe.java.vm",
    }),

    /**
     * 分页查询对象
     */
    PAGE_QUERY("PageQuery", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/PageQuery.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/view/PageQueryExe.java.vm",
    }),

    /**
     * QueryResult 结果集
     */
    QUERY_RESULT("QueryResult", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/dto/QueryResult.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/QueryResult2DOConvert.java.vm"
    }),

    /**
     * 未定义
     */
    OTHER("Other", new String[]{}),
    ;

    private final String name;
    private final String[] templateUrls;

    GenerateElementTypeEnum(String name, String[] templateUrls) {
        this.name = name;
        this.templateUrls = templateUrls;
    }
}
