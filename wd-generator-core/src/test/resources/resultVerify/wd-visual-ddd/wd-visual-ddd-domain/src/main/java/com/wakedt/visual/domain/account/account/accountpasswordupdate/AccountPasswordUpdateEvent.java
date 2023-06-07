package com.wakedt.visual.domain.account.account.accountpasswordupdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.account.account.*;

/**
 * 修改用户密码-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountPasswordUpdateEvent extends BaseDomainEvent {
    
    /** 主键 */
    private Long id;

    /** 旧密码 */
    private String oldPassword;

    /** 新密码 */
    private String newPassword;
    
    public AccountPasswordUpdateEvent() {}

    public AccountPasswordUpdateEvent(AccountPasswordUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.oldPassword = cmd.getOldPassword();
        this.newPassword = cmd.getNewPassword();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountpasswordupdate}";
    }
}
