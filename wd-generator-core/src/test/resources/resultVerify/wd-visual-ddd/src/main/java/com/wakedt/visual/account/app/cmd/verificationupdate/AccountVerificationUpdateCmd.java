package com.wakedt.visual.account.app.cmd.verificationupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新验证码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVerificationUpdateCmd {

    /** 主键 */
    private Long id;

    /** 验证码 */
    private String code;

}