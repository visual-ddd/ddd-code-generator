package com.wakedt.visual.domain.account.account.accountmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.account.account.*;

/**
 * 更新账号基本信息-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountModifyEvent extends BaseDomainEvent {
    
    /** 用户 ID */
    private Long id;

    /** 描述 */
    private String description;

    /** 用户名 */
    private String userName;

    /** 账号 */
    private String accountNo;

    /** 密码 */
    private String newPassword;

    /** 用户头像 */
    private String icon;
    
    public AccountModifyEvent() {}

    public AccountModifyEvent(AccountModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
        this.userName = cmd.getUserName();
        this.accountNo = cmd.getAccountNo();
        this.newPassword = cmd.getNewPassword();
        this.icon = cmd.getIcon();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.account.account.accountmodify}";
    }
}
