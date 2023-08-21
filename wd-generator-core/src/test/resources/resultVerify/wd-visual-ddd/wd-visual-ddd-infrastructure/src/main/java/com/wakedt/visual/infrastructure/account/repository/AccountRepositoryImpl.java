package com.wakedt.visual.infrastructure.account.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.account.account.Account;
import com.wakedt.visual.domain.account.account.AccountRepository;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountMapper;
import com.wakedt.visual.infrastructure.account.assembler.Account2AccountDOConvert;

/**
 * Account-聚合仓储实现类
 */
@Slf4j
@Component
public class AccountRepositoryImpl implements AccountRepository {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account save(Account account) {
        AccountDO accountDO = Account2AccountDOConvert.INSTANCE.dto2Do(account);
        int insert = accountMapper.insert(accountDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return Account2AccountDOConvert.INSTANCE.do2Dto(accountDO);
    }

    @Override
    public Account update(Account account) {
        AccountDO accountDO = Account2AccountDOConvert.INSTANCE.dto2Do(account);
        int update = accountMapper.updateById(accountDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return Account2AccountDOConvert.INSTANCE.do2Dto(accountDO);
    }

    @Override
    public void remove(Account account) {
        AccountDO accountDO = Account2AccountDOConvert.INSTANCE.dto2Do(account);
        accountMapper.deleteById(accountDO.getId());
    }

    @Override
    public Account find(Long id) {
        AccountDO result = accountMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return Account2AccountDOConvert.INSTANCE.do2Dto(result);
    }
}
