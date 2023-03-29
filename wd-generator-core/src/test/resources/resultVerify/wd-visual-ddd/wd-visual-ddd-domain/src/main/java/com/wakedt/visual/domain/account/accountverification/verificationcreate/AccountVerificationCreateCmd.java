package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.accountverification.*;

/**
 * 创建验证码-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVerificationCreateCmd {

    /** 验证码 */
    private String code;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

}