package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.account.client.query.AccountCreateDTO;
import com.wakedt.visual.account.app.cmd.accountcreate.AccountCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountCreateDTO2AccountCreateCmdConvert extends BaseConvert<AccountCreateDTO, AccountCreateCmd> {

    AccountCreateDTO2AccountCreateCmdConvert INSTANCE = Mappers.getMapper(AccountCreateDTO2AccountCreateCmdConvert.class);
}