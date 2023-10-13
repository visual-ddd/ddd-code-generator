package com.wakedt.visual.app.account.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.account.account.accountcreate.AccountCreateCmdHandler;
import com.wakedt.visual.domain.account.account.accountmodify.AccountModifyCmdHandler;
import com.wakedt.visual.domain.account.account.accountremove.AccountDeleteCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordresetsendemail.AccountEmailSendCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordreset.AccountPasswordResetCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordupdate.AccountPasswordUpdateCmdHandler;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmdHandler;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmdHandler;

import javax.annotation.Resource;

/**
 * Account-事件订阅
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Slf4j
@Component
public class AccountListener {

}