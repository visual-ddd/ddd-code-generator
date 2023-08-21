package com.wakedt.visual.account.app.cmd.accountpasswordreset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 重置用户密码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPasswordResetCmd {

    /** 重置密码唯一标识 */
    private String uuid;

    /** 账号ID */
    private Long id;

    /** 密码 */
    private String newPassword;

}