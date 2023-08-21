package com.wakedt.visual.account.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.account.app.AccountApplication;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import com.wakedt.visual.account.client.query.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号域-RPC能力接口实现
 */
@Service
public class AccountRpcServiceImpl implements AccountRpcService {

    @Resource
    private AccountApplication application;

    @Override
    public ResultDTO<Long> accountCreate(AccountCreateDTO dto) {
        return application.accountCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> accountModify(AccountModifyDTO dto) {
        return application.accountModify(dto);
    }

    @Override
    public ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto) {
        return application.accountRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto) {
        return application.accountPasswordResetSendEmail(dto);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto) {
        return application.accountPasswordReset(dto);
    }

    @Override
    public ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto) {
        return application.accountPasswordUpdate(dto);
    }

    @Override
    public ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto) {
        return application.verificationCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto) {
        return application.verificationUpdate(dto);
    }

    @Override
    public ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query) {
        return application.accountDetailQuery(query);
    }

    @Override
    public PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery) {
        return application.accountPageQuery(pageQuery);
    }

    @Override
    public ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query) {
        return application.accountVerificationDetailQuery(query);
    }
}