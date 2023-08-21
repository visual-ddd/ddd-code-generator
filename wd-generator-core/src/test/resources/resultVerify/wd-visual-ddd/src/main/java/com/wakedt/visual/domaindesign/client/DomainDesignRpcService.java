package com.wakedt.visual.domaindesign.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignDTO;
import com.wakedt.visual.domaindesign.client.dto.DomainDesignVersionDTO;
import com.wakedt.visual.domaindesign.client.query.*;

import java.util.List;

/**
 * 业务域-RPC能力接口
 */
public interface DomainDesignRpcService {

    /** 新增业务域 */
    ResultDTO<Long> domainDesignCreate(DomainDesignCreateDTO dto);

    /** 编辑业务域 */
    ResultDTO<Boolean> domainDesignModify(DomainDesignModifyDTO dto);

    /** 删除业务域 */
    ResultDTO<Boolean> domainDesignRemove(DomainDesignRemoveDTO dto);

    /** 新增业务域版本 */
    ResultDTO<Long> domainDesignVersionCreate(DomainDesignVersionCreateDTO dto);

    /** 编辑业务域版本 */
    ResultDTO<Boolean> domainDesignVersionModify(DomainDesignVersionModifyDTO dto);

    /** 删除业务域版本 */
    ResultDTO<Boolean> domainDesignVersionRemove(DomainDesignVersionRemoveDTO dto);

    /** 更新业务域DSL */
    ResultDTO<Boolean> domainDesignDslUpdate(DomainDesignDslUpdateDTO dto);

    /** 发布业务域版本 */
    ResultDTO<Boolean> domainDesignVersionPublish(DomainDesignVersionPublishDTO dto);

    /** Fork业务域版本 */
    ResultDTO<Long> domainDesignVersionFork(DomainDesignVersionForkDTO dto);

    /** 查询业务域详情 */
    ResultDTO<DomainDesignDTO> domainDesignQuery(DomainDesignQuery query);

    /** 分页查询业务域 */
    PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(DomainDesignPageQuery pageQuery);

    /** 查询业务域版本详情 */
    ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(DomainDesignVersionQuery query);

    /** 分页查询业务域版本 */
    PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery);

    /** 查询业务域下的最新版本 */
    ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query);

    /** 业务域列表查询对象 */
    PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(DomainDesignListQuery pageQuery);

}