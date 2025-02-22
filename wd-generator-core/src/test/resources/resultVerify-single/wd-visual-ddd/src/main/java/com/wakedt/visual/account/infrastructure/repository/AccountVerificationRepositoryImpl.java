package com.wakedt.visual.account.infrastructure.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.account.domain.accountverification.AccountVerification;
import com.wakedt.visual.account.domain.accountverification.AccountVerificationRepository;
import com.wakedt.visual.account.infrastructure.repository.model.AccountVerificationDO;
import com.wakedt.visual.account.infrastructure.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.account.infrastructure.assembler.AccountVerification2AccountVerificationDOConvert;

/**
 * AccountVerification-聚合仓储实现类
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Slf4j
@Component
public class AccountVerificationRepositoryImpl implements AccountVerificationRepository {

    @Resource
    private AccountVerificationMapper accountVerificationMapper;

    @Override
    public AccountVerification save(AccountVerification accountVerification) {
        AccountVerificationDO accountVerificationDO = AccountVerification2AccountVerificationDOConvert.INSTANCE.dto2Do(accountVerification);
        int insert = accountVerificationMapper.insert(accountVerificationDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return AccountVerification2AccountVerificationDOConvert.INSTANCE.do2Dto(accountVerificationDO);
    }

    @Override
    public AccountVerification update(AccountVerification accountVerification) {
        AccountVerificationDO accountVerificationDO = AccountVerification2AccountVerificationDOConvert.INSTANCE.dto2Do(accountVerification);
        int update = accountVerificationMapper.updateById(accountVerificationDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return AccountVerification2AccountVerificationDOConvert.INSTANCE.do2Dto(accountVerificationDO);
    }

    @Override
    public void remove(AccountVerification accountVerification) {
        AccountVerificationDO accountVerificationDO = AccountVerification2AccountVerificationDOConvert.INSTANCE.dto2Do(accountVerification);
        accountVerificationMapper.deleteById(accountVerificationDO.getId());
    }

    @Override
    public AccountVerification find(Long id) {
        AccountVerificationDO result = accountVerificationMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return AccountVerification2AccountVerificationDOConvert.INSTANCE.do2Dto(result);
    }
}
