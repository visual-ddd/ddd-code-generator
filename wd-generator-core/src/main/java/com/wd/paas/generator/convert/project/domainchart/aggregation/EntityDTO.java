package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.EntityGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 实体生成器转换类
 *
 * @author ZhuXueLiang
 * @date 2022/9/20 15:32
 * @version 1.0
 */
@Data
public class EntityDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<EntityGenerator> trans2EntityList(AggregationDTO dto, ChartDTO chartDTO) {
        String aggregationColor = dto.getAggregationColor();

        List<EntityGenerator> entityGenerators = new ArrayList<>();
        for (EntityDTO entityDTO : chartDTO.getEntityGeneratorDTOList()) {
            if (entityDTO.getAggregationColor().equals(aggregationColor)) {
                EntityGenerator entityGenerator = new EntityGenerator();
                entityGenerator.setUmlClass(
                    entityDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));
                entityGenerators.add(entityGenerator);
            }
        }
        return entityGenerators;
    }
}
