package com.wake.generator.application;

import com.wake.generator.controller.dto.GeneratorFileDTO;
import com.wake.generator.controller.dto.LabelDTO;
import com.wake.generator.core.constant.TemplateType;
import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Label;
import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.code.ClassGeneratorFile;
import com.wake.generator.core.domain.file.code.InterfaceGeneratorFile;
import com.wake.generator.start.WkCodeGeneratorApplication;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException.Gone;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WkCodeGeneratorApplication.class)
public class CodeGenerateServiceTest {

    @Resource
    CodeGenerateService codeGenerateService;

    @Test
    public void generateCode() {
        LabelDTO labelDTO = getLabelDTO();
        Label label = labelDTO.transformToLabel();
        codeGenerateService.generateCode(label);
    }

    @Test
    public void queryTemplateFullPath() {
        Set<String> templateFullPath = codeGenerateService.queryTemplateFullPath();
        for (String path : templateFullPath) {
            System.out.println(path);
        }
        Assert.assertNotNull(templateFullPath);
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
        classGeneratorFile.setOutputUrl("wk-code-generator\\wk-generator-domain\\src\\main\\java\\com\\wk\\generator\\domain\\Domain.java");
        classGeneratorFile.setTemplateType(TemplateType.CLASS);
        classGeneratorFile.setAnnotations(new ArrayList<String>());
        classGeneratorFile.setModifier("public");
        classGeneratorFile.setExtendsClass(new ClassGeneratorFile());
        classGeneratorFile.setImplementSet(new HashSet<InterfaceGeneratorFile>());
        classGeneratorFile.setPropertyList(new ArrayList<Property>());
        classGeneratorFile.setMethodList(new ArrayList<Method>());
        classGeneratorFile.setExtendsInterfaceSet(new HashSet<InterfaceGeneratorFile>());

        labelDTO.setGeneratorFileDtoSet(Collections.singleton(classGeneratorFile));
        return labelDTO;
    }
}