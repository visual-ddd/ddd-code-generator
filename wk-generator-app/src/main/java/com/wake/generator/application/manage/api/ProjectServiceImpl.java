package com.wake.generator.application.manage.api;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wake.generator.client.manage.api.ProjectService;
import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.client.manage.dto.ProjectDto;
import com.wake.generator.infra.manage.help.ProjectQueryHelper;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.mapper.ProjectMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import com.wake.generator.infra.manage.repository.model.ProjectDO;
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
 * 项目服务实现类
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Resource
    private DomainMapper domainMapper;

    @Resource
    private ChartMapper chartMapper;

    @Resource
    private FileStorageService fileStorageService;

    @Resource
    private ProjectQueryHelper projectQueryHelper;

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
        // 删除项目下所有领域和图谱
        List<DomainDO> domainDOList = domainMapper.selectList(
            new LambdaQueryWrapper<DomainDO>().in(DomainDO::getProjectId, projectIds));
        List<Long> domainIds = domainDOList.stream().map(DomainDO::getId)
            .collect(Collectors.toCollection(ArrayList::new));
        if (CollectionUtil.isNotEmpty(domainIds)) {
            removeDomainCharts(domainIds);
        }
        projectMapper.deleteBatchIds(projectIds);
        return ResultDTO.success(Boolean.TRUE);
    }

    private void removeDomainCharts(List<Long> domainIds) {
        List<ChartDO> chartDOList = chartMapper.selectList(
            new LambdaQueryWrapper<ChartDO>().in(ChartDO::getDomainId, domainIds));
        List<String> fileKeyList = chartDOList.stream().map(ChartDO::getFileKey)
            .collect(Collectors.toCollection(ArrayList::new));
        List<Long> chartIds = chartDOList.stream().map(ChartDO::getId)
            .collect(Collectors.toCollection(ArrayList::new));
        fileKeyList.forEach(
            fileKey -> fileStorageService.deleteFile(BucketEnum.MATERIAL, fileKey));
        chartMapper.deleteBatchIds(chartIds);
        domainMapper.deleteBatchIds(domainIds);
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
