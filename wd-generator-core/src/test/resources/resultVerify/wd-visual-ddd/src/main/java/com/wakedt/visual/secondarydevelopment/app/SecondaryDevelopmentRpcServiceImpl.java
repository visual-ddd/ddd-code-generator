package com.wakedt.visual.secondarydevelopment.app;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.secondarydevelopment.client.SecondaryDevelopmentRpcService;
import com.wakedt.visual.secondarydevelopment.client.dto.ApplicationBindModelInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.BusinessSceneVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.dto.DomainDesignVersionInfoDTO;
import com.wakedt.visual.secondarydevelopment.client.query.GetApplicationBindModelInfo;
import com.wakedt.visual.secondarydevelopment.client.query.GetBusinessSceneVersionNoAuth;
import com.wakedt.visual.secondarydevelopment.client.query.GetDomainDesignVersionNoAuth;
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