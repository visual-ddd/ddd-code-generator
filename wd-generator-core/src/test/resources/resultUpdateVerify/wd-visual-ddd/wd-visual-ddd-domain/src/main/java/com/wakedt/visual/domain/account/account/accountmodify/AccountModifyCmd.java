package com.wakedt.visual.domain.account.account.accountmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新账号基本信息-指令
 *
 * @author shimmer
 * @since 1.0
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

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;

    /** 用户头像 */
    private String icon;

}