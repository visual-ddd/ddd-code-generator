package com.wakedt.visual.domain.account.accountverification.verificationcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.account.accountverification.*;

/**
 * 创建验证码-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountVerificationCreateEvent extends BaseDomainEvent {
    
    /** 验证码 */
    private String code;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;
    
    public AccountVerificationCreateEvent() {}

    public AccountVerificationCreateEvent(AccountVerificationCreateCmd cmd
    ) {
        this.code = cmd.getCode();
        this.accountNo = cmd.getAccountNo();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}
