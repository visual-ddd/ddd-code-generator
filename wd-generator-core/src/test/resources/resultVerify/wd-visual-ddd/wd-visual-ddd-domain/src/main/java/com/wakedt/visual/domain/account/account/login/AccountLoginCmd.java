package com.wakedt.visual.domain.account.account.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 账号登录-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountLoginCmd {

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String password;

}