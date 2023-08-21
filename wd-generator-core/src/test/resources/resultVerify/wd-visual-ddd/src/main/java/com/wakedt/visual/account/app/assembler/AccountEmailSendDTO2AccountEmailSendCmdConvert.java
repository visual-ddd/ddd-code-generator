package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmd;
import com.wakedt.visual.account.client.query.AccountEmailSendDTO;
import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountEmailSendDTO2AccountEmailSendCmdConvert extends BaseConvert<AccountEmailSendDTO, AccountEmailSendCmd> {

    AccountEmailSendDTO2AccountEmailSendCmdConvert INSTANCE = Mappers.getMapper(AccountEmailSendDTO2AccountEmailSendCmdConvert.class);
}