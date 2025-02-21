package com.wakedt.visual.bizdomain.account.app;

import cn.hutool.core.bean.BeanUtil;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import com.wakedt.visual.bizdomain.account.domain.account.AccountRepository;
import com.wakedt.visual.bizdomain.account.domain.accountverification.AccountVerificationRepository;
import com.wakedt.visual.bizdomain.account.domain.account.Account;
import com.wakedt.visual.bizdomain.account.domain.accountverification.AccountVerification;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper.AccountMapper;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountDTO2AccountDOConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountDTO2AccountDOConvert;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountVerificationDTO2AccountVerificationDOConvert;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountVerificationDO;
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

    private AccountRepository accountRepository;
    private AccountVerificationRepository accountVerificationRepository;
    private AccountMapper accountMapper;
    private AccountVerificationMapper accountVerificationMapper;

    public ResultDTO<Long> accountCreate(AccountCreateDTO dto) {
        Account entity = BeanUtil.copyProperties(dto, Account.class);
        Account newEntity = accountRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }
    public ResultDTO<Boolean> accountModify(AccountModifyDTO dto) {
        Account entity = accountRepository.find(dto.getId());
        entity.accountModify(dto);
        accountRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto) {
        Account entity = accountRepository.find(dto.getId());
        entity.accountRemove(dto);
        accountRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto) {
        Account entity = accountRepository.find(dto.getId());
        entity.accountPasswordResetSendEmail(dto);
        accountRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto) {
        Account entity = accountRepository.find(dto.getId());
        entity.accountPasswordReset(dto);
        accountRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto) {
        Account entity = accountRepository.find(dto.getId());
        entity.accountPasswordUpdate(dto);
        accountRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }
    public ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto) {
        AccountVerification entity = BeanUtil.copyProperties(dto, AccountVerification.class);
        AccountVerification newEntity = accountVerificationRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }
    public ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto) {
        AccountVerification entity = accountVerificationRepository.find(dto.getId());
        entity.verificationUpdate(dto);
        accountVerificationRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query) {
        AccountDO accountDO = accountMapper.accountDetailQuery(query);
        return ResultDTO.success(AccountDTO2AccountDOConvert.INSTANCE.do2Dto(accountDO));
    }

    public PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<AccountDO> pageInfo = new PageInfo<>(accountMapper.accountPageQuery(pageQuery));
        return AccountDTO2AccountDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query) {
        AccountVerificationDO accountVerificationDO = accountVerificationMapper.accountVerificationDetailQuery(query);
        return ResultDTO.success(AccountVerificationDTO2AccountVerificationDOConvert.INSTANCE.do2Dto(accountVerificationDO));
    }
}