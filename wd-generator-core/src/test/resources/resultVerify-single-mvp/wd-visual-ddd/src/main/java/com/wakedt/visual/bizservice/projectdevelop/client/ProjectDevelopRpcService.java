package com.wakedt.visual.bizservice.projectdevelop.client;

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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 项目开发场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface ProjectDevelopRpcService {

    /** 批量删除统一语言 */
    ResultDTO<Boolean> universalLanguageBatchRemove(UniversalLanguageBatchRemove request);

    /** 统一语言导出Excel文件 */
    ResultDTO<Boolean> exportUniversalLanguage2Excel(ExportUniversalLanguage2Excel request);

    /** Excel导入统一语言 */
    ResultDTO<Boolean> importUniversalLanguageFromExcel(ImportUniversalLanguageFromExcel request);

    /** 不进行数据处理(由前端进行插入数据库) */
    ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(BusinessImportUniversallanguageFromExcel request);

    /** 统一语言导出Excel文件(业务域) */
    ResultDTO<Boolean> businessExportUniversalLanguage2Excel(BusinessExportUniversalLanguage2Excel request);

    /** 获取最新应用版本信息 */
    ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(GetLatestApplicationVersionInfo request);

    /** 获取最新业务域版本信息 */
    ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(GetLatestDomainDesignVersionInfo request);

    /** 获取最新业务场景版本信息 */
    ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(GetLatestBusinessSceneVersionInfo request);

}