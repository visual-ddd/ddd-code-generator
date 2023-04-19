package com.wakedt.visual.infrastructure.account.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;

/**
 * AccountVerificationMapper接口
 */
@Mapper
public interface AccountVerificationMapper extends BaseMapper<AccountVerificationDO> {

    /** 查询账号验证码详情 */
    AccountVerificationDO accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}