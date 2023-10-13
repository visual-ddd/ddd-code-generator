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
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 用户登录场景-RPC能力接口实现
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:44
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