package com.wakedt.visual.domain.account.accountverification;

import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmd;

/**
 * 账号验证码-聚合根能力
 */
public class AccountVerification extends AbstractAccountVerification {

    public void verificationUpdate(AccountVerificationUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }
}