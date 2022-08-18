package com.wake.generator.infra.manage.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wake.generator.infra.manage.repository.model.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户mapper接口
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
