package com.wakedt.visual.domain.account.account;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.account.account.accountmodify.AccountModifyCmd;
import com.wakedt.visual.domain.account.account.accountremove.AccountDeleteCmd;
import com.wakedt.visual.domain.account.account.accountpasswordresetsendemail.AccountEmailSendCmd;
import com.wakedt.visual.domain.account.account.accountpasswordreset.AccountPasswordResetCmd;
import com.wakedt.visual.domain.account.account.accountpasswordupdate.AccountPasswordUpdateCmd;

/**
 * 账号-聚合根能力
 */
public class Account extends AbstractAccount {

    @Override
    public void checkLoginPass(String password) {
        /* TODO 验证密码是否正确() */
    }

    @Override
    public void checkUuidPass(String uuid) {
        /* TODO 验证重置密码唯一标识是否正确() */
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