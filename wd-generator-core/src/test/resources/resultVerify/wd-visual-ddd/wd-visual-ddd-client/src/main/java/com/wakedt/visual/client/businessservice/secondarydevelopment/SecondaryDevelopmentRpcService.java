package com.wakedt.visual.client.businessservice.secondarydevelopment;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetDomainDesignVersionNoAuth;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetApplicationBindModelInfo;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.DomainDesignDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.DomainDesignVersionBaseInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.ApplicationBindModelInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.BusinessScenarioVersionBaseInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.BusinessScenarioDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.ApplicationDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.BusinessSceneVersionInfoDTO;
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
 * 二次开发场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/secondary-development")
@Api(tags = "[RPC] 二次开发场景")
public interface SecondaryDevelopmentRpcService {

    @ApiOperation("免鉴权获取业务域版本信息")
    @PostMapping("/get-domain-design-version-no-auth")
    ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(@RequestBody @Valid GetDomainDesignVersionNoAuth request);

    @ApiOperation("获取应用关联的模块信息")
    @PostMapping("/get-application-bind-model-info")
    ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(@RequestBody @Valid GetApplicationBindModelInfo request);

    @ApiOperation("免鉴权获取业务场景版本信息")
    @PostMapping("/get-business-scene-version-no-auth")
    ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(@RequestBody @Valid GetBusinessSceneVersionNoAuth request);

}