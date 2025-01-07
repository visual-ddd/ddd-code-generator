package com.wakedt.visual.bizdomain.account.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.domain.account.Account;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Account2AccountDOConvert extends BaseConvert<Account, AccountDO> {

    Account2AccountDOConvert INSTANCE = Mappers.getMapper(Account2AccountDOConvert.class);

}
