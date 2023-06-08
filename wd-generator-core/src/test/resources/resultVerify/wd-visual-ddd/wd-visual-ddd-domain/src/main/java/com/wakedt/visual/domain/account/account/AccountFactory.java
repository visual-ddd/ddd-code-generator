package com.wakedt.visual.domain.account.account;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.account.account.accountcreate.AccountCreateCmd;

/**
 * 账号-聚合根-工厂
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
