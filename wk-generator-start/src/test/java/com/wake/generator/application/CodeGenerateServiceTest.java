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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;
import org.junit.Assert;
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
        labelDTO.setGlobal(new Global());

        GeneratorFileDTO generatorFileDTO = new GeneratorFileDTO();
        generatorFileDTO.setName("");
        generatorFileDTO.setOutputUrl("");
        generatorFileDTO.setTemplateType(TemplateType.CLASS);
        generatorFileDTO.setAnnotations(new ArrayList<String>());
        generatorFileDTO.setModifier("");
        generatorFileDTO.setExtendsClass(new ClassGeneratorFile());
        generatorFileDTO.setImplementSet(new HashSet<InterfaceGeneratorFile>());
        generatorFileDTO.setPropertyList(new ArrayList<Property>());
        generatorFileDTO.setMethodList(new ArrayList<Method>());
        generatorFileDTO.setExtendsInterfaceSet(new HashSet<InterfaceGeneratorFile>());

        labelDTO.setGeneratorFileDtoSet(Collections.singleton(generatorFileDTO));
        return labelDTO;
    }
}