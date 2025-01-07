package com.wakedt.visual.bizdomain.businessscene.adapter;

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
import com.wakedt.visual.bizdomain.businessscene.app.BusinessSceneApplication;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessScenePageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneListQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionForkDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneVersionDTO;

/**
 * [APP] 业务场景域
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/app/business-scene")
@Api(value = "/app/business-scene", tags = "[APP] 业务场景域")
public class BusinessSceneAppController {

    @Resource
    private BusinessSceneApplication businessSceneApplication;

    @ApiOperation("新增业务场景")
    @PostMapping("/business-scene-create")
    public ResultDTO<Long> businessSceneCreate(@RequestBody @Valid BusinessSceneCreateDTO dto) {
        return businessSceneApplication.businessSceneCreate(dto);
    }

    @ApiOperation("编辑业务场景")
    @PostMapping("/business-scene-modify")
    public ResultDTO<Boolean> businessSceneModify(@RequestBody @Valid BusinessSceneModifyDTO dto) {
        return businessSceneApplication.businessSceneModify(dto);
    }

    @ApiOperation("删除业务场景")
    @PostMapping("/business-scene-remove")
    public ResultDTO<Boolean> businessSceneRemove(@RequestBody @Valid BusinessSceneRemoveDTO dto) {
        return businessSceneApplication.businessSceneRemove(dto);
    }

    @ApiOperation("删除业务场景版本")
    @PostMapping("/business-scene-version-remove")
    public ResultDTO<Boolean> businessSceneVersionRemove(@RequestBody @Valid BusinessSceneVersionRemoveDTO dto) {
        return businessSceneApplication.businessSceneVersionRemove(dto);
    }

    @ApiOperation("更新业务场景DSL")
    @PostMapping("/dsl-update")
    public ResultDTO<Boolean> dslUpdate(@RequestBody @Valid BusinessSceneVersionDSLUpdateDTO dto) {
        return businessSceneApplication.dslUpdate(dto);
    }

    @ApiOperation("发布业务场景版本")
    @PostMapping("/business-scene-version-publish")
    public ResultDTO<Boolean> businessSceneVersionPublish(@RequestBody @Valid BusinessSceneVersionPublishDTO dto) {
        return businessSceneApplication.businessSceneVersionPublish(dto);
    }

    @ApiOperation("Fork业务场景版本")
    @PostMapping("/business-scene-version-fork")
    public ResultDTO<Long> businessSceneVersionFork(@RequestBody @Valid BusinessSceneVersionForkDTO dto) {
        return businessSceneApplication.businessSceneVersionFork(dto);
    }

    @ApiOperation("业务场景详情查询对象")
    @PostMapping("/business-scene-query")
    public ResultDTO<BusinessSceneDTO> businessSceneQuery(@RequestBody @Valid BusinessSceneQuery query) {
        return businessSceneApplication.businessSceneQuery(query);
    }

    @ApiOperation("业务场景分页查询对象")
    @PostMapping("/business-scene-page-query")
    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(@RequestBody @Valid BusinessScenePageQuery pageQuery) {
        return businessSceneApplication.businessScenePageQuery(pageQuery);
    }

    @ApiOperation("业务场景版本详情查询对象")
    @PostMapping("/business-scene-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(@RequestBody @Valid BusinessSceneVersionQuery query) {
        return businessSceneApplication.businessSceneVersionQuery(query);
    }

    @ApiOperation("业务场景版本分页查询对象")
    @PostMapping("/business-scene-version-page-query")
    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(@RequestBody @Valid BusinessSceneVersionPageQuery pageQuery) {
        return businessSceneApplication.businessSceneVersionPageQuery(pageQuery);
    }

    @ApiOperation("业务场景列表查询对象")
    @PostMapping("/business-scene-list-query")
    public PageResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(@RequestBody @Valid BusinessSceneListQuery pageQuery) {
        return businessSceneApplication.businessSceneListQuery(pageQuery);
    }

    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/business-scene-latest-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(@RequestBody @Valid BusinessSceneLatestVersionQuery query) {
        return businessSceneApplication.businessSceneLatestVersionQuery(query);
    }
}