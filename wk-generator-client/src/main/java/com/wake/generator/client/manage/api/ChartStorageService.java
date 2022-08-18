package com.wake.generator.client.manage.api;

import com.wake.generator.client.manage.dto.ChartStorageDto;
import com.wakedata.common.core.dto.ResultDTO;
import javax.servlet.http.HttpServletResponse;

/**
 * 图谱存储服务接口
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/10
 */
public interface ChartStorageService {

    /**
     * 上传
     *
     * @param chartStorageDto
     * @return
     */
    ResultDTO<Boolean> uploadChart(ChartStorageDto chartStorageDto);

    /**
     * 下载领域图谱文件
     *
     * @param domainId
     * @param response response
     */
    void download(Long domainId, HttpServletResponse response);

    /**
     * 加载DDD工具库模版
     *
     * @param response response
     */
    void loadModel(HttpServletResponse response);
}
