package com.wakedt.visual.domain.account.account.login;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.account.account.*;

/**
 * 账号登录-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountLoginEvent extends BaseDomainEvent {
    
    /** 账号 */
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
        return "${event.com.wakedt.visual.domain.account.account.login}";
    }
}
