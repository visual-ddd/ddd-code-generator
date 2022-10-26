package com.wd.paas.generator.web.app.codegen.project.view;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wd.paas.generator.web.app.codegen.project.assember.ProjectDTOConvert;
import com.wd.paas.generator.web.client.codegen.project.dto.ProjectDTO;
import com.wd.paas.generator.web.client.codegen.project.query.ProjectPageQuery;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.ProjectMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 分页查询项目信息-分页查询器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectPageQueryExe {

    @Resource
    ProjectMapper projectMapper;

    public PageResultDTO<List<ProjectDTO>> execute(ProjectPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        LambdaQueryWrapper<ProjectDO> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotEmpty(pageQuery.getProjectName())) {
            queryWrapper.eq(ProjectDO::getProjectName, pageQuery.getProjectName());
        }

        List<ProjectDO> projectDOS = projectMapper.selectList(queryWrapper);
        List<ProjectDTO> projectDTOList = ProjectDTOConvert.INSTANCE.doList2DtoList(projectDOS);

        PageInfo<ProjectDTO> pageInfo = new PageInfo<>(projectDTOList);
        PageResultDTO<List<ProjectDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(pageInfo.getList());
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}
