package com.wakedt.visual.app.account.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.account.assembler.AccountDTO2AccountDOConvert;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
