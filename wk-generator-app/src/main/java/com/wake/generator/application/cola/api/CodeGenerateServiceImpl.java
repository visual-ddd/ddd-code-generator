package com.wake.generator.application.cola.api;

import com.wake.generator.application.cola.convert.FiledConvert;
import com.wake.generator.application.cola.convert.GlobalConvert;
import com.wake.generator.application.cola.convert.MethodConvert;
import com.wake.generator.application.cola.convert.ProjectChartConvert;
import com.wake.generator.application.cola.entity.DomainShape;
import com.wake.generator.application.cola.entity.Field;
import com.wake.generator.application.cola.entity.Method;
import com.wake.generator.application.cola.entity.ProjectChart;
import com.wake.generator.application.cola.handler.CodeGenerator;
import com.wake.generator.client.cola.api.CodeGenerateService;
import com.wake.generator.client.cola.dto.ProjectChartDto;
import com.wake.generator.client.cola.dto.element.*;
import com.wake.generator.client.common.DomainShapeEnum;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 代码生成器服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 17:43
 * @since 1.0
 */
@Service
public class CodeGenerateServiceImpl implements CodeGenerateService {

    @Override
    public boolean generateCode(ProjectChartDto projectChartDto) {
        // dto 转 entity
        ProjectChart projectChart = transformProjectChart(projectChartDto);
        CodeGenerator codeGenerator = CodeGenerator.getInstance();
        // 执行代码生成
        codeGenerator.codeGenerate(projectChart);
        // 保存项目列表
        codeGenerator.storeFileNames();
        return true;
    }

    /**
     * DTO 转 实体
     *
     * @param dto 需要转换的Dto
     * @return Uml图谱实体
     */
    public ProjectChart transformProjectChart(ProjectChartDto dto) {

        ProjectChart result = ProjectChartConvert.MAPPER.dto2entity(dto);
        result.setGlobal(GlobalConvert.MAPPER.dto2entity(dto.getGlobal()));
        Set<DomainShape> domainShapes = new HashSet<>();
        // 聚合
        for (Domain aggregation : dto.getAggregations()) {
            domainShapes.add(toDomainShape(aggregation, DomainShapeEnum.AGGREGATION));
        }
        // 值对象
        for (Domain valueObject : dto.getValueObjects()) {
            DomainShape domainShape = toDomainShape(valueObject, DomainShapeEnum.VALUE_OBJECT);
            domainShapes.add(domainShape);
        }
        // 故事节点
        for (StoryNode storyNode : dto.getStoryNodes()) {
            for (Domain cmd : storyNode.getCmdList()) {
                DomainShape domainShape = toDomainShape(cmd, DomainShapeEnum.COMMAND);
                domainShape.setActionName(storyNode.getPackageName());
                domainShapes.add(domainShape);
            }
            for (Domain event : storyNode.getEvents()) {
                DomainShape domainShape = toDomainShape(event, DomainShapeEnum.EVENT);
                domainShape.setActionName(storyNode.getPackageName());
                domainShapes.add(domainShape);
            }
        }
        this.setParentAggregation(domainShapes);
        result.setDomainShapeList(domainShapes);
        return result;
    }

    /**
     * 设置所属聚合
     *
     * @param domainShapes 需要设置的图形
     */
    private void setParentAggregation(Set<DomainShape> domainShapes) {
        // 缓存
        HashSet<DomainShape> aggregationShapes = domainShapes.stream()
                .filter(domainShape -> domainShape.getShapeType() == DomainShapeEnum.AGGREGATION)
                .collect(Collectors.toCollection(HashSet::new));
        for (DomainShape noAggregation : domainShapes) {
            if (noAggregation.getShapeType() == DomainShapeEnum.AGGREGATION) {
                continue;
            }
            String aggregationColor = noAggregation.getColor();
            aggregationShapes.stream().filter(aggregation -> aggregation.getColor().equals(aggregationColor))
                    .forEach(noAggregation::setParentAggregation);
        }
    }

    /**
     * 填充图形信息
     *
     * @param domain 待转化的图形元素
     * @param type   转换的类型
     * @return 转换后的抽象图形对象
     */
    private DomainShape toDomainShape(Domain domain, DomainShapeEnum type) {
        DomainShape domainShape = new DomainShape();
        domainShape.setName(domain.getName());
        domainShape.setColor(domain.getColor());
        domainShape.setDescription(domain.getDescription());
        domainShape.setShapeType(type);
        List<Field> fields = FiledConvert.MAPPER.dtoList2entityList(domain.getFieldList());
        domainShape.setFieldList(fields);
        List<Method> methods = MethodConvert.MAPPER.dtoList2entityList(domain.getMethodList());
        domainShape.setMethodList(methods);
        return domainShape;
    }

//    /**
//     * dto 转 实体
//     *
//     * @param dto
//     * @return
//     */
//    private DomainShape transformDomainElement(DomainShapeDto dto) {
//        DomainShape domainShape = DomainShapeConvert.MAPPER.dto2entity(dto);
//        domainShape.setFieldList(FiledConvert.MAPPER.dtoList2entityList(dto.getFieldList()));
//        domainShape.setMethodList(MethodConvert.MAPPER.dtoList2entityList(dto.getMethodList()));
//        return domainShape;
//    }

}
