package com.wakedt.visual.domain.account.account.accountmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.account.*;

/**
 * 更新账号基本信息-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountModifyCmd {

    /** 用户 ID */
    private Long id;

    /** 描述 */
    private String description;

    /** 用户名 */
    private String userName;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;

    /** 用户头像 */
    private String icon;

}