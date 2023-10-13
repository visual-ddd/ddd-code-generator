package com.wakedt.visual.client.businessscene;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.client.businessscene.query.BusinessScenePageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneCreateDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneModifyDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneRemoveDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionForkDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public interface BusinessSceneRpcService {

    /**
     * 新增业务场景
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> businessSceneCreate(BusinessSceneCreateDTO dto);

    /**
     * 编辑业务场景
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> businessSceneModify(BusinessSceneModifyDTO dto);

    /**
     * 删除业务场景
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> businessSceneRemove(BusinessSceneRemoveDTO dto);

    /**
     * 编辑业务场景版本
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> businessSceneVersionModify(BusinessSceneVersionModifyDTO dto);

    /**
     * 删除业务场景版本
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> businessSceneVersionRemove(BusinessSceneVersionRemoveDTO dto);

    /**
     * 更新业务场景DSL
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> dslUpdate(BusinessSceneVersionDSLUpdateDTO dto);

    /**
     * 发布业务场景版本
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> businessSceneVersionPublish(BusinessSceneVersionPublishDTO dto);

    /**
     * Fork业务场景版本
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> businessSceneVersionFork(BusinessSceneVersionForkDTO dto);

    /**
     * 查询业务场景详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query);

    /**
     * 分页查询业务场景
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery);

    /**
     * 查询业务场景版本详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query);

    /**
     * 分页查询业务场景版本
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery);

    /**
     * 业务场景列表查询对象
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery pageQuery);

    /**
     * 查询应用下的最新版本
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query);

}