package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.accountverification.*;

/**
 * 创建验证码-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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