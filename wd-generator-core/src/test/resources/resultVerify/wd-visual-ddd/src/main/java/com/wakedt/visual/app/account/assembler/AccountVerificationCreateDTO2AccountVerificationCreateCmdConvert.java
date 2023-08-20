package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.client.account.query.AccountVerificationCreateDTO;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert extends BaseConvert<AccountVerificationCreateDTO, AccountVerificationCreateCmd> {

    AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.class);
}