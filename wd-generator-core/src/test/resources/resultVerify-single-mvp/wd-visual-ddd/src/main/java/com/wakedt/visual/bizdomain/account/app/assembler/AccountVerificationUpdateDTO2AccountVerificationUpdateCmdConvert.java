package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountVerificationUpdateDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.verificationupdate.AccountVerificationUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert extends BaseConvert<AccountVerificationUpdateDTO, AccountVerificationUpdateCmd> {

    AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert.class);
}