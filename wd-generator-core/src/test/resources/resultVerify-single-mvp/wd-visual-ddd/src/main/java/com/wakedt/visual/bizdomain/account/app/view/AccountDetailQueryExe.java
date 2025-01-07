package com.wakedt.visual.bizdomain.account.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.account.client.request.AccountDetailQuery;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.mapper.AccountMapper;
import com.wakedt.visual.bizdomain.account.client.response.AccountDTO;
import com.wakedt.visual.bizdomain.account.app.assembler.AccountDTO2AccountDOConvert;

/**
 * 账号详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class AccountDetailQueryExe {

    @Resource
    private AccountMapper mapper;

    public ResultDTO<AccountDTO> execute(AccountDetailQuery query) {
        return ResultDTO.success(
                AccountDTO2AccountDOConvert.INSTANCE.do2Dto(mapper.accountDetailQuery(query)));
    }
}
