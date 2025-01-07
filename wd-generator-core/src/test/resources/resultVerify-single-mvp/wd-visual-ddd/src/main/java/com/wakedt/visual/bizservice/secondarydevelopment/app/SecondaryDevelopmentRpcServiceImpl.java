package com.wakedt.visual.bizservice.secondarydevelopment.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 二次开发场景-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0
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