package com.wd.paas.generator.web.adapter.codegen.domainchart.web;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.exception.BizException;
import com.wd.paas.generator.web.app.codegen.domainchart.view.DomainChartPageQueryExe;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.ChartXmlUpdateRequest;
import com.wd.paas.generator.web.client.codegen.domainchart.dto.DomainChartDTO;
import com.wd.paas.generator.web.client.codegen.domainchart.query.DomainChartPageQuery;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.domain.codegen.domainchart.chartXmlUpdate.ChartXmlUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.chartXmlUpdate.ChartXmlUpdateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate.DomainChartCreateCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove.DomainChartRemoveCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove.DomainChartRemoveCmdHandler;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate.DomainChartUpdateCmd;
import com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate.DomainChartUpdateCmdHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * 领域图谱-web-controller
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("/web/domain-chart")
@Api(value = "/web/domain-chart", tags = "领域图谱")
public class DomainChartWebController {

    @Resource
    private DomainChartCreateCmdHandler domainChartCreateCmdHandler;
    @Resource
    private DomainChartUpdateCmdHandler domainChartUpdateCmdHandler;
    @Resource
    private ChartXmlUpdateCmdHandler chartXmlUpdateCmdHandler;
    @Resource
    private DomainChartRemoveCmdHandler domainChartRemoveCmdHandler;
    @Resource
    private DomainChartPageQueryExe domainChartPageQueryExe;
    @Resource
    private DomainChartRepository domainChartRepository;


    @ApiOperation("创建领域图谱")
    @PostMapping("/domain-chart-create")
    public ResultDTO<Boolean> domainChartCreate(@RequestBody DomainChartCreateCmd cmd) {
        domainChartCreateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("更新领域图谱")
    @PostMapping("/domain-chart-update")
    public ResultDTO<Boolean> domainChartUpdate(@RequestBody DomainChartUpdateCmd cmd) {
        domainChartUpdateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("获取图谱组件库")
    @GetMapping("/chart-xml-component")
    public void charXmlDownload(HttpServletResponse response) {
        response.setContentType("application/xml;charset=utf-8");
        try (OutputStream outputStream = response.getOutputStream();
            InputStream inputStream = domainChartRepository.downloadChartXmlComponent()) {

            IOUtils.copy(inputStream, outputStream);
        } catch (IOException e) {
            throw new BizException("图谱组件库下载失败!");
        }
    }

    @ApiOperation("下载图谱云文件")
    @GetMapping("/chart-xml-download")
    public void charXmlDownload(Long domainId, HttpServletResponse response) {
        response.setContentType("application/xml;charset=utf-8");
        try (OutputStream outputStream = response.getOutputStream();
            InputStream inputStream = domainChartRepository.downloadChartXmlByDomainChartId(
                domainId)) {

            IOUtils.copy(inputStream, outputStream);
        } catch (IOException e) {
            throw new BizException("图谱云文件下载失败!");
        }
    }

    @ApiOperation("更新图谱云文件")
    @PostMapping("/chart-xml-update")
    public ResultDTO<Boolean> charXmlUpdate(Long id, @RequestBody ChartXmlUpdateRequest request) {
        ChartXmlUpdateCmd cmd = new ChartXmlUpdateCmd();
        cmd.setId(id);
        cmd.setChartXml(request.getXml());
        chartXmlUpdateCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("删除领域图及云端文件")
    @PostMapping("/domain-chart-remove")
    public ResultDTO<Boolean> domainChartRemove(@RequestBody DomainChartRemoveCmd cmd) {
        domainChartRemoveCmdHandler.handle(cmd);
        return ResultDTO.success(Boolean.TRUE);
    }

    @ApiOperation("分页查询领域图谱信息")
    @GetMapping("/domain-chart-page-query-exe")
    public ResultDTO<List<DomainChartDTO>> DomainChartPageQueryExe(DomainChartPageQuery pageQuery) {
        return domainChartPageQueryExe.execute(pageQuery);
    }
}