package com.wake.generator.application.manage.api;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wake.generator.application.manage.config.FileKeyConfig;
import com.wake.generator.client.manage.api.DomainService;
import com.wake.generator.client.manage.api.query.DomainQuery;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wake.generator.client.manage.dto.DomainDto;
import com.wake.generator.infra.manage.help.DomainQueryHelper;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.util.BeanUtil;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.service.FileStorageService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 领域服务实现类
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Service
public class DomainServiceImpl implements DomainService {

    @Resource
    private DomainMapper domainMapper;

    @Resource
    private ChartMapper chartMapper;

    @Resource
    private DomainQueryHelper domainQueryHelper;

    @Resource
    private FileStorageService fileStorageService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Long> createDomain(DomainDto domainDto) {
        DomainDO domainDO = BeanUtil.copy(domainDto, DomainDO.class);
        // 初始化图谱并关联当前领域
        domainDO.setChartId(getInitChartId());
        domainMapper.insert(domainDO);
        return ResultDTO.success(domainDO.getId());
    }

    /**
     * 获取初始图谱模版id
     *
     * @return 初始图谱模版id
     */
    private Long getInitChartId() {
        List<ChartDO> chartDOList = chartMapper.selectList(
            new LambdaQueryWrapper<ChartDO>().eq(ChartDO::getDomainId, 0L));
        if (CollectionUtil.isNotEmpty(chartDOList)) {
            return chartDOList.get(0).getId();
        }
        ChartDO chartDO = new ChartDO();
        chartDO.setDomainId(0L);
        chartDO.setFileKey(FileKeyConfig.INIT_CHART_FILE_KEY);
        chartMapper.insert(chartDO);
        return chartDO.getId();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> removeDomain(List<Long> domainIds) {
        deleteChartsByDomain(domainIds);
        domainMapper.deleteBatchIds(domainIds);
        return ResultDTO.success(Boolean.TRUE);
    }

    /**
     * 删除领域下的图谱
     *
     * @param domainIds 领域id
     */
    private void deleteChartsByDomain(List<Long> domainIds) {
        List<ChartDO> chartDOList = chartMapper.selectList(
            new LambdaQueryWrapper<ChartDO>().in(ChartDO::getDomainId, domainIds));
        List<String> fileKeyList = chartDOList.stream().map(ChartDO::getFileKey)
            .collect(Collectors.toCollection(ArrayList::new));
        List<Long> chartIds = chartDOList.stream().map(ChartDO::getId)
            .collect(Collectors.toCollection(ArrayList::new));
        fileKeyList.forEach(fileKey -> fileStorageService.deleteFile(BucketEnum.MATERIAL, fileKey));
        if (CollectionUtil.isNotEmpty(chartIds)) {
            chartMapper.deleteBatchIds(chartIds);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> modifyDomain(DomainDto domainDto) {
        domainMapper.updateById(BeanUtil.copy(domainDto, DomainDO.class));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<DomainDto> detailDomain(Long domainId) {
        DomainDO domainDO = domainMapper.selectById(domainId);
        DomainDto domainDto = BeanUtil.copy(domainDO, DomainDto.class);
        setChartDto(domainDto);
        return ResultDTO.success(domainDto);
    }

    @Override
    public PageResultDTO<List<DomainDto>> pageQueryDomain(DomainQuery query) {
        IPage<DomainDO> iPage = domainQueryHelper.selectPage(query);
        PageResultDTO<List<DomainDto>> result = new PageResultDTO<>();
        result.setPageNo(query.getPageNo());
        result.setPageSize(query.getPageSize());
        result.setCursor(iPage.getCurrent());
        result.setTotalCount(iPage.getTotal());
        List<DomainDto> dataList = ObjectUtil.isEmpty(iPage.getRecords()) ?
            Collections.emptyList() : BeanUtil.copyList(iPage.getRecords(), DomainDto.class);
        dataList.forEach(this::setChartDto);
        result.setData(dataList);
        return result;
    }

    private void setChartDto(DomainDto domainDto) {
        if (domainDto == null) {
            return;
        }
        ChartDO chartDO = chartMapper.selectById(domainDto.getChartId());
        ChartDto chartDto = BeanUtil.copy(chartDO, ChartDto.class);
        domainDto.setChartDto(chartDto);
    }

}
