package com.wake.generator.adapter.manage;

import com.wake.generator.client.manage.api.ProjectService;
import com.wake.generator.client.manage.api.query.ProjectQuery;
import com.wake.generator.client.manage.dto.ProjectDto;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/modify")
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
