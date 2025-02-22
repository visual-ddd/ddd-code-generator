package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.domain.account.accountverification.verificationupdate.AccountVerificationUpdateCmd;

/**
 * AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert extends BaseConvert<AccountVerificationUpdateDTO, AccountVerificationUpdateCmd> {

    AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationUpdateDTO2AccountVerificationUpdateCmdConvert.class);
}