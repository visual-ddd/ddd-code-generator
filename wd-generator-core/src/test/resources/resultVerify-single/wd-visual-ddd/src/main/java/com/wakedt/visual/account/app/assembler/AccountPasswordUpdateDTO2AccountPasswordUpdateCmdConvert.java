package com.wakedt.visual.account.app.assembler;

import com.wakedt.visual.account.infrastructure.BaseConvert;
import com.wakedt.visual.account.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.account.client.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert extends BaseConvert<AccountPasswordUpdateDTO, AccountPasswordUpdateCmd> {

    AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.class);
}