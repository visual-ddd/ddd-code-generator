package com.wakedt.visual.app.businessservice.secondarydevelopment;

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
import com.wakedt.visual.client.businessservice.secondarydevelopment.SecondaryDevelopmentRpcService;
import java.util.*;
import java.math.*;
import org.springframework.stereotype.Service;

/**
 * 二次开发场景-RPC能力接口实现
 */
@Service
public class SecondaryDevelopmentRpcServiceImpl implements SecondaryDevelopmentRpcService {

    @Override
    public ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request) {
        /* TODO 免鉴权获取业务域版本信息 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request) {
        /* TODO 获取应用关联的模块信息 */
        return ResultDTO.success();
    }

    @Override
    public ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request) {
        /* TODO 免鉴权获取业务场景版本信息 */
        return ResultDTO.success();
    }
}