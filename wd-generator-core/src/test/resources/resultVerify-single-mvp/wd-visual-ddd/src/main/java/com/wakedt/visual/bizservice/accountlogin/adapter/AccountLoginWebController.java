package com.wakedt.visual.bizservice.accountlogin.adapter;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
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

/**
 * 用户登录场景-B端
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/web/account-login")
@Api(value = "/web/account-login", tags = "用户登录场景-B端")
public class AccountLoginWebController {

    @Resource
    private AccountLoginRpcService accountLoginRpcService;

    @ApiOperation("账号登录")
    @PostMapping("/login")
    public ResultDTO<AccountInfoDTO> login(@RequestBody @Valid Login request) {
        return accountLoginRpcService.login(request);
    }

    @ApiOperation("退出登录")
    @PostMapping("/logout")
    public ResultDTO<Boolean> logout(@RequestBody @Valid Logout request) {
        return accountLoginRpcService.logout(request);
    }

    @ApiOperation("注册账号")
    @PostMapping("/account-register")
    public ResultDTO<Boolean> accountRegister(@RequestBody @Valid AccountRegister request) {
        return accountLoginRpcService.accountRegister(request);
    }

    @ApiOperation("发送注册账号验证码")
    @PostMapping("/account-verification-create")
    public ResultDTO<Boolean> accountVerificationCreate(@RequestBody @Valid AccountVerificationCreate request) {
        return accountLoginRpcService.accountVerificationCreate(request);
    }

    @ApiOperation("获取当前登录账号信息")
    @PostMapping("/get-account-info")
    public ResultDTO<AccountInfoDTO> getAccountInfo(@RequestBody @Valid GetAccountInfo request) {
        return accountLoginRpcService.getAccountInfo(request);
    }

    @ApiOperation("获取用户权限信息")
    @PostMapping("/get-account-role")
    public ResultDTO<AccountRoleDTO> getAccountRole(@RequestBody @Valid GetAccountRole request) {
        return accountLoginRpcService.getAccountRole(request);
    }
}