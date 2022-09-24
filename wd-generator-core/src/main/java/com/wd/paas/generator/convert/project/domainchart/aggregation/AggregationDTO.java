package com.wd.paas.generator.convert.project.domainchart.aggregation;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.AggregationGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 聚合xml
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class AggregationDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<AggregationGenerator> trans2Aggregations(ChartDTO chartDTO) {
        List<AggregationGenerator> aggregationGeneratorList = new ArrayList<>();

        for (AggregationDTO aggregationDTO : chartDTO.getAggregationDTOList()) {
            AggregationGenerator aggregationGenerator = new AggregationGenerator();

            aggregationGenerator.setUmlClass(
                aggregationDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                    chartDTO.getUmlMethodDTOList()));

            aggregationGenerator.setValueObjectList(
                ValueObjectDTO.trans2ValueObjectList(aggregationDTO, chartDTO));

            aggregationGenerator.setEntityList(
                EntityDTO.trans2EntityList(aggregationDTO, chartDTO));

            aggregationGenerator.setCmdList(
                CmdGeneratorDTO.trans2CmdList(aggregationDTO, chartDTO));

            // ================ 视图 =================
            aggregationGenerator.setQueryExeList(
                QueryExeDTO.trans2QueryExeList(aggregationDTO, chartDTO));

            aggregationGenerator.setPageQueryExeList(
                PageQueryExeDTO.trans2PageQueryExeList(aggregationDTO, chartDTO));

            aggregationGenerator.setQueryResultList(
                QueryResultDTO.trans2QueryResultList(aggregationDTO, chartDTO));

            aggregationGenerator.setQueryGenerator(
                QueryExeFieldDTO.trans2Query(aggregationDTO,chartDTO));

            aggregationGenerator.setPageQueryGenerator(
                PageQueryExeFieldDTO.trans2PageQuery(aggregationDTO,chartDTO));

            aggregationGeneratorList.add(aggregationGenerator);
        }
        return aggregationGeneratorList;
    }
}
