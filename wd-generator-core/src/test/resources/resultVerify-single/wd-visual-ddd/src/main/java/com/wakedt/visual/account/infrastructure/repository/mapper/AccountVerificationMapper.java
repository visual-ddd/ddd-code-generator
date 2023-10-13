package com.wakedt.visual.account.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.account.infrastructure.repository.model.AccountVerificationDO;
import com.wakedt.visual.account.client.query.AccountVerificationDetailQuery;

/**
 * AccountVerificationMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Mapper
public interface AccountVerificationMapper extends BaseMapper<AccountVerificationDO> {

    /**
      * 账号验证码详情查询对象
      */
    AccountVerificationDO accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}