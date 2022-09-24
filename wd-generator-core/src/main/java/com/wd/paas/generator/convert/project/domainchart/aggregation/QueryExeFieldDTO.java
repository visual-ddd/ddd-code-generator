package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
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
public class QueryExeFieldDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static QueryGenerator trans2Query(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<UmlField> queryExeFieldList = new ArrayList<>();
        for (QueryExeFieldDTO exeFieldDTO : chartDTO.getQueryExeFieldDTOList()) {
            if (exeFieldDTO.getAggregationColor().equals(aggregationColor)) {
                List<UmlField> fieldList = ChartDTO.getUmlFields(chartDTO, exeFieldDTO.getId());
                queryExeFieldList.addAll(fieldList);
            }
        }

        if (!queryExeFieldList.isEmpty()) {
            QueryGenerator queryGenerator = new QueryGenerator();
            UmlClass umlClass = new UmlClass();
            umlClass.setClassName(dto.className + "Query");
            umlClass.setClassDesc(dto.description);
            umlClass.setFieldList(queryExeFieldList);
            queryGenerator.setUmlClass(umlClass);
            return queryGenerator;
        }
        return null;
    }
}