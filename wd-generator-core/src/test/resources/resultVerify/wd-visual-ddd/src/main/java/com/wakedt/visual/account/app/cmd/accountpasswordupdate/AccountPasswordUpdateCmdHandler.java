package com.wakedt.visual.account.app.cmd.accountpasswordupdate;

import com.wakedt.visual.account.domain.account.Account;
import com.wakedt.visual.account.domain.account.AccountRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 修改用户密码-指令处理器
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