package com.wakedt.visual.domain.account.account.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 账号登录-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginCmd {

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 密码 */
    private String password;

}