package com.wakedt.visual.domain.account.accountverification.verificationupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新验证码-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVerificationUpdateCmd {

    /** 主键 */
    private Long id;

    /** 验证码 */
    private String code;

}