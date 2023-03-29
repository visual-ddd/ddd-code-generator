package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountVerificationCreateDTO;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert extends BaseConvert<AccountVerificationCreateDTO, AccountVerificationCreateCmd> {

    AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.class);
}