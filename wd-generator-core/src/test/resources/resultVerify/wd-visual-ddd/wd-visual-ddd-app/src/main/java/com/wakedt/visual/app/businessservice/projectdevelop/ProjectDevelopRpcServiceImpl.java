package com.wakedt.visual.app.businessservice.projectdevelop;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.ProjectDevelopRpcService;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.query.*;
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