package com.wakedt.visual.account.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.account.client.query.AccountDetailQuery;
import com.wakedt.visual.account.client.query.AccountPageQuery;
import com.wakedt.visual.account.client.query.AccountVerificationDetailQuery;
import com.wakedt.visual.account.client.query.AccountCreateDTO;
import com.wakedt.visual.account.client.query.AccountModifyDTO;
import com.wakedt.visual.account.client.query.AccountDeleteDTO;
import com.wakedt.visual.account.client.query.AccountEmailSendDTO;
import com.wakedt.visual.account.client.query.AccountPasswordResetDTO;
import com.wakedt.visual.account.client.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.account.client.query.AccountVerificationCreateDTO;
import com.wakedt.visual.account.client.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import com.wakedt.visual.account.app.AccountApplication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 账号域-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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