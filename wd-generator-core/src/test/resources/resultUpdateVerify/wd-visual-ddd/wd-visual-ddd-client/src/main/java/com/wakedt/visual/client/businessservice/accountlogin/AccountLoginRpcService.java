package com.wakedt.visual.client.businessservice.accountlogin;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountInfoDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountRoleDTO;
import com.wakedt.visual.client.businessservice.accountlogin.query.*;

/**
 * 用户登录场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface AccountLoginRpcService {

    /**
     * 验证账号密码，\n并返回用户信息，供存储到session
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<AccountInfoDTO> login(Login request);

    /**
     * 退出登录
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> logout(Logout request);

    /**
     * 校验注册验证码，创建账号
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> accountRegister(AccountRegister request);

    /**
     * 发送注册账号验证码
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request);

    /**
     * 获取登录账号的基本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<AccountInfoDTO> getAccountInfo(GetAccountInfo request);

    /**
     * 获取当前登录账号的权限信息，包含所属组织、团队等信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<AccountRoleDTO> getAccountRole(GetAccountRole request);

}