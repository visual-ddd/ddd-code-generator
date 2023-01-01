package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.EnumGenerator;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举生成器转换类
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class EnumDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<EnumGenerator> trans2EnumList(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<EnumGenerator> enumGenerators = new ArrayList<>();
        for (EnumDTO enumDTO : chartDTO.getEnumGeneratorDTOList()) {
            if (enumDTO.getAggregationColor().equals(aggregationColor)) {
                EnumGenerator enumGenerator = new EnumGenerator();
                enumGenerator.setUmlClass(
                    enumDTO.trans2EnumUmlClass(chartDTO.getUmlConstantDTOList()));
                enumGenerators.add(enumGenerator);
            }
        }
        return enumGenerators;
    }
}
