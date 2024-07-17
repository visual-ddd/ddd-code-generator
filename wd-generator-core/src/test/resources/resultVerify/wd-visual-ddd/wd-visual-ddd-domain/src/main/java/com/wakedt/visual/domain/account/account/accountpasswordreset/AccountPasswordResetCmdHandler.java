package com.wakedt.visual.domain.account.account.accountpasswordreset;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 重置用户密码-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class AccountPasswordResetCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountPasswordResetCmd updateCmd) {
        log.info("重置用户密码-指令处理器:{}", updateCmd);

        Account account = repository.find(updateCmd.getId());
        account.accountPasswordReset(updateCmd);

        repository.update(account);

    }
}