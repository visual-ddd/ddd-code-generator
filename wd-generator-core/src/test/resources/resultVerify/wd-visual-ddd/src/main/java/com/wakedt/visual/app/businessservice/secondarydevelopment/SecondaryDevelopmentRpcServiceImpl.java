package com.wakedt.visual.app.businessservice.secondarydevelopment;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.SecondaryDevelopmentRpcService;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.ApplicationBindModelInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetApplicationBindModelInfo;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.client.businessservice.secondarydevelopment.query.GetDomainDesignVersionNoAuth;
import org.springframework.stereotype.Service;

/**
 * 二次开发场景-RPC能力接口实现
 */
@Service
public class SecondaryDevelopmentRpcServiceImpl implements SecondaryDevelopmentRpcService {

    @Override
    public ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request) {

        return ResultDTO.success();
    }

    @Override
    public ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request) {

        return ResultDTO.success();
    }
}