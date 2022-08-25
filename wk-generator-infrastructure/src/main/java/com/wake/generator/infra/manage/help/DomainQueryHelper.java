package com.wake.generator.infra.manage.help;


import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wake.generator.client.manage.api.query.DomainQuery;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DomainQueryHelper {

    @Resource
    private DomainMapper domainMapper;

    /**
     * 分页查询
     *
     * @param query 查询条件
     * @return 分页结果
     */
    public IPage<DomainDO> selectPage(DomainQuery query) {
        LambdaQueryWrapper<DomainDO> queryWrapper = getQueryWrapper(query);
        IPage<DomainDO> page = new Page<>(query.getPageNo(), query.getPageSize());
        return domainMapper.selectPage(page, queryWrapper);
    }

    /**
     * 组装查询条件wrapper
     *
     * @param query 查询条件
     * @return LambdaQueryWrapper<DomainDo>
     */
    private LambdaQueryWrapper<DomainDO> getQueryWrapper(DomainQuery query) {
        LambdaQueryWrapper<DomainDO> queryWrapper = new LambdaQueryWrapper<>();
        if (query.getProjectId() != null) {
            queryWrapper.eq(DomainDO::getProjectId, query.getProjectId());
        }
        if (ObjectUtil.isNotEmpty(query.getDomainPackage())) {
            queryWrapper.like(DomainDO::getDomainPackage, query.getDomainPackage());
        }
        if (ObjectUtil.isNotEmpty(query.getDomainName())) {
            queryWrapper.like(DomainDO::getDomainName, query.getDomainName());
        }
        if (ObjectUtil.isNotEmpty(query.getAuthor())) {
            queryWrapper.like(DomainDO::getAuthor, query.getAuthor());
        }
        queryWrapper.orderByDesc(DomainDO::getId);
        return queryWrapper;
    }

}
