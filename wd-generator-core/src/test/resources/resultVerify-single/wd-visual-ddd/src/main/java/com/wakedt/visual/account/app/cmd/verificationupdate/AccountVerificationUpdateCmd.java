package com.wakedt.visual.account.app.cmd.verificationupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.account.domain.accountverification.*;

/**
 * 更新验证码-指令
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