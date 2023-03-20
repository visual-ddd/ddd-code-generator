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
            // adapter
            "cola/{projectName}/{projectName}-adapter/pom.xml.vm",
            "cola/{projectName}/{projectName}-adapter/src/resources/i18n/messages_zh_CN.properties",
            "cola/{projectName}/{projectName}-adapter/src/resources/i18n/messages_en_US.properties",
            // app
            "cola/{projectName}/{projectName}-app/pom.xml.vm",
            // client
            "cola/{projectName}/{projectName}-client/pom.xml.vm",
            // infrastructure
            "cola/{projectName}/{projectName}-infrastructure/pom.xml.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJpaAggregate.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseConvert.java.vm",
            // start
            "cola/{projectName}/{projectName}-start/pom.xml.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/StartApplication.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/application.yml.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/bootstrap.yml.vm",
            "cola/{projectName}/{projectName}-start/src/main/resources/logback-spring.xml.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/Knife4jConfiguration.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/ProjectExceptionHandler.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/StartInfoPrintListener.java.vm",
            "cola/{projectName}/{projectName}-start/src/main/docker/Dockerfile",
    }),

    /**
     * 业务域
     */
    DOMAIN_CHART("DomainChart", new String[]{
            // controller
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/app/{Domain}AppController.java.vm",
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/web/{Domain}WebController.java.vm",
            // app
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/JsonConverter.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/{Domain}RpcServiceImpl.java.vm",
            // client
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{Domain}RpcService.java.vm",
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
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AbstractAggregation.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationFactory.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationRepository.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Aggregation.java.vm",
    }),

    /**
     * 实体
     */
    ENTITY("Entity", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Entity.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/EntityConverter.java.vm",
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/EntityDTO.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/EntityDTO2EntityConvert.java.vm"
    }),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm",
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/ValueObjectDTO.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/ValueObjectDTO2ValueObjectConvert.java.vm",
            "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObjectConverter.java.vm"
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
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/CommandDTO.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/CommandDTO2CommandConvert.java.vm",
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
     * 查询对象
     */
    QUERY("Query", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/Query.java.vm",
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/view/QueryExe.java.vm",
    }),

    /**
     * QueryResult 结果集
     */
    QUERY_RESULT("QueryResult", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/dto/QueryResult.java.vm",
    }),

    /**
     * 数据对象
     */
    DATA_MODEL("DataModel", new String[]{
            "cola/{projectName}/{projectName}-infrastructure/src/main/resources/mapper/{field}/DataModelMapper.xml.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/mapper/DataModelMapper.java.vm",
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/DataModelDO.java.vm"
    }),

    OBJECT_MAPPER_MODEL("ObjectMapperModel", new String[]{
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/ObjectMapperRepositoryImpl.java.vm",
    }),

    OBJECT_MAPPER_MODEL_ENTITY_TO_DO("Entity2Do", new String[]{
            "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/assembler/Entity2DOConvert.java.vm"
    }),

    OBJECT_MAPPER_MODEL_DTO_TO_DO("DTO2DO", new String[]{
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/QueryResult2DOConvert.java.vm"
    }),

    /**
     * 业务场景
     */
    BUSINESS_SCENARIO("BusinessScenario", new String[]{
            "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/businessservice/{business}/{Business}RpcServiceImpl.java.vm",
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/{Business}RpcService.java.vm",
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/businessservice/{business}/app/{Business}AppController.java.vm",
            "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/businessservice/{business}/web/{Business}WebController.java.vm",
    }),

    /**
     * 业务请求对象
     */
    BUSINESS_QUERY("BusinessQuery", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/query/{BusinessQuery}.java.vm",
    }),

    /**
     * 业务结构对象
     */
    BUSINESS_DTO("BusinessDto", new String[]{
            "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/dto/{BusinessDTO}.java.vm",
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
