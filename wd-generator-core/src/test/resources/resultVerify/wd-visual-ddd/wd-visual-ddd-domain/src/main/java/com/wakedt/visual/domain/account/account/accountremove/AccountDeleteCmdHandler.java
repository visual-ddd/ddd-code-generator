package com.wakedt.visual.domain.account.account.accountremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 删除账号-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class AccountDeleteCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountDeleteCmd removeCmd) {
        log.info("删除账号-指令处理器:{}", removeCmd);

        Account account = repository.find(removeCmd.getId());
        account.accountRemove(removeCmd);

        repository.remove(account);

    }
}