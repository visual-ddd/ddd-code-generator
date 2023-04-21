package com.wakedt.visual.domain.account.account.accountpasswordreset;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.account.*;

/**
 * 重置用户密码-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountPasswordResetEvent extends BaseDomainEvent {
    
    /** 重置密码唯一标识 */
    private String uuid;

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;
    
    public AccountPasswordResetEvent() {}

    public AccountPasswordResetEvent(AccountPasswordResetCmd cmd
    ) {
        this.uuid = cmd.getUuid();
        this.accountNo = cmd.getAccountNo();
        this.newPassword = cmd.getNewPassword();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountpasswordreset}";
    }
}
