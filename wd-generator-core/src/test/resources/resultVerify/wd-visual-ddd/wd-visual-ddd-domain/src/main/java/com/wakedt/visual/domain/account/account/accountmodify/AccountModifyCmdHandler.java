package com.wakedt.visual.domain.account.account.accountmodify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.account.account.*;

/**
 * 更新账号基本信息-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class AccountModifyCmdHandler {

    @Resource
    private AccountRepository repository;

    public void handle(AccountModifyCmd updateCmd) {
        log.info("更新账号基本信息-指令处理器:{}", updateCmd);

        Account account = repository.find(updateCmd.getId());
        account.accountModify(updateCmd);

        /* TODO IsAccountExistsOrError(账号唯一) 邮箱为用户唯一标识，同一个邮箱不可重复注册 */

        repository.update(account);

    }
}