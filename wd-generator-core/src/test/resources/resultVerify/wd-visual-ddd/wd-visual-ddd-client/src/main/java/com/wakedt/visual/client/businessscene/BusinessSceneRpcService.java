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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 业务场景域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/business-scene")
@Api(tags = "[RPC] 业务场景域")
public interface BusinessSceneRpcService {

    /**
     * 新增业务场景
     */
    @ApiOperation("新增业务场景")
    @PostMapping("/business-scene-create")
    ResultDTO<Long> businessSceneCreate(@RequestBody @Valid BusinessSceneCreateDTO dto);

    /**
     * 编辑业务场景
     */
    @ApiOperation("编辑业务场景")
    @PostMapping("/business-scene-modify")
    ResultDTO<Boolean> businessSceneModify(@RequestBody @Valid BusinessSceneModifyDTO dto);

    /**
     * 删除业务场景
     */
    @ApiOperation("删除业务场景")
    @PostMapping("/business-scene-remove")
    ResultDTO<Boolean> businessSceneRemove(@RequestBody @Valid BusinessSceneRemoveDTO dto);

    /**
     * 编辑业务场景版本
     */
    @ApiOperation("编辑业务场景版本")
    @PostMapping("/business-scene-version-modify")
    ResultDTO<Boolean> businessSceneVersionModify(@RequestBody @Valid BusinessSceneVersionModifyDTO dto);

    /**
     * 删除业务场景版本
     */
    @ApiOperation("删除业务场景版本")
    @PostMapping("/business-scene-version-remove")
    ResultDTO<Boolean> businessSceneVersionRemove(@RequestBody @Valid BusinessSceneVersionRemoveDTO dto);

    /**
     * 更新业务场景DSL
     */
    @ApiOperation("更新业务场景DSL")
    @PostMapping("/dsl-update")
    ResultDTO<Boolean> dslUpdate(@RequestBody @Valid BusinessSceneVersionDSLUpdateDTO dto);

    /**
     * 发布业务场景版本
     */
    @ApiOperation("发布业务场景版本")
    @PostMapping("/business-scene-version-publish")
    ResultDTO<Boolean> businessSceneVersionPublish(@RequestBody @Valid BusinessSceneVersionPublishDTO dto);

    /**
     * Fork业务场景版本
     */
    @ApiOperation("Fork业务场景版本")
    @PostMapping("/business-scene-version-fork")
    ResultDTO<Long> businessSceneVersionFork(@RequestBody @Valid BusinessSceneVersionForkDTO dto);

    /**
     * 业务场景详情查询对象
     */
    @ApiOperation("业务场景详情查询对象")
    @PostMapping("/business-scene-query")
    ResultDTO<BusinessSceneDTO> businessSceneQuery(@RequestBody @Valid BusinessSceneQuery query);

    /**
     * 业务场景分页查询对象
     */
    @ApiOperation("业务场景分页查询对象")
    @PostMapping("/business-scene-page-query")
    PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(@RequestBody @Valid BusinessScenePageQuery pageQuery);

    /**
     * 业务场景版本详情查询对象
     */
    @ApiOperation("业务场景版本详情查询对象")
    @PostMapping("/business-scene-version-query")
    ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(@RequestBody @Valid BusinessSceneVersionQuery query);

    /**
     * 业务场景版本分页查询对象
     */
    @ApiOperation("业务场景版本分页查询对象")
    @PostMapping("/business-scene-version-page-query")
    PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(@RequestBody @Valid BusinessSceneVersionPageQuery pageQuery);

    /**
     * 业务场景列表查询对象
     */
    @ApiOperation("业务场景列表查询对象")
    @PostMapping("/business-scene-list-query")
    PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(@RequestBody @Valid BusinessSceneListQuery pageQuery);

    /**
     * 应用最新版本查询对象
     */
    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/business-scene-latest-version-query")
    ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(@RequestBody @Valid BusinessSceneLatestVersionQuery query);

}