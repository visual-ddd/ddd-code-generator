package com.wd.paas.generator.generate.constant;

/**
 * 模板文件路径映射变量
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/27
 */
public class ModelUrlConstant {

    public static final String OUTPUT_PATH = "cola";

    public static final String PROJECT_NAME = "{projectName}";
    public static final String GROUP = "{group}";
    public static final String FIELD = "{field}";
    public static final String ACTION = "{action}";
    public static final String AGGREGATION = "{aggregation}";
    public static final String VM = ".vm";
    public static final String POINT = ".";
    public static final String SLASH = "/";
    public static final String EMPTY = "";

    public static final String AGGREGATION_CLASS = "Aggregation";
    public static final String ENTITY_CLASS = "Entity";
    public static final String VALUE_OBJECT_CLASS = "ValueObject";
    public static final String COMMAND_CLASS = "Command";
    public static final String ADD_COMMAND_HANDLER_CLASS = "AddCommand";
    public static final String UPDATE_COMMAND_HANDLER_CLASS = "UpdateCommand";
    public static final String DELETE_COMMAND_HANDLER_CLASS = "DeleteCommand";
    public static final String EVENT_CLASS = "Event";
    public static final String DOMAIN_CHART = "DomainChart";

    public static final String COMMAND_CLASS_SUFFIX = "Cmd";
    public static final String EVENT_CLASS_SUFFIX = "Event";

    public static final String QUERY_RESULT_CLASS = "QueryResult";
    public static final String QUERY_CLASS = "Query";
    public static final String PAGE_QUERY_CLASS = "PageQuery";
}