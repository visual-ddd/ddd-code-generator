package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountVerificationDTO2AccountVerificationDOConvert extends BaseConvert<AccountVerificationDTO, AccountVerificationDO> {

    AccountVerificationDTO2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerificationDTO2AccountVerificationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "code", target = "code")
    @Mapping(source = "accountNo", target = "accountNo")
    @Override
    AccountVerificationDO dto2Do(AccountVerificationDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "code", target = "code")
    @Mapping(source = "accountNo", target = "accountNo")
    @Override
    AccountVerificationDTO do2Dto(AccountVerificationDO d);
}