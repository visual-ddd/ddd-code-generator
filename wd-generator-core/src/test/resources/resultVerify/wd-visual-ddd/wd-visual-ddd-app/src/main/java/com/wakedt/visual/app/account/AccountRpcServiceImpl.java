package com.wakedt.visual.app.account;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.account.assembler.*;
import com.wakedt.visual.app.account.view.AccountDetailQueryExe;
import com.wakedt.visual.app.account.view.AccountPageQueryExe;
import com.wakedt.visual.app.account.view.AccountVerificationDetailQueryExe;
import com.wakedt.visual.client.account.AccountRpcService;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.client.account.query.*;
import com.wakedt.visual.domain.account.account.accountcreate.AccountCreateCmdHandler;
import com.wakedt.visual.domain.account.account.accountmodify.AccountModifyCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordreset.AccountPasswordResetCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordresetsendemail.AccountEmailSendCmdHandler;
import com.wakedt.visual.domain.account.account.accountpasswordupdate.AccountPasswordUpdateCmdHandler;
import com.wakedt.visual.domain.account.account.accountremove.AccountDeleteCmdHandler;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmdHandler;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmdHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号域-RPC能力接口实现
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/rpc/account")
public class AccountRpcServiceImpl implements AccountRpcService {

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


    @Override
    public ResultDTO<Long> accountCreate(AccountCreateDTO dto) {
        Long id = accountCreateCmdHandler.handle(AccountCreateDTO2AccountCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> accountModify(AccountModifyDTO dto) {
        accountModifyCmdHandler.handle(AccountModifyDTO2AccountModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto) {
        accountDeleteCmdHandler.handle(AccountDeleteDTO2AccountDeleteCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto) {
        accountEmailSendCmdHandler.handle(AccountEmailSendDTO2AccountEmailSendCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto) {
        accountPasswordResetCmdHandler.handle(AccountPasswordResetDTO2AccountPasswordResetCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto) {
        accountPasswordUpdateCmdHandler.handle(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto) {
        Long id = accountVerificationCreateCmdHandler.handle(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto) {
        accountVerificationUpdateCmdHandler.handle(AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query) {
        return accountDetailQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery) {
        return accountPageQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query) {
        return accountVerificationDetailQueryExe.execute(query);
    }
}