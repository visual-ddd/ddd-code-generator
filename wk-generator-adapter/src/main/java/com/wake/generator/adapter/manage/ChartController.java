package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.ChartStorageService;
import com.wake.generator.client.manage.dto.ChartStorageDto;
import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 图谱页面管理
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@RequestMapping("/chart/manage")
@RestController
public class ChartController {

    @Resource
    private ChartStorageService chartStorageService;

    /**
     * 上传图谱接口(允许跨域)
     *
     * @param domainId        所属领域
     * @param chartStorageDto 图谱存储DTO
     * @return 上传结果
     */
    @CrossOrigin
    @RequestMapping("/upload")
    public ResultDTO<Boolean> upload(@RequestParam(value = "domainId") Long domainId,
        @RequestBody ChartStorageDto chartStorageDto) {
        chartStorageDto.setDomainId(domainId);
        return chartStorageService.uploadChart(chartStorageDto);
    }

    /**
     * 获取最新图谱文件
     *
     * @param domainId 所属领域
     */
    @CrossOrigin
    @GetMapping("/download")
    public void download(@RequestParam(value = "domainId") Long domainId,
        HttpServletResponse response) {
        chartStorageService.download(domainId, response);
    }

    /**
     * 加载DDD工具库模版
     *
     * @param response response
     */
    @CrossOrigin
    @GetMapping("/loadModel")
    public void getInitChart(HttpServletResponse response) {
        chartStorageService.loadModel(response);
    }

}
