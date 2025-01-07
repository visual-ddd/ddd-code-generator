package com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.bizdomain.account.client.request.AccountDetailQuery;
import com.wakedt.visual.bizdomain.account.client.request.AccountPageQuery;

/**
 * AccountMapper接口
 *
 * @author visual-ddd
 * @since 1.0
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