package com.wakedt.visual.client.account;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.client.account.query.AccountPageQuery;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;
import com.wakedt.visual.client.account.query.AccountCreateDTO;
import com.wakedt.visual.client.account.query.AccountModifyDTO;
import com.wakedt.visual.client.account.query.AccountDeleteDTO;
import com.wakedt.visual.client.account.query.AccountEmailSendDTO;
import com.wakedt.visual.client.account.query.AccountPasswordResetDTO;
import com.wakedt.visual.client.account.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.client.account.query.AccountVerificationCreateDTO;
import com.wakedt.visual.client.account.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;
import java.util.*;
import java.math.*;

/**
 * 账号域-RPC能力接口
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