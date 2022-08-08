package com.wake.generator.application.manage.api;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wake.generator.client.manage.api.ProjectService;
import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.client.manage.dto.ProjectDto;
import com.wake.generator.infra.manage.help.ProjectQueryHelper;
import com.wake.generator.infra.manage.repository.mapper.ProjectMapper;
import com.wake.generator.infra.manage.repository.model.ProjectDO;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.util.BeanUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    ProjectMapper projectMapper;

    @Resource
    ProjectQueryHelper projectQueryHelper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Long> createProject(ProjectDto projectDto) {
        ProjectDO projectDO = BeanUtil.copy(projectDto, ProjectDO.class);
        projectMapper.insert(projectDO);
        return ResultDTO.success(projectDO.getId());
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> removeProject(List<Long> projectIds) {
        projectMapper.deleteBatchIds(projectIds);
        return ResultDTO.success(Boolean.TRUE);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> modifyProject(ProjectDto projectDto) {
        projectMapper.updateById(BeanUtil.copy(projectDto, ProjectDO.class));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<ProjectDto> detailProject(Long projectId) {
        ProjectDO projectDO = projectMapper.selectById(projectId);
        return ResultDTO.success(BeanUtil.copy(projectDO, ProjectDto.class));
    }

    @Override
    public PageResultDTO<List<ProjectDto>> pageQueryProject(ProjectQuery query) {
        IPage<ProjectDO> iPage = projectQueryHelper.selectPage(query);
        PageResultDTO<List<ProjectDto>> result = new PageResultDTO<>();
        result.setPageNo(query.getPageNo());
        result.setPageSize(query.getPageSize());
        result.setCursor(iPage.getCurrent());
        result.setTotalCount(iPage.getTotal());
        List<ProjectDto> dataList = ObjectUtil.isEmpty(iPage.getRecords()) ?
                Collections.emptyList() : BeanUtil.copyList(iPage.getRecords(), ProjectDto.class);
        result.setData(dataList);
        return result;
    }

}
