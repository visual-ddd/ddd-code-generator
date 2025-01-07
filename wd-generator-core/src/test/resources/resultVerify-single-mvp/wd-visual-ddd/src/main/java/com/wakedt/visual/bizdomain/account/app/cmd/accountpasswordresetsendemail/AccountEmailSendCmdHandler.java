package com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordresetsendemail;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.account.domain.account.*;

/**
 * 发送重置密码邮件-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class AccountEmailSendCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountEmailSendCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.accountPasswordResetSendEmail(updateCmd);

        /* TODO UpdateAccountUuid(更新账号uuid) 更新重置账号uuid */

        /* TODO SendResetEmail(发送重置邮件) 发送重置密码邮件 */

        repository.update(account);
    }
}