package com.wake.generator.adapter.generate;

import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.dto.DomainChartGenerateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成器
 *
 * @author ZhuXueLiang
 * @date 2022/7/28
 * @since 1.0
 */
@Slf4j
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
    @PostMapping(value = "/generateCodeByChart", consumes = "application/json")
    public void generateCodeByChart(@RequestBody DomainChartGenerateDto domainChartGenerateDto,
                                    HttpServletResponse response) {
        try (ZipOutputStream out = new ZipOutputStream(response.getOutputStream())) {
            // 生成代码,并传递到输出流
            codeGenerateService.generateCode(domainChartGenerateDto, out);
            response.flushBuffer();
        } catch (Exception e) {
            log.error(this.getClass() + ".downloadFile error, error info :" + e);
        }
    }

}
