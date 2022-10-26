package com.wd.paas.generator.generate.constant;

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
        // project
        "cola/{projectName}/pom.xml.vm",
        // domain
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
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/BaseConvert.java.vm",
        // start
        "cola/{projectName}/{projectName}-start/pom.xml.vm",
        "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/StartApplication.java.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/application.yml.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/bootstrap.yml.vm",
        "cola/{projectName}/{projectName}-start/src/main/resources/logback-spring.xml.vm",
        "cola/{projectName}/{projectName}-start/src/main/java/{group}/start/config/Knife4jConfiguration.java.vm"},
        new String[]{}),

    /**
     * 领域图谱
     */
    DOMAIN_CHART("DomainChart", new String[]{}, new String[]{}),

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
        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/{aggregation}/app/AggregationAppController.java.vm",
        "cola/{projectName}/{projectName}-adapter/src/main/java/{group}/adapter/{field}/{aggregation}/web/AggregationWebController.java.vm",
        // repository
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/mapper/AggregationMapper.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/model/AggregationDO.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/repository/AggregationRepositoryImpl.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/java/{group}/infrastructure/{field}/assembler/AggregationDoConvert.java.vm",
        "cola/{projectName}/{projectName}-infrastructure/src/main/resources/mapper/{field}/AggregationMapper.xml.vm",
    }, new String[]{
        // domain
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/AbstractAggregation.java.vm",
    }),

    /**
     * 实体
     */
    ENTITY("Entity", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Entity.java.vm",
    }, new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/Entity.java.vm",
    }),

    /**
     * 值对象
     */
    VALUE_OBJECT("ValueObject", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm"
    }, new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/ValueObject.java.vm"
    }),

    /**
     * 指令
     */
    COMMAND("Command", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Command.java.vm",
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/CommandHandler.java.vm",
    }, new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Command.java.vm",
    }),

    /**
     * 事件
     */
    EVENT("Event", new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Event.java.vm"
    }, new String[]{
        "cola/{projectName}/{projectName}-domain/src/main/java/{group}/domain/{field}/{aggregation}/{action}/Event.java.vm"
    }),

    /**
     * 属性
     */
    FIELD("Field", new String[]{},
        new String[]{}),

    /**
     * 方法
     */
    METHOD("Method", new String[]{},
        new String[]{}),

    /**
     * 查询器
     */
    QUERY_EXE("QueryExe", new String[]{
        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/{aggregation}/view/QueryExe.java.vm",
    }, new String[]{}),

    /**
     * 分页查询器
     */
    PAGE_QUERY_EXE("PageQueryExe", new String[]{
        "cola/{projectName}/{projectName}-app/src/main/java/{group}/app/{field}/{aggregation}/view/PageQueryExe.java.vm",
    }, new String[]{}),

    /**
     * 查询对象
     */
    QUERY("Query", new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/query/Query.java.vm",
    }, new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/query/Query.java.vm",
    }),

    /**
     * 分页查询对象
     */
    PAGE_QUERY("PageQuery", new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/query/PageQuery.java.vm",
    }, new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/query/PageQuery.java.vm",
    }),

    /**
     * QueryResult 结果集
     */
    QUERY_RESULT("QueryResult", new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/dto/QueryResult.java.vm",
    }, new String[]{
        "cola/{projectName}/{projectName}-client/src/main/java/{group}/client/{field}/{aggregation}/dto/QueryResult.java.vm",
    }),

    /**
     * 未定义
     */
    OTHER("Other", new String[]{}, new String[]{}),
    ;

    private final String name;
    private final String[] templateUrls;
    private final String[] updateTemplateUrls;

    GenerateElementTypeEnum(String name, String[] templateUrls, String[] updateTemplateUrls) {
        this.name = name;
        this.templateUrls = templateUrls;
        this.updateTemplateUrls = updateTemplateUrls;
    }

    /**
     * 根据生成方式获取需要生成的模版数组
     *
     * @param way 生成方式
     * @return 模版路径数组
     */
    public String[] getTemplateUrlsByWay(GenerateWayEnum way) {
        switch (way) {
            case OVERALL:
                return templateUrls;
            case PART:
                return updateTemplateUrls;
            default:
                return new String[]{};
        }

    }
}
