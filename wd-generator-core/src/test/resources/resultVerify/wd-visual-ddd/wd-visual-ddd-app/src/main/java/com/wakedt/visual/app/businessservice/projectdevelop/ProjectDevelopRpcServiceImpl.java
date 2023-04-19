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
import org.springframework.stereotype.Service;

/**
 * DDD项目开发流程-RPC能力接口实现
 */
@Service
public class ProjectDevelopRpcServiceImpl implements ProjectDevelopRpcService {

    @Override
    public ResultDTO<Boolean> universalLanguageBatchRemove(UniversalLanguageBatchRemove request) {
        // TODO 批量删除统一语言
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> exportUniversalLanguage2Excel(ExportUniversalLanguage2Excel request) {
        // TODO 统一语言导出Excel文件
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> importUniversalLanguageFromExcel(ImportUniversalLanguageFromExcel request) {
        // TODO Excel导入统一语言
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(BusinessImportUniversallanguageFromExcel request) {
        // TODO 不进行数据处理(由前端进行插入数据库)
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> businessExportUniversalLanguage2Excel(BusinessExportUniversalLanguage2Excel request) {
        // TODO 统一语言导出Excel文件(业务域)
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(GetLatestApplicationVersionInfo request) {
        // TODO 获取最新应用版本信息
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(GetLatestDomainDesignVersionInfo request) {
        // TODO 获取最新业务域版本信息
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(GetLatestBusinessSceneVersionInfo request) {
        // TODO 获取最新业务场景版本信息
        return ResultDTO.success();
    }
}