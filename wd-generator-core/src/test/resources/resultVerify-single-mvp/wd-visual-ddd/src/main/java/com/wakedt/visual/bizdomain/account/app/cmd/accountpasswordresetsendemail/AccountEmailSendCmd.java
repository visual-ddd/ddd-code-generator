package com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordresetsendemail;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.account.domain.account.*;

/**
 * 发送重置密码邮件-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEmailSendCmd {

    /** 账号ID */
    private Long id;

}