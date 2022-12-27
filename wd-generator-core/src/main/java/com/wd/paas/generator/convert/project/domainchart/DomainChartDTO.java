package com.wd.paas.generator.convert.project.domainchart;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationDTO;
import com.wd.paas.generator.generate.generator.DomainChartInfo;
import com.wd.paas.generator.generate.generator.project.domainchart.DomainChartGenerator;
import lombok.Data;

/**
 * DDD领域图谱生成信息
 *
 * @author ZhuXueLiang
 * @version 1.1
 * @date 2022/8/23
 */
@Data
public class DomainChartDTO {

    /**
     * 领域名
     */
    private String name;

    /**
     * 领域描述
     */
    private String description;

    /**
     * 领域作者
     */
    private String author;

    /**
     * 领域生成时间
     */
    private String dateTime;

    /**
     * 图谱
     */
    private ChartDTO chartDTO;

    public DomainChartGenerator trans2DomainChart() {
        DomainChartGenerator domainChartGenerator = new DomainChartGenerator();
        domainChartGenerator.setDomainChartInfo(trans2DomainChartInfo());
        domainChartGenerator.setAggregationList(AggregationDTO.trans2Aggregations(chartDTO));
        return domainChartGenerator;
    }

    private DomainChartInfo trans2DomainChartInfo() {
        DomainChartInfo domainChartInfo = new DomainChartInfo();
        domainChartInfo.setName(name.toLowerCase());
        domainChartInfo.setDescription(description);
        domainChartInfo.setAuthor(author);
        domainChartInfo.setDateTime(dateTime);
        return domainChartInfo;
    }
}
