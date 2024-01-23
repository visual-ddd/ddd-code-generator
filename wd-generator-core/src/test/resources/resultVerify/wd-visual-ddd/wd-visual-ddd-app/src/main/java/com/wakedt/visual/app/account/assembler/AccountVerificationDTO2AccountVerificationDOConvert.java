package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * AccountVerificationDTO2AccountVerificationDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        AccountDTOConverter.class,
        AccountVerificationDTOConverter.class,
})
public interface AccountVerificationDTO2AccountVerificationDOConvert extends BaseConvert<AccountVerificationDTO, AccountVerificationDO> {

    AccountVerificationDTO2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerificationDTO2AccountVerificationDOConvert.class);

}