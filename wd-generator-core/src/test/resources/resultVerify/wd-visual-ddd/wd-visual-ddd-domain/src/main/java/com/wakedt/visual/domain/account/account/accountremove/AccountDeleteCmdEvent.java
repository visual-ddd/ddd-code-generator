package com.wakedt.visual.domain.account.account.accountremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.account.*;

/**
 * 删除账号-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDeleteCmdEvent extends BaseDomainEvent {
    
    /** 用户 ID */
    private Long id;
    
    public AccountDeleteCmdEvent() {}

    public AccountDeleteCmdEvent(AccountDeleteCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountremove}";
    }
}
