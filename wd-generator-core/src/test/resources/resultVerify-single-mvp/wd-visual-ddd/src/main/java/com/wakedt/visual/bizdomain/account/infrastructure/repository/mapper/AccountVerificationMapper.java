package com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountVerificationDO;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationDetailQuery;

/**
 * AccountVerificationMapper接口
 *
 * @author visual-ddd
 * @since 1.0
 */
@Mapper
public interface AccountVerificationMapper extends BaseMapper<AccountVerificationDO> {

    /**
     * 查询账号验证码详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    AccountVerificationDO accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}