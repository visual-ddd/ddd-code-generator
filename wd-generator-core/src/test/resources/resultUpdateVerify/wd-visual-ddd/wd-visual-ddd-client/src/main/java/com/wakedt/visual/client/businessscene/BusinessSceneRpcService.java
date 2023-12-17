package com.wakedt.visual.client.businessscene;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.client.businessscene.query.*;
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

    @ApiOperation("新增业务场景")
    @PostMapping("/business-scene-create")
    ResultDTO<Long> businessSceneCreate(@RequestBody @Valid BusinessSceneCreateDTO dto);

    @ApiOperation("编辑业务场景")
    @PostMapping("/business-scene-modify")
    ResultDTO<Boolean> businessSceneModify(@RequestBody @Valid BusinessSceneModifyDTO dto);

    @ApiOperation("删除业务场景")
    @PostMapping("/business-scene-remove")
    ResultDTO<Boolean> businessSceneRemove(@RequestBody @Valid BusinessSceneRemoveDTO dto);

    @ApiOperation("编辑业务场景版本")
    @PostMapping("/business-scene-version-modify")
    ResultDTO<Boolean> businessSceneVersionModify(@RequestBody @Valid BusinessSceneVersionModifyDTO dto);

    @ApiOperation("删除业务场景版本")
    @PostMapping("/business-scene-version-remove")
    ResultDTO<Boolean> businessSceneVersionRemove(@RequestBody @Valid BusinessSceneVersionRemoveDTO dto);

    @ApiOperation("更新业务场景DSL")
    @PostMapping("/dsl-update")
    ResultDTO<Boolean> dslUpdate(@RequestBody @Valid BusinessSceneVersionDSLUpdateDTO dto);

    @ApiOperation("发布业务场景版本")
    @PostMapping("/business-scene-version-publish")
    ResultDTO<Boolean> businessSceneVersionPublish(@RequestBody @Valid BusinessSceneVersionPublishDTO dto);

    @ApiOperation("Fork业务场景版本")
    @PostMapping("/business-scene-version-fork")
    ResultDTO<Long> businessSceneVersionFork(@RequestBody @Valid BusinessSceneVersionForkDTO dto);

    @ApiOperation("业务场景详情查询对象")
    @PostMapping("/business-scene-query")
    ResultDTO<BusinessSceneDTO> businessSceneQuery(@RequestBody @Valid BusinessSceneQuery query);

    @ApiOperation("业务场景分页查询对象")
    @PostMapping("/business-scene-page-query")
    PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(@RequestBody @Valid BusinessScenePageQuery pageQuery);

    @ApiOperation("业务场景版本详情查询对象")
    @PostMapping("/business-scene-version-query")
    ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(@RequestBody @Valid BusinessSceneVersionQuery query);

    @ApiOperation("业务场景版本分页查询对象")
    @PostMapping("/business-scene-version-page-query")
    PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(@RequestBody @Valid BusinessSceneVersionPageQuery pageQuery);

    @ApiOperation("业务场景列表查询对象")
    @PostMapping("/business-scene-list-query")
    PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(@RequestBody @Valid BusinessSceneListQuery pageQuery);

    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/business-scene-latest-version-query")
    ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(@RequestBody @Valid BusinessSceneLatestVersionQuery query);

}