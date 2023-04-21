package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.accountverification.*;

/**
 * 创建验证码-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountVerificationCreateEvent extends BaseDomainEvent {
    
    /** 验证码 */
    private String code;

    /** 账号标识 */
    private String accountNo;
    
    public AccountVerificationCreateEvent() {}

    public AccountVerificationCreateEvent(AccountVerificationCreateCmd cmd
    ) {
        this.code = cmd.getCode();
        this.accountNo = cmd.getAccountNo();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.accountverification.verificationcreate}";
    }
}
