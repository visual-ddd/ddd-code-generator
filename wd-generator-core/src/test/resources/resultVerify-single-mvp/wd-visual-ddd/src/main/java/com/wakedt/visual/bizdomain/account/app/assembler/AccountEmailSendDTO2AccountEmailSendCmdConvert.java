package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountEmailSendDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordresetsendemail.AccountEmailSendCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountEmailSendDTO2AccountEmailSendCmdConvert extends BaseConvert<AccountEmailSendDTO, AccountEmailSendCmd> {

    AccountEmailSendDTO2AccountEmailSendCmdConvert INSTANCE = Mappers.getMapper(AccountEmailSendDTO2AccountEmailSendCmdConvert.class);
}