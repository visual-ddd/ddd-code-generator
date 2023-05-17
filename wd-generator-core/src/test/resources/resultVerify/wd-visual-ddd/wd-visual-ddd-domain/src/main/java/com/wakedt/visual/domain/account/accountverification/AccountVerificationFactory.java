package com.wakedt.visual.domain.account.accountverification;

import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;
import org.springframework.stereotype.Component;

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
