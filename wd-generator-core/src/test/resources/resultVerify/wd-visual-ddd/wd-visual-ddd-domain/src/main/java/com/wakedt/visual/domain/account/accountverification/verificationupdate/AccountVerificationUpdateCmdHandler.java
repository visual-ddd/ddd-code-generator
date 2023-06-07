package com.wakedt.visual.domain.account.accountverification.verificationupdate;

import com.wakedt.visual.domain.account.accountverification.AccountVerification;
import com.wakedt.visual.domain.account.accountverification.AccountVerificationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 更新验证码-指令处理器
 */
@Component
public class AccountVerificationUpdateCmdHandler {

    @Resource
    private AccountVerificationRepository repository;

    public void handle(AccountVerificationUpdateCmd updateCmd) {
        AccountVerification accountVerification = repository.find(updateCmd.getId());
        accountVerification.verificationUpdate(updateCmd);

        repository.update(accountVerification);

       // DomainEventPublisher.getInstance().postAfterCommit(new AccountVerificationUpdateEvent(updateCmd));
    }
}