package com.wakedt.visual.client.businessservice.userlogin;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountLogin;
import com.wakedt.visual.client.businessservice.userlogin.query.Logout;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountRegister;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountVerificationCreate;
import com.wakedt.visual.client.businessservice.userlogin.dto.AccountDTO;
import java.util.List;

/**
 * 描述用户登录的流程-RPC能力接口
 */
public interface UserLoginRpcService {

    /** 账号登录 */
    ResultDTO<AccountDTO> accountLogin(AccountLogin request);

    /** 退出登录 */
    ResultDTO<void> logout(Logout request);

    /** 注册账号 */
    ResultDTO<Boolean> accountRegister(AccountRegister request);

    /** 发送注册账号验证码 */
    ResultDTO<Boolean> accountVerificationCreate(AccountVerificationCreate request);

}