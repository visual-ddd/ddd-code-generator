package com.wakedt.visual.app.businessservice.projectdevelop;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.query.UniversalLanguageBatchRemove;
import com.wakedt.visual.client.businessservice.projectdevelop.query.ExportUniversalLanguage2Excel;
import com.wakedt.visual.client.businessservice.projectdevelop.query.ImportUniversalLanguageFromExcel;
import com.wakedt.visual.client.businessservice.projectdevelop.query.BusinessImportUniversallanguageFromExcel;
import com.wakedt.visual.client.businessservice.projectdevelop.query.BusinessExportUniversalLanguage2Excel;
import com.wakedt.visual.client.businessservice.projectdevelop.query.GetLatestApplicationVersionInfo;
import com.wakedt.visual.client.businessservice.projectdevelop.query.GetLatestDomainDesignVersionInfo;
import com.wakedt.visual.client.businessservice.projectdevelop.query.GetLatestBusinessSceneVersionInfo;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.ApplicationVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.ProjectDevelopRpcService;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目开发场景-RPC能力接口实现
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/rpc/project-develop")
public class ProjectDevelopRpcServiceImpl implements ProjectDevelopRpcService {

    @Override
    public ResultDTO<Boolean> universalLanguageBatchRemove(UniversalLanguageBatchRemove request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> exportUniversalLanguage2Excel(ExportUniversalLanguage2Excel request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> importUniversalLanguageFromExcel(ImportUniversalLanguageFromExcel request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(BusinessImportUniversallanguageFromExcel request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> businessExportUniversalLanguage2Excel(BusinessExportUniversalLanguage2Excel request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(GetLatestApplicationVersionInfo request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(GetLatestDomainDesignVersionInfo request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(GetLatestBusinessSceneVersionInfo request) {

        return ResultDTO.success();
    }
}