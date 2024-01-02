package com.wakedt.visual.client.account;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 账号域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/account")
@Api(tags = "[RPC] 账号域")
public interface AccountRpcService {

    @ApiOperation("创建账号")
    @PostMapping("/account-create")
    ResultDTO<Long> accountCreate(@RequestBody @Valid AccountCreateDTO dto);

    @ApiOperation("更新账号基本信息")
    @PostMapping("/account-modify")
    ResultDTO<Boolean> accountModify(@RequestBody @Valid AccountModifyDTO dto);

    @ApiOperation("删除账号")
    @PostMapping("/account-remove")
    ResultDTO<Boolean> accountRemove(@RequestBody @Valid AccountDeleteDTO dto);

    @ApiOperation("发送重置密码邮件")
    @PostMapping("/account-password-reset-send-email")
    ResultDTO<Boolean> accountPasswordResetSendEmail(@RequestBody @Valid AccountEmailSendDTO dto);

    @ApiOperation("重置用户密码")
    @PostMapping("/account-password-reset")
    ResultDTO<Boolean> accountPasswordReset(@RequestBody @Valid AccountPasswordResetDTO dto);

    @ApiOperation("修改用户密码")
    @PostMapping("/account-password-update")
    ResultDTO<Boolean> accountPasswordUpdate(@RequestBody @Valid AccountPasswordUpdateDTO dto);

    @ApiOperation("创建验证码")
    @PostMapping("/verification-create")
    ResultDTO<Long> verificationCreate(@RequestBody @Valid AccountVerificationCreateDTO dto);

    @ApiOperation("更新验证码")
    @PostMapping("/verification-update")
    ResultDTO<Boolean> verificationUpdate(@RequestBody @Valid AccountVerificationUpdateDTO dto);

    @ApiOperation("账号详情查询对象")
    @PostMapping("/account-detail-query")
    ResultDTO<AccountDTO> accountDetailQuery(@RequestBody @Valid AccountDetailQuery query);

    @ApiOperation("账号分页查询对象")
    @PostMapping("/account-page-query")
    PageResultDTO<List<AccountDTO>> accountPageQuery(@RequestBody @Valid AccountPageQuery pageQuery);

    @ApiOperation("账号验证码详情查询对象")
    @PostMapping("/account-verification-detail-query")
    ResultDTO<AccountVerificationDTO> accountVerificationDetailQuery(@RequestBody @Valid AccountVerificationDetailQuery query);

}