package com.wakedt.visual.bizservice.secondarydevelopment.adapter;

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
import com.wakedt.visual.bizservice.secondarydevelopment.client.request.GetDomainDesignVersionNoAuth;
import com.wakedt.visual.bizservice.secondarydevelopment.client.request.GetApplicationBindModelInfo;
import com.wakedt.visual.bizservice.secondarydevelopment.client.request.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.DomainDesignVersionInfoDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.DomainDesignDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.DomainDesignVersionBaseInfoDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.ApplicationBindModelInfoDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.BusinessScenarioVersionBaseInfoDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.BusinessScenarioDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.ApplicationDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.response.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.bizservice.secondarydevelopment.client.SecondaryDevelopmentRpcService;

/**
 * 二次开发场景-B端
 *
 * @author visual-ddd
 * @since 1.0
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