package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.QueryGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 查询对象
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class QueryDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;
    /**
     * 查询结果集类型
     */
    private String queryResultType;

    public static List<QueryGenerator> trans2Query(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<QueryGenerator> queryGenerators = new ArrayList<>();
        for (QueryDTO queryDTO : chartDTO.getQueryDTOList()) {
            if (queryDTO.getAggregationColor().equals(aggregationColor)) {

                QueryGenerator queryGenerator = new QueryGenerator();
                queryGenerator.setUmlClass(
                    queryDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));

                queryGenerator.setQUERY_RESULT_TYPE(queryDTO.getQueryResultType());

                queryGenerators.add(queryGenerator);
            }
        }
        return queryGenerators;
    }
}