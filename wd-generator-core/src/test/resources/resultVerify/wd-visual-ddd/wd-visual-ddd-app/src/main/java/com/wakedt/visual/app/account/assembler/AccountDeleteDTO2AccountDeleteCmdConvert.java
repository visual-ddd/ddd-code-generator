package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountDeleteDTO;
import com.wakedt.visual.domain.account.account.accountremove.AccountDeleteCmd;

/**
 * AccountDeleteDTO2AccountDeleteCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountDeleteDTO2AccountDeleteCmdConvert extends BaseConvert<AccountDeleteDTO, AccountDeleteCmd> {

    AccountDeleteDTO2AccountDeleteCmdConvert INSTANCE = Mappers.getMapper(AccountDeleteDTO2AccountDeleteCmdConvert.class);
}