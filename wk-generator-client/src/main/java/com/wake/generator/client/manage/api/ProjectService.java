package com.wake.generator.client.manage.api;

import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.client.manage.dto.ProjectDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import java.util.List;

/**
 * 项目管理服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
public interface ProjectService {

    ResultDTO<Long> createProject(ProjectDto projectDto);

    ResultDTO<Boolean> removeProject(List<Long> projectIds);

    ResultDTO<Boolean> modifyProject(ProjectDto projectDto);

    ResultDTO<ProjectDto> detailProject(Long projectId);

    PageResultDTO<List<ProjectDto>> pageQueryProject(ProjectQuery projectQuery);

}

