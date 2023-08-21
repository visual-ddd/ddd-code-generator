package com.wakedt.visual.account.app.task;

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
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Account - 定时任务
 */
@Slf4j
@Component
public class AccountTask {

}