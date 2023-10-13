package com.wakedt.visual.account.app.cmd.accountpasswordreset;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.account.domain.account.*;

/**
 * 重置用户密码-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPasswordResetCmd {

    /** 重置密码唯一标识 */
    private String uuid;

    /** 账号ID */
    private Long id;

    /** 密码 */
    private String newPassword;

}