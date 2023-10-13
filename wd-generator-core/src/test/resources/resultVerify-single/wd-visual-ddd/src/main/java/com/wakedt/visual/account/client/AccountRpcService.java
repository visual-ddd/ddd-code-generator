package com.wakedt.visual.account.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.account.client.query.AccountDetailQuery;
import com.wakedt.visual.account.client.query.AccountPageQuery;
import com.wakedt.visual.account.client.query.AccountVerificationDetailQuery;
import com.wakedt.visual.account.client.query.AccountCreateDTO;
import com.wakedt.visual.account.client.query.AccountModifyDTO;
import com.wakedt.visual.account.client.query.AccountDeleteDTO;
import com.wakedt.visual.account.client.query.AccountEmailSendDTO;
import com.wakedt.visual.account.client.query.AccountPasswordResetDTO;
import com.wakedt.visual.account.client.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.account.client.query.AccountVerificationCreateDTO;
import com.wakedt.visual.account.client.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.account.client.dto.AccountDTO;
import com.wakedt.visual.account.client.dto.AccountVerificationDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 账号域-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public interface AccountRpcService {

    /** 创建账号 */
    ResultDTO<Long> accountCreate(AccountCreateDTO dto);

    /** 更新账号基本信息 */
    ResultDTO<Boolean> accountModify(AccountModifyDTO dto);

    /** 删除账号 */
    ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto);

    /** 发送重置密码邮件 */
    ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto);

    /** 重置用户密码 */
    ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto);

    /** 修改用户密码 */
    ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto);

    /** 创建验证码 */
    ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto);

    /** 更新验证码 */
    ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto);

    /** 查询账号详情 */
    ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query);

    /** 分页查询账号 */
    PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery);

    /** 查询账号验证码详情 */
    ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}