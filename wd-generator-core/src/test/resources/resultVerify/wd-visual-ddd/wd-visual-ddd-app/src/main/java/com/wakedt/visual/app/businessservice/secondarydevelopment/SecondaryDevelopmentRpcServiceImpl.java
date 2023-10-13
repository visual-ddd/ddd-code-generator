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
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 二次开发场景-RPC能力接口实现
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:53
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