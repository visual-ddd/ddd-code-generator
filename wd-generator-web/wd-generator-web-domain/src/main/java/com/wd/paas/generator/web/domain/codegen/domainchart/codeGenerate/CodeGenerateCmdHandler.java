package com.wd.paas.generator.web.domain.codegen.domainchart.codeGenerate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.CodeGenerateServiceImpl;
import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateWayEnum;
import org.apache.velocity.VelocityContext;
import org.springframework.stereotype.Component;

/**
 * 生成代码-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class CodeGenerateCmdHandler {

    public void handle(CodeGenerateCmd cmd) {
        ProjectDTO projectDTO = new ProjectDTO();

        GenerateContext generateContext = new GenerateContext(new VelocityContext(),
            "/", null, GenerateWayEnum.OVERALL);

        CodeGenerateService codeGenerateService = new CodeGenerateServiceImpl();
        codeGenerateService.generate(projectDTO, generateContext);

        DomainEventPublisher.getInstance()
            .postAfterCommit(new CodeGenerateEvent(cmd));
    }
}