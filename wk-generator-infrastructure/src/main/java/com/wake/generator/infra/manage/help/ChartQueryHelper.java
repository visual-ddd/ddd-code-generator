package com.wake.generator.infra.manage.help;


import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wake.generator.client.manage.api.query.ChartQuery;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
public class ChartQueryHelper {

    @Resource
    private ChartMapper chartMapper;

    /**
     * 分页查询
     *
     * @param query 查询条件
     * @return 分页结果
     */
    public IPage<ChartDO> selectPage(ChartQuery query) {
        LambdaQueryWrapper<ChartDO> queryWrapper = getQueryWrapper(query);
        IPage<ChartDO> page = new Page<>(query.getPageNo(), query.getPageSize());
        return chartMapper.selectPage(page, queryWrapper);
    }

    /**
     * 组装查询条件wrapper
     *
     * @param query 查询条件
     * @return LambdaQueryWrapper<ChartDo>
     */
    private static LambdaQueryWrapper<ChartDO> getQueryWrapper(ChartQuery query) {
        LambdaQueryWrapper<ChartDO> queryWrapper = new LambdaQueryWrapper<>();
        if (query.getProjectId() != null) {
            queryWrapper.eq(ChartDO::getProjectId, query.getProjectId());
        }
        if (ObjectUtil.isNotEmpty(query.getDomainPackage())) {
            queryWrapper.like(ChartDO::getDomainPackage, query.getDomainPackage());
        }
        if (ObjectUtil.isNotEmpty(query.getChartName())) {
            queryWrapper.like(ChartDO::getChartName, query.getChartName());
        }
        if (ObjectUtil.isNotEmpty(query.getAuthor())) {
            queryWrapper.like(ChartDO::getAuthor, query.getAuthor());
        }
        queryWrapper.orderByDesc(ChartDO::getId);
        return queryWrapper;
    }

}
