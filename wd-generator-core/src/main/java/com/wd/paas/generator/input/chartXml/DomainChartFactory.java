package com.wd.paas.generator.input.chartXml;


import com.wd.paas.generator.convert.project.domainchart.aggregation.QueryResultDTO;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.common.constant.ModifyEnum;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.EntityGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdEventGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlMethodDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.ValueObjectGeneratorDTO;
import com.wd.paas.generator.input.chartXml.util.model.ChartXmlObject;
import com.wd.paas.generator.input.chartXml.util.model.MxCell;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

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

    public void putInstance( ChartXmlObject dddXmlObject) {
        GenerateElementTypeEnum shapeType = Optional.ofNullable(dddXmlObject)
            .map(ChartXmlObject::getShapeType).
            orElse(GenerateElementTypeEnum.OTHER);

        String xmlObjectId = Optional.ofNullable(dddXmlObject).map(ChartXmlObject::getId)
            .orElse(null);

        String style = Optional.ofNullable(dddXmlObject).map(ChartXmlObject::getMxCell)
            .map(MxCell::getStyle).orElse(null);

        switch (shapeType) {
            case AGGREGATION:
                AggregationGeneratorDTO aggregationDTO = new AggregationGeneratorDTO();
                aggregationDTO.setId(xmlObjectId);
                aggregationDTO.setClassName(dddXmlObject.getClassName());
                aggregationDTO.setDescription(dddXmlObject.getClassDesc());
                aggregationDTO.setAggregationColor(getColor(style));
                domainChartDTO.getAggregationDTOList().add(aggregationDTO);
                break;
            case ENTITY:
                EntityGeneratorDTO entityGeneratorDTO = new EntityGeneratorDTO();
                entityGeneratorDTO.setId(xmlObjectId);
                entityGeneratorDTO.setAggregationColor(getColor(style));
                entityGeneratorDTO.setClassName(dddXmlObject.getClassName());
                entityGeneratorDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getEntityGeneratorDTOList().add(entityGeneratorDTO);
                break;
            case VALUE_OBJECT:
                ValueObjectGeneratorDTO valueObjectDTO = new ValueObjectGeneratorDTO();
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
                cmdDTO.setClassPackage(dddXmlObject.getClassPackage());
                cmdDTO.setDescription(dddXmlObject.getClassDesc());
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
            case  QUERY_EXE:
                break;
            case PAGE_QUERY_EXE:

                break;
            case QUERY_RESULT:
                QueryResultDTO queryResultDTO = new QueryResultDTO();
                queryResultDTO.setId(xmlObjectId);
                queryResultDTO.setAggregationColor(getColor(style));
                queryResultDTO.setClassName(dddXmlObject.getClassName());
                queryResultDTO.setDescription(dddXmlObject.getClassDesc());
                domainChartDTO.getQueryResultDTOList().add(queryResultDTO);
                break;
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
