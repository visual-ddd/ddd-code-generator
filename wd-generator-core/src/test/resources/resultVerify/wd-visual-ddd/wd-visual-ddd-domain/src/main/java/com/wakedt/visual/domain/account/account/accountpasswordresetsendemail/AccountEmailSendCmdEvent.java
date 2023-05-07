package com.wakedt.visual.domain.account.account.accountpasswordresetsendemail;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.account.*;

/**
 * 发送重置密码邮件-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountEmailSendCmdEvent extends BaseDomainEvent {
    
    /** 账号ID */
    private Long id;
    
    public AccountEmailSendCmdEvent() {}

    public AccountEmailSendCmdEvent(AccountEmailSendCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountpasswordresetsendemail}";
    }
}
