package com.wakedt.visual.domain.account.accountverification.verificationupdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.account.accountverification.*;

/**
 * 更新验证码-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountVerificationUpdateEvent extends BaseDomainEvent {
    
    /** 主键 */
    private Long id;

    /** 验证码 */
    private String code;
    
    public AccountVerificationUpdateEvent() {}

    public AccountVerificationUpdateEvent(AccountVerificationUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.code = cmd.getCode();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
