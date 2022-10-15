package com.wd.paas.generator.web.infrastructure.codegen.repository;

import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.infrastructure.codegen.assembler.DomainChartDoConvert;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.DomainChartMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 领域图谱存储接口实现类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Slf4j
@Component
public class DomainChartRepositoryImpl implements DomainChartRepository {

    @Resource
    private DomainChartMapper mapper;

    @Override
    public Long insertDomainChart(DomainChart aggregation) {
        DomainChartDO aggregationDO = DomainChartDoConvert.INSTANCE.dto2Do(aggregation);
        mapper.insert(aggregationDO);
        return aggregationDO.getId();
    }

    @Override
    public void updateDomainChart(DomainChart aggregation) {
        mapper.updateById(DomainChartDoConvert.INSTANCE.dto2Do(aggregation));
    }

    @Override
    public void deleteDomainChartById(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public DomainChart selectDomainChartById(Long id) {
        return DomainChartDoConvert.INSTANCE.do2Dto(mapper.selectById(id));
    }
}
