package com.wakedt.visual.bizdomain.account.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.domain.accountverification.AccountVerification;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountVerificationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerification2AccountVerificationDOConvert extends BaseConvert<AccountVerification, AccountVerificationDO> {

    AccountVerification2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerification2AccountVerificationDOConvert.class);

}
