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
import com.wake.generator.client.cola.dto.test.*;
import com.wake.generator.client.common.DomainShapeEnum;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        for (Aggregation aggregation : dto.getAggregations()) {
            domainShapes.add(toDomainShape(aggregation, DomainShapeEnum.AGGREGATION));
        }
        for (ValueObject valueObject : dto.getValueObjects()) {
            DomainShape domainShape = toDomainShape(valueObject, DomainShapeEnum.VALUE_OBJECT);
            Aggregation parentAggregation = valueObject.getParentAggregation();
            domainShape.setParentAggregation(toDomainShape(parentAggregation, DomainShapeEnum.AGGREGATION));
            domainShapes.add(domainShape);
        }
        for (StoryNode storyNode : dto.getStoryNodes()) {
            for (Cmd cmd : storyNode.getCmdList()) {
                DomainShape domainShape = toDomainShape(cmd, DomainShapeEnum.COMMAND);
                Aggregation aggregation = cmd.getParentAggregation();
                domainShape.setParentAggregation(toDomainShape(aggregation, DomainShapeEnum.AGGREGATION));
                domainShape.setActionName(storyNode.getPackageName());
                domainShapes.add(domainShape);
            }
            for (Event event : storyNode.getEvents()) {
                DomainShape domainShape = toDomainShape(event, DomainShapeEnum.EVENT);
                Aggregation aggregation = event.getParentAggregation();
                domainShape.setParentAggregation(toDomainShape(aggregation, DomainShapeEnum.AGGREGATION));
                domainShape.setActionName(storyNode.getPackageName());
                domainShapes.add(domainShape);
            }
        }

        result.setDomainShapeList(domainShapes);
        return result;
    }

    private DomainShape toDomainShape(Domain domain, DomainShapeEnum type) {
        DomainShape domainShape = new DomainShape();
        domainShape.setName(domain.getName());
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
