package com.wd.paas.generator.web.app.codegen.project;

import com.wd.paas.generator.web.client.codegen.project.dto.CodeGenerateRequest;
import java.util.zip.ZipOutputStream;

public interface CodeGenService {

    /**
     * 生成项目代码
     *
     * @param request         生成代码请求参数
     * @param zipOutputStream 输出流
     */
    void genProject(CodeGenerateRequest request, ZipOutputStream zipOutputStream);

}
