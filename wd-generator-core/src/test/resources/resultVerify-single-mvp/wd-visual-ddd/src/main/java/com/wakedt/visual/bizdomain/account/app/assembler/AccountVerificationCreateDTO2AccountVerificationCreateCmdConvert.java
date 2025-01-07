package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationCreateDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.verificationcreate.AccountVerificationCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert extends BaseConvert<AccountVerificationCreateDTO, AccountVerificationCreateCmd> {

    AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.class);
}