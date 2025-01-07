package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.account.client.response.AccountDTO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountDTO2AccountDOConvert extends BaseConvert<AccountDTO, AccountDO> {

    AccountDTO2AccountDOConvert INSTANCE = Mappers.getMapper(AccountDTO2AccountDOConvert.class);

}