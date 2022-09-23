package com.wd.paas.generator.convert.project.domainchart.aggregation;


import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.ValueObjectGenerator;
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

    public static List<ValueObjectGenerator> trans2ValueObjectList(AggregationGeneratorDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();
        List<ValueObjectGenerator> valueObjectGenerators = new ArrayList<>();
        for (ValueObjectGeneratorDTO valueObjectGeneratorDTO : chartDTO.getValueObjectDTOList()) {
            if (valueObjectGeneratorDTO.getAggregationColor().equals(aggregationColor)) {
                ValueObjectGenerator valueObjectGenerator = new ValueObjectGenerator();
                valueObjectGenerator.setUmlClass(
                        valueObjectGeneratorDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                                chartDTO.getUmlMethodDTOList()));
                valueObjectGenerators.add(valueObjectGenerator);
            }
        }
        return valueObjectGenerators;
    }
}