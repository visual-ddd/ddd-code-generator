package com.wakedt.visual.infrastructure.account.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;

/**
 * AccountVerificationMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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