package com.wakedt.visual.infrastructure.account.assembler;

import com.wakedt.visual.domain.account.account.Account;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.account.repository.model.AccountDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Account2AccountDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Account2AccountDOConvert extends BaseConvert<Account, AccountDO> {

    Account2AccountDOConvert INSTANCE = Mappers.getMapper(Account2AccountDOConvert.class);

}
