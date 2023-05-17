package com.wakedt.visual.domain.account.account.accountremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 删除账号-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDeleteEvent extends BaseDomainEvent {
    
    /** 用户 ID */
    private Long id;
    
    public AccountDeleteEvent() {}

    public AccountDeleteEvent(AccountDeleteCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountremove}";
    }
}
