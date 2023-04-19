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
    
    /** 用户重置密码时携带的唯一标识 */
    private String uuid;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
