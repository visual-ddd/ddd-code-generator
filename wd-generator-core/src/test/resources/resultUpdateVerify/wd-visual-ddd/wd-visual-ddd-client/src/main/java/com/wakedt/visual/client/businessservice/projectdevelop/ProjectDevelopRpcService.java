package com.wakedt.visual.client.businessservice.projectdevelop;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.ApplicationLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.BusinessSceneLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.DomainDesignLatestVersionInfoDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import com.wakedt.visual.client.businessservice.projectdevelop.query.*;

import java.util.List;

/**
 * 项目开发场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface ProjectDevelopRpcService {

    /**
     * 批量删除统一语言
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> universalLanguageBatchRemove(UniversalLanguageBatchRemove request);

    /**
     * 统一语言导出Excel文件
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> exportUniversalLanguage2Excel(ExportUniversalLanguage2Excel request);

    /**
     * Excel导入统一语言
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> importUniversalLanguageFromExcel(ImportUniversalLanguageFromExcel request);

    /**
     * 不进行数据处理(由前端进行插入数据库)
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<List<UniversalLanguageExcelDTO>> businessImportUniversallanguageFromExcel(BusinessImportUniversallanguageFromExcel request);

    /**
     * 统一语言导出Excel文件(业务域)
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> businessExportUniversalLanguage2Excel(BusinessExportUniversalLanguage2Excel request);

    /**
     * 获取最新应用版本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<ApplicationLatestVersionInfoDTO> getLatestApplicationVersionInfo(GetLatestApplicationVersionInfo request);

    /**
     * 获取最新业务域版本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<DomainDesignLatestVersionInfoDTO> getLatestDomainDesignVersionInfo(GetLatestDomainDesignVersionInfo request);

    /**
     * 获取最新业务场景版本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<BusinessSceneLatestVersionInfoDTO> getLatestBusinessSceneVersionInfo(GetLatestBusinessSceneVersionInfo request);

}