
package com.wakedt.visual.client.application;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.client.application.query.ApplicationPageQuery;
import com.wakedt.visual.client.application.query.ApplicationVersionQuery;
import com.wakedt.visual.client.application.query.ApplicationVersionPageQuery;
import com.wakedt.visual.client.application.query.ApplicationListQuery;
import com.wakedt.visual.client.application.query.ApplicationLatestVersionQuery;
import com.wakedt.visual.client.application.query.ApplicationCreateDTO;
import com.wakedt.visual.client.application.query.ApplicationModifyDTO;
import com.wakedt.visual.client.application.query.ApplicationRemoveDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionCreateDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionModifyDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionRemoveDTO;
import com.wakedt.visual.client.application.query.BusinessSceneVersionBindDTO;
import com.wakedt.visual.client.application.query.DomainDesignVersionBindDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionPublishDTO;
import com.wakedt.visual.client.application.query.ApplicationVersionForkDTO;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import java.util.*;
import java.math.*;

/**
 * 维护应用及版本的领域-RPC能力接口
 */
public interface ApplicationRpcService {

    /** 新增应用 */
    ResultDTO<Long> applicationCreate(ApplicationCreateDTO dto);

    /** 编辑应用 */
    ResultDTO<Boolean> applicationModify(ApplicationModifyDTO dto);

    /** 删除应用 */
    ResultDTO<Boolean> applicationRemove(ApplicationRemoveDTO dto);

    /** 新增应用版本 */
    ResultDTO<Long> applicationVersionCreate(ApplicationVersionCreateDTO dto);

    /** 编辑应用版本 */
    ResultDTO<Boolean> applicationVersionModify(ApplicationVersionModifyDTO dto);

    /** 删除应用版本 */
    ResultDTO<Boolean> applicationVersionRemove(ApplicationVersionRemoveDTO dto);

    /** 关联业务场景版本 */
    ResultDTO<Boolean> businessSceneVersionBind(BusinessSceneVersionBindDTO dto);

    /** 关联业务域版本 */
    ResultDTO<Boolean> domainDesignVersionBind(DomainDesignVersionBindDTO dto);

    /** 发布应用版本 */
    ResultDTO<Boolean> applicationVersionPublish(ApplicationVersionPublishDTO dto);

    /** Fork应用版本 */
    ResultDTO<Long> applicationVersionFork(ApplicationVersionForkDTO dto);

    /** 查询应用详情 */
    ResultDTO<ApplicationDTO> applicationQuery(ApplicationQuery query);

    /** 分页查询应用 */
    PageResultDTO<List<ApplicationDTO>> applicationPageQuery(ApplicationPageQuery pageQuery);

    /** 查询应用版本详情 */
    ResultDTO<ApplicationVersionDTO> applicationVersionQuery(ApplicationVersionQuery query);

    /** 分页查询应用版本 */
    PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery);

    /** 应用列表查询对象 */
    ResultDTO<List<ApplicationDTO>> applicationListQuery(ApplicationListQuery query);

    /** 查询应用下的最新版本 */
    ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(ApplicationLatestVersionQuery query);

}