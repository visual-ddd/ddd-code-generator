package com.wakedt.visual.domain.account.account.accountpasswordupdate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 修改用户密码-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class AccountPasswordUpdateCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountPasswordUpdateCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.accountPasswordUpdate(updateCmd);

        /* TODO CheckLoginPass(账号密码正确) 验证账号密码是否正确 */

        repository.update(account);

    }
}