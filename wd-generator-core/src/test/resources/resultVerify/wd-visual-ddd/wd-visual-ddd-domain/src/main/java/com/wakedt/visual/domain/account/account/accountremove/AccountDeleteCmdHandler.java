package com.wakedt.visual.domain.account.account.accountremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 删除账号-指令处理器
 */
@Component
public class AccountDeleteCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountDeleteCmd removeCmd) {
        Account account = repository.find(removeCmd.getId());
        account.accountRemove(removeCmd);

        repository.remove(account);

//        DomainEventPublisher.getInstance().postAfterCommit(new AccountDeleteEvent(removeCmd));
    }
}