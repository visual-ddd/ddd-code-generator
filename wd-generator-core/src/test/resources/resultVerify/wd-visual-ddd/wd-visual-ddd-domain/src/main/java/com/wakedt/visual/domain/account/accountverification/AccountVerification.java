package com.wakedt.visual.domain.account.accountverification;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmd;

/**
 * 账号验证码-聚合根能力
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public class AccountVerification extends AbstractAccountVerification {

    public void verificationUpdate(AccountVerificationUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }
}