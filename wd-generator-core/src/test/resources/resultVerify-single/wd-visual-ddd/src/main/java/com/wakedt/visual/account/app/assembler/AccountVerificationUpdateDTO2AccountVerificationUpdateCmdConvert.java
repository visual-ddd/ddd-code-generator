package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.account.client.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.account.app.cmd.verificationupdate.AccountVerificationUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert extends BaseConvert<AccountVerificationUpdateDTO, AccountVerificationUpdateCmd> {

    AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert.class);
}