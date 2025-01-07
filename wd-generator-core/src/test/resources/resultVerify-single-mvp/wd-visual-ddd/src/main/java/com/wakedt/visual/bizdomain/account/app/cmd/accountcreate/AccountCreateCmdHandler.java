package com.wakedt.visual.bizdomain.account.app.cmd.accountcreate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.account.domain.account.*;

/**
 * 创建账号-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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