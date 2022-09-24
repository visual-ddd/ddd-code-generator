package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.QueryResultGenerator;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询结果集
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class QueryResultDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<QueryResultGenerator> trans2QueryResultList(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();
        List<QueryResultGenerator> QueryResultGenerators = new ArrayList<>();
        for (QueryResultDTO queryResultDTO : chartDTO.getQueryResultDTOList()) {
            if (queryResultDTO.getAggregationColor().equals(aggregationColor)) {
                QueryResultGenerator QueryResultGenerator = new QueryResultGenerator();
                QueryResultGenerator.setUmlClass(
                        queryResultDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                                chartDTO.getUmlMethodDTOList()));
                QueryResultGenerators.add(QueryResultGenerator);
            }
        }
        return QueryResultGenerators;
    }
}