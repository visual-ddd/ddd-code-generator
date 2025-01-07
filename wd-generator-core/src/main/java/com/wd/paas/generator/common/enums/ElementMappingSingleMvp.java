package com.wd.paas.generator.common.enums;

/**
 * 元素与模板的映射关系 - 单体结构-MVP版本
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
public class ElementMappingSingleMvp extends AbstractElementMapping {

    public ElementMappingSingleMvp(GenerateOperationTypeEnum operationTypeEnum) {
        super(operationTypeEnum);
    }

    /**
     * 项目
     */
    @Override
    public String[] project() {
        return new String[]{
                "cola-single-mvp/{projectName}/pom.xml.vm",
                "cola-single-mvp/{projectName}/Dockerfile",
                "cola-single-mvp/{projectName}/src/main/java/{group}/start/StartApplication.java.vm",
                "cola-single-mvp/{projectName}/src/main/resources/application.yml.vm",
//                "cola-single-mvp/{projectName}/src/main/resources/application-dev.yml.vm",
                "cola-single-mvp/{projectName}/src/main/resources/logback-spring.xml.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/start/config/Knife4jConfig.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/start/config/StartInfoPrinter.java.vm",
                "cola-single-mvp/docker-compose.yml.vm",

                // common
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/DTO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseEnum.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseQuery.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseDTO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseVO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/dto/PageQuery.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/dto/ResultDTO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/dto/PageResultDTO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/dto/SortingField.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseConvert.java",
//                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseJpaAggregate.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/base/BaseJsonConvertor.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/exception/SysException.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/exception/BizDialogException.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/exception/BizException.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/resultcode/ResultCode.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/resultcode/CommonResultCode.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/mybatis/plus/po/BaseDO.java",
                "cola-single-mvp/{projectName}/src/main/java/com/wakedata/common/core/dto/PageConstant.java",

        };
    }

    /**
     * 业务域
     */
    @Override
    public String[] domainChart() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/adapter/{Domain}AppController.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/adapter/{Domain}WebController.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/{Domain}Application.java.vm",
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/{Domain}RpcService.java.vm",
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/{Domain}RpcServiceImpl.java.vm",
        };
    }

    /**
     * 业务域定时任务
     */
    @Override
    public String[] domainChartTask() {
        return new String[]{
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/task/{Domain}Task.java.vm",
        };
    }

    /**
     * 业务域事件监听
     */
    @Override
    public String[] domainChartListener() {
        return new String[]{
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/consumer/{Domain}Listener.java.vm",
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
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/AggregationFactory.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/AggregationRepository.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/Aggregation.java.vm",
        };
    }

    /**
     * 实体
     */
    @Override
    public String[] entity() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/Entity.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/assembler/EntityConverter.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/request/EntityDTO.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/assembler/EntityDTO2EntityConvert.java.vm"
        };
    }

    /**
     * 值对象
     */
    @Override
    public String[] valueObject() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/ValueObject.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/request/ValueObjectDTO.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/assembler/ValueObjectDTO2ValueObjectConvert.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/assembler/ValueObjectConverter.java.vm"
        };
    }

    /**
     * 枚举
     */
    @Override
    public String[] enums() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/domain/{aggregation}/Enum.java.vm",
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/assembler/EnumConverter.java.vm",
        };
    }

    /**
     * 指令
     */
    @Override
    public String[] command() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/Command.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/request/CommandDTO.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/assembler/CommandDTO2CommandConvert.java.vm",
        };
    }

    /**
     * 指令处理器
     */
    @Override
    public String[] commandHandler() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/CommandHandler.java.vm",
        };
    }

    /**
     * 新增指令处理器
     */
    @Override
    public String[] addCommandHandler() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/AddCommandHandler.java.vm",
        };
    }

    /**
     * 更新指令处理器
     */
    @Override
    public String[] updateCommandHandler() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/UpdateCommandHandler.java.vm",
        };
    }

    /**
     * 删除指令处理器
     */
    @Override
    public String[] deleteCommandHandler() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/DeleteCommandHandler.java.vm",
        };
    }

    /**
     * 外部事件
     */
    @Override
    public String[] externalEvent() {
        return new String[]{
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/consumer/event/{ExternalEvent}.java.vm",
        };
    }

    /**
     * 指令事件
     */
    @Override
    public String[] event() {
        return new String[]{
//                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/cmd/{action}/{Event}.java.vm"
        };
    }

    /**
     * 查询对象
     */
    @Override
    public String[] query() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/request/Query.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/view/QueryExe.java.vm",
        };
    }

    /**
     * QueryResult 结果集
     */
    @Override
    public String[] queryResult() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/client/response/{QueryResult}.java.vm",
        };
    }

    /**
     * 数据对象
     */
    @Override
    public String[] dataModel() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/resources/mapper/{field}/DataModelMapper.xml.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/repository/mapper/DataModelMapper.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/repository/model/DataModelDO.java.vm"
        };
    }

    @Override
    public String[] objectMapperModel() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/repository/ObjectMapperRepositoryImpl.java.vm",
        };
    }

    @Override
    public String[] Entity2Do() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/infrastructure/assembler/Entity2DOConvert.java.vm"
        };
    }

    @Override
    public String[] DTO2DO() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizdomain/{field}/app/assembler/QueryResult2DOConvert.java.vm"
        };
    }

    /**
     * 业务场景
     */
    @Override
    public String[] businessScenario() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/app/{Business}RpcServiceImpl.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/client/{Business}RpcService.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/adapter/{Business}AppController.java.vm",
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/adapter/{Business}WebController.java.vm",
        };
    }

    /**
     * 业务请求对象
     */
    @Override
    public String[] businessQuery() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/client/request/{BusinessQuery}.java.vm",
        };
    }

    /**
     * 业务结构对象
     */
    @Override
    public String[] businessDto() {
        return new String[]{
                "cola-single-mvp/{projectName}/src/main/java/{group}/bizservice/{business}/client/response/{BusinessDTO}.java.vm",
        };
    }

}
