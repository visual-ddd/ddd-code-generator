package com.wd.paas.generator.web.adapter.codegen.project.web;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.exception.BizException;
import com.wd.paas.generator.web.app.codegen.project.CodeGenService;
import com.wd.paas.generator.web.app.codegen.project.view.ProjectPageQueryExe;
import com.wd.paas.generator.web.app.codegen.project.view.ProjectQueryExe;
import com.wd.paas.generator.web.client.codegen.project.dto.CodeGenerateRequest;
import com.wd.paas.generator.web.client.codegen.project.dto.ProjectDTO;
import com.wd.paas.generator.web.client.codegen.project.query.ProjectPageQuery;
import com.wd.paas.generator.web.client.codegen.project.query.ProjectQuery;
import com.wd.paas.generator.web.domain.codegen.project.projectCreate.ProjectCreateCmd;
import com.wd.paas.generator.web.domain.codegen.project.projectCreate.ProjectCreateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.project.projectRemove.ProjectRemoveCmd;
import com.wd.paas.generator.web.domain.codegen.project.projectRemove.ProjectRemoveCmdHandler;
import com.wd.paas.generator.web.domain.codegen.project.projectUpdate.ProjectUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.project.projectUpdate.ProjectUpdateCmdHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipOutputStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目-web-controller
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@RestController
@RequestMapping("/web/project")
@Api(value = "/web/project", tags = "项目")
public class ProjectWebController {

    @Resource
    private ProjectCreateCmdHandler projectCreateCmdHandler;
    @Resource
    private ProjectUpdateCmdHandler projectUpdateCmdHandler;
    @Resource
    private ProjectRemoveCmdHandler projectRemoveCmdHandler;
    @Resource
    private ProjectPageQueryExe projectPageQueryExe;
    @Resource
    private ProjectQueryExe projectQueryExe;
    @Resource
    private CodeGenService codeGenService;


    @ApiOperation("新增项目信息")
    @PostMapping("/project-create")
    public ResultDTO<Long> projectCreate(@RequestBody ProjectCreateCmd cmd) {
        return ResultDTO.success(projectCreateCmdHandler.handle(cmd));
    }

    @ApiOperation("更新项目信息")
    @PostMapping("/project-update")
    public ResultDTO<Boolean> projectUpdate(@RequestBody ProjectUpdateCmd cmd) {
        projectUpdateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("删除项目及项目下的领域图谱")
    @PostMapping("/project-remove")
    public ResultDTO<Boolean> projectRemove(@RequestBody ProjectRemoveCmd cmd) {
        projectRemoveCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("查询项目详情")
    @GetMapping("/project-query-exe")
    public ResultDTO<ProjectDTO> ProjectQueryExe(ProjectQuery projectQuery) {
        return projectQueryExe.execute(projectQuery);
    }

    @ApiOperation("分页查询项目信息")
    @GetMapping("/project-page-query-exe")
    public ResultDTO<List<ProjectDTO>> ProjectPageQueryExe(ProjectPageQuery pageQuery) {
        return projectPageQueryExe.execute(pageQuery);
    }

    @ApiOperation("生成代码")
    @PostMapping(value = "/code-generate")
    public void codeGenerate(@RequestBody CodeGenerateRequest request,
        HttpServletResponse response) {
        response.setContentType("application/zip");
        response.setHeader("Content-Disposition", "attachment;filename=source.zip");
        try (ZipOutputStream out = new ZipOutputStream(response.getOutputStream())) {

            // 生成代码,并输出到输出流中
            codeGenService.genProject(request, out);
            response.flushBuffer();
        } catch (IOException e) {
            throw new BizException("代码生成执行流异常!");
        }
    }
}