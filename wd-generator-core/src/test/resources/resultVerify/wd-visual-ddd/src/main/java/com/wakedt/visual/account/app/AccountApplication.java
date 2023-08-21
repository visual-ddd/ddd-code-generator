package com.wakedt.visual.account.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.account.app.assembler.*;
import com.wakedt.visual.account.app.cmd.accountcreate.AccountCreateCmdHandler;
import com.wakedt.visual.account.app.cmd.accountmodify.AccountModifyCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordreset.AccountPasswordResetCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmdHandler;
import com.wakedt.visual.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmdHandler;
import com.wakedt.visual.account.app.cmd.accountremove.AccountDeleteCmdHandler;
import com.wakedt.visual.account.app.cmd.verificationcreate.AccountVerificationCreateCmdHandler;
import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmdHandler;
import com.wakedt.visual.account.app.view.AccountDetailQueryExe;
import com.wakedt.visual.account.app.view.AccountPageQueryExe;
import com.wakedt.visual.account.app.view.AccountVerificationDetailQueryExe;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import com.wakedt.visual.account.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号域
 */
@Service
public class AccountApplication {

    @Resource
    private AccountCreateCmdHandler accountCreateCmdHandler;
    @Resource
    private AccountModifyCmdHandler accountModifyCmdHandler;
    @Resource
    private AccountDeleteCmdHandler accountDeleteCmdHandler;
    @Resource
    private AccountEmailSendCmdHandler accountEmailSendCmdHandler;
    @Resource
    private AccountPasswordResetCmdHandler accountPasswordResetCmdHandler;
    @Resource
    private AccountPasswordUpdateCmdHandler accountPasswordUpdateCmdHandler;
    @Resource
    private AccountVerificationCreateCmdHandler accountVerificationCreateCmdHandler;
    @Resource
    private AccountVerificationUpdateCmdHandler accountVerificationUpdateCmdHandler;
    @Resource
    private AccountDetailQueryExe accountDetailQueryExe;
    @Resource
    private AccountPageQueryExe accountPageQueryExe;
    @Resource
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