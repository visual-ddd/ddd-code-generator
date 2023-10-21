package com.wakedt.visual.app.account.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.account.query.AccountEmailSendDTO;
import com.wakedt.visual.domain.account.account.accountpasswordresetsendemail.AccountEmailSendCmd;

/**
 * AccountEmailSendDTO2AccountEmailSendCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface AccountEmailSendDTO2AccountEmailSendCmdConvert extends BaseConvert<AccountEmailSendDTO, AccountEmailSendCmd> {

    AccountEmailSendDTO2AccountEmailSendCmdConvert INSTANCE = Mappers.getMapper(AccountEmailSendDTO2AccountEmailSendCmdConvert.class);
}