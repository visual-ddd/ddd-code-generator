package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.DomainChartService;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wake.generator.client.manage.dto.DomainChartDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 领域图谱页面管理
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@RequestMapping("/code/manage")
@RestController
public class DomainChartController {

    @Resource
    DomainChartService domainChartService;

    @RequestMapping("/insert")
    public void insert(@RequestBody ChartDto chartDto) {
        domainChartService.save(chartDto);
    }

    @RequestMapping("/insertChart")
    public Long insertChart(@RequestBody DomainChartDto domainChartDto) {
        return domainChartService.insertDomainChart(domainChartDto);
    }

}
