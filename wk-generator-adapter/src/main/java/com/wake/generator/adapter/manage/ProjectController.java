package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.ProjectService;
import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.client.manage.dto.ProjectDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目页面管理
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@RequestMapping("/project/manage")
@RestController
public class ProjectController {

    @Resource
    ProjectService projectService;

    @PostMapping("/save")
    public ResultDTO<Long> save(@RequestBody ProjectDto projectDto) {
        return projectService.createProject(projectDto);
    }

    @GetMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestParam("projectIds") Long[] projectIds) {
        return projectService.removeProject(Arrays.asList(projectIds));
    }

    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody ProjectDto projectDto) {
        return projectService.modifyProject(projectDto);
    }

    @GetMapping("/detail")
    public ResultDTO<ProjectDto> detailProject(@RequestParam("projectId") Long projectId) {
        return projectService.detailProject(projectId);
    }

    @GetMapping("/page_query")
    public PageResultDTO<List<ProjectDto>> pageQueryProject(ProjectQuery projectQuery) {
        return projectService.pageQueryProject(projectQuery);
    }

}
