package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建验证码-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVerificationCreateCmd {

    /** 验证码 */
    private String code;

    /** 账号标识 */
    private String accountNo;

}