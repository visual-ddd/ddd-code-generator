package com.wakedt.visual.adapter.account.web;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.client.account.AccountRpcService;
import com.wakedt.visual.client.account.query.AccountDetailQuery;
import com.wakedt.visual.client.account.query.AccountPageQuery;
import com.wakedt.visual.client.account.query.AccountVerificationDetailQuery;
import com.wakedt.visual.client.account.query.AccountCreateDTO;
import com.wakedt.visual.client.account.query.AccountModifyDTO;
import com.wakedt.visual.client.account.query.AccountDeleteDTO;
import com.wakedt.visual.client.account.query.AccountEmailSendDTO;
import com.wakedt.visual.client.account.query.AccountPasswordResetDTO;
import com.wakedt.visual.client.account.query.AccountPasswordUpdateDTO;
import com.wakedt.visual.client.account.query.AccountVerificationCreateDTO;
import com.wakedt.visual.client.account.query.AccountVerificationUpdateDTO;
import com.wakedt.visual.client.account.dto.AccountDTO;
import com.wakedt.visual.client.account.dto.AccountVerificationDTO;

/**
 * 账号域-B端
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/web/account")
@Api(value = "/web/account", tags = "[WEB] 账号域")
public class AccountWebController {

    @Resource
    private AccountRpcService accountRpcService;

    @ApiOperation("创建账号")
    @PostMapping("/account-create")
    public ResultDTO<Long> accountCreate(@RequestBody @Valid AccountCreateDTO dto) {
        return accountRpcService.accountCreate(dto);
    }

    @ApiOperation("更新账号基本信息")
    @PostMapping("/account-modify")
    public ResultDTO<Boolean> accountModify(@RequestBody @Valid AccountModifyDTO dto) {
        return accountRpcService.accountModify(dto);
    }

    @ApiOperation("删除账号")
    @PostMapping("/account-remove")
    public ResultDTO<Boolean> accountRemove(@RequestBody @Valid AccountDeleteDTO dto) {
        return accountRpcService.accountRemove(dto);
    }

    @ApiOperation("发送重置密码邮件")
    @PostMapping("/account-password-reset-send-email")
    public ResultDTO<Boolean> accountPasswordResetSendEmail(@RequestBody @Valid AccountEmailSendDTO dto) {
        return accountRpcService.accountPasswordResetSendEmail(dto);
    }

    @ApiOperation("重置用户密码")
    @PostMapping("/account-password-reset")
    public ResultDTO<Boolean> accountPasswordReset(@RequestBody @Valid AccountPasswordResetDTO dto) {
        return accountRpcService.accountPasswordReset(dto);
    }

    @ApiOperation("修改用户密码")
    @PostMapping("/account-password-update")
    public ResultDTO<Boolean> accountPasswordUpdate(@RequestBody @Valid AccountPasswordUpdateDTO dto) {
        return accountRpcService.accountPasswordUpdate(dto);
    }

    @ApiOperation("创建验证码")
    @PostMapping("/verification-create")
    public ResultDTO<Long> verificationCreate(@RequestBody @Valid AccountVerificationCreateDTO dto) {
        return accountRpcService.verificationCreate(dto);
    }

    @ApiOperation("更新验证码")
    @PostMapping("/verification-update")
    public ResultDTO<Boolean> verificationUpdate(@RequestBody @Valid AccountVerificationUpdateDTO dto) {
        return accountRpcService.verificationUpdate(dto);
    }

    @ApiOperation("账号详情查询对象")
    @PostMapping("/account-detail-query")
    public ResultDTO<AccountDTO> accountDetailQuery(@RequestBody @Valid AccountDetailQuery query) {
        return accountRpcService.accountDetailQuery(query);
    }

    @ApiOperation("账号分页查询对象")
    @PostMapping("/account-page-query")
    public PageResultDTO<List<AccountDTO>> accountPageQuery(@RequestBody @Valid AccountPageQuery pageQuery) {
        return accountRpcService.accountPageQuery(pageQuery);
    }

    @ApiOperation("账号验证码详情查询对象")
    @PostMapping("/account-verification-detail-query")
    public ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(@RequestBody @Valid AccountVerificationDetailQuery query) {
        return accountRpcService.accountVerificationDetailQuery(query);
    }
}