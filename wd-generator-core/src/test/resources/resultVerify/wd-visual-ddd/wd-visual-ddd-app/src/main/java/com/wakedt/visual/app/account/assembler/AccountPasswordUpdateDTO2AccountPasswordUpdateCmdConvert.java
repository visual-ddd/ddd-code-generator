package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.domain.account.account.accountpasswordupdate.AccountPasswordUpdateCmd;

/**
 * AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert extends BaseConvert<AccountPasswordUpdateDTO, AccountPasswordUpdateCmd> {

    AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert INSTANCE = Mappers.getMapper(AccountPasswordUpdateDTO2AccountPasswordUpdateCmdConvert.class);
}