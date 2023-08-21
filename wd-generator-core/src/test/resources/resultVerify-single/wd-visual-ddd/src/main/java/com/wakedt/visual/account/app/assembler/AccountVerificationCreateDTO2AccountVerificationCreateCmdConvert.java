package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.account.client.query.AccountVerificationCreateDTO;
import com.wakedt.visual.account.app.cmd.verificationcreate.AccountVerificationCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert extends BaseConvert<AccountVerificationCreateDTO, AccountVerificationCreateCmd> {

    AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.class);
}