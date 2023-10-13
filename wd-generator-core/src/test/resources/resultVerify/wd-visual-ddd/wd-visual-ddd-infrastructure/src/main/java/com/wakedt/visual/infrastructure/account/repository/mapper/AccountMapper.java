package com.wakedt.visual.infrastructure.account.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.client.account.query.AccountPageQuery;

/**
 * AccountMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountDO> {

    /**
     * 查询账号详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    AccountDO accountDetailQuery(AccountDetailQuery query);

    /**
     * 分页查询账号
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<AccountDO> accountPageQuery(AccountPageQuery pageQuery);

}