package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.PageQueryExeGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.QueryExeGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.QueryResultGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class QueryExeDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;
    /**
     * 查询结果集类型
     */
    private String queryResultType;

    public static List<QueryExeGenerator> trans2QueryExeList(AggregationDTO dto,
        ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<QueryExeGenerator> queryExeGenerators = new ArrayList<>();
        for (QueryExeDTO queryExeDTO : chartDTO.getQueryExeDTOList()) {
            if (queryExeDTO.getAggregationColor().equals(aggregationColor)) {
                QueryExeGenerator queryExeGenerator = new QueryExeGenerator();
                queryExeGenerator.setUmlClass(
                    queryExeDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));

                queryExeGenerator.setQueryResultType(queryExeDTO.getQueryResultType());

                queryExeGenerators.add(queryExeGenerator);
            }
        }
        return queryExeGenerators;
    }
}
