package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountCreateDTO;
import com.wakedt.visual.domain.account.account.accountcreate.AccountCreateCmd;

/**
 * AccountCreateDTO2AccountCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountCreateDTO2AccountCreateCmdConvert extends BaseConvert<AccountCreateDTO, AccountCreateCmd> {

    AccountCreateDTO2AccountCreateCmdConvert INSTANCE = Mappers.getMapper(AccountCreateDTO2AccountCreateCmdConvert.class);
}