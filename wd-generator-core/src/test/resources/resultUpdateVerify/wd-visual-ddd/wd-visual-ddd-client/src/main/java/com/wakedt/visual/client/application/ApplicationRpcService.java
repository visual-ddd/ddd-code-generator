package com.wakedt.visual.client.application;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.client.application.query.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 应用域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/application")
@Api(tags = "[RPC] 应用域")
public interface ApplicationRpcService {

    @ApiOperation("新增应用")
    @PostMapping("/application-create")
    ResultDTO<Long> applicationCreate(@RequestBody @Valid ApplicationCreateDTO dto);

    @ApiOperation("编辑应用")
    @PostMapping("/application-modify")
    ResultDTO<Boolean> applicationModify(@RequestBody @Valid ApplicationModifyDTO dto);

    @ApiOperation("删除应用")
    @PostMapping("/application-remove")
    ResultDTO<Boolean> applicationRemove(@RequestBody @Valid ApplicationRemoveDTO dto);

    @ApiOperation("新增应用版本")
    @PostMapping("/application-version-create")
    ResultDTO<Long> applicationVersionCreate(@RequestBody @Valid ApplicationVersionCreateDTO dto);

    @ApiOperation("删除应用版本")
    @PostMapping("/application-version-remove")
    ResultDTO<Boolean> applicationVersionRemove(@RequestBody @Valid ApplicationVersionRemoveDTO dto);

    @ApiOperation("关联业务场景版本")
    @PostMapping("/business-scene-version-bind")
    ResultDTO<Boolean> businessSceneVersionBind(@RequestBody @Valid BusinessSceneVersionBindDTO dto);

    @ApiOperation("关联业务域版本")
    @PostMapping("/domain-design-version-bind")
    ResultDTO<Boolean> domainDesignVersionBind(@RequestBody @Valid DomainDesignVersionBindDTO dto);

    @ApiOperation("发布应用版本")
    @PostMapping("/application-version-publish")
    ResultDTO<Boolean> applicationVersionPublish(@RequestBody @Valid ApplicationVersionPublishDTO dto);

    @ApiOperation("Fork应用版本")
    @PostMapping("/application-version-fork")
    ResultDTO<Long> applicationVersionFork(@RequestBody @Valid ApplicationVersionForkDTO dto);

    @ApiOperation("应用详情查询对象")
    @PostMapping("/application-query")
    ResultDTO<ApplicationDTO> applicationQuery(@RequestBody @Valid ApplicationQuery query);

    @ApiOperation("应用分页查询对象")
    @PostMapping("/application-page-query")
    PageResultDTO<List<ApplicationDTO>> applicationPageQuery(@RequestBody @Valid ApplicationPageQuery pageQuery);

    @ApiOperation("应用版本详情查询对象")
    @PostMapping("/application-version-query")
    ResultDTO<ApplicationVersionDTO> applicationVersionQuery(@RequestBody @Valid ApplicationVersionQuery query);

    @ApiOperation("应用版本分页查询对象")
    @PostMapping("/application-version-page-query")
    PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(@RequestBody @Valid ApplicationVersionPageQuery pageQuery);

    @ApiOperation("应用列表查询对象")
    @PostMapping("/application-list-query")
    PageResultDTO<List<ApplicationDTO>> applicationListQuery(@RequestBody @Valid ApplicationListQuery pageQuery);

    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/application-latest-version-query")
    ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(@RequestBody @Valid ApplicationLatestVersionQuery query);

}