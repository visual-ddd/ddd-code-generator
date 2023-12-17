package com.wd.paas.generator.common.enums;

/**
 * 元素与模板的映射关系 - 单体结构
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
public class ElementMappingV2 extends AbstractElementMapping {

    public ElementMappingV2(GenerateOperationTypeEnum operationTypeEnum) {
        super(operationTypeEnum);
    }

    /**
     * 项目
     */
    @Override
    public String[] project() {
        return new String[]{
                "cola-single/{projectName}/pom.xml.vm",
                "cola-single/{projectName}/src/main/resources/i18n/messages_zh_CN.properties",
                "cola-single/{projectName}/src/main/resources/i18n/messages_en_US.properties",
                "cola-single/{projectName}/src/main/java/{group}/start/StartApplication.java.vm",
                "cola-single/{projectName}/src/main/resources/application.yml.vm",
                "cola-single/{projectName}/src/main/resources/bootstrap.yml.vm",
                "cola-single/{projectName}/src/main/resources/logback-spring.xml.vm",
                "cola-single/{projectName}/src/main/java/{group}/start/config/Knife4jConfiguration.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/start/config/ProjectExceptionHandler.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/start/config/StartInfoPrintListener.java.vm",
                "cola-single/{projectName}/src/main/docker/Dockerfile",
        };
    }

    /**
     * 业务域
     */
    @Override
    public String[] domainChart() {
        return new String[]{
                // adapter
                "cola-single/{projectName}/src/main/java/{group}/{field}/adapter/app/{Domain}AppController.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/adapter/web/{Domain}WebController.java.vm",
                // app
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/{Domain}Application.java.vm",
                // client
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/{Domain}RpcService.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/{Domain}RpcServiceImpl.java.vm",
                // infrastructure
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseJpaAggregate.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseConvert.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/BaseJsonConvertor.java.vm",
        };
    }

    /**
     * 业务域定时任务
     */
    @Override
    public String[] domainChartTask() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/task/{Domain}Task.java.vm",
        };
    }

    /**
     * 业务域事件监听
     */
    @Override
    public String[] domainChartListener() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/consumer/{Domain}Listener.java.vm",
        };
    }

    /**
     * 聚合
     */
    @Override
    public String[] aggregation() {
        return new String[]{};
    }

    /**
     * 聚合根
     */
    @Override
    public String[] aggregationRoot() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/AggregationFactory.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/AggregationRepository.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Aggregation.java.vm",
        };
    }

    /**
     * 实体
     */
    @Override
    public String[] entity() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Entity.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/EntityConverter.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/query/EntityDTO.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/assembler/EntityDTO2EntityConvert.java.vm"
        };
    }

    /**
     * 值对象
     */
    @Override
    public String[] valueObject() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/ValueObject.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/query/ValueObjectDTO.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/assembler/ValueObjectDTO2ValueObjectConvert.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/ValueObjectConverter.java.vm"
        };
    }

    /**
     * 枚举
     */
    @Override
    public String[] enums() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/Enum.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/domain/{aggregation}/EnumConverter.java.vm",
        };
    }

    /**
     * 指令
     */
    @Override
    public String[] command() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/Command.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/query/CommandDTO.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/assembler/CommandDTO2CommandConvert.java.vm",
        };
    }

    /**
     * 指令处理器
     */
    @Override
    public String[] commandHandler() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/CommandHandler.java.vm",
        };
    }

    /**
     * 新增指令处理器
     */
    @Override
    public String[] addCommandHandler() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/AddCommandHandler.java.vm",
        };
    }

    /**
     * 更新指令处理器
     */
    @Override
    public String[] updateCommandHandler() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/UpdateCommandHandler.java.vm",
        };
    }

    /**
     * 删除指令处理器
     */
    @Override
    public String[] deleteCommandHandler() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/DeleteCommandHandler.java.vm",
        };
    }

    /**
     * 外部事件
     */
    @Override
    public String[] externalEvent() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/consumer/event/{ExternalEvent}.java.vm",
        };
    }

    /**
     * 指令事件
     */
    @Override
    public String[] event() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/cmd/{action}/{Event}.java.vm"
        };
    }

    /**
     * 查询对象
     */
    @Override
    public String[] query() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/query/Query.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/view/QueryExe.java.vm",
        };
    }

    /**
     * QueryResult 结果集
     */
    @Override
    public String[] queryResult() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/client/dto/QueryResult.java.vm",
        };
    }

    /**
     * 数据对象
     */
    @Override
    public String[] dataModel() {
        return new String[]{
                "cola-single/{projectName}/src/main/resources/mapper/{field}/DataModelMapper.xml.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/mapper/DataModelMapper.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/model/DataModelDO.java.vm"
        };
    }

    @Override
    public String[] objectMapperModel() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/repository/ObjectMapperRepositoryImpl.java.vm",
        };
    }

    @Override
    public String[] Entity2Do() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/infrastructure/assembler/Entity2DOConvert.java.vm"
        };
    }

    @Override
    public String[] DTO2DO() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{field}/app/assembler/QueryResult2DOConvert.java.vm"
        };
    }

    /**
     * 业务场景
     */
    @Override
    public String[] businessScenario() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{business}/app/{Business}RpcServiceImpl.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{business}/client/{Business}RpcService.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{business}/adapter/app/{Business}AppController.java.vm",
                "cola-single/{projectName}/src/main/java/{group}/{business}/adapter/web/{Business}WebController.java.vm",
        };
    }

    /**
     * 业务请求对象
     */
    @Override
    public String[] businessQuery() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{business}/client/query/{BusinessQuery}.java.vm",
        };
    }

    /**
     * 业务结构对象
     */
    @Override
    public String[] businessDto() {
        return new String[]{
                "cola-single/{projectName}/src/main/java/{group}/{business}/client/dto/{BusinessDTO}.java.vm",
        };
    }

}
