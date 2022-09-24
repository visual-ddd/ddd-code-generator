package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.PageQueryExeGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class PageQueryExeDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;
    /**
     * 查询结果集类型
     */
    private String queryResultType;

    public static List<PageQueryExeGenerator> trans2PageQueryExeList(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();
        List<PageQueryExeGenerator> PageQueryExeGenerators = new ArrayList<>();
        for (PageQueryExeDTO pageQueryExeDTO : chartDTO.getPageQueryExeDTOList()) {
            if (pageQueryExeDTO.getAggregationColor().equals(aggregationColor)) {
                PageQueryExeGenerator pageQueryExeGenerator = new PageQueryExeGenerator();
                pageQueryExeGenerator.setUmlClass(
                    pageQueryExeDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));

                pageQueryExeGenerator.setQueryResultType(pageQueryExeDTO.getQueryResultType());

                PageQueryExeGenerators.add(pageQueryExeGenerator);
            }
        }
        return PageQueryExeGenerators;
    }
}
