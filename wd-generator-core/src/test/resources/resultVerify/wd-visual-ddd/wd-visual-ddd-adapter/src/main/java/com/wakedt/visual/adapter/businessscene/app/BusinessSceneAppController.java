package com.wakedt.visual.adapter.businessscene.app;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.client.businessscene.BusinessSceneRpcService;
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

/**
 * 业务场景域-C端
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@RestController
@RequestMapping("/app/business-scene")
@Api(value = "/app/business-scene", tags = "业务场景域-C端")
public class BusinessSceneAppController {

    @Resource
    private BusinessSceneRpcService businessSceneRpcService;

    @ApiOperation("新增业务场景")
    @PostMapping("/business-scene-create")
    public ResultDTO<Long> businessSceneCreate(@RequestBody @Valid BusinessSceneCreateDTO dto) {
        return businessSceneRpcService.businessSceneCreate(dto);
    }

    @ApiOperation("编辑业务场景")
    @PostMapping("/business-scene-modify")
    public ResultDTO<Boolean> businessSceneModify(@RequestBody @Valid BusinessSceneModifyDTO dto) {
        return businessSceneRpcService.businessSceneModify(dto);
    }

    @ApiOperation("删除业务场景")
    @PostMapping("/business-scene-remove")
    public ResultDTO<Boolean> businessSceneRemove(@RequestBody @Valid BusinessSceneRemoveDTO dto) {
        return businessSceneRpcService.businessSceneRemove(dto);
    }

    @ApiOperation("删除业务场景版本")
    @PostMapping("/business-scene-version-remove")
    public ResultDTO<Boolean> businessSceneVersionRemove(@RequestBody @Valid BusinessSceneVersionRemoveDTO dto) {
        return businessSceneRpcService.businessSceneVersionRemove(dto);
    }

    @ApiOperation("更新业务场景DSL")
    @PostMapping("/dsl-update")
    public ResultDTO<Boolean> dslUpdate(@RequestBody @Valid BusinessSceneVersionDSLUpdateDTO dto) {
        return businessSceneRpcService.dslUpdate(dto);
    }

    @ApiOperation("发布业务场景版本")
    @PostMapping("/business-scene-version-publish")
    public ResultDTO<Boolean> businessSceneVersionPublish(@RequestBody @Valid BusinessSceneVersionPublishDTO dto) {
        return businessSceneRpcService.businessSceneVersionPublish(dto);
    }

    @ApiOperation("Fork业务场景版本")
    @PostMapping("/business-scene-version-fork")
    public ResultDTO<Long> businessSceneVersionFork(@RequestBody @Valid BusinessSceneVersionForkDTO dto) {
        return businessSceneRpcService.businessSceneVersionFork(dto);
    }

    @ApiOperation("业务场景详情查询对象")
    @PostMapping("/business-scene-query")
    public ResultDTO<BusinessSceneDTO> businessSceneQuery(@RequestBody @Valid BusinessSceneQuery query) {
        return businessSceneRpcService.businessSceneQuery(query);
    }

    @ApiOperation("业务场景分页查询对象")
    @PostMapping("/business-scene-page-query")
    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(@RequestBody @Valid BusinessScenePageQuery pageQuery) {
        return businessSceneRpcService.businessScenePageQuery(pageQuery);
    }

    @ApiOperation("业务场景版本详情查询对象")
    @PostMapping("/business-scene-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(@RequestBody @Valid BusinessSceneVersionQuery query) {
        return businessSceneRpcService.businessSceneVersionQuery(query);
    }

    @ApiOperation("业务场景版本分页查询对象")
    @PostMapping("/business-scene-version-page-query")
    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(@RequestBody @Valid BusinessSceneVersionPageQuery pageQuery) {
        return businessSceneRpcService.businessSceneVersionPageQuery(pageQuery);
    }

    @ApiOperation("业务场景列表查询对象")
    @PostMapping("/business-scene-list-query")
    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(@RequestBody @Valid BusinessSceneListQuery pageQuery) {
        return businessSceneRpcService.businessSceneListQuery(pageQuery);
    }

    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/business-scene-latest-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(@RequestBody @Valid BusinessSceneLatestVersionQuery query) {
        return businessSceneRpcService.businessSceneLatestVersionQuery(query);
    }
}