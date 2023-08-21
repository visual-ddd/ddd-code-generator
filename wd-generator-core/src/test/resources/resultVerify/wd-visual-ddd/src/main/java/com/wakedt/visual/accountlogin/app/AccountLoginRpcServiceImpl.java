package com.wakedt.visual.accountlogin.app;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.accountlogin.client.AccountLoginRpcService;
import com.wakedt.visual.accountlogin.client.dto.AccountInfoDTO;
import com.wakedt.visual.accountlogin.client.dto.AccountRoleDTO;
import com.wakedt.visual.accountlogin.client.query.*;
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