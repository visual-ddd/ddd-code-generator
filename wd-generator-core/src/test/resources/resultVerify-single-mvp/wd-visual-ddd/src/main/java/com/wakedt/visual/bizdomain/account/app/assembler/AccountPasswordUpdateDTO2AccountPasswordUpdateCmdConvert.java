package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.account.client.request.AccountPasswordUpdateDTO;
import com.wakedt.visual.bizdomain.account.app.cmd.accountpasswordupdate.AccountPasswordUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert extends BaseConvert<AccountPasswordUpdateDTO, AccountPasswordUpdateCmd> {

    AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.class);
}