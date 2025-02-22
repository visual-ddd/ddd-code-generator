package com.wakedt.visual.adapter.businessservice.secondarydevelopment.app;

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
import com.wakedt.visual.client.businessservice.secondarydevelopment.SecondaryDevelopmentRpcService;

/**
 * 二次开发场景-C端
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/app/secondary-development")
@Api(value = "/app/secondary-development", tags = "二次开发场景-C端")
public class SecondaryDevelopmentAppController {

    @Resource
    private SecondaryDevelopmentRpcService secondaryDevelopmentRpcService;

    @ApiOperation("免鉴权获取业务域版本信息")
    @PostMapping("/get-domain-design-version-no-auth")
    public ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(@RequestBody @Valid GetDomainDesignVersionNoAuth request) {
        return secondaryDevelopmentRpcService.getDomainDesignVersionNoAuth(request);
    }

    @ApiOperation("获取应用关联的模块信息")
    @PostMapping("/get-application-bind-model-info")
    public ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(@RequestBody @Valid GetApplicationBindModelInfo request) {
        return secondaryDevelopmentRpcService.getApplicationBindModelInfo(request);
    }

    @ApiOperation("免鉴权获取业务场景版本信息")
    @PostMapping("/get-business-scene-version-no-auth")
    public ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(@RequestBody @Valid GetBusinessSceneVersionNoAuth request) {
        return secondaryDevelopmentRpcService.getBusinessSceneVersionNoAuth(request);
    }
}