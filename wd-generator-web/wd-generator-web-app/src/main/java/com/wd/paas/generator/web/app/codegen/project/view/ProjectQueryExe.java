package com.wd.paas.generator.web.app.codegen.project.view;

import com.wakedata.common.core.dto.PageQuery;
import com.wakedata.common.core.dto.ResultDTO;
import com.wd.paas.generator.web.app.codegen.project.assember.ProjectDTOConvert;
import com.wd.paas.generator.web.client.codegen.project.dto.ProjectDTO;
import com.wd.paas.generator.web.client.codegen.project.query.ProjectQuery;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.ProjectMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * 查询项目详情-查询器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class ProjectQueryExe {

    @Resource
    private ProjectMapper projectMapper;

    public ResultDTO<ProjectDTO> execute(ProjectQuery query) {
        ProjectDO projectDO = projectMapper.selectById(query.getId());
        ResultDTO<ProjectDTO> resultDTO = ResultDTO.success();
        resultDTO.setData(ProjectDTOConvert.INSTANCE.do2Dto(projectDO));
        return resultDTO;
    }
}
