package com.wd.paas.generator.convert.project.domainchart.aggregation;

import java.util.List;

import com.wd.paas.generator.convert.project.domainchart.abstractuml.AbstractUmlDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import lombok.Data;

/**
 * 聚合xml
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class AggregationGeneratorDTO extends AbstractUmlDTO {

    /**
     * 聚合颜色
     */
    private String aggregationColor;

    /**
     * 值对象列表
     */
    private List<ValueObjectGeneratorDTO> valueObjectList;
//
//    /**
//     * 动作列表
//     */
//    private List<ActionGeneratorDTO> actionList;

    /**
     * 指令列表
     */
    private List<CmdGeneratorDTO> cmdDTOList;

}
