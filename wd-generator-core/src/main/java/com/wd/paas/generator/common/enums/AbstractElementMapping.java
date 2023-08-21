package com.wd.paas.generator.common.enums;

/**
 * 元素类型模版映射
 */
public interface AbstractElementMapping {

    String[] project();
    
    String[] domainChart();

    String[] domainChartTask();

    String[] domainChartListener();

    String[] aggregation();

    String[] aggregationRoot();

    String[] entity();

    String[] valueObject();

    String[] enums();

    String[] command();

    String[] commandHandler();

    String[] addCommandHandler();

    String[] updateCommandHandler();

    String[] deleteCommandHandler();

    String[] externalEvent();

    String[] event();

    String[] query();

    String[] queryResult();

    String[] dataModel();

    String[] objectMapperModel();

    String[] Entity2Do();

    String[] DTO2DO();

    String[] businessScenario();

    String[] businessQuery();

    String[] businessDto();
}
