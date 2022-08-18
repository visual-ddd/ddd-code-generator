package com.wake.generator.infra.manage.help;


import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.infra.manage.repository.mapper.ProjectMapper;
import com.wake.generator.infra.manage.repository.model.ProjectDO;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProjectQueryHelper {

    @Resource
    private ProjectMapper projectMapper;

    /**
     * 分页查询
     *
     * @param query 查询条件
     * @return 分页结果
     */
    public IPage<ProjectDO> selectPage(ProjectQuery query) {
        LambdaQueryWrapper<ProjectDO> queryWrapper = getQueryWrapper(query);
        IPage<ProjectDO> page = new Page<>(query.getPageNo(), query.getPageSize());
        return projectMapper.selectPage(page, queryWrapper);
    }

    /**
     * 组装查询条件wrapper
     *
     * @param query 查询条件
     * @return LambdaQueryWrapper<ProjectDO>
     */
    private static LambdaQueryWrapper<ProjectDO> getQueryWrapper(ProjectQuery query) {
        LambdaQueryWrapper<ProjectDO> queryWrapper = new LambdaQueryWrapper<>();
        if (query.getUserId() != null) {
            queryWrapper.eq(ProjectDO::getUserId, query.getUserId());
        }
        if (ObjectUtil.isNotEmpty(query.getGroupPackage())) {
            queryWrapper.like(ProjectDO::getGroupPackage, query.getGroupPackage());
        }
        if (ObjectUtil.isNotEmpty(query.getProjectName())) {
            queryWrapper.like(ProjectDO::getProjectName, query.getProjectName());
        }
        if (ObjectUtil.isNotEmpty(query.getProjectVersion())) {
            queryWrapper.like(ProjectDO::getProjectVersion, query.getProjectVersion());
        }
        queryWrapper.orderByDesc(ProjectDO::getId);
        return queryWrapper;
    }

}
