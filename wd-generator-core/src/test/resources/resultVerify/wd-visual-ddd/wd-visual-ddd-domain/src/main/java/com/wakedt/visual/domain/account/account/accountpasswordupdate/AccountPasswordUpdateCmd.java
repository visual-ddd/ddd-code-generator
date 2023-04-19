package com.wakedt.visual.domain.account.account.accountpasswordupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

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