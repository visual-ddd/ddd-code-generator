package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordResetDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordreset.AccountPasswordResetCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordResetDTO2AccountPasswordResetCmdConvert extends BaseConvert<AccountPasswordResetDTO, AccountPasswordResetCmd> {

    AccountPasswordResetDTO2AccountPasswordResetCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordResetDTO2AccountPasswordResetCmdConvert.class);
}