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
import com.wake.generator.client.generete.dto.ActionDto;
import com.wake.generator.client.generete.dto.DomainChartGenerateDto;
import com.wake.generator.client.generete.dto.DomainDto;
import com.wake.generator.client.generete.dto.StoryNodeDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public boolean generateCode(DomainChartGenerateDto domainChartGenerateDto) {
        // dto 转 entity
        DomainChart domainChart = transformProjectChart(domainChartGenerateDto);
        CodeGenerator codeGenerator = CodeGenerator.getInstance();
        // 执行代码生成
        codeGenerator.codeGenerate(domainChart);
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
    public DomainChart transformProjectChart(DomainChartGenerateDto dto) {
        DomainChart domainChart = ProjectChartConvert.MAPPER.dto2entity(dto);
        domainChart.setGlobal(GlobalConvert.MAPPER.dto2entity(dto));
        Set<DomainShape> domainShapes = new HashSet<>();
        // 缓存聚合对象
        HashSet<DomainShape> aggregationShapes = new HashSet<>(7);
        // 聚合
        for (DomainDto aggregation : dto.getAggregations()) {
            if (StringUtils.isBlank(aggregation.getColor())) {
                continue;
            }
            DomainShape domainShape = toDomainShape(aggregation, DomainShapeEnum.AGGREGATION);
            domainShapes.add(domainShape);
            aggregationShapes.add(domainShape);
        }
        // 值对象
        for (DomainDto valueObject : dto.getValueObjects()) {
            if (StringUtils.isBlank(valueObject.getColor())) {
                continue;
            }
            domainShapes.add(toDomainShape(valueObject, DomainShapeEnum.VALUE_OBJECT));
        }
        // 故事节点
        for (StoryNodeDto storyNodeDto : dto.getStoryNodes()) {
            for (ActionDto action : storyNodeDto.getActions()) {
                DomainDto cmd = action.getCmd();
                if (Objects.isNull(cmd) || StringUtils.isBlank(cmd.getColor())) {
                    log.debug("节点元素未满足生成条件：" + cmd);
                    continue;
                }
                DomainShape domainShape = toDomainShape(cmd, DomainShapeEnum.COMMAND);
                domainShape.setActionName(action.getPackageName());
                domainShapes.add(domainShape);

                DomainDto event = action.getEvent();
                if (Objects.isNull(event) || StringUtils.isBlank(event.getColor())) {
                    log.debug("节点元素未满足生成条件：" + event);
                    continue;
                }
                DomainShape eventShape = toDomainShape(event, DomainShapeEnum.EVENT);
                eventShape.setActionName(action.getPackageName());
                domainShapes.add(eventShape);
            }
        }
        this.setParentAggregation(domainShapes, aggregationShapes);
        // 添加项目元素
        DomainShape projectShape = new DomainShape();
        projectShape.setShapeType(DomainShapeEnum.PROJECT);
        domainShapes.add(projectShape);
        domainChart.setDomainShapeList(domainShapes);
        return domainChart;
    }

    /**
     * 设置所属聚合
     *
     * @param domainShapes 需要设置的图形
     */
    private void setParentAggregation(Set<DomainShape> domainShapes, Set<DomainShape> aggregationShapes) {
        Iterator<DomainShape> iterator = domainShapes.iterator();
        while (iterator.hasNext()) {
            DomainShape element = iterator.next();
            if (element.getShapeType() == DomainShapeEnum.AGGREGATION) {
                continue;
            }
            // 填充聚合
            String elementColor = element.getColor();
            aggregationShapes.stream()
                    .filter(aggregation -> aggregation.getColor().equals(elementColor))
                    .forEach(element::setParentAggregation);
            // 校验
            if (Objects.isNull(element.getParentAggregation())) {
                // 注意：遍历删除
                iterator.remove();
                log.warn("元素聚合颜色非法,已取消生成：" + element);
            }
        }
    }

    /**
     * 填充图形信息
     *
     * @param domainDto 待转化的图形元素
     * @param type      转换的类型
     * @return 转换后的抽象图形对象
     */
    private DomainShape toDomainShape(DomainDto domainDto, DomainShapeEnum type) {
        DomainShape domainShape = new DomainShape();
        domainShape.setName(domainDto.getName());
        domainShape.setColor(domainDto.getColor());
        domainShape.setDescription(domainDto.getDescription());
        domainShape.setShapeType(type);
        List<Field> fields = FiledConvert.MAPPER.dtoList2entityList(domainDto.getFieldList());
        domainShape.setFieldList(fields);
        List<Method> methods = MethodConvert.MAPPER.dtoList2entityList(domainDto.getMethodList());
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
