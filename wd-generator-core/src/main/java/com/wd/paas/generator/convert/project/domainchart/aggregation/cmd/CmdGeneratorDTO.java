package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationDTO;
import com.wd.paas.generator.generate.constant.CmdTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdGenerator;
import java.util.Optional;
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

    /**
     * cmd操作类型
     */
    private CmdTypeEnum cmdType;

    public static List<CmdGenerator> trans2CmdList(AggregationDTO aggregationDTO,
        ChartDTO chartDTO) {

        String color = aggregationDTO.getAggregationColor();

        // 指令
        List<CmdGenerator> cmdGenerators = new ArrayList<>();
        for (CmdGeneratorDTO cmdGeneratorDTO : chartDTO.getCmdDTOList()) {
            if (Objects.equals(cmdGeneratorDTO.getAggregationColor(), color)) {

                String classPackage = FormatUtil.formatPackage(cmdGeneratorDTO.getClassPackage());
                // 默认不填，使用包名拼接
                String inputClassName = Optional.ofNullable(cmdGeneratorDTO.getClassName())
                    .orElse(classPackage);
                String className = FormatUtil.formatClassName(inputClassName,
                    ModelUrlConstant.COMMAND_CLASS_SUFFIX);

                cmdGeneratorDTO.setClassPackage(classPackage);
                cmdGeneratorDTO.setClassName(className);

                CmdGenerator cmdGenerator = new CmdGenerator();
                cmdGenerator.setUmlClass(
                    cmdGeneratorDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));
                cmdGenerators.add(cmdGenerator);

                // 指令事件
                cmdGenerator.setCmdEventGenerator(
                    CmdEventGeneratorDTO.trans2Event(chartDTO, aggregationDTO, cmdGeneratorDTO)
                );
                // 指令类型
                cmdGenerator.setCmdType(
                    Optional.ofNullable(cmdGeneratorDTO.getCmdType()).orElse(CmdTypeEnum.DEFAULT));
            }
        }
        return cmdGenerators;
    }

}

