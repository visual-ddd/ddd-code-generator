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
public class AccountEmailSendEvent extends BaseDomainEvent {
    
    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;
    
    public AccountEmailSendEvent() {}

    public AccountEmailSendEvent(AccountEmailSendCmd cmd
    ) {
        this.accountNo = cmd.getAccountNo();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
