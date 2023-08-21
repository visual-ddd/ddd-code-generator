package com.wakedt.visual.projectdevelop.app;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.projectdevelop.client.ProjectDevelopRpcService;
import com.wakedt.visual.projectdevelop.client.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.projectdevelop.client.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.projectdevelop.client.query.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目开发场景-RPC能力接口实现
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