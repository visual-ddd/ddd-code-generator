package com.wakedt.visual.account.app.cmd.accountpasswordupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.account.domain.account.*;

/**
 * 修改用户密码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPasswordUpdateCmd {

    /** 主键 */
    private Long id;

    /** 旧密码 */
    private String oldPassword;

    /** 新密码 */
    private String newPassword;

}