package com.wakedt.visual.domain.account.account.accountpasswordresetsendemail;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 发送重置密码邮件-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEmailSendCmd {

    /** 账号 */
    private String accountNo;

}