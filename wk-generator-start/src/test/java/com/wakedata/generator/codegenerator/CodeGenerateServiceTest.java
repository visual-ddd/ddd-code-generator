package com.wakedata.generator.codegenerator;

import com.wake.generator.application.CodeGenerateServiceImpl;
import com.wake.generator.application.constant.DomainElementType;
import com.wake.generator.application.entity.ProjectChart;
import com.wake.generator.application.entity.DomainElement;
import com.wake.generator.application.entity.Field;
import com.wake.generator.application.entity.Global;
import com.wake.generator.application.entity.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class CodeGenerateServiceTest {

    CodeGenerateServiceImpl codeGenerateService = new CodeGenerateServiceImpl();

    @Test
    public void execute() {
        ProjectChart project = new ProjectChart();

        Global global = new Global();
        global.setAuthor("shimmer");
        global.setProjectName("cola-project");
        global.setDateTime(LocalDate.now().toString());
        global.setGroup("com.szy");
        global.setFiled("SpellGroup");
        project.setGlobal(global);

        // 聚合元素
        DomainElement aggregation = new DomainElement();
        aggregation.setName("DemoClass");
        aggregation.setDescription("演示代码生成");
        aggregation.setElementType(DomainElementType.AGGREGATION);

        // 字段
        Field field = new Field();
        field.setName("name");
        field.setType("List<String>");
        field.setModifier("private");
        field.setDescription("类名称");

        // 方法
        Method method = new Method();
        method.setName("execute");
        method.setModifier("public static");
        method.setReturnType("Set<List<Integer>>");
        method.setAttributeLabel("LabelDTO labelDTO, Collection<Set<List<Integer>>> test");
        method.setDescription("执行代码生成");

        aggregation.setFieldList(Collections.singletonList(field));
        aggregation.setMethodList(Collections.singletonList(method));

        // cmd元素
        DomainElement cmd = new DomainElement();
        cmd.setName("Activity");
        cmd.setDescription("Cmd");
        cmd.setElementType(DomainElementType.COMMAND);
        // 指定聚合下
        cmd.setParentAggregation(aggregation);

        List<DomainElement> domainElements = new ArrayList<>();
        domainElements.add(aggregation);
        domainElements.add(cmd);
        project.setDomainElementList(domainElements);

        codeGenerateService.generateCode(project);
    }

    @Test
    public void getTemplateFullPath() {
        Set<String> templateFullPath = codeGenerateService.queryTemplateFullPath();
        for (String s : templateFullPath) {
            System.out.println(s + "\n");
        }
    }
}