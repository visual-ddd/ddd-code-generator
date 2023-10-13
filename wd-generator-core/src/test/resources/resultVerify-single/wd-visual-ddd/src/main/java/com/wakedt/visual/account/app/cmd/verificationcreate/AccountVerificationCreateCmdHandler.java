package com.wakedt.visual.account.app.cmd.verificationcreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.account.domain.accountverification.*;

/**
 * 创建验证码-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Component
public class AccountVerificationCreateCmdHandler {

    @Resource
    private AccountVerificationRepository repository;
    @Resource
    private AccountVerificationFactory factory;

    public Long handle(AccountVerificationCreateCmd createCmd) {
        AccountVerification entity = factory.getInstance(createCmd);

        /* TODO IsAccountExistsOrError(校验账号唯一标识是否存在) 校验账号唯一标识是否存在 */

        AccountVerification newEntity = repository.save(entity);
        return newEntity.getId();
    }
}