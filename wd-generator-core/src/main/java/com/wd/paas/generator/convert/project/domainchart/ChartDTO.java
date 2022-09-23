package com.wd.paas.generator.convert.project.domainchart;


import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.QueryResultDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.EntityGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdEventGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlMethodDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.ValueObjectGeneratorDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.AggregationGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 领域图谱数据转换对象
 * <p>
 * 临时存储数据,用于数据模型的转换
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class ChartDTO {

    /**
     * 字段列表
     */
    private List<UmlFieldDTO> umlFieldDTOList;

    /**
     * 方法列表
     */
    private List<UmlMethodDTO> umlMethodDTOList;

    /**
     * 聚合
     */
    private List<AggregationGeneratorDTO> aggregationDTOList;

    /**
     * 值对象
     */
    private List<ValueObjectGeneratorDTO> valueObjectDTOList;

    /**
     * 实体
     */
    private List<EntityGeneratorDTO> entityGeneratorDTOList;

    /**
     * 指令
     */
    private List<CmdGeneratorDTO> cmdDTOList;

    /**
     * 事件
     */
    private List<CmdEventGeneratorDTO> eventDTOList;

    // ================================= 视图 =================================

    /**
     * 查询结果集
     */
    private List<QueryResultDTO> queryResultDTOList;

    public ChartDTO() {
        this.umlFieldDTOList = new ArrayList<>();
        this.umlMethodDTOList = new ArrayList<>();
        this.aggregationDTOList = new ArrayList<>();
        this.valueObjectDTOList = new ArrayList<>();
        this.entityGeneratorDTOList = new ArrayList<>();
        this.cmdDTOList = new ArrayList<>();
        this.eventDTOList = new ArrayList<>();
        this.queryResultDTOList = new ArrayList<>();
    }

    public List<AggregationGenerator> trans2Aggregations() {
        List<AggregationGenerator> aggregationGeneratorList = new ArrayList<>();
        for (AggregationGeneratorDTO aggregationDTO : aggregationDTOList) {
            AggregationGenerator aggregationGenerator = new AggregationGenerator();
            aggregationGenerator.setUmlClass(
                aggregationDTO.trans2UmlClass(umlFieldDTOList, umlMethodDTOList));

            aggregationGenerator.setValueObjectList(
                ValueObjectGeneratorDTO.trans2ValueObjectList(aggregationDTO, this));

            aggregationGenerator.setEntityList(
                EntityGeneratorDTO.trans2EntityList(aggregationDTO, this));

            aggregationGenerator.setCmdList(
                CmdGeneratorDTO.trans2CmdList(aggregationDTO, this)
            );
            aggregationGeneratorList.add(aggregationGenerator);
        }
        return aggregationGeneratorList;
    }

}
