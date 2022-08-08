package com.wake.generator.infra.manage.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wake.generator.infra.manage.repository.model.ProjectDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 项目
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@Mapper
public interface ProjectMapper extends BaseMapper<ProjectDO> {

}
