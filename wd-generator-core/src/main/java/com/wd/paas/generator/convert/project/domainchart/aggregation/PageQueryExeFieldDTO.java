package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.PageQueryGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.QueryGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 分页查询对象
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class PageQueryExeFieldDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static PageQueryGenerator trans2PageQuery(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<UmlField> queryExeFieldList = new ArrayList<>();
        for (PageQueryExeFieldDTO queryExeFieldDTO : chartDTO.getPageQueryExeFieldDTOList()) {
            if (queryExeFieldDTO.getAggregationColor().equals(aggregationColor)) {
                List<UmlField> fieldList = ChartDTO.getUmlFields(chartDTO, queryExeFieldDTO.getId());
                queryExeFieldList.addAll(fieldList);
            }
        }

        if (!queryExeFieldList.isEmpty()) {
            PageQueryGenerator pageQueryGenerator = new PageQueryGenerator();
            UmlClass umlClass = new UmlClass();
            umlClass.setClassName(dto.className + "PageQuery");
            umlClass.setClassDesc(dto.description);
            umlClass.setFieldList(queryExeFieldList);
            pageQueryGenerator.setUmlClass(umlClass);
            return pageQueryGenerator;
        }
        return null;
    }
}