package com.wakedt.visual.infrastructure.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.account.accountverification.AccountVerification;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;

@Mapper(uses = {
})
public interface AccountVerification2AccountVerificationDOConvert extends BaseConvert<AccountVerification, AccountVerificationDO> {

    AccountVerification2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerification2AccountVerificationDOConvert.class);

    @Mapping(source = "code", target = "code")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Override
    AccountVerificationDO dto2Do(AccountVerification dto);

    @Mapping(source = "code", target = "code")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Override
    AccountVerification do2Dto(AccountVerificationDO d);
}
