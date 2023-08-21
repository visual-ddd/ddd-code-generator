package com.wakedt.visual.account.app.cmd.accountremove;

import com.wakedt.visual.account.domain.account.Account;
import com.wakedt.visual.account.domain.account.AccountRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    }
}