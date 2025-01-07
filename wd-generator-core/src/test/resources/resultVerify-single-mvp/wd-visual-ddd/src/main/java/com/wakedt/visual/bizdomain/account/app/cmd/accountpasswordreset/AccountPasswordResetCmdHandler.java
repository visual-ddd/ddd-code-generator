package com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordreset;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.account.domain.account.*;

/**
 * 重置用户密码-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class AccountPasswordResetCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountPasswordResetCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.accountPasswordReset(updateCmd);

        repository.update(account);
    }
}