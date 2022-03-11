package com.wakedata.generator.codegenerator;

import com.wake.generator.application.CodeGenerateServiceImpl;
import com.wake.generator.application.constant.DomainElementType;
import com.wake.generator.application.domain.DomainElement;
import com.wake.generator.application.domain.Field;
import com.wake.generator.application.domain.Global;
import com.wake.generator.application.domain.Method;
import com.wake.generator.application.domain.Project;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import org.junit.Test;

public class CodeGenerateServiceTest {

    CodeGenerateServiceImpl codeGenerateService = new CodeGenerateServiceImpl();

    @Test
    public void execute() {
        Project project = new Project();

        DomainElement DomainElement = new DomainElement();
        DomainElement.setName("DemoClass");
        DomainElement.setOutputDir("{projectName}\\{projectName}-domain\\src\\main\\java\\{group}\\domain\\{filed}\\{polymerization}\\");

        Field field = new Field();
        field.setName("name");
        field.setType("List<String>");
        field.setModifier("private");
        field.setDescription("类名称");

        Method method = new Method();
        method.setName("execute");
        method.setModifier("public static");
        method.setReturnType("Set<List<Integer>>");
        method.setAttributeLabel("LabelDTO labelDTO, Collection<Set<List<Integer>>> double");
        method.setDescription("执行代码生成");


        DomainElement.setFieldList(Collections.singletonList(field));
        DomainElement.setMethodList(Collections.singletonList(method));
        DomainElement.setElementType(DomainElementType.AGGREGATION);
        DomainElement.setDescription("演示代码生成");
        project.setDomainElementList(Collections.singletonList(DomainElement));

        Global globalDTO = new Global();
        globalDTO.setAuthor("shimmer");
        globalDTO.setDateTime(LocalDate.now().toString());
        globalDTO.setGroup("com.szy");
        project.setGlobal(globalDTO);

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