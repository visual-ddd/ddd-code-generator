package com.wakedt.visual.projectdevelop.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 项目开发场景-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
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