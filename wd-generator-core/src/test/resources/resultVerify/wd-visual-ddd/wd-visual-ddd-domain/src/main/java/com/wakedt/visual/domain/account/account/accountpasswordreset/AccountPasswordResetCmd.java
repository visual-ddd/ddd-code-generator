package com.wakedt.visual.domain.account.account.accountpasswordreset;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 重置用户密码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPasswordResetCmd {

    /** 重置密码唯一标识 */
    private String uuid;

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;

}