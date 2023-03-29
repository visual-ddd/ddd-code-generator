package com.wakedt.visual.infrastructure.account.repository.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.client.account.query.AccountPageQuery;

/**
 * AccountMapper接口
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountDO> {

    /** 查询账号详情 */
    AccountDO accountDetailQuery(AccountDetailQuery query);

    /** 分页查询账号 */
    List<AccountDO> accountPageQuery(AccountPageQuery pageQuery);

}