package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationDTO;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdEventGenerator;
import java.util.Optional;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 事件xml
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmdEventGeneratorDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    /**
     * 对应指令id
     */
    private String cmdId;

    public static CmdEventGenerator trans2Event(ChartDTO chartDTO, AggregationDTO aggregationDTO,
        CmdGeneratorDTO cmdGeneratorDTO) {
        String color = aggregationDTO.getAggregationColor();

        for (CmdEventGeneratorDTO cmdEventDTO : chartDTO.getEventDTOList()) {
            if (!Objects.equals(cmdEventDTO.getAggregationColor(), color)) {
                continue;
            }

            String cmdId = cmdEventDTO.getCmdId();
            if (Objects.equals(cmdId, cmdGeneratorDTO.getId())) {

                String classPackage = FormatUtil.formatPackage(cmdGeneratorDTO.getClassPackage());
                String inputClassName = Optional.ofNullable(cmdGeneratorDTO.getClassName())
                    .orElse(classPackage);
                String className = FormatUtil.formatClassName(inputClassName,
                    ModelUrlConstant.EVENT_CLASS_SUFFIX);

                cmdEventDTO.setClassPackage(classPackage);
                cmdEventDTO.setClassName(className);
                cmdEventDTO.setDescription(cmdGeneratorDTO.getDescription());

                CmdEventGenerator cmdEventGenerator = new CmdEventGenerator();
                cmdEventGenerator.setUmlClass(
                    cmdEventDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                        chartDTO.getUmlMethodDTOList()));

                List<UmlField> cmdFieldList = ChartDTO.getUmlFields(chartDTO, cmdId);
                cmdEventGenerator.getUmlClass().getFieldList().addAll(cmdFieldList);
                return cmdEventGenerator;
            }
        }
        return null;
    }
}