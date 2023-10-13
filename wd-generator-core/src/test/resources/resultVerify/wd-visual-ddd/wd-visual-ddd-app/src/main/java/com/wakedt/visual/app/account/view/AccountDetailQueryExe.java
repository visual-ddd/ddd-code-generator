package com.wakedt.visual.app.account.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import com.wakedt.visual.infrastructure.account.repository.mapper.AccountMapper;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.app.account.assembler.AccountDTO2AccountDOConvert;

/**
 * 账号详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
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
