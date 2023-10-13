package com.wakedt.visual.projectdevelop.adapter.app;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.projectdevelop.client.query.UniversalLanguageBatchRemove;
import com.wakedt.visual.projectdevelop.client.query.ExportUniversalLanguage2Excel;
import com.wakedt.visual.projectdevelop.client.query.ImportUniversalLanguageFromExcel;
import com.wakedt.visual.projectdevelop.client.query.BusinessImportUniversallanguageFromExcel;
import com.wakedt.visual.projectdevelop.client.query.BusinessExportUniversalLanguage2Excel;
import com.wakedt.visual.projectdevelop.client.query.GetLatestApplicationVersionInfo;
import com.wakedt.visual.projectdevelop.client.query.GetLatestDomainDesignVersionInfo;
import com.wakedt.visual.projectdevelop.client.query.GetLatestBusinessSceneVersionInfo;
import com.wakedt.visual.projectdevelop.client.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.projectdevelop.client.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.ApplicationVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.ProjectDevelopRpcService;

/**
 * 项目开发场景-C端
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@RestController
@RequestMapping("/app/project-develop")
@Api(value = "/app/project-develop", tags = "项目开发场景-C端")
public class ProjectDevelopAppController {

    @Resource
    private ProjectDevelopRpcService projectDevelopRpcService;

    @ApiOperation("批量删除统一语言")
    @PostMapping("/universal-language-batch-remove")
    public ResultDTO<Boolean> universalLanguageBatchRemove(@RequestBody @Valid UniversalLanguageBatchRemove request) {
        return projectDevelopRpcService.universalLanguageBatchRemove(request);
    }

    @ApiOperation("统一语言导出Excel文件")
    @PostMapping("/export-universal-language2-excel")
    public ResultDTO<Boolean> exportUniversalLanguage2Excel(@RequestBody @Valid ExportUniversalLanguage2Excel request) {
        return projectDevelopRpcService.exportUniversalLanguage2Excel(request);
    }

    @ApiOperation("Excel导入统一语言")
    @PostMapping("/import-universal-language-from-excel")
    public ResultDTO<Boolean> importUniversalLanguageFromExcel(@RequestBody @Valid ImportUniversalLanguageFromExcel request) {
        return projectDevelopRpcService.importUniversalLanguageFromExcel(request);
    }

    @ApiOperation("Excel导入统一语言(业务域)")
    @PostMapping("/business-import-universallanguage-from-excel")
    public ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(@RequestBody @Valid BusinessImportUniversallanguageFromExcel request) {
        return projectDevelopRpcService.businessImportUniversallanguageFromExcel(request);
    }

    @ApiOperation("统一语言导出Excel文件(业务域)")
    @PostMapping("/business-export-universal-language2-excel")
    public ResultDTO<Boolean> businessExportUniversalLanguage2Excel(@RequestBody @Valid BusinessExportUniversalLanguage2Excel request) {
        return projectDevelopRpcService.businessExportUniversalLanguage2Excel(request);
    }

    @ApiOperation("获取最新应用版本信息")
    @PostMapping("/get-latest-application-version-info")
    public ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(@RequestBody @Valid GetLatestApplicationVersionInfo request) {
        return projectDevelopRpcService.getLatestApplicationVersionInfo(request);
    }

    @ApiOperation("获取最新业务域版本信息")
    @PostMapping("/get-latest-domain-design-version-info")
    public ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(@RequestBody @Valid GetLatestDomainDesignVersionInfo request) {
        return projectDevelopRpcService.getLatestDomainDesignVersionInfo(request);
    }

    @ApiOperation("获取最新业务场景版本信息")
    @PostMapping("/get-latest-business-scene-version-info")
    public ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(@RequestBody @Valid GetLatestBusinessSceneVersionInfo request) {
        return projectDevelopRpcService.getLatestBusinessSceneVersionInfo(request);
    }
}