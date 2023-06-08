package com.wakedt.visual.domain.account.account.accountcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.account.account.*;

/**
 * 创建账号-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountCreateEvent extends BaseDomainEvent {
    
    /** 用户 ID */
    private Long id;

    /** 用户名 */
    private String userName;

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;
    
    public AccountCreateEvent() {}

    public AccountCreateEvent(AccountCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.userName = cmd.getUserName();
        this.accountNo = cmd.getAccountNo();
        this.password = cmd.getPassword();
        this.icon = cmd.getIcon();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountcreate}";
    }
}
