package com.wd.paas.generator.common.enums;

/**
 * 元素类型模版映射
 */
public abstract class AbstractElementMapping {

    protected GenerateOperationTypeEnum operationTypeEnum;

    public AbstractElementMapping(GenerateOperationTypeEnum operationTypeEnum) {
        this.operationTypeEnum = operationTypeEnum;
    }

    public abstract String[] project();

    public abstract String[] domainChart();

    public abstract String[] domainChartTask();

    public abstract String[] domainChartListener();

    public abstract String[] aggregation();

    public abstract String[] aggregationRoot();

    public abstract String[] entity();

    public abstract String[] valueObject();

    public abstract String[] enums();

    public abstract String[] command();

    public abstract String[] commandHandler();

    public abstract String[] addCommandHandler();

    public abstract String[] updateCommandHandler();

    public abstract String[] deleteCommandHandler();

    public abstract String[] externalEvent();

    public abstract String[] event();

    public abstract String[] query();

    public abstract String[] queryResult();

    public abstract String[] dataModel();

    public abstract String[] objectMapperModel();

    public abstract String[] Entity2Do();

    public abstract String[] DTO2DO();

    public abstract String[] businessScenario();

    public abstract String[] businessQuery();

    public abstract String[] businessDto();
}
