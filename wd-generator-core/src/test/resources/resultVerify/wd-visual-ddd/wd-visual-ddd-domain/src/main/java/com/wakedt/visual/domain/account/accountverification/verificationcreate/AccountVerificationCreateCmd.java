package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
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

    /** 账号标识 */
    private String accountNo;

}