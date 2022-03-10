package com.wake.generator.application;

import com.wake.generator.controller.dto.GeneratorFileDTO;
import com.wake.generator.controller.dto.ProjectDTO;
import com.wake.generator.core.constant.TemplateType;
import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Project;
import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.code.ClassFile;
import com.wake.generator.core.domain.file.code.InterfaceFile;
import com.wake.generator.start.WkCodeGeneratorApplication;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WkCodeGeneratorApplication.class)
public class CodeGenerateServiceTest {

    @Resource
    CodeGenerateService codeGenerateService;

    @Test
    public void generateCode() {
        ProjectDTO projectDTO = getLabelDTO();
        Project project = projectDTO.transformToProject();
        codeGenerateService.generateCode(project);
    }

    private ProjectDTO getLabelDTO() {
        ProjectDTO projectDTO = new ProjectDTO();
        Global global = new Global();
        global.setAuthor("shimmer");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        global.setDateTime(formatter.format(date));
        projectDTO.setGlobal(global);

        GeneratorFileDTO classGeneratorFile = new GeneratorFileDTO();
        classGeneratorFile.setName("Domain");
        classGeneratorFile.setDescription("聚合类");
        classGeneratorFile.setOutputUrl("wk-code-generator\\wk-generator-domain\\src\\main\\java\\com\\wk\\generator\\domain\\Domain.java");
        classGeneratorFile.setTemplateType(TemplateType.CLASS);
        classGeneratorFile.setAnnotations(Arrays.asList("@Data", "@Entity"));
        classGeneratorFile.setModifier("public");

        ClassFile superClass = new ClassFile();
        superClass.setName("SuperClass");
        classGeneratorFile.setExtendsClass(superClass);

        InterfaceFile interfaceFile1 = new InterfaceFile();
        interfaceFile1.setName("interfaceClass1");
        InterfaceFile interfaceFile2 = new InterfaceFile();
        interfaceFile2.setName("interfaceClass2");
        Set<InterfaceFile> set = new HashSet<>();
        set.add(interfaceFile1);
        set.add(interfaceFile2);
        classGeneratorFile.setImplementSet(set);

        Property property = new Property();
        property.setModifier("private");
        property.setType("List<String>");
        property.setName("annotations");
        property.setDescription("注解列表");
        property.setAnnotations(Arrays.asList("@NotBlank", "@TableField"));
        classGeneratorFile.setPropertySet(Collections.singleton(property));

        Method method = new Method();
        method.setModifier("public static");
        method.setReturnType("void");
        method.setName("main");
        method.setDescription("主方法");
        method.setAttributeLabel("String[] args");
        method.setAnnotations(Arrays.asList("@Api", "@Method"));
        classGeneratorFile.setMethodSet(Collections.singleton(method));

        projectDTO.setGeneratorFileDtoSet(Collections.singleton(classGeneratorFile));
        return projectDTO;
    }
}