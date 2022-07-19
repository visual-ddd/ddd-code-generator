package com.wake.generator.adapter;

import com.wake.generator.client.cola.api.CodeGenerateService;
import com.wake.generator.client.cola.dto.ProjectChartDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Title: GeneratorController</p>
 * <p>Description: 代码生成器</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/15 11:54
 */
@RequestMapping("/code/generator")
@RestController
public class GeneratorController {

    @Resource
    private CodeGenerateService codeGenerateService;

    /**
     * 通过projectChartDto生成代码
     *
     * @param projectChartDto
     */
    @RequestMapping("/generateCodeByProjectDto")
    public void generateCodeByProjectDto(@RequestBody ProjectChartDto projectChartDto) {
        boolean result = codeGenerateService.generateCode(projectChartDto);
        System.out.println("生成结果： " + result);
    }
}
