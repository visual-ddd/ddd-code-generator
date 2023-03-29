package com.wakedt.visual.adapter.businessservice.accountlogin.app;

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

/**
 * 用户登录场景-C端
 */
@RestController
@RequestMapping("/app/account-login")
@Api(value = "/app/account-login", tags = "用户登录场景-C端")
public class AccountLoginAppController {

    @Resource
    private AccountLoginRpcService accountLoginRpcService;

    @ApiOperation("验证账号密码，并返回用户信息，供存储到session")
    @PostMapping("/login")
    public ResultDTO<AccountInfoDTO> login(@RequestBody @Valid Login request) {
        return accountLoginRpcService.login(request);
    }

    @ApiOperation("退出登录")
    @PostMapping("/logout")
    public ResultDTO<Boolean> logout(@RequestBody @Valid Logout request) {
        return accountLoginRpcService.logout(request);
    }

    @ApiOperation("校验注册验证码，创建账号")
    @PostMapping("/account-register")
    public ResultDTO<Boolean> accountRegister(@RequestBody @Valid AccountRegister request) {
        return accountLoginRpcService.accountRegister(request);
    }

    @ApiOperation("发送注册账号验证码")
    @PostMapping("/account-verification-create")
    public ResultDTO<Boolean> accountVerificationCreate(@RequestBody @Valid AccountVerificationCreate request) {
        return accountLoginRpcService.accountVerificationCreate(request);
    }

    @ApiOperation("获取登录账号的基本信息")
    @PostMapping("/get-account-info")
    public ResultDTO<AccountInfoDTO> getAccountInfo(@RequestBody @Valid GetAccountInfo request) {
        return accountLoginRpcService.getAccountInfo(request);
    }

    @ApiOperation("获取当前登录账号的权限信息，包含所属组织、团队等信息")
    @PostMapping("/get-account-role")
    public ResultDTO<AccountRoleDTO> getAccountRole(@RequestBody @Valid GetAccountRole request) {
        return accountLoginRpcService.getAccountRole(request);
    }
}