package com.wakedt.visual.domain.account.account.accountpasswordresetsendemail;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 发送重置密码邮件-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEmailSendCmd {

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

}