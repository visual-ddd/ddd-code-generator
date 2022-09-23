package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationGeneratorDTO;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdEventGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 指令xml
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmdGeneratorDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    public static List<CmdGenerator> trans2CmdList(AggregationGeneratorDTO aggregationDTO, ChartDTO chartDTO) {
        String color = aggregationDTO.getAggregationColor();

        // 指令
        List<CmdGenerator> cmdGenerators = new ArrayList<>();
        for (CmdGeneratorDTO cmdGeneratorDTO : chartDTO.getCmdDTOList()) {
            if (Objects.equals(cmdGeneratorDTO.getAggregationColor(), color)) {
                String classPackage = cmdGeneratorDTO.getClassPackage();
                String upperName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, classPackage);
                String className = upperName + ModelUrlConstant.COMMAND_CLASS_SUFFIX;

                cmdGeneratorDTO.setClassPackage(classPackage);
                cmdGeneratorDTO.setClassName(className);

                CmdGenerator cmdGenerator = new CmdGenerator();
                cmdGenerator.setUmlClass(
                        cmdGeneratorDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                                chartDTO.getUmlMethodDTOList()));
                cmdGenerators.add(cmdGenerator);

                // 事件
                cmdGenerator.setCmdEventGenerator(
                        CmdEventGeneratorDTO.trans2Event(chartDTO, aggregationDTO, cmdGeneratorDTO)
                );
            }
        }
        return cmdGenerators;
    }
}

