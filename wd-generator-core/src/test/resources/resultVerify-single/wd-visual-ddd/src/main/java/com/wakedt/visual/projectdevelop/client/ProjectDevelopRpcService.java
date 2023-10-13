package com.wakedt.visual.projectdevelop.client;

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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 项目开发场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
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