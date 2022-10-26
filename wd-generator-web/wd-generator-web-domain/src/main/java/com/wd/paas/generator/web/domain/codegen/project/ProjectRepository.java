package com.wd.paas.generator.web.domain.codegen.project;

import com.wd.paas.generator.convert.project.ProjectDTO;

/**
 * 项目-聚合根-仓储接口
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
public interface ProjectRepository {

    /**
     * 新增
     *
     * @param aggregation 聚合
     * @return 主键id
     */
    Long insertProject(Project aggregation);

    /**
     * 更新
     *
     * @param aggregation 聚合
     */
    void updateProject(Project aggregation);

    /**
     * 删除
     *
     * @param id 主键
     */
    void deleteProjectById(Long id);

    /**
     * 查询
     *
     * @param id 主键
     * @return 查询结果
     */
    Project selectProjectById(Long id);

    /**
     * 构建需要生成的项目
     * @param projectId 项目id
     * @return 生成项目模型
     */
    ProjectDTO buildProjectDTO(Long projectId);
}
