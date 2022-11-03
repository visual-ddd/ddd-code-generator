package com.wd.paas.generator.generate.constant;

/**
 * Velocity上下文变量
 * 描述：对应模版中需要进行替换的变量
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/27
 */
public class VelocityLabel {

    /**
     * 项目
     */
    public static final String PROJECT_NAME = "PROJECT_NAME";
    public static final String PROJECT_PACKAGE = "PROJECT_PACKAGE";
    public static final String PROJECT_AUTHOR = "PROJECT_AUTHOR";
    public static final String PROJECT_DATE_TIME = "PROJECT_DATE_TIME";

    /**
     * 领域
     */
    public static final String DOMAIN_NAME = "DOMAIN_NAME";
    public static final String DOMAIN_AUTHOR = "DOMAIN_AUTHOR";
    public static final String DOMAIN_DATE_TIME = "DOMAIN_DATE_TIME";

    // 聚合
    public static final String AGGREGATION_CLASS_NAME = "AGGREGATION_CLASS_NAME";
    public static final String AGGREGATION_CLASS_NAME_ALL_LOWER = "AGGREGATION_CLASS_NAME_ALL_LOWER";
    public static final String AGGREGATION_CLASS_DESCRIPTION = "AGGREGATION_CLASS_DESCRIPTION";
    public static final String AGGREGATION_CLASS_FIELDS = "AGGREGATION_CLASS_FIELDS";
    public static final String AGGREGATION_CLASS_METHODS = "AGGREGATION_CLASS_METHODS";
    public static final String AGGREGATION_CLASS_PACKAGE = "AGGREGATION_CLASS_PACKAGE";
    public static final String AGGREGATION_CMD_LIST = "AGGREGATION_CMD_LIST";
    public static final String AGGREGATION_QUERY_LIST = "AGGREGATION_QUERY_LIST";
    public static final String AGGREGATION_PAGE_QUERY_LIST = "AGGREGATION_PAGE_QUERY_LIST";

    // 实体
    public static final String ENTITY_CLASS_NAME = "ENTITY_CLASS_NAME";
    public static final String ENTITY_CLASS_PACKAGE = "ENTITY_CLASS_PACKAGE";
    public static final String ENTITY_CLASS_FIELDS = "ENTITY_CLASS_FIELDS";
    public static final String ENTITY_CLASS_DESCRIPTION = "ENTITY_CLASS_DESCRIPTION";
    public static final String ENTITY_CLASS_METHODS = "ENTITY_CLASS_METHODS";

    // 值对象
    public static final String VALUE_OBJECT_CLASS_NAME = "VALUE_OBJECT_CLASS_NAME";
    public static final String VALUE_OBJECT_CLASS_PACKAGE = "VALUE_OBJECT_CLASS_PACKAGE";
    public static final String VALUE_OBJECT_CLASS_DESCRIPTION = "VALUE_OBJECT_CLASS_DESCRIPTION";
    public static final String VALUE_OBJECT_CLASS_FIELDS = "VALUE_OBJECT_CLASS_FIELDS";
    public static final String VALUE_OBJECT_CLASS_METHODS = "VALUE_OBJECT_CLASS_METHODS";

    // 分页查询
    public static final String PAGE_QUERY_CLASS_NAME = "PAGE_QUERY_CLASS_NAME";
    public static final String PAGE_QUERY_CLASS_PACKAGE = "PAGE_QUERY_CLASS_PACKAGE";
    public static final String PAGE_QUERY_CLASS_DESCRIPTION = "PAGE_QUERY_CLASS_DESCRIPTION";
    public static final String PAGE_QUERY_CLASS_FIELDS = "PAGE_QUERY_CLASS_FIELDS";
    public static final String PAGE_QUERY_CLASS_METHODS = "PAGE_QUERY_CLASS_METHODS";

    // 查询
    public static final String QUERY_CLASS_NAME = "QUERY_CLASS_NAME";
    public static final String QUERY_CLASS_PACKAGE = "QUERY_CLASS_PACKAGE";
    public static final String QUERY_CLASS_DESCRIPTION = "QUERY_CLASS_DESCRIPTION";
    public static final String QUERY_CLASS_FIELDS = "QUERY_CLASS_FIELDS";
    public static final String QUERY_CLASS_METHODS = "QUERY_CLASS_METHODS";

    public static final String QUERY_RESULT_TYPE = "QUERY_RESULT_TYPE";

    // 结果集
    public static final String QUERY_RESULT_CLASS_NAME = "QUERY_RESULT_CLASS_NAME";
    public static final String QUERY_RESULT_CLASS_PACKAGE = "QUERY_RESULT_CLASS_PACKAGE";
    public static final String QUERY_RESULT_CLASS_DESCRIPTION = "QUERY_RESULT_CLASS_DESCRIPTION";
    public static final String QUERY_RESULT_CLASS_FIELDS = "QUERY_RESULT_CLASS_FIELDS";
    public static final String QUERY_RESULT_CLASS_METHODS = "QUERY_RESULT_CLASS_METHODS";

    // 指令
    public static final String CMD_CLASS_NAME = "CMD_CLASS_NAME";
    public static final String CMD_CLASS_PACKAGE = "CMD_CLASS_PACKAGE";
    public static final String CMD_CLASS_DESCRIPTION = "CMD_CLASS_DESCRIPTION";
    public static final String CMD_CLASS_FIELDS = "CMD_CLASS_FIELDS";
    public static final String CMD_CLASS_METHODS = "CMD_CLASS_METHODS";
    public static final String CMD_EVENT = "CMD_EVENT" ;

    // 指令事件
    public static final String CMD_EVENT_CLASS_NAME = "CMD_EVENT_CLASS_NAME";
    public static final String CMD_EVENT_CLASS_PACKAGE = "CMD_EVENT_CLASS_PACKAGE";
    public static final String CMD_EVENT_CLASS_DESCRIPTION = "CMD_EVENT_CLASS_DESCRIPTION";
    public static final String CMD_EVENT_CLASS_FIELDS = "CMD_EVENT_CLASS_FIELDS";
    public static final String CMD_EVENT_CLASS_METHODS = "CMD_EVENT_CLASS_METHODS";


    public static final String PROJECT_SLASH_GROUP = "ProjectSlashGroup";
    public static final String CASE_FORMAT_LOWER_HYPHEN = "CASE_FORMAT_LOWER_HYPHEN";
    public static final String CASE_FORMAT_LOWER_CAMEL = "CASE_FORMAT_LOWER_CAMEL";
}