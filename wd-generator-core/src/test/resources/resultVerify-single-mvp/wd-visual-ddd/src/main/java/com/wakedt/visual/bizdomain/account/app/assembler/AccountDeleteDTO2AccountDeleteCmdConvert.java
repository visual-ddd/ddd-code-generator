package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountDeleteDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountremove.AccountDeleteCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountDeleteDTO2AccountDeleteCmdConvert extends BaseConvert<AccountDeleteDTO, AccountDeleteCmd> {

    AccountDeleteDTO2AccountDeleteCmdConvert INSTANCE = Mappers.getMapper(AccountDeleteDTO2AccountDeleteCmdConvert.class);
}