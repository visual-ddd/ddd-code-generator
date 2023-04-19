package com.wakedt.visual.domain.account.account.accountcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 创建账号-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreateCmd {

    /** 用户名 */
    private String userName;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;

}