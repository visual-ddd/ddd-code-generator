package com.wake.generator.adapter.dto;

import com.wake.generator.application.constant.DomainElementType;
import com.wake.generator.application.entity.DomainElement;
import com.wake.generator.application.entity.Global;
import com.wake.generator.application.entity.ProjectChart;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Data;

/**
 * <p>Title: DomainsChartDto</p>
 * <p>Description: Uml图谱DTO</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/3 10:12
 */
@Data
public class ProjectChartDto {

    private static final long serialVersionUID = 3411792002890207219L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 全局信息
     */
    private Global global;

    /**
     * 图形对象集合
     */
    private Set<DomainShapeDto> domainShapeDtoSet = new HashSet<>();

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

    /**
     * DTO 转 Uml图谱实体
     *
     * @return Uml图谱实体
     */
    public ProjectChart transformToProjectChart() {
        ProjectChart result = new ProjectChart();
        result.setId(id);
        result.setName(name);
        result.setGlobal(global);
        result.setUmlShapeInfo(umlShapeInfo);
        result.setLineInfo(lineInfo);
        List<DomainElement> domainElements = result.getDomainElementList();
        for (DomainShapeDto parentDto : domainShapeDtoSet) {
            if (parentDto.getShapeType().equals(DomainElementType.AGGREGATION)) {
                DomainElement aggregation = transDomainElement(parentDto);
                domainElements.add(aggregation);
                for (DomainShapeDto sonDto : domainShapeDtoSet) {
                    if (DomainElementType.RULE.equals(sonDto.getShapeType())) {
                        continue;
                    }
                    // 根据颜色区分聚合
                    if (sonDto.getColor().equals(parentDto.getColor())) {
                        DomainElement sonElement = transDomainElement(sonDto);
                        sonElement.setParentAggregation(aggregation);
                        domainElements.add(sonElement);
                    }
                }
            }
        }
        return result;
    }

    /**
     * dto 转 实体
     *
     * @param sonDto
     * @return
     */
    private DomainElement transDomainElement(DomainShapeDto sonDto) {
        DomainElement domainElement = new DomainElement();
        domainElement.setName(sonDto.getName());
        domainElement.setFieldList(sonDto.getFieldList());
        domainElement.setMethodList(sonDto.getMethodList());
        domainElement.setDescription(sonDto.getDescription());
        domainElement.setElementType(sonDto.getShapeType());
        return domainElement;
    }


}
