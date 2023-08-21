package com.wakedt.visual.account.app.cmd.accountpasswordresetsendemail;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.account.domain.account.*;

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