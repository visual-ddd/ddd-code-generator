package com.wakedt.visual.domain.account.account.accountpasswordresetsendemail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发送重置密码邮件-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEmailSendCmd {

    /** 账号ID */
    private Long id;

}