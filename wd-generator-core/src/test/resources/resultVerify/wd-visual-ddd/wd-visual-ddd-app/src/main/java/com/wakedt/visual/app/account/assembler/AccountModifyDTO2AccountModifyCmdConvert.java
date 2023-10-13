package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountModifyDTO;
import com.wakedt.visual.domain.account.account.accountmodify.AccountModifyCmd;

/**
 * AccountModifyDTO2AccountModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountModifyDTO2AccountModifyCmdConvert extends BaseConvert<AccountModifyDTO, AccountModifyCmd> {

    AccountModifyDTO2AccountModifyCmdConvert INSTANCE = Mappers.getMapper(AccountModifyDTO2AccountModifyCmdConvert.class);
}