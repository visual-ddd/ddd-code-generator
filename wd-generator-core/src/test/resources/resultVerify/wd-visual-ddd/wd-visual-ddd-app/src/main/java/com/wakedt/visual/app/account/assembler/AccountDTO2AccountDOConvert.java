package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;

/**
 * AccountDTO2AccountDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        AccountDTOConverter.class,
        AccountVerificationDTOConverter.class,
})
public interface AccountDTO2AccountDOConvert extends BaseConvert<AccountDTO, AccountDO> {

    AccountDTO2AccountDOConvert INSTANCE = Mappers.getMapper(AccountDTO2AccountDOConvert.class);

}