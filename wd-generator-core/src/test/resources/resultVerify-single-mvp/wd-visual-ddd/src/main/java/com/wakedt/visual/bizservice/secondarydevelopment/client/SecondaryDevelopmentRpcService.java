package com.wakedt.visual.bizservice.secondarydevelopment.client;

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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 二次开发场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface SecondaryDevelopmentRpcService {

    /** 免鉴权获取业务域版本信息 */
    ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request);

    /** 获取应用关联的模块信息 */
    ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request);

    /** 免鉴权获取业务场景版本信息 */
    ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request);

}