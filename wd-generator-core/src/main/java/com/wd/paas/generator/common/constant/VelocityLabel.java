package com.wd.paas.generator.common.constant;

/**
 * Velocity上下文变量
 * 描述：对应模版中需要进行替换的变量
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/27
 */
public class VelocityLabel {

    // 项目
    public static final String PROJECT_NAME = "PROJECT_NAME";
    public static final String PROJECT_PACKAGE = "PROJECT_PACKAGE";
    public static final String PROJECT_TITLE = "PROJECT_TITLE";
    public static final String PROJECT_DESCRIPTION = "PROJECT_DESCRIPTION";
    public static final String PROJECT_VERSION = "PROJECT_VERSION";

    // 业务域
    public static final String DOMAIN_NAME = "DOMAIN_NAME";
    public static final String DOMAIN_CLASS_NAME = "DOMAIN_CLASS_NAME";
    public static final String DOMAIN_DESCRIPTION = "DOMAIN_DESCRIPTION";
    public static final String DOMAIN_AUTHOR = "DOMAIN_AUTHOR";
    public static final String DOMAIN_QUERY_LIST = "DOMAIN_QUERY_LIST";
    public static final String DOMAIN_DTO_LIST = "DOMAIN_DTO_LIST";
    public static final String DOMAIN_CMD_LIST = "DOMAIN_CMD_LIST";
    public static final String DOMAIN_ENUM_LIST = "DOMAIN_ENUM_LIST";
    public static final String DOMAIN_VALUE_OBJECT_LIST = "DOMAIN_VALUE_OBJECT_LIST";
    public static final String DOMAIN_AGGREGATION_LIST = "DOMAIN_AGGREGATION_LIST";
    public static final String DOMAIN_OBJECT_MAPPER_LIST = "DOMAIN_OBJECT_MAPPER_LIST";
    public static final String DOMAIN_DATA_LIST = "DOMAIN_DATA_LIST";

    // 聚合
    public static final String AGGREGATION_CLASS_NAME = "AGGREGATION_CLASS_NAME";
    public static final String AGGREGATION_CLASS_DESCRIPTION = "AGGREGATION_CLASS_DESCRIPTION";
    public static final String AGGREGATION_CLASS_ID = "AGGREGATION_CLASS_ID";
    public static final String AGGREGATION_CLASS_FIELDS = "AGGREGATION_CLASS_FIELDS";
    public static final String AGGREGATION_CLASS_METHODS = "AGGREGATION_CLASS_METHODS";

    public static final String AGGREGATION_ENUM_LIST = "AGGREGATION_ENUM_LIST";
    public static final String AGGREGATION_VALUE_OBJECT_LIST = "AGGREGATION_VALUE_OBJECT_LIST";
    public static final String AGGREGATION_ENTITY_LIST = "AGGREGATION_ENTITY_LIST";
    public static final String AGGREGATION_CMD_LIST = "AGGREGATION_CMD_LIST";

    // 实体
    public static final String ENTITY_CLASS_NAME = "ENTITY_CLASS_NAME";
    public static final String ENTITY_CLASS_FIELDS = "ENTITY_CLASS_FIELDS";
    public static final String ENTITY_CLASS_DESCRIPTION = "ENTITY_CLASS_DESCRIPTION";
    public static final String ENTITY_CLASS_METHODS = "ENTITY_CLASS_METHODS";

    // 枚举
    public static final String ENUM_CLASS_NAME = "ENUM_CLASS_NAME";
    public static final String ENUM_CLASS_CONSTANTS = "ENUM_CLASS_CONSTANTS";
    public static final String ENUM_CLASS_DESCRIPTION = "ENUM_CLASS_DESCRIPTION";

    // 值对象
    public static final String VALUE_OBJECT_CLASS_NAME = "VALUE_OBJECT_CLASS_NAME";
    public static final String VALUE_OBJECT_CLASS_PACKAGE = "VALUE_OBJECT_CLASS_PACKAGE";
    public static final String VALUE_OBJECT_CLASS_DESCRIPTION = "VALUE_OBJECT_CLASS_DESCRIPTION";
    public static final String VALUE_OBJECT_CLASS_FIELDS = "VALUE_OBJECT_CLASS_FIELDS";
    public static final String VALUE_OBJECT_CLASS_METHODS = "VALUE_OBJECT_CLASS_METHODS";
    public static final String VALUE_OBJECT_DTO_NAME = "VALUE_OBJECT_DTO_NAME";

