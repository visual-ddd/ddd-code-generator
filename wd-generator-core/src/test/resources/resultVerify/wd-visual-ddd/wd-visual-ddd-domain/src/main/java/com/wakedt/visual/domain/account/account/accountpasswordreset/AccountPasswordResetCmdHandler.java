package com.wakedt.visual.domain.account.account.accountpasswordreset;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

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

//        DomainEventPublisher.getInstance().postAfterCommit(new AccountPasswordResetEvent(updateCmd));
    }
}