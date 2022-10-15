package com.wd.paas.generator.web.adapter.codegen.domainchart.web;

import com.wakedata.common.core.dto.ResultDTO;
import com.wd.paas.generator.web.app.codegen.domainchart.view.DomainChartPageQueryExe;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.DomainChartDTO;
import com.wd.paas.generator.web.client.codegen.domainchart.query.DomainChartPageQuery;
import com.wd.paas.generator.web.domain.codegen.domainchart.chartUpdate.ChartUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.chartUpdate.ChartUpdateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.codeGenerate.CodeGenerateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.codeGenerate.CodeGenerateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove.DomainChartRemoveCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove.DomainChartRemoveCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate.DomainChartUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate.DomainChartUpdateCmdHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 领域图谱-web-controller
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@RestController
@RequestMapping("/web/domain-chart")
@Api(value = "/web/domain-chart", tags = "领域图谱")
public class DomainChartWebController {

    @Resource
    private DomainChartCreateCmdHandler domainChartCreateCmdHandler;
    @Resource
    private DomainChartUpdateCmdHandler domainChartUpdateCmdHandler;
    @Resource
    private DomainChartRemoveCmdHandler domainChartRemoveCmdHandler;
    @Resource
    private ChartUpdateCmdHandler chartUpdateCmdHandler;
    @Resource
    private CodeGenerateCmdHandler codeGenerateCmdHandler;
    @Resource
    private DomainChartPageQueryExe domainChartPageQueryExe;


    @ApiOperation("创建领域图谱")
    @PostMapping("/domain-chart-create")
    public ResultDTO<Boolean> domainChartCreate(DomainChartCreateCmd cmd) {
        domainChartCreateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("更新领域图谱")
    @PostMapping("/domain-chart-update")
    public ResultDTO<Boolean> domainChartUpdate(DomainChartUpdateCmd cmd) {
        domainChartUpdateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("删除领域图及云端文件")
    @PostMapping("/domain-chart-remove")
    public ResultDTO<Boolean> domainChartRemove(DomainChartRemoveCmd cmd) {
        domainChartRemoveCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("更新云端图谱文件")
    @PostMapping("/chart-update")
    public ResultDTO<Boolean> chartUpdate(ChartUpdateCmd cmd) {
        chartUpdateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("生成代码")
    @PostMapping("/code-generate")
    public ResultDTO<Boolean> codeGenerate(CodeGenerateCmd cmd) {
        codeGenerateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("分页查询领域图谱信息")
    @GetMapping("/domain-chart-page-query-exe")
    public ResultDTO<List<DomainChartDTO>> DomainChartPageQueryExe(DomainChartPageQuery pageQuery) {
        return domainChartPageQueryExe.execute(pageQuery);
    }
}