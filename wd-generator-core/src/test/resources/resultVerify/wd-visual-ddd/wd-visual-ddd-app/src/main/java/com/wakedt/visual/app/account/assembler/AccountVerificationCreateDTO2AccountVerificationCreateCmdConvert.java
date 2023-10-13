package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountVerificationCreateDTO;
import com.wakedt.visual.domain.account.accountverification.verificationcreate.AccountVerificationCreateCmd;

/**
 * AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert extends BaseConvert<AccountVerificationCreateDTO, AccountVerificationCreateCmd> {

    AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert INSTANCE = Mappers.getMapper(AccountVerificationCreateDTO2AccountVerificationCreateCmdConvert.class);
}