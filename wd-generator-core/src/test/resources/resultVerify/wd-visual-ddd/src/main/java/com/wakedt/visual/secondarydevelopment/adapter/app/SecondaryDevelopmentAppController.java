package com.wakedt.visual.secondarydevelopment.adapter.app;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.secondarydevelopment.client.SecondaryDevelopmentRpcService;
import com.wakedt.visual.secondarydevelopment.client.dto.ApplicationBindModelInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.query.GetApplicationBindModelInfo;
import com.wakedt.visual.secondarydevelopment.client.query.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.secondarydevelopment.client.query.GetDomainDesignVersionNoAuth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 二次开发场景-C端
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