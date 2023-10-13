package com.wakedt.visual.infrastructure.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.account.accountverification.AccountVerification;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;

/**
 * AccountVerification2AccountVerificationDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerification2AccountVerificationDOConvert extends BaseConvert<AccountVerification, AccountVerificationDO> {

    AccountVerification2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerification2AccountVerificationDOConvert.class);

}
