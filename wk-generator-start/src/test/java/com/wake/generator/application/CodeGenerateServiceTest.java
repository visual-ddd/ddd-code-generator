package com.wake.generator.application;

import com.wake.generator.controller.dto.GeneratorFileDTO;
import com.wake.generator.controller.dto.LabelDTO;
import com.wake.generator.core.constant.TemplateType;
import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Project;
import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.code.ClassFile;
import com.wake.generator.core.domain.file.code.InterfaceFile;
import com.wake.generator.start.WkCodeGeneratorApplication;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
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
        LabelDTO labelDTO = getLabelDTO();
        Project project = labelDTO.transformToLabel();
        codeGenerateService.generateCode(project);
    }

    private LabelDTO getLabelDTO() {
        LabelDTO labelDTO = new LabelDTO();
        Global global = new Global();
        global.setAuthor("shimmer");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        global.setDateTime(formatter.format(date));
        labelDTO.setGlobal(global);

        GeneratorFileDTO classGeneratorFile = new GeneratorFileDTO();
        classGeneratorFile.setName("Domain");
        classGeneratorFile.setDescription("聚合类");
        classGeneratorFile.setOutputUrl("wk-code-generator\\wk-generator-domain\\src\\main\\java\\com\\wk\\generator\\domain\\Domain.java");
        classGeneratorFile.setTemplateType(TemplateType.CLASS);
        classGeneratorFile.setAnnotations(new ArrayList<String>());
        classGeneratorFile.setModifier("public");
        classGeneratorFile.setExtendsClass(new ClassFile());
        classGeneratorFile.setImplementSet(new HashSet<InterfaceFile>());
        classGeneratorFile.setPropertyList(new ArrayList<Property>());
        classGeneratorFile.setMethodList(new ArrayList<Method>());
        classGeneratorFile.setExtendsInterfaceSet(new HashSet<InterfaceFile>());

        labelDTO.setGeneratorFileDtoSet(Collections.singleton(classGeneratorFile));
        return labelDTO;
    }
}