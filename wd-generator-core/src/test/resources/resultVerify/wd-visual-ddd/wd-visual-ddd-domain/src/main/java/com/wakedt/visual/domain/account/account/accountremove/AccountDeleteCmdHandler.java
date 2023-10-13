package com.wakedt.visual.domain.account.account.accountremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 删除账号-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Component
public class AccountDeleteCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountDeleteCmd removeCmd) {
        Account account = repository.find(removeCmd.getId());
        account.accountRemove(removeCmd);

        repository.remove(account);

    }
}