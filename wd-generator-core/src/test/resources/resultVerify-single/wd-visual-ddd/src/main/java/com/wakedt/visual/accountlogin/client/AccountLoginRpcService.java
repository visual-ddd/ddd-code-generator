package com.wakedt.visual.accountlogin.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.accountlogin.client.query.Login;
import com.wakedt.visual.accountlogin.client.query.Logout;
import com.wakedt.visual.accountlogin.client.query.AccountRegister;
import com.wakedt.visual.accountlogin.client.query.AccountVerificationCreate;
import com.wakedt.visual.accountlogin.client.query.GetAccountInfo;
import com.wakedt.visual.accountlogin.client.query.GetAccountRole;
import com.wakedt.visual.accountlogin.client.dto.AccountInfoDTO;
import com.wakedt.visual.accountlogin.client.dto.AccountRoleDTO;
import com.wakedt.visual.accountlogin.client.dto.AccountTeamInfoDTO;
import com.wakedt.visual.accountlogin.client.dto.AccountOrganizationInfoDTO;
import com.wakedt.visual.accountlogin.client.dto.OrganizationDTO;
import com.wakedt.visual.accountlogin.client.dto.TeamDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 用户登录场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
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