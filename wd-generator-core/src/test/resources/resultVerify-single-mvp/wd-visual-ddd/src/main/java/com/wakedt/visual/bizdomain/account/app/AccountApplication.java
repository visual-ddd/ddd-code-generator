package com.wakedt.visual.bizdomain.account.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountDetailQuery;
import com.wakedt.visual.bizdomain.account.client.request.AccountPageQuery;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationDetailQuery;
import com.wakedt.visual.bizdomain.account.client.request.AccountCreateDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountModifyDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountDeleteDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountEmailSendDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordResetDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordUpdateDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationCreateDTO;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationUpdateDTO;
import com.wakedt.visual.bizdomain.account.client.response.AccountDTO;
import com.wakedt.visual.bizdomain.account.client.response.AccountVerificationDTO;
import com.wakedt.visual.bizdomain.account.app.view.AccountDetailQueryExe;
import com.wakedt.visual.bizdomain.account.app.view.AccountPageQueryExe;
import com.wakedt.visual.bizdomain.account.app.view.AccountVerificationDetailQueryExe;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountCreateDTO2AccountCreateCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountModifyDTO2AccountModifyCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountDeleteDTO2AccountDeleteCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountEmailSendDTO2AccountEmailSendCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountPasswordResetDTO2AccountPasswordResetCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert;
import com.wakedt.visual.bizdomain.account.app.cmd.accountcreate.AccountCreateCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.accountmodify.AccountModifyCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.accountremove.AccountDeleteCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordreset.AccountPasswordResetCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.verificationcreate.AccountVerificationCreateCmdHandler;
import com.wakedt.visual.bizdomain.account.app.cmd.verificationupdate.AccountVerificationUpdateCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 账号域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class AccountApplication {

    private AccountCreateCmdHandler accountCreateCmdHandler;
    private AccountModifyCmdHandler accountModifyCmdHandler;
    private AccountDeleteCmdHandler accountDeleteCmdHandler;
    private AccountEmailSendCmdHandler accountEmailSendCmdHandler;
    private AccountPasswordResetCmdHandler accountPasswordResetCmdHandler;
    private AccountPasswordUpdateCmdHandler accountPasswordUpdateCmdHandler;
    private AccountVerificationCreateCmdHandler accountVerificationCreateCmdHandler;
    private AccountVerificationUpdateCmdHandler accountVerificationUpdateCmdHandler;
    private AccountDetailQueryExe accountDetailQueryExe;
    private AccountPageQueryExe accountPageQueryExe;
    private AccountVerificationDetailQueryExe accountVerificationDetailQueryExe;


    public ResultDTO<Long> accountCreate(AccountCreateDTO dto) {
        Long id = accountCreateCmdHandler.handle(AccountCreateDTO2AccountCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> accountModify(AccountModifyDTO dto) {
        accountModifyCmdHandler.handle(AccountModifyDTO2AccountModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto) {
        accountDeleteCmdHandler.handle(AccountDeleteDTO2AccountDeleteCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto) {
        accountEmailSendCmdHandler.handle(AccountEmailSendDTO2AccountEmailSendCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto) {
        accountPasswordResetCmdHandler.handle(AccountPasswordResetDTO2AccountPasswordResetCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto) {
        accountPasswordUpdateCmdHandler.handle(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto) {
        Long id = accountVerificationCreateCmdHandler.handle(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto) {
        accountVerificationUpdateCmdHandler.handle(AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query) {
        return accountDetailQueryExe.execute(query);
    }

    public PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery) {
        return accountPageQueryExe.execute(pageQuery);
    }

    public ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query) {
        return accountVerificationDetailQueryExe.execute(query);
    }
}