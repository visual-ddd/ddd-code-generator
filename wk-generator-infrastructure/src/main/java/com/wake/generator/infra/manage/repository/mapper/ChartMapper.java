package com.wake.generator.infra.manage.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 领域图谱
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@Mapper
public interface ChartMapper extends BaseMapper<ChartDO> {
}
