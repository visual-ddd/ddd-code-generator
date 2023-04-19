package com.wakedt.visual.domain.account.accountverification;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 账号进行邮箱验证操作时，需要使用验证码进行验证-聚合根
 */
@Data
public abstract class AbstractAccountVerification {

    /** 实体唯一标识符 */
    private Long id;

    /** 验证码 */
    private String code;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

}