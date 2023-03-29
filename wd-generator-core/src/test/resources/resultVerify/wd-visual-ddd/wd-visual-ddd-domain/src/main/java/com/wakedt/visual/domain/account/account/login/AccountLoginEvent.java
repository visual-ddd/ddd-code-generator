package com.wakedt.visual.domain.account.account.login;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.account.account.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountLoginEvent extends BaseDomainEvent {
    
    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 密码 */
    private String password;
    
    public AccountLoginEvent() {}

    public AccountLoginEvent(AccountLoginCmd cmd
    ) {
        this.accountNo = cmd.getAccountNo();
        this.password = cmd.getPassword();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
