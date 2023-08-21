package com.wakedt.visual.account.domain.accountverification;

import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmd;

/**
 * 账号验证码-聚合根能力
 */
public class AccountVerification extends AbstractAccountVerification {

    public void verificationUpdate(AccountVerificationUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }
}