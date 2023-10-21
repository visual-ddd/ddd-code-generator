package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountPasswordResetDTO;
import com.wakedt.visual.domain.account.account.accountpasswordreset.AccountPasswordResetCmd;

/**
 * AccountPasswordResetDTO2AccountPasswordResetCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordResetDTO2AccountPasswordResetCmdConvert extends BaseConvert<AccountPasswordResetDTO, AccountPasswordResetCmd> {

    AccountPasswordResetDTO2AccountPasswordResetCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordResetDTO2AccountPasswordResetCmdConvert.class);
}