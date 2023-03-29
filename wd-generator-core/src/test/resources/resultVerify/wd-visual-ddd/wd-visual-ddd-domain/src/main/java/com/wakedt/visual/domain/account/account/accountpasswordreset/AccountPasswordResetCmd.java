package com.wakedt.visual.domain.account.account.accountpasswordreset;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 重置用户密码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPasswordResetCmd {

    /** 用户重置密码时携带的唯一标识 */
    private String uuid;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;

}