package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.app.cmd.accountmodify.AccountModifyCmd;
import com.wakedt.visual.account.client.query.AccountModifyDTO;
import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountModifyDTO2AccountModifyCmdConvert extends BaseConvert<AccountModifyDTO, AccountModifyCmd> {

    AccountModifyDTO2AccountModifyCmdConvert INSTANCE = Mappers.getMapper(AccountModifyDTO2AccountModifyCmdConvert.class);
}