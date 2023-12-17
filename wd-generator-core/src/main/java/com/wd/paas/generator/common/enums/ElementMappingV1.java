package com.wd.paas.generator.common.enums;

/**
 * 元素与模板的映射关系 - 分层结构
 *
 * @author ZhuXueLiang
 * @since 1.0
 */
public class ElementMappingV1 extends AbstractElementMapping {

    public ElementMappingV1(GenerateOperationTypeEnum operationTypeEnum) {
        super(operationTypeEnum);
    }

    /**
     * 项目
     */
    @Override
    public String[] project() {
        return new String[]{
                // project
                "cola/{projectName}/pom.xml.vm",
                // domain
                "cola/{projectName}/{projectName}-domain/pom.xml.vm",
                // adapter
                "cola/{projectName}/{projectName}-adapter/pom.xml.vm",
                // app
                "cola/{projectName}/{projectName}-app/pom.xml.vm",
                // client
                "cola/{projectName}/{projectName}-client/pom.xml.vm",
                "cola/{projectName}/{projectName}-client/src/resources/i18n/messages_zh_CN.properties",
                "cola/{projectName}/{projectName}-client/src/resources/i18n/messages_en_US.properties",
                // infrastructure
                "cola/{projectName}/{projectName}-infrastructure/pom.xml.vm",
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
        };
    }

    /**
     * 业务域
     */
    @Override
    public String[] domainChart() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        // controller
                        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/app/{Domain}AppController.java.vm",
                        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/web/{Domain}WebController.java.vm",
                        // app
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/{Domain}RpcServiceImpl.java.vm",
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/task/{Domain}Task.java.vm",
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/consumer/{Domain}Listener.java.vm",
                        // client
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{Domain}RpcService.java.vm",
                        // domain
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/BaseRepository.java.vm",
                        // infrastructure
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJpaAggregate.java.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseConvert.java.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJsonConvertor.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{
                        // client
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{Domain}RpcService.java.vm",
                        // domain
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/BaseRepository.java.vm",
                        // infrastructure
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJpaAggregate.java.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseConvert.java.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseJsonConvertor.java.vm",
                };
        }
    }

    /**
     * 业务域定时任务
     */
    @Override
    public String[] domainChartTask() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/task/{Domain}Task.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 业务域事件监听
     */
    @Override
    public String[] domainChartListener() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/consumer/{Domain}Listener.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
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
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        // domain
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AbstractAggregation.java.vm",
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationFactory.java.vm",
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AggregationRepository.java.vm",
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Aggregation.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{
                        // domain
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AbstractAggregation.java.vm",
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Aggregation.java.vm",
                };
        }
    }

    /**
     * 实体
     */
    @Override
    public String[] entity() {
        return new String[]{
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Entity.java.vm",
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/EntityConverter.java.vm",
                "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/EntityDTO.java.vm",
                "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/EntityDTO2EntityConvert.java.vm"
        };
    }

    /**
     * 值对象
     */
    @Override
    public String[] valueObject() {
        return new String[]{
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm",
                "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/ValueObjectDTO.java.vm",
                "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/ValueObjectDTO2ValueObjectConvert.java.vm",
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObjectConverter.java.vm"
        };
    }

    /**
     * 枚举
     */
    @Override
    public String[] enums() {
        return new String[]{
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Enum.java.vm",
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/EnumConverter.java.vm",
        };
    }

    /**
     * 指令
     */
    @Override
    public String[] command() {
        switch (operationTypeEnum) {
            default:
            case UPDATE_CODE:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Command.java.vm",
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/CommandDTO.java.vm",
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/CommandDTO2CommandConvert.java.vm",
                };
        }
    }

    /**
     * 指令处理器
     */
    @Override
    public String[] commandHandler() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/CommandHandler.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 新增指令处理器
     */
    @Override
    public String[] addCommandHandler() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/AddCommandHandler.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 更新指令处理器
     */
    @Override
    public String[] updateCommandHandler() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/UpdateCommandHandler.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 删除指令处理器
     */
    @Override
    public String[] deleteCommandHandler() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/DeleteCommandHandler.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 外部事件
     */
    @Override
    public String[] externalEvent() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/consumer/event/{ExternalEvent}.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    /**
     * 指令事件
     */
    @Override
    public String[] event() {
        return new String[]{
                "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/{Event}.java.vm"
        };
    }

    /**
     * 查询对象
     */
    @Override
    public String[] query() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/Query.java.vm",
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/view/QueryExe.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/query/Query.java.vm",
                };
        }
    }

    /**
     * QueryResult 结果集
     */
    @Override
    public String[] queryResult() {
        return new String[]{
                "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/dto/QueryResult.java.vm",
        };
    }

    /**
     * 数据对象
     */
    @Override
    public String[] dataModel() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-infrastructure/src/main/resources/mapper/{field}/DataModelMapper.xml.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/mapper/DataModelMapper.java.vm",
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/DataModelDO.java.vm"
                };
            case UPDATE_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/DataModelDO.java.vm"
                };
        }
    }

    @Override
    public String[] objectMapperModel() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/ObjectMapperRepositoryImpl.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{};
        }
    }

    @Override
    public String[] Entity2Do() {
        return new String[]{
                "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/assembler/Entity2DOConvert.java.vm"
        };
    }

    @Override
    public String[] DTO2DO() {
        return new String[]{
                "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/assembler/QueryResult2DOConvert.java.vm"
        };
    }

    /**
     * 业务场景
     */
    @Override
    public String[] businessScenario() {
        switch (operationTypeEnum) {
            default:
            case INIT_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/businessservice/{business}/{Business}RpcServiceImpl.java.vm",
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/{Business}RpcService.java.vm",
                        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/businessservice/{business}/app/{Business}AppController.java.vm",
                        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/businessservice/{business}/web/{Business}WebController.java.vm",
                };
            case UPDATE_CODE:
                return new String[]{
                        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/{Business}RpcService.java.vm",
                };
        }
    }

    /**
     * 业务请求对象
     */
    @Override
    public String[] businessQuery() {
        return new String[]{
                "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/query/{BusinessQuery}.java.vm",
        };
    }

    /**
     * 业务结构对象
     */
    @Override
    public String[] businessDto() {
        return new String[]{
                "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/businessservice/{business}/dto/{BusinessDTO}.java.vm",
        };
    }

}
