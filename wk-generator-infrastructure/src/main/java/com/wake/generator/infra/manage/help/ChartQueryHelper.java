package com.wake.generator.infra.manage.help;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wake.generator.client.manage.api.query.ChartQuery;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
    private LambdaQueryWrapper<ChartDO> getQueryWrapper(ChartQuery query) {
        LambdaQueryWrapper<ChartDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(ChartDO::getId);
        return queryWrapper;
    }

}
