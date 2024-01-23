package com.wakedt.visual.client.businessservice.projectdevelop;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.query.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 项目开发场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/project-develop")
@Api(tags = "[RPC] 项目开发场景")
public interface ProjectDevelopRpcService {

    @ApiOperation("批量删除统一语言")
    @PostMapping("/universal-language-batch-remove")
    ResultDTO<Boolean> universalLanguageBatchRemove(@RequestBody @Valid UniversalLanguageBatchRemove request);

    @ApiOperation("统一语言导出Excel文件")
    @PostMapping("/export-universal-language2-excel")
    ResultDTO<Boolean> exportUniversalLanguage2Excel(@RequestBody @Valid ExportUniversalLanguage2Excel request);

    @ApiOperation("Excel导入统一语言")
    @PostMapping("/import-universal-language-from-excel")
    ResultDTO<Boolean> importUniversalLanguageFromExcel(@RequestBody @Valid ImportUniversalLanguageFromExcel request);

    @ApiOperation("Excel导入统一语言(业务域)")
    @PostMapping("/business-import-universallanguage-from-excel")
    ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(@RequestBody @Valid BusinessImportUniversallanguageFromExcel request);

    @ApiOperation("统一语言导出Excel文件(业务域)")
    @PostMapping("/business-export-universal-language2-excel")
    ResultDTO<Boolean> businessExportUniversalLanguage2Excel(@RequestBody @Valid BusinessExportUniversalLanguage2Excel request);

    @ApiOperation("获取最新应用版本信息")
    @PostMapping("/get-latest-application-version-info")
    ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(@RequestBody @Valid GetLatestApplicationVersionInfo request);

    @ApiOperation("获取最新业务域版本信息")
    @PostMapping("/get-latest-domain-design-version-info")
    ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(@RequestBody @Valid GetLatestDomainDesignVersionInfo request);

    @ApiOperation("获取最新业务场景版本信息")
    @PostMapping("/get-latest-business-scene-version-info")
    ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(@RequestBody @Valid GetLatestBusinessSceneVersionInfo request);

}