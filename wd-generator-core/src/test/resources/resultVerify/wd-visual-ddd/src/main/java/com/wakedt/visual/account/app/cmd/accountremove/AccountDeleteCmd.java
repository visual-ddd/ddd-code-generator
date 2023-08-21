package com.wakedt.visual.account.app.cmd.accountremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除账号-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDeleteCmd {

    /** 用户 ID */
    private Long id;

}