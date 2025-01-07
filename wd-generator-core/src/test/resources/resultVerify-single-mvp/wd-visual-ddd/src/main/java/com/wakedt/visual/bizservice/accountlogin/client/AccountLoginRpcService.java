package com.wakedt.visual.bizservice.accountlogin.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizservice.accountlogin.client.request.Login;
import com.wakedt.visual.bizservice.accountlogin.client.request.Logout;
import com.wakedt.visual.bizservice.accountlogin.client.request.AccountRegister;
import com.wakedt.visual.bizservice.accountlogin.client.request.AccountVerificationCreate;
import com.wakedt.visual.bizservice.accountlogin.client.request.GetAccountInfo;
import com.wakedt.visual.bizservice.accountlogin.client.request.GetAccountRole;
import com.wakedt.visual.bizservice.accountlogin.client.response.AccountInfoDTO;
import com.wakedt.visual.bizservice.accountlogin.client.response.AccountRoleDTO;
import com.wakedt.visual.bizservice.accountlogin.client.response.AccountTeamInfoDTO;
import com.wakedt.visual.bizservice.accountlogin.client.response.AccountOrganizationInfoDTO;
import com.wakedt.visual.bizservice.accountlogin.client.response.OrganizationDTO;
import com.wakedt.visual.bizservice.accountlogin.client.response.TeamDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 用户登录场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface AccountLoginRpcService {

    /** 验证账号密码，\n并返回用户信息，供存储到session */
    ResultDTO<AccountInfoDTO> login(Login request);

    /** 退出登录 */
    ResultDTO<Boolean> logout(Logout request);

    /** 校验注册验证码，创建账号 */
    ResultDTO<Boolean> accountRegister(AccountRegister request);

    /** 发送注册账号验证码 */
    ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request);

    /** 获取登录账号的基本信息 */
    ResultDTO<AccountInfoDTO> getAccountInfo(GetAccountInfo request);

    /** 获取当前登录账号的权限信息，包含所属组织、团队等信息 */
    ResultDTO<AccountRoleDTO> getAccountRole(GetAccountRole request);

}