package com.wakedt.visual.app.businessservice.userlogin;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountLogin;
import com.wakedt.visual.client.businessservice.userlogin.query.Logout;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountRegister;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountVerificationCreate;
import com.wakedt.visual.client.businessservice.userlogin.dto.AccountDTO;
import com.wakedt.visual.client.businessservice.userlogin.UserLoginRpcService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 描述用户登录的流程-RPC能力接口
 */
@Service
public class UserLoginRpcServiceImpl implements UserLoginRpcService {

    /** 账号登录 */
    @Override
    public ResultDTO<AccountDTO> accountLogin(AccountLogin request) {
        // TODO 账号登录
        return new ResultDTO<AccountDTO>();
    }

    /** 退出登录 */
    @Override
    public ResultDTO<void> logout(Logout request) {
        // TODO 退出登录
        return new ResultDTO<void>();
    }

    /** 注册账号 */
    @Override
    public ResultDTO<Boolean> accountRegister(AccountRegister request) {
        // TODO 注册账号
        return new ResultDTO<Boolean>();
    }

    /** 发送注册账号验证码 */
    @Override
    public ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request) {
        // TODO 发送注册账号验证码
        return new ResultDTO<Boolean>();
    }
}