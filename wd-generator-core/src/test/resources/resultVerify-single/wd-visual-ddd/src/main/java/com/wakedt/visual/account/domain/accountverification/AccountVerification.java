package com.wakedt.visual.account.domain.accountverification;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmd;

/**
 * 账号验证码-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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