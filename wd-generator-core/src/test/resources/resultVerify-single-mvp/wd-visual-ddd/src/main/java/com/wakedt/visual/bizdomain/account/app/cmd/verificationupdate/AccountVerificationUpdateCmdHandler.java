package com.wakedt.visual.bizdomain.account.app.cmd.verificationupdate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.account.domain.accountverification.*;

/**
 * 更新验证码-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class AccountVerificationUpdateCmdHandler {

    @Resource
    private AccountVerificationRepository repository;

    public void handle(AccountVerificationUpdateCmd updateCmd) {
        AccountVerification accountVerification = repository.find(updateCmd.getId());
        accountVerification.verificationUpdate(updateCmd);

        repository.update(accountVerification);
    }
}