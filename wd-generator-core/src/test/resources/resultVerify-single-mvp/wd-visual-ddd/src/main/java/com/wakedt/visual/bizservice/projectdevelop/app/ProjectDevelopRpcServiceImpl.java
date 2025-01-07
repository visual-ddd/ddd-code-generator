package com.wakedt.visual.bizservice.projectdevelop.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.request.UniversalLanguageBatchRemove;
import com.wakedt.visual.bizservice.projectdevelop.client.request.ExportUniversalLanguage2Excel;
import com.wakedt.visual.bizservice.projectdevelop.client.request.ImportUniversalLanguageFromExcel;
import com.wakedt.visual.bizservice.projectdevelop.client.request.BusinessImportUniversallanguageFromExcel;
import com.wakedt.visual.bizservice.projectdevelop.client.request.BusinessExportUniversalLanguage2Excel;
import com.wakedt.visual.bizservice.projectdevelop.client.request.GetLatestApplicationVersionInfo;
import com.wakedt.visual.bizservice.projectdevelop.client.request.GetLatestDomainDesignVersionInfo;
import com.wakedt.visual.bizservice.projectdevelop.client.request.GetLatestBusinessSceneVersionInfo;
import com.wakedt.visual.bizservice.projectdevelop.client.response.UniversalLanguageExcelDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.ApplicationVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.DomainDesignVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.response.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.bizservice.projectdevelop.client.ProjectDevelopRpcService;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 项目开发场景-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
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