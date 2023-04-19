package com.wakedt.visual.client.businessservice.secondarydevelopment;

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
import java.util.*;
import java.math.*;

/**
 * 描述快速进行二开场景-RPC能力接口
 */
public interface SecondaryDevelopmentRpcService {

    /** 免鉴权获取业务域版本信息 */
    ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request);

    /** 获取应用关联的模块信息 */
    ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request);

    /** 免鉴权获取业务场景版本信息 */
    ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request);

}