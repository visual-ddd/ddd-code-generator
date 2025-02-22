package com.wakedt.visual.infrastructure.account.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.account.accountverification.AccountVerification;
import com.wakedt.visual.domain.account.accountverification.AccountVerificationRepository;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.infrastructure.account.assembler.AccountVerification2AccountVerificationDOConvert;

/**
 * 账号验证码-聚合仓储实现类
 *
 * @author shimmer
 * @since 1.0
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
        AccountVerificationDO result = Optional.ofNullable(accountVerificationMapper.selectById(id))
                .orElseThrow(() -> new BizException(CommonResultCode.NOT_EXISTS));
        return AccountVerification2AccountVerificationDOConvert.INSTANCE.do2Dto(result);
    }
}