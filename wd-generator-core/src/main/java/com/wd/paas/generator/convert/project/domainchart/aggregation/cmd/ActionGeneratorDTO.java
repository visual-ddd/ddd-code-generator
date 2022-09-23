package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import lombok.Data;

/**
 * 动作xml
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Deprecated
@Data
public class ActionGeneratorDTO {

    /**
     * id
     */
    private String id;

    /**
     * 动作
     */
    private String actionPackage;

//    public static List<ActionGenerator> trans2Actions(AggregationGeneratorDTO aggregationDTO,
//        ChartDTO chartDTO) {
//
//        List<ActionGenerator> actionGenerators = new ArrayList<>();
//        for (ActionGeneratorDTO actionGeneratorDTO : chartDTO.getActionDTOList()) {
//            String actionId = actionGeneratorDTO.getId();
//            String actionPackage = actionGeneratorDTO.getActionPackage();
//
//            // 动作
//            ActionGenerator actionGenerator = new ActionGenerator();
//            actionGenerator.setActionName(actionPackage);
//            actionGenerator.setCmdList(
//                Optional.of(CmdGeneratorDTO.trans2CmdList(aggregationDTO, chartDTO))
//                    .orElse(Collections.emptyList()));
//            actionGenerator.setEventList(
//                Optional.of(EventGeneratorDTO.trans2EventList(chartDTO, aggregationDTO, actionId))
//                    .orElse(Collections.emptyList()));
//            actionGenerators.add(actionGenerator);
//        }
//        return actionGenerators;
//    }

}
