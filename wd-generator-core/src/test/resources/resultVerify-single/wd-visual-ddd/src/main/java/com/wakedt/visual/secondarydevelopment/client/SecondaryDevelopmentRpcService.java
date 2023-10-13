package com.wakedt.visual.secondarydevelopment.client;

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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 二次开发场景-RPC能力接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
public interface SecondaryDevelopmentRpcService {

    /** 免鉴权获取业务域版本信息 */
    ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request);

    /** 获取应用关联的模块信息 */
    ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request);

    /** 免鉴权获取业务场景版本信息 */
    ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request);

}