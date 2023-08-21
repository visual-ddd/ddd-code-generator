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
//            "cola/{projectName}/{projectName}-domain/pom.xml.vm",
            // adapter
//            "cola/{projectName}/{projectName}-adapter/pom.xml.vm",
            "cola/{projectName}/src/main/resources/i18n/messages_zh_CN.properties",
            "cola/{projectName}/src/main/resources/i18n/messages_en_US.properties",
            // app
//            "cola/{projectName}/{projectName}-app/pom.xml.vm",
            // client
//            "cola/{projectName}/{projectName}/pom.xml.vm",
            // infrastructure
//            "cola/{projectName}/{projectName}/pom.xml.vm",
            // start
//            "cola/{projectName}/{projectName}-start/pom.xml.vm",
            "cola/{projectName}/src/main/java/{group}/start/StartApplication.java.vm",
            "cola/{projectName}/src/main/resources/application.yml.vm",
            "cola/{projectName}/src/main/resources/bootstrap.yml.vm",
            "cola/{projectName}/src/main/resources/logback-spring.xml.vm",
            "cola/{projectName}/src/main/java/{group}/start/config/Knife4jConfiguration.java.vm",
            "cola/{projectName}/src/main/java/{group}/start/config/ProjectExceptionHandler.java.vm",
            "cola/{projectName}/src/main/java/{group}/start/config/StartInfoPrintListener.java.vm",
            "cola/{projectName}/src/main/docker/Dockerfile",
    }),

    /**
     * 业务域
     */
    DOMAIN_CHART("DomainChart", new String[]{
            // controller
            "cola/{projectName}/src/main/java/{group}/{field}/adapter/app/{Domain}AppController.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/adapter/web/{Domain}WebController.java.vm",
            // app
            "cola/{projectName}/src/main/java/{group}/{field}/app/{Domain}Application.java.vm",
            // client
            "cola/{projectName}/src/main/java/{group}/{field}/client/{Domain}RpcService.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/client/{Domain}RpcServiceImpl.java.vm",
            // infrastructure
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseJpaAggregate.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseConvert.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseJsonConvertor.java.vm",
    }),

    /**
     * 业务域定时任务
     */
    DOMAIN_CHART_TASK("DomainChartTask", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/task/{Domain}Task.java.vm",
    }),

    /**
     * 业务域事件监听
     */
    DOMAIN_CHART_LISTENER("DomainChartListener", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/consumer/{Domain}Listener.java.vm",
    }),

    /**
     * 聚合
     */
    AGGREGATION("Aggregation", new String[]{}),

    /**
     * 聚合根
     */
    AGGREGATION_ROOT("AggregationRoot", new String[]{
            // domain
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/AggregationFactory.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/AggregationRepository.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Aggregation.java.vm",
    }),

    /**
     * 实体
     */
    ENTITY("Entity", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Entity.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/EntityConverter.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/client/query/EntityDTO.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/app/assembler/EntityDTO2EntityConvert.java.vm"
    }),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/ValueObject.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/client/query/ValueObjectDTO.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/app/assembler/ValueObjectDTO2ValueObjectConvert.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/ValueObjectConverter.java.vm"
    }),

    /**
     * 枚举
     */
    ENUM("Enum", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Enum.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/EnumConverter.java.vm",
    }),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/Command.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/client/query/CommandDTO.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/app/assembler/CommandDTO2CommandConvert.java.vm",
    }),

    /**
     * 指令处理器
     */
    COMMAND_HANDLER("CommandHandler", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/CommandHandler.java.vm",
    }),

    /**
     * 新增指令处理器
     */
    ADD_COMMAND_HANDLER("AddCommandHandler", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/AddCommandHandler.java.vm",
    }),

    /**
     * 更新指令处理器
     */
    UPDATE_COMMAND_HANDLER("UpdateCommandHandler", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/UpdateCommandHandler.java.vm",
    }),

    /**
     * 删除指令处理器
     */
    DELETE_COMMAND_HANDLER("DeleteCommandHandler", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/DeleteCommandHandler.java.vm",
    }),

    /**
     * 外部事件
     */
    EXTERNAL_EVENT("ExternalEvent", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/consumer/event/{ExternalEvent}.java.vm",
    }),

    /**
     * 指令事件
     */
    EVENT("Event", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/{Event}.java.vm"
    }),

    /**
     * 查询对象
     */
    QUERY("Query", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/client/query/Query.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/app/view/QueryExe.java.vm",
    }),

    /**
     * QueryResult 结果集
     */
    QUERY_RESULT("QueryResult", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/client/dto/QueryResult.java.vm",
    }),

    /**
     * 数据对象
     */
    DATA_MODEL("DataModel", new String[]{
            "cola/{projectName}/src/main/resources/mapper/{field}/DataModelMapper.xml.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/mapper/DataModelMapper.java.vm",
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/model/DataModelDO.java.vm"
    }),

    OBJECT_MAPPER_MODEL("ObjectMapperModel", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/ObjectMapperRepositoryImpl.java.vm",
    }),

    OBJECT_MAPPER_MODEL_ENTITY_TO_DO("Entity2Do", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/infrastructure/assembler/Entity2DOConvert.java.vm"
    }),

    OBJECT_MAPPER_MODEL_DTO_TO_DO("DTO2DO", new String[]{
            "cola/{projectName}/src/main/java/{group}/{field}/app/assembler/QueryResult2DOConvert.java.vm"
    }),

    /**
     * 业务场景
     */
    BUSINESS_SCENARIO("BusinessScenario", new String[]{
            "cola/{projectName}/src/main/java/{group}/{business}/app/{Business}RpcServiceImpl.java.vm",
            "cola/{projectName}/src/main/java/{group}/{business}/client/{Business}RpcService.java.vm",
            "cola/{projectName}/src/main/java/{group}/{business}/adapter/app/{Business}AppController.java.vm",
            "cola/{projectName}/src/main/java/{group}/{business}/adapter/web/{Business}WebController.java.vm",
    }),

    /**
     * 业务请求对象
     */
    BUSINESS_QUERY("BusinessQuery", new String[]{
            "cola/{projectName}/src/main/java/{group}/{business}/client/query/{BusinessQuery}.java.vm",
    }),

    /**
     * 业务结构对象
     */
    BUSINESS_DTO("BusinessDto", new String[]{
            "cola/{projectName}/src/main/java/{group}/{business}/client/dto/{BusinessDTO}.java.vm",
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
