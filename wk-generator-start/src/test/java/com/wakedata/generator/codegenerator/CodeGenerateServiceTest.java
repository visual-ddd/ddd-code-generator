package com.wakedata.generator.codegenerator;

import com.wake.generator.application.cola.api.CodeGenerateServiceImpl;
import com.wake.generator.client.cola.dto.DomainShapeDto;
import com.wake.generator.client.cola.dto.FieldDto;
import com.wake.generator.client.cola.dto.GlobalDto;
import com.wake.generator.client.cola.dto.MethodDto;
import com.wake.generator.client.cola.dto.ProjectChartDto;
import com.wake.generator.client.common.DomainShapeEnum;
import java.time.LocalDate;
import java.util.Collections;
import org.assertj.core.util.Sets;
import org.junit.Test;

public class CodeGenerateServiceTest {

    CodeGenerateServiceImpl codeGenerateService = new CodeGenerateServiceImpl();

    @Test
    public void execute() {
        ProjectChartDto project = new ProjectChartDto();

        GlobalDto global = new GlobalDto();
        global.setAuthor("shimmer");
        global.setProjectName("cola-project");
        global.setDateTime(LocalDate.now().toString());
        global.setGroup("com.szy");
        global.setFiled("SpellGroup");
        project.setGlobal(global);

        // 聚合元素
        DomainShapeDto aggregation = new DomainShapeDto();
        aggregation.setName("DemoClass");
        aggregation.setDescription("演示代码生成");
        aggregation.setShapeType(DomainShapeEnum.AGGREGATION);

        // 字段
        FieldDto field = new FieldDto();
        field.setName("name");
        field.setType("List<String>");
        field.setModifier("private");
        field.setDescription("类名称");

        // 方法
        MethodDto method = new MethodDto();
        method.setName("execute");
        method.setModifier("public static");
        method.setReturnType("Set<List<Integer>>");
        method.setAttributeLabel("LabelDTO labelDTO, Collection<Set<List<Integer>>> test");
        method.setDescription("执行代码生成");

        aggregation.setFieldList(Collections.singletonList(field));
        aggregation.setMethodList(Collections.singletonList(method));

        // cmd元素
        DomainShapeDto cmd = new DomainShapeDto();
        cmd.setActionName("create");
        cmd.setDescription("Cmd");
        cmd.setShapeType(DomainShapeEnum.COMMAND);
        cmd.setParentAggregation(aggregation);
        // event元素
        DomainShapeDto event = new DomainShapeDto();
        event.setActionName("create");
        event.setDescription("事件类");
        event.setShapeType(DomainShapeEnum.EVENT);
        event.setParentAggregation(aggregation);

        project.setDomainShapeDtoSet(Sets.set(aggregation, cmd, event));

        codeGenerateService.generateCode(project);
    }
}