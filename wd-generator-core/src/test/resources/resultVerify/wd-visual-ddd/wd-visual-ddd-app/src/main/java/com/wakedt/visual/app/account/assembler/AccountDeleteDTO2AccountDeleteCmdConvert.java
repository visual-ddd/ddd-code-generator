package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountDeleteDTO;
import com.wakedt.visual.domain.account.account.accountremove.AccountDeleteCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountDeleteDTO2AccountDeleteCmdConvert extends BaseConvert<AccountDeleteDTO, AccountDeleteCmd> {

    AccountDeleteDTO2AccountDeleteCmdConvert INSTANCE = Mappers.getMapper(AccountDeleteDTO2AccountDeleteCmdConvert.class);
}