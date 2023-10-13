package com.wakedt.visual.account.app.cmd.accountmodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.account.domain.account.*;

/**
 * 更新账号基本信息-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class AccountModifyCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountModifyCmd updateCmd) {
        Account account = repository.find(updateCmd.getId());
        account.accountModify(updateCmd);

        /* TODO IsAccountExistsOrError(账号唯一) 邮箱为用户唯一标识，同一个邮箱不可重复注册 */

        repository.update(account);
    }
}