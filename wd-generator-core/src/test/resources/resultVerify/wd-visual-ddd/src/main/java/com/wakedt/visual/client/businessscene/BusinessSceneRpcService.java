package com.wakedt.visual.client.businessscene;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.client.businessscene.query.*;

import java.util.List;

/**
 * 业务场景域-RPC能力接口
 */
public interface BusinessSceneRpcService {

    /** 新增业务场景 */
    ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto);

    /** 编辑业务场景 */
    ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto);

    /** 删除业务场景 */
    ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto);

    /** 编辑业务场景版本 */
    ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto);

    /** 删除业务场景版本 */
    ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto);

    /** 更新业务场景DSL */
    ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto);

    /** 发布业务场景版本 */
    ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto);

    /** Fork业务场景版本 */
    ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto);

    /** 查询业务场景详情 */
    ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query);

    /** 分页查询业务场景 */
    PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery);

    /** 查询业务场景版本详情 */
    ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query);

    /** 分页查询业务场景版本 */
    PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery);

    /** 业务场景列表查询对象 */
    PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery);

    /** 查询应用下的最新版本 */
    ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query);

}