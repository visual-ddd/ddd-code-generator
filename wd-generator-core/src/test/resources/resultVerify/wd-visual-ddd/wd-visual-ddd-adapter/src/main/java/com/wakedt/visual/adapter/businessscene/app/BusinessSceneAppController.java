
package com.wakedt.visual.adapter.businessscene.app;

import java.util.List;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
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

    @ApiOperation("新增业务场景版本")
    @PostMapping("/business-scene-version-create")
    public ResultDTO<Long> businessSceneVersionCreate(@RequestBody @Valid BusinessSceneVersionCreateDTO dto) {
        return businessSceneRpcService.businessSceneVersionCreate(dto);
    }

    @ApiOperation("编辑业务场景版本")
    @PostMapping("/business-scene-version-modify")
    public ResultDTO<Boolean> businessSceneVersionModify(@RequestBody @Valid BusinessSceneVersionModifyDTO dto) {
        return businessSceneRpcService.businessSceneVersionModify(dto);
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

    @ApiOperation("查询业务场景详情")
    @GetMapping("/business-scene-query")
    public ResultDTO<BusinessSceneDTO> businessSceneQuery(BusinessSceneQuery query) {
        return businessSceneRpcService.businessSceneQuery(query);
    }

    @ApiOperation("分页查询业务场景")
    @GetMapping("/business-scene-page-query")
    public PageResultDTO<List<BusinessSceneDTO>> businessScenePageQuery(BusinessScenePageQuery pageQuery) {
        return businessSceneRpcService.businessScenePageQuery(pageQuery);
    }

    @ApiOperation("查询业务场景版本详情")
    @GetMapping("/business-scene-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneVersionQuery(BusinessSceneVersionQuery query) {
        return businessSceneRpcService.businessSceneVersionQuery(query);
    }

    @ApiOperation("分页查询业务场景版本")
    @GetMapping("/business-scene-version-page-query")
    public PageResultDTO<List<BusinessSceneVersionDTO>> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery) {
        return businessSceneRpcService.businessSceneVersionPageQuery(pageQuery);
    }

    @ApiOperation("业务场景列表查询对象")
    @GetMapping("/business-scene-list-query")
    public ResultDTO<List<BusinessSceneDTO>> businessSceneListQuery(BusinessSceneListQuery query) {
        return businessSceneRpcService.businessSceneListQuery(query);
    }

    @ApiOperation("查询应用下的最新版本")
    @GetMapping("/business-scene-latest-version-query")
    public ResultDTO<BusinessSceneVersionDTO> businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query) {
        return businessSceneRpcService.businessSceneLatestVersionQuery(query);
    }
}