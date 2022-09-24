package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.ValueObjectGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 值对象
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class ValueObjectDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<ValueObjectGenerator> trans2ValueObjectList(AggregationDTO dto,
        ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();
        List<ValueObjectGenerator> valueObjectGenerators = new ArrayList<>();
        for (ValueObjectDTO valueObjectDTO : chartDTO.getValueObjectDTOList()) {
            if (valueObjectDTO.getAggregationColor().equals(aggregationColor)) {
                ValueObjectGenerator valueObjectGenerator = new ValueObjectGenerator();
                valueObjectGenerator.setUmlClass(
                    valueObjectDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));
                valueObjectGenerators.add(valueObjectGenerator);
            }
        }
        return valueObjectGenerators;
    }
}
