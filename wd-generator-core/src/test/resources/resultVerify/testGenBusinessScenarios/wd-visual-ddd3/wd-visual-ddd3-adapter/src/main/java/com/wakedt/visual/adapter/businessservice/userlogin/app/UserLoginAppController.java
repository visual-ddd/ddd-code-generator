package com.wakedt.visual.adapter.businessservice.userlogin.app;

import java.util.List;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountLogin;
import com.wakedt.visual.client.businessservice.userlogin.query.Logout;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountRegister;
import com.wakedt.visual.client.businessservice.userlogin.query.AccountVerificationCreate;
import com.wakedt.visual.client.businessservice.userlogin.dto.AccountDTO;
import com.wakedt.visual.client.businessservice.userlogin.UserLoginRpcService;

/**
 * 描述用户登录的流程-app-controller
 */
@RestController
@RequestMapping("/app/user-login")
@Api(value = "/app/user-login", tags = "C端-用户登录场景")
public class UserLoginAppController {

    @Resource
    private UserLoginRpcService userLoginRpcService;

    @ApiOperation("账号登录")
    @PostMapping("/account-login")
    public ResultDTO<AccountDTO> accountLogin(@RequestBody @Valid AccountLogin request) {
        return userLoginRpcService.accountLogin(request);
    }

    @ApiOperation("退出登录")
    @PostMapping("/logout")
    public ResultDTO<Void> logout(@RequestBody @Valid Logout request) {
        return userLoginRpcService.logout(request);
    }

    @ApiOperation("注册账号")
    @PostMapping("/account-register")
    public ResultDTO<Boolean> accountRegister(@RequestBody @Valid AccountRegister request) {
        return userLoginRpcService.accountRegister(request);
    }

    @ApiOperation("发送注册账号验证码")
    @PostMapping("/account-verification-create")
    public ResultDTO<Boolean> accountVerificationCreate(@RequestBody @Valid AccountVerificationCreate request) {
        return userLoginRpcService.accountVerificationCreate(request);
    }
}