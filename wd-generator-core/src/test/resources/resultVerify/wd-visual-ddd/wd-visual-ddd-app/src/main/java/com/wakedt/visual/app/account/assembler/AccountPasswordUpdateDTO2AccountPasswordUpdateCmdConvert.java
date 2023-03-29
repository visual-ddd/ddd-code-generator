package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.domain.account.account.accountpasswordupdate.AccountPasswordUpdateCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert extends BaseConvert<AccountPasswordUpdateDTO, AccountPasswordUpdateCmd> {

    AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.class);
}