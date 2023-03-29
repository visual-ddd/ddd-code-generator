package com.wakedt.visual.domain.account.accountverification;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;

/**
 * 账号进行邮箱验证操作时，需要使用验证码进行验证-聚合根-工厂
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
