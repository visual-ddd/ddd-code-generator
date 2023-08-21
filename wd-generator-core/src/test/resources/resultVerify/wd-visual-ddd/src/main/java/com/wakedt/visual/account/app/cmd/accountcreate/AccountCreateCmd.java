package com.wakedt.visual.account.app.cmd.accountcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建账号-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreateCmd {

    /** 用户名 */
    private String userName;

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;

}