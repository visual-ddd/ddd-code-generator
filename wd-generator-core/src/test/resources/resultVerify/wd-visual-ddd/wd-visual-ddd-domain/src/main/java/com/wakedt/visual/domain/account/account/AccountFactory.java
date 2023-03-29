package com.wakedt.visual.domain.account.account;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.account.account.accountcreate.AccountCreateCmd;

/**
 * 用户的唯一标识，用于平台登录-聚合根-工厂
 */
@Component
public class AccountFactory {

    public Account getInstance(AccountCreateCmd createCmd) {
        Account instance = new Account();
        instance.setUserName(createCmd.getUserName());
        instance.setAccountNo(createCmd.getAccountNo());
        instance.setPassword(createCmd.getPassword());
        instance.setIcon(createCmd.getIcon());
        return instance;
    }

}
