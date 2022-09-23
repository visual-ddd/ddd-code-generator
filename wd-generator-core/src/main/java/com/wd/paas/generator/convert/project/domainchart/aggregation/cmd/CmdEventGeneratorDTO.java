package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationGeneratorDTO;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.CmdEventGenerator;
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

    public static CmdEventGenerator trans2Event(ChartDTO chartDTO, AggregationGeneratorDTO aggregationDTO,
                                                CmdGeneratorDTO cmdGeneratorDTO) {
        String color = aggregationDTO.getAggregationColor();

        for (CmdEventGeneratorDTO cmdEventGeneratorDTO : chartDTO.getEventDTOList()) {
            if (!Objects.equals(cmdEventGeneratorDTO.getAggregationColor(), color)) {
                continue;
            }

            String cmdId = cmdEventGeneratorDTO.getCmdId();
            if (Objects.equals(cmdId, cmdGeneratorDTO.getId())) {

                String classPackage = cmdGeneratorDTO.getClassPackage();
                String upperName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, classPackage);
                String className = upperName + ModelUrlConstant.EVENT_CLASS_SUFFIX;

                cmdEventGeneratorDTO.setClassPackage(classPackage);
                cmdEventGeneratorDTO.setClassName(className);
                cmdEventGeneratorDTO.setDescription(cmdGeneratorDTO.getDescription());

                CmdEventGenerator cmdEventGenerator = new CmdEventGenerator();
                cmdEventGenerator.setUmlClass(
                        cmdEventGeneratorDTO.trans2UmlClass(chartDTO.getUmlFieldDTOList(),
                                chartDTO.getUmlMethodDTOList()));

                List<UmlField> cmdFieldList = getUmlFields(chartDTO, cmdId);
                cmdEventGenerator.getUmlClass().getFieldList().addAll(cmdFieldList);
                return cmdEventGenerator;
            }
        }
        return null;
    }

    private static List<UmlField> getUmlFields(ChartDTO chartDTO, String cmdId) {
        List<UmlField> fieldList = new ArrayList<>();
        for (UmlFieldDTO umlFieldDTO : chartDTO.getUmlFieldDTOList()) {
            if (Objects.equals(cmdId, umlFieldDTO.getClassId())) {
                UmlField umlField = new UmlField();
                umlField.setName(umlFieldDTO.getName());
                umlField.setType(umlFieldDTO.getType());
                umlField.setModifier(umlFieldDTO.getModifier());
                umlField.setDescription(umlFieldDTO.getDescription());
                fieldList.add(umlField);
            }
        }
        return fieldList;
    }
}