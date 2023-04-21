package com.wakedt.visual.app.businessservice.accountlogin;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.accountlogin.query.Login;
import com.wakedt.visual.client.businessservice.accountlogin.query.Logout;
import com.wakedt.visual.client.businessservice.accountlogin.query.AccountRegister;
import com.wakedt.visual.client.businessservice.accountlogin.query.AccountVerificationCreate;
import com.wakedt.visual.client.businessservice.accountlogin.query.GetAccountInfo;
import com.wakedt.visual.client.businessservice.accountlogin.query.GetAccountRole;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountInfoDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountRoleDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountTeamInfoDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountOrganizationInfoDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.OrganizationDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.TeamDTO;
import com.wakedt.visual.client.businessservice.accountlogin.AccountLoginRpcService;
import java.util.*;
import java.math.*;
import org.springframework.stereotype.Service;

/**
 * 用户登录场景-RPC能力接口实现
 */
@Service
public class AccountLoginRpcServiceImpl implements AccountLoginRpcService {

    @Override
    public ResultDTO<AccountInfoDTO> login(Login request) {
        /* TODO 验证账号密码，\n并返回用户信息，供存储到session */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> logout(Logout request) {
        /* TODO 退出登录 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> accountRegister(AccountRegister request) {
        /* TODO 校验注册验证码，创建账号 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request) {
        /* TODO 发送注册账号验证码 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<AccountInfoDTO> getAccountInfo(GetAccountInfo request) {
        /* TODO 获取登录账号的基本信息 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<AccountRoleDTO> getAccountRole(GetAccountRole request) {
        /* TODO 获取当前登录账号的权限信息，包含所属组织、团队等信息 */
        return ResultDTO.success();
    }
}