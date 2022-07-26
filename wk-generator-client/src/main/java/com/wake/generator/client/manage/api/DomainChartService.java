package com.wake.generator.client.manage.api;

import com.wake.generator.client.manage.dto.ChartDto;
import com.wake.generator.client.manage.dto.DomainChartDto;

/**
 * 领域图谱管理服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:35
 * @since 1.0
 */
public interface DomainChartService {

    /**
     * 新增
     *
     * @param chartDto 领域图谱
     * @return 插入结果
     */
    Boolean save(ChartDto chartDto);

    /**
     * 新增
     *
     * @param chartDto 领域图谱
     * @return 插入结果
     */
    Long insertDomainChart(DomainChartDto chartDto);
}
