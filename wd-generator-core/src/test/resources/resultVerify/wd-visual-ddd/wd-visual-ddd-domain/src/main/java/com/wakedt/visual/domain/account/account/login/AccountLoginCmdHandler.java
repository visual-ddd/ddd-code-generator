package com.wakedt.visual.domain.account.account.login;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 账号登录-指令处理器
 */
@Component
public class AccountLoginCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountLoginCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.login(updateCmd);

        // TODO CheckLoginPass(账号密码正确) 验证账号密码是否正确

        repository.update(account);

//        DomainEventPublisher.getInstance().postAfterCommit(new AccountLoginEvent(updateCmd));
    }
}