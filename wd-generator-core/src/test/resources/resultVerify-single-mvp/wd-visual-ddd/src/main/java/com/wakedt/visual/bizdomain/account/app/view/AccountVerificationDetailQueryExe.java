package com.wakedt.visual.bizdomain.account.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationDetailQuery;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountVerificationDO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper.AccountVerificationMapper;
import com.wakedt.visual.bizdomain.account.client.response.AccountVerificationDTO;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountVerificationDTO2AccountVerificationDOConvert;

/**
 * 账号验证码详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
