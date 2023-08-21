package com.wakedt.visual.account.app.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.app.cmd.accountcreate.AccountCreateCmdHandler;
import com.wakedt.visual.account.app.cmd.accountmodify.AccountModifyCmdHandler;
import com.wakedt.visual.account.app.cmd.accountremove.AccountDeleteCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordreset.AccountPasswordResetCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmdHandler;
import com.wakedt.visual.account.app.cmd.verificationcreate.AccountVerificationCreateCmdHandler;
import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmdHandler;

import javax.annotation.Resource;

/**
 * Account - 事件订阅
 */
@Slf4j
@Component
public class AccountListener {

}