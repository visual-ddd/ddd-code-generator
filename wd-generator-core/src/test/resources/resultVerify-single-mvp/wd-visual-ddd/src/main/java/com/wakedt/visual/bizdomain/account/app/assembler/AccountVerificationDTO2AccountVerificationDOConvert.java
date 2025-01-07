package com.wakedt.visual.bizdomain.account.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.account.client.response.AccountVerificationDTO;
import com.wakedt.visual.bizdomain.account.infrastructure.repository.model.AccountVerificationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountVerificationDTO2AccountVerificationDOConvert extends BaseConvert<AccountVerificationDTO, AccountVerificationDO> {

    AccountVerificationDTO2AccountVerificationDOConvert INSTANCE = Mappers.getMapper(AccountVerificationDTO2AccountVerificationDOConvert.class);

}