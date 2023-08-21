package com.wakedt.visual.accountlogin.app;

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
import com.wakedt.visual.accountlogin.client.AccountLoginRpcService;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 用户登录场景-RPC能力接口实现
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