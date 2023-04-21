package com.wakedt.visual.domain.account.accountverification;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 账号验证码-聚合根
 */
@Data
public abstract class AbstractAccountVerification {

    /** 实体唯一标识符 */
    private Long id;

    /** 验证码 */
    private String code;

    /** 账号标识 */
    private String accountNo;

}