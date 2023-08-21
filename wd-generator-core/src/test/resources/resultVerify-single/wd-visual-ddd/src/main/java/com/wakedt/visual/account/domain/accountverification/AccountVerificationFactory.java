package com.wakedt.visual.account.domain.accountverification;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.app.cmd.verificationcreate.AccountVerificationCreateCmd;

/**
 * 账号验证码-聚合根-工厂
 */
@Component
public class AccountVerificationFactory {

    public AccountVerification getInstance(AccountVerificationCreateCmd createCmd) {
        AccountVerification instance = new AccountVerification();
        instance.setCode(createCmd.getCode());
        instance.setAccountNo(createCmd.getAccountNo());
        return instance;
    }

}
