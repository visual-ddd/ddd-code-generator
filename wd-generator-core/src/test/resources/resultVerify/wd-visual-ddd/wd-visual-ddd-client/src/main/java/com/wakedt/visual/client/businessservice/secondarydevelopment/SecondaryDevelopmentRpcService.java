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
import java.time.LocalDateTime;

/**
 * 二次开发场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:53
 */
public interface SecondaryDevelopmentRpcService {

    /**
     * 免鉴权获取业务域版本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<DomainDesignVersionInfoDTO> getDomainDesignVersionNoAuth(GetDomainDesignVersionNoAuth request);

    /**
     * 获取应用关联的模块信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<ApplicationBindModelInfoDTO> getApplicationBindModelInfo(GetApplicationBindModelInfo request);

    /**
     * 免鉴权获取业务场景版本信息
     *
     * @param request 请求对象
     * @return 返回结果
     */
    ResultDTO<BusinessSceneVersionInfoDTO> getBusinessSceneVersionNoAuth(GetBusinessSceneVersionNoAuth request);

}