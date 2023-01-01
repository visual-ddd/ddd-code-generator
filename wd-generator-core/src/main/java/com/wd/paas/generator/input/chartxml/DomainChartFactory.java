package com.wd.paas.generator.input.chartxml;


import com.wd.paas.generator.common.constant.ModifyEnum;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlConstantDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlMethodDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.*;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdEventGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.input.chartxml.util.model.ChartXmlObject;
import com.wd.paas.generator.input.chartxml.util.model.MxCell;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * chartXml工厂类
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Slf4j
public class DomainChartFactory {

    private static final Pattern COLOR_PATTERN = Pattern.compile("fillColor=(.*?);");

    private final ChartDTO domainChartDTO;

    public DomainChartFactory(ChartDTO domainChartDTO) {
        this.domainChartDTO = domainChartDTO;
    }

    public void putInstance(ChartXmlObject dddXmlObject) {
        GenerateElementTypeEnum shapeType = Optional.ofNullable(dddXmlObject)
                .map(ChartXmlObject::getShapeType).
                orElse(GenerateElementTypeEnum.OTHER);

        String xmlObjectId = Optional.ofNullable(dddXmlObject).map(ChartXmlObject::getId)
                .orElse(null);

        String style = Optional.ofNullable(dddXmlObject).map(ChartXmlObject::getMxCell)
                .map(MxCell::getStyle).orElse(null);

        switch (shapeType) {
            case AGGREGATION:
                AggregationDTO aggregationDTO = new AggregationDTO();
                aggregationDTO.setId(xmlObjectId);
                aggregationDTO.setClassName(dddXmlObject.getClassName());
                aggregationDTO.setDescription(dddXmlObject.getClassDesc());
                aggregationDTO.setAggregationColor(getColor(style));
                domainChartDTO.getAggregationDTOList().add(aggregationDTO);
                break;
            case ENTITY:
                EntityDTO entityGeneratorDTO = new EntityDTO();
                entityGeneratorDTO.setId(xmlObjectId);
                entityGeneratorDTO.setAggregationColor(getColor(style));
                entityGeneratorDTO.setClassName(dddXmlObject.getClassName());
                entityGeneratorDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getEntityGeneratorDTOList().add(entityGeneratorDTO);
                break;
            case ENUM:
                EnumDTO enumDTO = new EnumDTO();
                enumDTO.setId(xmlObjectId);
                enumDTO.setAggregationColor(getColor(style));
                enumDTO.setClassName(dddXmlObject.getClassName());
                enumDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getEnumGeneratorDTOList().add(enumDTO);
                break;
            case VALUE_OBJECT:
                ValueObjectDTO valueObjectDTO = new ValueObjectDTO();
                valueObjectDTO.setId(xmlObjectId);
                valueObjectDTO.setAggregationColor(getColor(style));
                valueObjectDTO.setClassName(dddXmlObject.getClassName());
                valueObjectDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getValueObjectDTOList().add(valueObjectDTO);
                break;
            case COMMAND:
                CmdGeneratorDTO cmdDTO = new CmdGeneratorDTO();
                cmdDTO.setId(xmlObjectId);
                cmdDTO.setAggregationColor(getColor(style));
                cmdDTO.setClassName(dddXmlObject.getClassName());
                cmdDTO.setClassPackage(dddXmlObject.getClassPackage());
                cmdDTO.setDescription(dddXmlObject.getClassDesc());
                cmdDTO.setCmdType(dddXmlObject.getCmdType());
                domainChartDTO.getCmdDTOList().add(cmdDTO);
                break;
            case EVENT:
                CmdEventGeneratorDTO eventDTO = new CmdEventGeneratorDTO();
                eventDTO.setId(xmlObjectId);
                eventDTO.setAggregationColor(getColor(style));
                eventDTO.setCmdId(dddXmlObject.getMxCell().getParent());
                domainChartDTO.getEventDTOList().add(eventDTO);
                break;
            case FIELD:
                UmlFieldDTO umlFieldDTO = new UmlFieldDTO();
                umlFieldDTO.setClassId(dddXmlObject.getMxCell().getParent());
                umlFieldDTO.setName(dddXmlObject.getFieldName());
                umlFieldDTO.setType(dddXmlObject.getFieldType());
                umlFieldDTO.setModifier(ModifyEnum.getModify(dddXmlObject.getFieldModify()));
                umlFieldDTO.setDescription(dddXmlObject.getFieldDesc());
                domainChartDTO.getUmlFieldDTOList().add(umlFieldDTO);
                break;
            case CONSTANT:
                UmlConstantDTO umlConstantDTO = new UmlConstantDTO();
                umlConstantDTO.setClassId(dddXmlObject.getMxCell().getParent());
                umlConstantDTO.setName(dddXmlObject.getConstantName());
                umlConstantDTO.setCode(dddXmlObject.getConstantCode());
                umlConstantDTO.setDesc(dddXmlObject.getConstantDesc());
                umlConstantDTO.setNote(dddXmlObject.getConstantNote());
                domainChartDTO.getUmlConstantDTOList().add(umlConstantDTO);
                break;
            case METHOD:
                UmlMethodDTO umlMethodDTO = new UmlMethodDTO();
                umlMethodDTO.setReturnType(dddXmlObject.getMethodReturn());
                umlMethodDTO.setAttributeLabel(dddXmlObject.getMethodAttr());
                umlMethodDTO.setClassId(dddXmlObject.getMxCell().getParent());
                umlMethodDTO.setName(dddXmlObject.getMethodName());
                umlMethodDTO.setModifier(ModifyEnum.getModify(dddXmlObject.getMethodModify()));
                umlMethodDTO.setDescription(dddXmlObject.getMethodDesc());
                domainChartDTO.getUmlMethodDTOList().add(umlMethodDTO);
                break;
            case QUERY:
                // query对象
                QueryDTO queryDTO = new QueryDTO();
                queryDTO.setId(xmlObjectId);
                queryDTO.setAggregationColor(getColor(style));
                queryDTO.setClassName(dddXmlObject.getClassName());
                queryDTO.setDescription(dddXmlObject.getClassDesc());
                queryDTO.setQueryResultType(dddXmlObject.getQueryResultType());
                domainChartDTO.getQueryDTOList().add(queryDTO);
                break;
            case PAGE_QUERY:
                // pageQuery对象
                PageQueryDTO pageQueryDTO = new PageQueryDTO();
                pageQueryDTO.setId(xmlObjectId);
                pageQueryDTO.setAggregationColor(getColor(style));
                pageQueryDTO.setClassName(dddXmlObject.getClassName());
                pageQueryDTO.setDescription(dddXmlObject.getClassDesc());
                pageQueryDTO.setQueryResultType(dddXmlObject.getQueryResultType());
                domainChartDTO.getPageQueryDTOList().add(pageQueryDTO);
                break;
            case QUERY_RESULT:
                QueryResultDTO queryResultDTO = new QueryResultDTO();
                queryResultDTO.setId(xmlObjectId);
                queryResultDTO.setAggregationColor(getColor(style));
                queryResultDTO.setClassName(dddXmlObject.getClassName());
                queryResultDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getQueryResultDTOList().add(queryResultDTO);
                break;
            case OTHER:
            default:
                break;
        }
    }

    /**
     * 正则取出图形填充的聚合颜色标识
     *
     * @param style xml属性
     * @return 颜色值
     */
    public static String getColor(String style) {
        String result = null;
        if (StringUtils.isBlank(style)) {
            return null;
        }
        Matcher matcher = COLOR_PATTERN.matcher(style);
        if (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

}
