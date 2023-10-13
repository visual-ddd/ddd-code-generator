package com.wakedt.visual.account.app.cmd.accountcreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.account.domain.account.*;

/**
 * 创建账号-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class AccountCreateCmdHandler {

    @Resource
    private AccountRepository repository;
    @Resource
    private AccountFactory factory;

    public Long handle(AccountCreateCmd createCmd) {
        Account entity = factory.getInstance(createCmd);

        /* TODO IsAccountExistsOrError(账号唯一) 邮箱为用户唯一标识，\n同一个邮箱不可重复注册 */

        Account newEntity = repository.save(entity);
        return newEntity.getId();
    }
}