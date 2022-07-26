package com.wake.generator.application.manage.api;

import com.alibaba.fastjson.JSON;
import com.wake.generator.application.manage.convert.AggregationConvert;
import com.wake.generator.application.manage.convert.ChartConvert;
import com.wake.generator.application.manage.convert.DomainChartConvert;
import com.wake.generator.application.manage.convert.ValueObjectConvert;
import com.wake.generator.client.manage.api.DomainChartService;
import com.wake.generator.client.manage.dto.AggregationDto;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wake.generator.client.manage.dto.DomainChartDto;
import com.wake.generator.client.manage.dto.ValueObjectDto;
import com.wake.generator.infra.manage.repository.mapper.AggregationMapper;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainChartMapper;
import com.wake.generator.infra.manage.repository.mapper.ValueObjectMapper;
import com.wake.generator.infra.manage.repository.model.AggregationDo;
import com.wake.generator.infra.manage.repository.model.ChartDo;
import com.wake.generator.infra.manage.repository.model.DomainChartDo;
import com.wake.generator.infra.manage.repository.model.ValueObjectDo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 管理服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@Service
public class DomainChartServiceImpl implements DomainChartService {

    @Resource
    ChartMapper chartMapper;

    @Resource
    AggregationMapper aggregationMapper;

    @Resource
    ValueObjectMapper valueObjectMapper;

    @Resource
    DomainChartMapper domainChartMapper;

    @Override
    public Boolean save(ChartDto chartDto) {
        ChartDo chartDo = ChartConvert.MAPPER.dto2entity(chartDto);
        chartMapper.insert(chartDo);
        Long chartId = chartDo.getId();

        // 缓存聚合id
        HashMap<String, Long> colorMap = new HashMap<>(5);

        // 聚合
        List<AggregationDto> aggregations = chartDto.getAggregations();
        List<AggregationDo> aggregationDos = AggregationConvert.MAPPER.dtoList2entityList(aggregations);
        for (AggregationDo aggregationDo : aggregationDos) {
            aggregationDo.setChartId(chartId);
            aggregationMapper.insert(aggregationDo);
            colorMap.put(aggregationDo.getColor(), aggregationDo.getId());
        }

        // 值对象
        List<ValueObjectDto> valueObjects = chartDto.getValueObjects();
        List<ValueObjectDo> valueObjectDos = ValueObjectConvert.MAPPER.dtoList2entityList(valueObjects);
        for (ValueObjectDo valueObjectDo : valueObjectDos) {
            Long aggregationId = colorMap.get(valueObjectDo.getColor());
            valueObjectDo.setAggregationId(aggregationId);
            valueObjectDo.setChartId(chartId);
            valueObjectMapper.insert(valueObjectDo);
        }

        // TODO: 插入故事节点

        return Boolean.TRUE;
    }

    @Override
    public Long insertDomainChart(DomainChartDto chartDto) {
        String jsonInfo = JSON.toJSONString(chartDto);
        DomainChartDo domainChartDo = DomainChartConvert.MAPPER.dto2entity(chartDto);
        domainChartDo.setJsonInfo(jsonInfo);
        domainChartMapper.insert(domainChartDo);
        return domainChartDo.getId();
    }


}
