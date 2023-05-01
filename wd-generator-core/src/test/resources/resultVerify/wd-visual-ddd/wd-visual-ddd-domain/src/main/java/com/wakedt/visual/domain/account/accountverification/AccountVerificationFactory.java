package com.wakedt.visual.domain.account.accountverification;

import java.util.*;
import java.math.*;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;

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
