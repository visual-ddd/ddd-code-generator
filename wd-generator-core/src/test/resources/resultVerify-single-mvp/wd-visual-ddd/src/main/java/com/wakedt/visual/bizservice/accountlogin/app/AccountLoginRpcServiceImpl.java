package com.wakedt.visual.bizservice.accountlogin.app;

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
import com.wakedt.visual.bizservice.accountlogin.client.AccountLoginRpcService;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 用户登录场景-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
public class AccountLoginRpcServiceImpl implements AccountLoginRpcService {

    @Override
    public ResultDTO<AccountInfoDTO> login(Login request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> logout(Logout request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> accountRegister(AccountRegister request) {

        /* TODO CheckCodeDue(验证码校验) 验证码校验 */

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<AccountInfoDTO> getAccountInfo(GetAccountInfo request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<AccountRoleDTO> getAccountRole(GetAccountRole request) {

        return ResultDTO.success();
    }
}