    // 查询
    public static final String QUERY_CLASS_NAME = "QUERY_CLASS_NAME";
    public static final String QUERY_PAGINATION = "QUERY_PAGINATION";
    public static final String QUERY_RETURN_INFO = "QUERY_RETURN_INFO";
    public static final String QUERY_CLASS_DESCRIPTION = "QUERY_CLASS_DESCRIPTION";
    public static final String QUERY_CLASS_FIELDS = "QUERY_CLASS_FIELDS";

    // 结果集
    public static final String QUERY_RESULT_CLASS_NAME = "QUERY_RESULT_CLASS_NAME";
    public static final String QUERY_RESULT_CLASS_PACKAGE = "QUERY_RESULT_CLASS_PACKAGE";
    public static final String QUERY_RESULT_CLASS_DESCRIPTION = "QUERY_RESULT_CLASS_DESCRIPTION";
    public static final String QUERY_RESULT_CLASS_FIELDS = "QUERY_RESULT_CLASS_FIELDS";
    public static final String QUERY_RESULT_CLASS_METHODS = "QUERY_RESULT_CLASS_METHODS";

    // 指令
    public static final String CMD_CLASS_NAME = "CMD_CLASS_NAME";
    public static final String CMD_DTO_CLASS = "CMD_DTO_CLASS";
    public static final String CMD_CLASS_DESCRIPTION = "CMD_CLASS_DESCRIPTION";
    public static final String CMD_CLASS_FIELDS = "CMD_CLASS_FIELDS";

    // 指令事件
    public static final String CMD_EVENT_CLASS_NAME = "CMD_EVENT_CLASS_NAME";
    public static final String CMD_EVENT_CLASS_FIELDS = "CMD_EVENT_CLASS_FIELDS";
    public static final String CMD_EVENT_CLASS_DESCRIPTION = "CMD_EVENT_CLASS_DESCRIPTION";
    public static final String CMD_CATEGORY = "CMD_CATEGORY";

    // 数据模型对象
    public static final String DATA_OBJECT_CLASS_NAME = "DATA_OBJECT_CLASS_NAME";
    public static final String DATA_OBJECT_CLASS_DESCRIPTION = "DATA_OBJECT_CLASS_DESCRIPTION";
    public static final String DATA_OBJECT_CLASS_FIELDS = "DATA_OBJECT_CLASS_FIELDS";
    public static final String DATA_OBJECT_CLASS_PRIMARY_KEY = "DATA_OBJECT_CLASS_PRIMARY_KEY";
    public static final String DATA_TABLE_NAME = "DATA_OBJECT_TABLE_NAME";
    public static final String DATA_MAPPER_CLASS_NAME = "DATA_MAPPER_CLASS_NAME";

    // 对象映射对象模型
    public static final String OBJECT_MAPPER_CLASS_DESCRIPTION = "OBJECT_MAPPER_CLASS_DESCRIPTION";
    public static final String OBJECT_MAPPER_SOURCE_OBJECT = "OBJECT_MAPPER_SOURCE_OBJECT";
    public static final String OBJECT_MAPPER_TARGET_OBJECT = "OBJECT_MAPPER_TARGET_OBJECT";
    public static final String OBJECT_MAPPER_OBJECT_TYPE = "OBJECT_MAPPER_OBJECT_TYPE";
    public static final String OBJECT_MAPPER_OBJECT_AGGREGATION = "OBJECT_MAPPER_OBJECT_AGGREGATION";
    public static final String OBJECT_MAPPER_OBJECT_FIELD_LIST = "OBJECT_MAPPER_OBJECT_FIELD_LIST";
    public static final String OBJECT_MAPPER_DATA_MAPPER = "OBJECT_MAPPER_DATA_MAPPER";

    public static final String CASE_FORMAT_LOWER_HYPHEN = "CASE_FORMAT_LOWER_HYPHEN";
    public static final String CASE_FORMAT_LOWER_CAMEL = "CASE_FORMAT_LOWER_CAMEL";
    public static final String CASE_FORMAT_UPPER_CAMEL = "CASE_FORMAT_UPPER_CAMEL";
    public static final String CASE_FORMAT_LOWER_UNDERSCORE = "CASE_FORMAT_LOWER_UNDERSCORE";

    public static final String URL_ACTION = "URL_ACTION";
    public static final String URL_AGGREGATION = "URL_AGGREGATION";

    public static final String CLASS_DTO_SUFFIX = "DTO";
    public static final String IMPORT_PACKAGE_MAP = "IMPORT_PACKAGE_MAP";
    public static final String PARSE_STRING_UTIL = "PARSE_STRING_UTIL";
}