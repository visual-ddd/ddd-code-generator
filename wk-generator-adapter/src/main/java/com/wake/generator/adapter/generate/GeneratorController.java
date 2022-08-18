package com.wake.generator.adapter.generate;

import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.dto.GenerateProjectDto;
import java.util.zip.ZipOutputStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 生成代码
     *
     * @param projectDto 需要生成的模型
     * @param response   HttpServletResponse
     */
    @PostMapping(value = "/generateCodeByProject", consumes = "application/json")
    public void generateCodeByProject(@RequestBody GenerateProjectDto projectDto,
        HttpServletResponse response) {
        //设置response的header
        response.setContentType("application/zip");
        response.setHeader("Content-Disposition",
            "attachment;filename=" + projectDto.getProjectName() + ".zip");
        try (ZipOutputStream out = new ZipOutputStream(response.getOutputStream())) {
            // 生成代码,并传递到输出流
            codeGenerateService.generateCodeByChartXml(projectDto, out);
            response.flushBuffer();
        } catch (Exception e) {
            log.error(this.getClass() + ".downloadFile error, error info :" + e);
        }
    }

}
