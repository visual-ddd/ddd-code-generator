package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.account.client.query.AccountDeleteDTO;
import com.wakedt.visual.account.app.cmd.accountremove.AccountDeleteCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountDeleteDTO2AccountDeleteCmdConvert extends BaseConvert<AccountDeleteDTO, AccountDeleteCmd> {

    AccountDeleteDTO2AccountDeleteCmdConvert INSTANCE = Mappers.getMapper(AccountDeleteDTO2AccountDeleteCmdConvert.class);
}