package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.ChartService;
import com.wake.generator.client.manage.api.query.ChartQuery;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

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
    ChartService chartService;

    @PostMapping("/save")
    public ResultDTO<Long> save(@RequestBody ChartDto chartDto) {
        return chartService.createChart(chartDto);
    }

    @GetMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestParam("chartIds") Long[] chartIds) {
        return chartService.removeChart(Arrays.asList(chartIds));
    }

    @GetMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody ChartDto chartDto) {
        return chartService.modifyChart(chartDto);
    }

    @GetMapping("/detail")
    public ResultDTO<ChartDto> detailChart(@RequestParam("chartId") Long chartId) {
        return chartService.detailChart(chartId);
    }

    @GetMapping("/page_query")
    public PageResultDTO<List<ChartDto>> pageQueryChart(ChartQuery chartQuery) {
        return chartService.pageQueryChart(chartQuery);
    }

}
