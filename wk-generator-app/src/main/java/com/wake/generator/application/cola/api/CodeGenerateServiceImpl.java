package com.wake.generator.application.cola.api;

import com.wake.generator.application.cola.convert.DomainShapeConvert;
import com.wake.generator.application.cola.convert.FiledConvert;
import com.wake.generator.application.cola.convert.GlobalConvert;
import com.wake.generator.application.cola.convert.MethodConvert;
import com.wake.generator.application.cola.convert.ProjectChartConvert;
import com.wake.generator.application.cola.entity.DomainShape;
import com.wake.generator.application.cola.entity.ProjectChart;
import com.wake.generator.application.cola.handler.CodeGenerator;
import com.wake.generator.client.cola.api.CodeGenerateService;
import com.wake.generator.client.cola.dto.DomainShapeDto;
import com.wake.generator.client.cola.dto.ProjectChartDto;
import com.wake.generator.client.common.DomainShapeEnum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 代码生成器服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 17:43
 * @since 1.0
 */
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
     * DTO 转 Uml图谱实体
     *
     * @param dto 需要转换的Dto
     * @return Uml图谱实体
     */
    public ProjectChart transformProjectChart(ProjectChartDto dto) {
        ProjectChart result = ProjectChartConvert.MAPPER.dto2entity(dto);
        result.setGlobal(GlobalConvert.MAPPER.dto2entity(dto.getGlobal()));
        Set<DomainShape> domainShapes = new HashSet<>();
        for (DomainShapeDto shapeDto : dto.getDomainShapeDtoSet()) {
            DomainShape shape = transformDomainElement(shapeDto);
            domainShapes.add(shape);
        }
        result.setDomainShapeList(domainShapes);
        return result;
    }

    /**
     * dto 转 实体
     *
     * @param dto
     * @return
     */
    private DomainShape transformDomainElement(DomainShapeDto dto) {
        DomainShape domainShape = DomainShapeConvert.MAPPER.dto2entity(dto);
        domainShape.setFieldList(FiledConvert.MAPPER.dtoList2entityList(dto.getFieldList()));
        domainShape.setMethodList(MethodConvert.MAPPER.dtoList2entityList(dto.getMethodList()));
        return domainShape;
    }

}
