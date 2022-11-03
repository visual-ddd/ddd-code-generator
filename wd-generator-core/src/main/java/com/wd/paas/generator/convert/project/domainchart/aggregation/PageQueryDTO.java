package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.PageQueryGenerator;
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
public class PageQueryDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;
    /**
     * 查询结果集类型
     */
    private String queryResultType;

    public static List<PageQueryGenerator> trans2PageQuery(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<PageQueryGenerator> pageQueryGenerators = new ArrayList<>();
        for (PageQueryDTO pageQueryDTO : chartDTO.getPageQueryDTOList()) {
            if (pageQueryDTO.getAggregationColor().equals(aggregationColor)) {

                PageQueryGenerator pageQueryGenerator = new PageQueryGenerator();
                pageQueryGenerator.setUmlClass(
                    pageQueryDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));

                pageQueryGenerator.setQueryResultType(pageQueryDTO.getQueryResultType());
                pageQueryGenerators.add(pageQueryGenerator);
            }
        }
        return pageQueryGenerators;
    }
}