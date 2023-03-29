package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountModifyDTO;
import com.wakedt.visual.domain.account.account.accountmodify.AccountModifyCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountModifyDTO2AccountModifyCmdConvert extends BaseConvert<AccountModifyDTO, AccountModifyCmd> {

    AccountModifyDTO2AccountModifyCmdConvert INSTANCE = Mappers.getMapper(AccountModifyDTO2AccountModifyCmdConvert.class);
}