package com.wakedt.visual.account.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.account.client.query.AccountDetailQuery;
import com.wakedt.visual.account.infrastructure.repository.model.AccountDO;
import com.wakedt.visual.account.infrastructure.repository.mapper.AccountMapper;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.app.assembler.AccountDTO2AccountDOConvert;

/**
 * 账号详情查询对象-查询器
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
