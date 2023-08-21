package com.wakedt.visual.account.app.cmd.verificationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建验证码-指令
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