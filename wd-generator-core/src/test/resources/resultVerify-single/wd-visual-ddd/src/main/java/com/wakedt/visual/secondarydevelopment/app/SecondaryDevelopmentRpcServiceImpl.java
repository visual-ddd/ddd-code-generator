package com.wakedt.visual.secondarydevelopment.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * 二次开发场景-RPC能力接口实现
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
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