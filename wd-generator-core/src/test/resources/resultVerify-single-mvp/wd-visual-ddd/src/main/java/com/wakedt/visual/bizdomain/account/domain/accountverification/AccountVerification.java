package com.wakedt.visual.bizdomain.account.domain.accountverification;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationUpdateDTO;

/**
 * 账号验证码-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class AccountVerification {

    /** 实体唯一标识符 */
    private Long id;

    /** 验证码 */
    private String code;

    /** 账号标识 */
    private String accountNo;

    public void verificationUpdate(AccountVerificationUpdateDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setCode(updateCmd.getCode());
    }

}