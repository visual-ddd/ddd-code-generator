package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountDTO2AccountDOConvert extends BaseConvert<AccountDTO, AccountDO> {

    AccountDTO2AccountDOConvert INSTANCE = Mappers.getMapper(AccountDTO2AccountDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "icon", target = "icon")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "uuid", target = "uuid")
    @Override
    AccountDO dto2Do(AccountDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "icon", target = "icon")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "uuid", target = "uuid")
    @Override
    AccountDTO do2Dto(AccountDO d);
}