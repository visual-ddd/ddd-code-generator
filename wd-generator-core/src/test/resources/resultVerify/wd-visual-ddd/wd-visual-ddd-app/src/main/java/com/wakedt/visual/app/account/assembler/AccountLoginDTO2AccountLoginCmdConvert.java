package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountLoginDTO;
import com.wakedt.visual.domain.account.account.login.AccountLoginCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountLoginDTO2AccountLoginCmdConvert extends BaseConvert<AccountLoginDTO, AccountLoginCmd> {

    AccountLoginDTO2AccountLoginCmdConvert INSTANCE = Mappers.getMapper(AccountLoginDTO2AccountLoginCmdConvert.class);
}