package com.wakedt.visual.app.account.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.app.account.assembler.AccountVerificationDTO2AccountVerificationDOConvert;

/**
 * 查询账号验证码详情-查询器
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
