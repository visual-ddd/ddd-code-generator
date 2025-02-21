package com.wakedt.visual.bizdomain.account.domain.account;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.account.client.request.AccountModifyDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountDeleteDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountEmailSendDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordResetDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordUpdateDTO;

/**
 * 账号-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class Account {

    /** 用户 ID */
    private Long id;

    /** 账号 */
    private String accountNo;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;

    /** 描述 */
    private String description;

    /** 重置密码唯一标识 */
    private String uuid;

    /**
     * 验证密码是否正确
     */
    public void checkLoginPass(){
        // TODO 验证密码是否正确()
    }

    /**
     * 验证重置密码唯一标识是否正确
     */
    public void checkUuidPass(){
        // TODO 验证重置密码唯一标识是否正确()
    }

    public void accountModify(AccountModifyDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
        this.setUserName(updateCmd.getUserName());
        this.setAccountNo(updateCmd.getAccountNo());
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
        this.setIcon(updateCmd.getIcon());
    }

    public void accountRemove(AccountDeleteDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void accountPasswordResetSendEmail(AccountEmailSendDTO updateCmd) {
        this.setId(updateCmd.getId());
    }

    public void accountPasswordReset(AccountPasswordResetDTO updateCmd) {
        this.setUuid(updateCmd.getUuid());
        this.setId(updateCmd.getId());
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
    }

    public void accountPasswordUpdate(AccountPasswordUpdateDTO updateCmd) {
        this.setId(updateCmd.getId());
        /* TODO 指令字段不匹配 updateCmd.getOldPassword(); */
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
    }

}