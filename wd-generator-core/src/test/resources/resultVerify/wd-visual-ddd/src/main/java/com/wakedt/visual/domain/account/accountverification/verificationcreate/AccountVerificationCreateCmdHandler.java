package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import com.wakedt.visual.domain.account.accountverification.AccountVerification;
import com.wakedt.visual.domain.account.accountverification.AccountVerificationFactory;
import com.wakedt.visual.domain.account.accountverification.AccountVerificationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 创建验证码-指令处理器
 */
@Component
public class AccountVerificationCreateCmdHandler {

    @Resource
    private AccountVerificationRepository repository;
    @Resource
    private AccountVerificationFactory factory;

    public Long handle(AccountVerificationCreateCmd createCmd) {
        AccountVerification entity = factory.getInstance(createCmd);

        /* TODO IsAccountExistsOrError(校验账号唯一标识是否存在) 校验账号唯一标识是否存在 */

        AccountVerification newEntity = repository.save(entity);

       // DomainEventPublisher.getInstance().postAfterCommit(new AccountVerificationCreateEvent(createCmd));
        return newEntity.getId();
    }
}