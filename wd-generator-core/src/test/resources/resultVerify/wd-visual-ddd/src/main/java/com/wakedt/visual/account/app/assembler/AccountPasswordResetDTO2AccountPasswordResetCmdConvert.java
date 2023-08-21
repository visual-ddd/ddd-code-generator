package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.app.cmd.accountpasswordreset.AccountPasswordResetCmd;
import com.wakedt.visual.account.client.query.AccountPasswordResetDTO;
import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordResetDTO2AccountPasswordResetCmdConvert extends BaseConvert<AccountPasswordResetDTO, AccountPasswordResetCmd> {

    AccountPasswordResetDTO2AccountPasswordResetCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordResetDTO2AccountPasswordResetCmdConvert.class);
}