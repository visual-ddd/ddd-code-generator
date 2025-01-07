package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountCreateDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountcreate.AccountCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountCreateDTO2AccountCreateCmdConvert extends BaseConvert<AccountCreateDTO, AccountCreateCmd> {

    AccountCreateDTO2AccountCreateCmdConvert INSTANCE = Mappers.getMapper(AccountCreateDTO2AccountCreateCmdConvert.class);
}