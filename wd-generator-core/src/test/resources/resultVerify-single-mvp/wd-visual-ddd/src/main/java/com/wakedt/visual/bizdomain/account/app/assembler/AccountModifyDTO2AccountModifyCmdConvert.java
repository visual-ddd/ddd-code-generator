package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountModifyDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountmodify.AccountModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountModifyDTO2AccountModifyCmdConvert extends BaseConvert<AccountModifyDTO, AccountModifyCmd> {

    AccountModifyDTO2AccountModifyCmdConvert INSTANCE = Mappers.getMapper(AccountModifyDTO2AccountModifyCmdConvert.class);
}