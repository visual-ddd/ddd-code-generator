package com.wakedt.visual.account.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.client.query.AccountVerificationDetailQuery;
import com.wakedt.visual.account.infrastructure.repository.model.AccountVerificationDO;
import com.wakedt.visual.account.infrastructure.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import com.wakedt.visual.account.app.assembler.AccountVerificationDTO2AccountVerificationDOConvert;

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
