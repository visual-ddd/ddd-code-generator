package com.wd.paas.generator.web.app.codegen.project;

import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.CodeGenerateServiceImpl;
import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateWayEnum;
import com.wd.paas.generator.web.client.codegen.project.dto.CodeGenerateRequest;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import org.apache.velocity.VelocityContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.zip.ZipOutputStream;

@Service
public class CodeGenServiceImpl implements CodeGenService {

    @Resource
    private ProjectRepository repository;

    @Override
    public void genProject(CodeGenerateRequest request, ZipOutputStream zipOutputStream) {
        // 配置上下文参数
        ProjectDTO projectDTO = repository.buildProjectDTO(request.getProjectId());
        GenerateContext generateContext = new GenerateContext(new VelocityContext(),
            "", zipOutputStream, GenerateWayEnum.OVERALL);

        CodeGenerateService codeGenerateService = new CodeGenerateServiceImpl();
        codeGenerateService.generate(projectDTO, generateContext);
    }
}
