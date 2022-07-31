package com.wake.generator.application.generate.api;

import com.wake.generator.application.generate.convert.FiledConvert;
import com.wake.generator.application.generate.convert.GlobalConvert;
import com.wake.generator.application.generate.convert.MethodConvert;
import com.wake.generator.application.generate.convert.ProjectChartConvert;
import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.application.generate.entity.DomainShape;
import com.wake.generator.application.generate.entity.Field;
import com.wake.generator.application.generate.entity.Method;
import com.wake.generator.application.generate.handler.CodeGenerator;
import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.common.DomainShapeEnum;
import com.wake.generator.client.generete.dto.DomainChartGenerateDto;
import com.wake.generator.client.generete.dto.DomainDto;
import com.wake.generator.client.generete.dto.shape.AggregationDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成器服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 17:43
 * @since 1.0
 */
@Slf4j
@Service
public class CodeGenerateServiceImpl implements CodeGenerateService {

    @Override
    public boolean generateCode(DomainChartGenerateDto domainChartGenerateDto,ZipOutputStream zipOutputStream) {
        CodeGenerator codeGenerator = CodeGenerator.getInstance();
        codeGenerator.codeGenerate(transformProjectChart(domainChartGenerateDto), zipOutputStream);
        return true;
    }

    /**
     * 对领域图谱DTO进行数据转换，并添加项目元素
     * 返回用于代码生成的领域图谱DomainChart
     *
     * @param dto 需要转换的Dto
     * @return 用于代码生成的领域图谱结构
     */
    private DomainChart transformProjectChart(DomainChartGenerateDto dto) {
        DomainChart domainChart = ProjectChartConvert.MAPPER.dto2entity(dto);
        domainChart.setGlobal(GlobalConvert.MAPPER.dto2entity(dto));
        Set<DomainDto> domainDtoSet = new HashSet<>();

        domainDtoSet.addAll(dto.getActionElements());
        domainDtoSet.addAll(dto.getValueObjects());

        List<AggregationDto> aggregations = dto.getAggregations();
        // 设置元素所属聚合
        this.setParentAggregation(domainDtoSet, aggregations);
        domainDtoSet.addAll(aggregations);

        // 元素转换
        Set<DomainShape> domainShapes = new HashSet<>();
        for (DomainDto domainDto : domainDtoSet) {
            // 规则：未标颜色的元素，不进行代码生成
            if (Objects.isNull(domainDto) || StringUtils.isBlank(domainDto.getColor())) {
                log.debug("节点元素未满足生成条件：" + domainDto);
                continue;
            }
            domainShapes.add(toDomainShape(domainDto));
        }
        // 添加项目元素
        DomainShape projectShape = new DomainShape();
        projectShape.setShapeType(DomainShapeEnum.PROJECT);
        domainShapes.add(projectShape);
        domainChart.setDomainShapeList(domainShapes);
        return domainChart;
    }

    /**
     * 批量设置元素所属聚合
     *
     * @param noAggregations 待设置的非聚合图形
     */
    private void setParentAggregation(Set<DomainDto> noAggregations, List<AggregationDto> aggregationShapes) {
        Iterator<DomainDto> iterator = noAggregations.iterator();
        while (iterator.hasNext()) {
            DomainDto element = iterator.next();
            // 填充聚合
            String elementColor = element.getColor();
            aggregationShapes.stream()
                    .filter(aggregation -> aggregation.getColor().equals(elementColor))
                    .forEach(element::setParentAggregation);
            // 校验（删除没有找到所属聚合的元素）
            if (Objects.isNull(element.getParentAggregation())) {
                // 注意：遍历删除
                iterator.remove();
            }
        }
    }

    /**
     * 填充图形信息
     *
     * @param domainDto 待转化的图形元素
     * @return 转换后的抽象图形对象
     */
    private DomainShape toDomainShape(DomainDto domainDto) {
        DomainShape domainShape = new DomainShape();
        domainShape.setName(domainDto.getName());
        domainShape.setColor(domainDto.getColor());
        domainShape.setShapeType(domainDto.getType());
        domainShape.setActionName(domainDto.getActionName());
        domainShape.setDescription(domainDto.getDescription());
        List<Field> fields = FiledConvert.MAPPER.dtoList2entityList(domainDto.getFieldList());
        domainShape.setFieldList(fields);
        List<Method> methods = MethodConvert.MAPPER.dtoList2entityList(domainDto.getMethodList());
        domainShape.setMethodList(methods);
        // 所属聚合
        DomainDto parentAggregation = domainDto.getParentAggregation();
        if (Objects.isNull(parentAggregation)) {
            return domainShape;
        }
        domainShape.setParentAggregation(toDomainShape(parentAggregation));
        return domainShape;
    }

}
