package com.wakedt.visual.infrastructure.account.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * AccountVerificationMapper接口
 */
@Mapper
public interface AccountVerificationMapper extends BaseMapper<AccountVerificationDO> {

    /** 账号验证码详情查询对象 */
    AccountVerificationDO accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}