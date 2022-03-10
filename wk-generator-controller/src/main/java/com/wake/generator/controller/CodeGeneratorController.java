package com.wake.generator.controller;

import com.wake.generator.application.CodeGenerateService;
import com.wake.generator.controller.dto.LabelDTO;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: CodeGeneratorController</p>
 * <p>Description: 代码生成器</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 16:58
 */
@RequestMapping("/code-generator")
@RestController
public class CodeGeneratorController {

    @Resource
    CodeGenerateService codeGenerateService;

    @RequestMapping("test")
    public void test(LabelDTO labelDTO) {

    }

}
