package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import com.wakedt.visual.account.infrastructure.repository.model.AccountVerificationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
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