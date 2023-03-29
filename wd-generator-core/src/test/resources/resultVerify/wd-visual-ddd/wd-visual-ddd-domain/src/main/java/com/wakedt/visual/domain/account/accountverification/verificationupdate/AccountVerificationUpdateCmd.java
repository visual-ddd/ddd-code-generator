package com.wakedt.visual.domain.account.accountverification.verificationupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.account.accountverification.*;

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