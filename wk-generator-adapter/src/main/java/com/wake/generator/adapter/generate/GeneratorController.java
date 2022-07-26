package com.wake.generator.adapter.generate;

import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.dto.DomainChartGenerateDto;
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
@RequestMapping("/code/generate")
@RestController
public class GeneratorController {

    @Resource
    private CodeGenerateService codeGenerateService;

    /**
     * 通过领域图谱生成代码
     *
     * @param domainChartGenerateDto 单张领域图谱
     */
    @RequestMapping("/generateCodeByChart")
    public String generateCodeByChart(@RequestBody DomainChartGenerateDto domainChartGenerateDto) {
        boolean result = codeGenerateService.generateCode(domainChartGenerateDto);
        return "生成结果： " + result;
    }
}
