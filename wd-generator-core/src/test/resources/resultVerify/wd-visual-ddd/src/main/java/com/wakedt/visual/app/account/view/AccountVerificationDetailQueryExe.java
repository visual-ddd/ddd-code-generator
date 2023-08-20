package com.wakedt.visual.app.account.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.account.assembler.AccountVerificationDTO2AccountVerificationDOConvert;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountVerificationMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 账号验证码详情查询对象-查询器
 */
@Component
public class AccountVerificationDetailQueryExe {

    @Resource
    private AccountVerificationMapper mapper;

    public ResultDTO<AccountVerificationDTO> execute(AccountVerificationDetailQuery query) {
        return ResultDTO.success(
                AccountVerificationDTO2AccountVerificationDOConvert.INSTANCE.do2Dto(mapper.accountVerificationDetailQuery(query)));
    }
}
