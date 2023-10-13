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
import java.time.LocalDateTime;

/**
 * 账号域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public interface AccountRpcService {

    /**
     * 创建账号
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> accountCreate(AccountCreateDTO dto);

    /**
     * 更新账号基本信息
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> accountModify(AccountModifyDTO dto);

    /**
     * 删除账号
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> accountRemove(AccountDeleteDTO dto);

    /**
     * 发送重置密码邮件
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> accountPasswordResetSendEmail(AccountEmailSendDTO dto);

    /**
     * 重置用户密码
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> accountPasswordReset(AccountPasswordResetDTO dto);

    /**
     * 修改用户密码
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> accountPasswordUpdate(AccountPasswordUpdateDTO dto);

    /**
     * 创建验证码
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> verificationCreate(AccountVerificationCreateDTO dto);

    /**
     * 更新验证码
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> verificationUpdate(AccountVerificationUpdateDTO dto);

    /**
     * 查询账号详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<AccountDTO> accountDetailQuery(AccountDetailQuery query);

    /**
     * 分页查询账号
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<AccountDTO>> accountPageQuery(AccountPageQuery pageQuery);

    /**
     * 查询账号验证码详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(AccountVerificationDetailQuery query);

}