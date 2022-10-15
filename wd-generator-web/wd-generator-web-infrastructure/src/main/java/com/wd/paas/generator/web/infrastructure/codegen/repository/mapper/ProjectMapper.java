package com.wd.paas.generator.web.infrastructure.codegen.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.ProjectDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 项目Mapper接口
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Mapper
public interface ProjectMapper extends BaseMapper<ProjectDO> {

}
