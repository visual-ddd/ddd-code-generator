package com.wakedt.visual.client.businessservice.accountlogin;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountInfoDTO;
import com.wakedt.visual.client.businessservice.accountlogin.dto.AccountRoleDTO;
import com.wakedt.visual.client.businessservice.accountlogin.query.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * 用户登录场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/account-login")
@Api(tags = "[RPC] 用户登录场景")
public interface AccountLoginRpcService {

    @ApiOperation("账号登录")
    @PostMapping("/login")
    ResultDTO<AccountInfoDTO> login(@RequestBody @Valid Login request);

    @ApiOperation("退出登录")
    @PostMapping("/logout")
    ResultDTO<Boolean> logout(@RequestBody @Valid Logout request);

    @ApiOperation("注册账号")
    @PostMapping("/account-register")
    ResultDTO<Boolean> accountRegister(@RequestBody @Valid AccountRegister request);

    @ApiOperation("发送注册账号验证码")
    @PostMapping("/account-verification-create")
    ResultDTO<Boolean> accountVerificationCreate(@RequestBody @Valid AccountVerificationCreate request);

    @ApiOperation("获取当前登录账号信息")
    @PostMapping("/get-account-info")
    ResultDTO<AccountInfoDTO> getAccountInfo(@RequestBody @Valid GetAccountInfo request);

    @ApiOperation("获取用户权限信息")
    @PostMapping("/get-account-role")
    ResultDTO<AccountRoleDTO> getAccountRole(@RequestBody @Valid GetAccountRole request);

}