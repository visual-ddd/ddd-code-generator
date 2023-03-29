package com.wakedt.visual.domain.account.accountverification;

import java.util.List;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmd;

/**
 * 账号进行邮箱验证操作时，需要使用验证码进行验证-聚合根能力
 */
public class AccountVerification extends AbstractAccountVerification {

    public void verificationUpdate(AccountVerificationUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }
}