package com.wd.paas.generator.convert.project.domainchart;


import com.wd.paas.generator.convert.project.domainchart.aggregation.AggregationDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.PageQueryExeFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.QueryExeFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.QueryExeDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.QueryResultDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.EntityDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.cmd.CmdEventGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlFieldDTO;
import com.wd.paas.generator.convert.project.domainchart.abstractuml.UmlMethodDTO;
import com.wd.paas.generator.convert.project.domainchart.aggregation.ValueObjectDTO;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.convert.project.domainchart.aggregation.PageQueryExeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

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
    private List<AggregationDTO> aggregationDTOList;

    /**
     * 值对象
     */
    private List<ValueObjectDTO> valueObjectDTOList;

    /**
     * 实体
     */
    private List<EntityDTO> entityGeneratorDTOList;

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
     * 查询器
     */
    private List<QueryExeDTO> queryExeDTOList;
    /**
     * 分页查询器
     */
    private List<PageQueryExeDTO> pageQueryExeDTOList;
    /**
     * 查询结果集
     */
    private List<QueryResultDTO> queryResultDTOList;
    /**
     * 查询对象
     */
    private List<QueryExeFieldDTO> queryExeFieldDTOList;
    /**
     * 分页查询对象
     */
    private List<PageQueryExeFieldDTO> pageQueryExeFieldDTOList;

    public ChartDTO() {
        this.umlFieldDTOList = new ArrayList<>();
        this.umlMethodDTOList = new ArrayList<>();
        this.aggregationDTOList = new ArrayList<>();
        this.valueObjectDTOList = new ArrayList<>();
        this.entityGeneratorDTOList = new ArrayList<>();
        this.cmdDTOList = new ArrayList<>();
        this.eventDTOList = new ArrayList<>();
        this.queryExeDTOList = new ArrayList<>();
        this.pageQueryExeDTOList = new ArrayList<>();
        this.pageQueryExeFieldDTOList = new ArrayList<>();
        this.queryResultDTOList = new ArrayList<>();
        this.queryExeFieldDTOList = new ArrayList<>();
    }

    public static List<UmlField> getUmlFields(ChartDTO chartDTO, String classId) {
        List<UmlField> fieldList = new ArrayList<>();
        for (UmlFieldDTO umlFieldDTO : chartDTO.getUmlFieldDTOList()) {
            if (Objects.equals(classId, umlFieldDTO.getClassId())) {
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
