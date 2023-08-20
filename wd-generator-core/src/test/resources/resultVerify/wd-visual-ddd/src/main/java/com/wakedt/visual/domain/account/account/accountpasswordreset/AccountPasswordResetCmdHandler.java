package com.wakedt.visual.domain.account.account.accountpasswordreset;

import com.wakedt.visual.domain.account.account.Account;
import com.wakedt.visual.domain.account.account.AccountRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 重置用户密码-指令处理器
 */
@Component
public class AccountPasswordResetCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountPasswordResetCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.accountPasswordReset(updateCmd);

        repository.update(account);

       // DomainEventPublisher.getInstance().postAfterCommit(new AccountPasswordResetEvent(updateCmd));
    }
}