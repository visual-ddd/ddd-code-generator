package com.wakedt.visual.account.domain.account;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.app.cmd.accountcreate.AccountCreateCmd;

/**
 * 账号-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
