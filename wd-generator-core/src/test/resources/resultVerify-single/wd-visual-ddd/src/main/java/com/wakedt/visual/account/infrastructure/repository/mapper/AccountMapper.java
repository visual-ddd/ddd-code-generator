package com.wakedt.visual.account.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.account.client.query.AccountDetailQuery;
import com.wakedt.visual.account.client.query.AccountPageQuery;

/**
 * AccountMapper接口
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountDO> {

    /** 账号详情查询对象 */
    AccountDO accountDetailQuery(AccountDetailQuery query);

    /** 账号分页查询对象 */
    List<AccountDO> accountPageQuery(AccountPageQuery pageQuery);

}