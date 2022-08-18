package com.wake.generator.application.manage.api;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wake.generator.client.manage.api.ChartService;
import com.wake.generator.client.manage.api.query.ChartQuery;
import com.wake.generator.client.manage.dto.ChartDto;
import com.wake.generator.infra.manage.help.ChartQueryHelper;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.util.BeanUtil;
import com.wakedata.common.storage.service.FileStorageService;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 图谱服务实现类
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Service
public class ChartServiceImpl implements ChartService {

    @Resource
    private ChartMapper chartMapper;

    @Resource
    private ChartQueryHelper chartQueryHelper;

    @Resource
    private FileStorageService fileStorageService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Long> createChart(ChartDto chartDto) {
        ChartDO chartDO = BeanUtil.copy(chartDto, ChartDO.class);
        chartMapper.insert(chartDO);
        return ResultDTO.success(chartDO.getId());
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> removeChart(List<Long> chartIds) {
        chartMapper.deleteBatchIds(chartIds);
        return ResultDTO.success(Boolean.TRUE);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> modifyChart(ChartDto chartDto) {
        chartMapper.updateById(BeanUtil.copy(chartDto, ChartDO.class));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<ChartDto> detailChart(Long chartId) {
        ChartDO chartDO = chartMapper.selectById(chartId);
        ChartDto chartDto = BeanUtil.copy(chartDO, ChartDto.class);
        return ResultDTO.success(chartDto);
    }

    @Override
    public PageResultDTO<List<ChartDto>> pageQueryChart(ChartQuery query) {
        IPage<ChartDO> iPage = chartQueryHelper.selectPage(query);
        PageResultDTO<List<ChartDto>> result = new PageResultDTO<>();
        result.setPageNo(query.getPageNo());
        result.setPageSize(query.getPageSize());
        result.setCursor(iPage.getCurrent());
        result.setTotalCount(iPage.getTotal());
        List<ChartDto> dataList = ObjectUtil.isEmpty(iPage.getRecords()) ?
            Collections.emptyList() : BeanUtil.copyList(iPage.getRecords(), ChartDto.class);
        result.setData(dataList);
        return result;
    }

}
