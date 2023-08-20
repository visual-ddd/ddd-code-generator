package com.wakedt.visual.infrastructure.account.assembler;

import com.wakedt.visual.domain.account.account.Account;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Account2AccountDOConvert extends BaseConvert<Account, AccountDO> {

    Account2AccountDOConvert INSTANCE = Mappers.getMapper(Account2AccountDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "icon", target = "icon")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "uuid", target = "uuid")
    @Override
    AccountDO dto2Do(Account dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountNo", target = "accountNo")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "icon", target = "icon")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "uuid", target = "uuid")
    @Override
    Account do2Dto(AccountDO d);
}
