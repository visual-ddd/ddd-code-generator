package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import com.wakedt.visual.infrastructure.account.repository.model.AccountVerificationDO;

/**
 * AccountVerificationDTO2AccountVerificationDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationDTO2AccountVerificationDOConvert extends BaseConvert<AccountVerificationDTO, AccountVerificationDO> {

    AccountVerificationDTO2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerificationDTO2AccountVerificationDOConvert.class);

}