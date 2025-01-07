package com.wakedt.visual.bizdomain.account.app.cmd.accountremove;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.account.domain.account.*;

/**
 * 删除账号-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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