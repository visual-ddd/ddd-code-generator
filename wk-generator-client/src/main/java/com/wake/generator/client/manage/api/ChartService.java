package com.wake.generator.client.manage.api;

import com.wake.generator.client.manage.api.query.ChartQuery;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;

import java.util.List;

/**
 * 图谱管理服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
public interface ChartService {

    ResultDTO<Long> createChart(ChartDto projectDto);

    ResultDTO<Boolean> removeChart(List<Long> projectIds);

    ResultDTO<Boolean> modifyChart(ChartDto projectDto);

    ResultDTO<ChartDto> detailChart(Long projectId);

    PageResultDTO<List<ChartDto>> pageQueryChart(ChartQuery projectQuery);

}

