package com.wakedt.visual.account.domain.accountverification;

import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmd;
import lombok.Data;

/**
 * 账号验证码-聚合根
 */
@Data
public class AccountVerification {

    /** 实体唯一标识符 */
    private Long id;

    /** 验证码 */
    private String code;

    /** 账号标识 */
    private String accountNo;

    public void verificationUpdate(AccountVerificationUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }

}