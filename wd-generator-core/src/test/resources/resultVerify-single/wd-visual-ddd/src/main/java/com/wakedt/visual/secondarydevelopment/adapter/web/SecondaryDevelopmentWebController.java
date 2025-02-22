package com.wakedt.visual.secondarydevelopment.adapter.web;

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
import com.wakedt.visual.secondarydevelopment.client.query.GetDomainDesignVersionNoAuth;
import com.wakedt.visual.secondarydevelopment.client.query.GetApplicationBindModelInfo;
import com.wakedt.visual.secondarydevelopment.client.query.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.secondarydevelopment.client.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.DomainDesignDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.DomainDesignVersionBaseInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.ApplicationBindModelInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.BusinessScenarioVersionBaseInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.BusinessScenarioDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.ApplicationDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.SecondaryDevelopmentRpcService;

/**
 * 二次开发场景-B端
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@RestController
@RequestMapping("/web/secondary-development")
@Api(value = "/web/secondary-development", tags = "二次开发场景-B端")
public class SecondaryDevelopmentWebController {

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