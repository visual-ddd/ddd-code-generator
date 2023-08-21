package com.wakedt.visual.account.domain.accountverification;

import lombok.Data;

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