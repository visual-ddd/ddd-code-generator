package com.wd.paas.generator.common.constant;

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
    public static final String BUSINESS = "{business}";
    public static final String ACTION = "{action}";
    public static final String AGGREGATION = "{aggregation}";
    public static final String VM = ".vm";
    public static final String POINT = ".";
    public static final String SLASH = "/";
    public static final String EMPTY = "";

    public static final String DOMAIN_CLASS = "{Domain}";
    public static final String AGGREGATION_CLASS = "Aggregation";
    public static final String ENUM_CLASS = "Enum";

    public static final String ENTITY_CLASS = "Entity";
    public static final String ENTITY_DTO_CLASS = "EntityDTO";

    public static final String VALUE_OBJECT_CLASS = "ValueObject";
    public static final String VALUE_OBJECT_DTO_CLASS = "ValueObjectDTO";

    public static final String COMMAND_CLASS = "Command";
    public static final String COMMAND_DTO_CLASS = "CommandDTO";
    public static final String ADD_COMMAND_HANDLER_CLASS = "AddCommand";
    public static final String UPDATE_COMMAND_HANDLER_CLASS = "UpdateCommand";
    public static final String DELETE_COMMAND_HANDLER_CLASS = "DeleteCommand";
    public static final String EVENT_CLASS = "{Event}";
    public static final String EXTERNAL_EVENT_CLASS = "{ExternalEvent}";

    public static final String EVENT_CLASS_SUFFIX = "Event";

    public static final String COMMAND_CLASS_SUFFIX = "Cmd";

    // 查询模型
    public static final String QUERY_RESULT_CLASS = "QueryResult";
    public static final String QUERY_CLASS = "Query";
    public static final String DTO_SUFFIX = "DTO";
    public static final String CONVERT_DTO_SUFFIX = "Dto";
    public static final String REQUEST_SUFFIX = "Request";

    // 数据模型
    public static final String DATA_DO_CLASS = "DataModelDO";
    public static final String DATA_MAPPER_CLASS = "DataModel";
    public static final String DATA_CLASS_SUFFIX = "DO";
    public static final String DATA_MAPPER_CLASS_SUFFIX = "Mapper";

    // 对象映射模型
    public static final String QUERY_RESULT_CONVERT_CLASS = "QueryResult2DOConvert";
    public static final String OBJECT_MAPPER_CONVERT_CLASS = "Entity2DOConvert";
    public static final String OBJECT_MAPPER_REPOSITORY_CLASS = "ObjectMapper";

    // 业务模型
    public static final String BUSINESS_SERVICE_CLASS = "{Business}";
    public static final String BUSINESS_DTO_CLASS = "{BusinessDTO}";
    public static final String BUSINESS_QUERY_CLASS = "{BusinessQuery}";

}