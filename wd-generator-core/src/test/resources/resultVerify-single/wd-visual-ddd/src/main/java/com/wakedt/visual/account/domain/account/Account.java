package com.wakedt.visual.account.domain.account;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.account.app.cmd.accountmodify.AccountModifyCmd;
import com.wakedt.visual.account.app.cmd.accountremove.AccountDeleteCmd;
import com.wakedt.visual.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmd;
import com.wakedt.visual.account.app.cmd.accountpasswordreset.AccountPasswordResetCmd;
import com.wakedt.visual.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmd;

/**
 * 账号-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
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

    public void accountModify(AccountModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
        this.setUserName(updateCmd.getUserName());
        this.setAccountNo(updateCmd.getAccountNo());
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
        this.setIcon(updateCmd.getIcon());
    }

    public void accountRemove(AccountDeleteCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void accountPasswordResetSendEmail(AccountEmailSendCmd updateCmd) {
        this.setId(updateCmd.getId());
    }

    public void accountPasswordReset(AccountPasswordResetCmd updateCmd) {
        this.setUuid(updateCmd.getUuid());
        this.setId(updateCmd.getId());
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
    }

    public void accountPasswordUpdate(AccountPasswordUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        /* TODO 指令字段不匹配 updateCmd.getOldPassword(); */
        /* TODO 指令字段不匹配 updateCmd.getNewPassword(); */
    }

}