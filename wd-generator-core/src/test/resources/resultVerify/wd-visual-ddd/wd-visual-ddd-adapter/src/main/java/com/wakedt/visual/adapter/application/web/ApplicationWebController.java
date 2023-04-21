
package com.wakedt.visual.adapter.application.web;

import java.util.*;
import java.math.*;
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
import com.wakedt.visual.client.application.ApplicationRpcService;
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

/**
 * 应用域-B端
 */
@RestController
@RequestMapping("/web/application")
@Api(value = "/web/application", tags = "应用域-B端")
public class ApplicationWebController {

    @Resource
    private ApplicationRpcService applicationRpcService;

    @ApiOperation("新增应用")
    @PostMapping("/application-create")
    public ResultDTO<Long> applicationCreate(@RequestBody @Valid ApplicationCreateDTO dto) {
        return applicationRpcService.applicationCreate(dto);
    }

    @ApiOperation("编辑应用")
    @PostMapping("/application-modify")
    public ResultDTO<Boolean> applicationModify(@RequestBody @Valid ApplicationModifyDTO dto) {
        return applicationRpcService.applicationModify(dto);
    }

    @ApiOperation("删除应用")
    @PostMapping("/application-remove")
    public ResultDTO<Boolean> applicationRemove(@RequestBody @Valid ApplicationRemoveDTO dto) {
        return applicationRpcService.applicationRemove(dto);
    }

    @ApiOperation("新增应用版本")
    @PostMapping("/application-version-create")
    public ResultDTO<Long> applicationVersionCreate(@RequestBody @Valid ApplicationVersionCreateDTO dto) {
        return applicationRpcService.applicationVersionCreate(dto);
    }

    @ApiOperation("编辑应用版本")
    @PostMapping("/application-version-modify")
    public ResultDTO<Boolean> applicationVersionModify(@RequestBody @Valid ApplicationVersionModifyDTO dto) {
        return applicationRpcService.applicationVersionModify(dto);
    }

    @ApiOperation("删除应用版本")
    @PostMapping("/application-version-remove")
    public ResultDTO<Boolean> applicationVersionRemove(@RequestBody @Valid ApplicationVersionRemoveDTO dto) {
        return applicationRpcService.applicationVersionRemove(dto);
    }

    @ApiOperation("关联业务场景版本")
    @PostMapping("/business-scene-version-bind")
    public ResultDTO<Boolean> businessSceneVersionBind(@RequestBody @Valid BusinessSceneVersionBindDTO dto) {
        return applicationRpcService.businessSceneVersionBind(dto);
    }

    @ApiOperation("关联业务域版本")
    @PostMapping("/domain-design-version-bind")
    public ResultDTO<Boolean> domainDesignVersionBind(@RequestBody @Valid DomainDesignVersionBindDTO dto) {
        return applicationRpcService.domainDesignVersionBind(dto);
    }

    @ApiOperation("发布应用版本")
    @PostMapping("/application-version-publish")
    public ResultDTO<Boolean> applicationVersionPublish(@RequestBody @Valid ApplicationVersionPublishDTO dto) {
        return applicationRpcService.applicationVersionPublish(dto);
    }

    @ApiOperation("Fork应用版本")
    @PostMapping("/application-version-fork")
    public ResultDTO<Long> applicationVersionFork(@RequestBody @Valid ApplicationVersionForkDTO dto) {
        return applicationRpcService.applicationVersionFork(dto);
    }

    @ApiOperation("应用详情查询对象")
    @GetMapping("/application-query")
    public ResultDTO<ApplicationDTO> applicationQuery(ApplicationQuery query) {
        return applicationRpcService.applicationQuery(query);
    }

    @ApiOperation("应用分页查询对象")
    @GetMapping("/application-page-query")
    public PageResultDTO<List<ApplicationDTO>> applicationPageQuery(ApplicationPageQuery pageQuery) {
        return applicationRpcService.applicationPageQuery(pageQuery);
    }

    @ApiOperation("应用版本详情查询对象")
    @GetMapping("/application-version-query")
    public ResultDTO<ApplicationVersionDTO> applicationVersionQuery(ApplicationVersionQuery query) {
        return applicationRpcService.applicationVersionQuery(query);
    }

    @ApiOperation("应用版本分页查询对象")
    @GetMapping("/application-version-page-query")
    public PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery) {
        return applicationRpcService.applicationVersionPageQuery(pageQuery);
    }

    @ApiOperation("应用列表查询对象")
    @GetMapping("/application-list-query")
    public ResultDTO<List<ApplicationDTO>> applicationListQuery(ApplicationListQuery query) {
        return applicationRpcService.applicationListQuery(query);
    }

    @ApiOperation("应用最新版本查询对象")
    @GetMapping("/application-latest-version-query")
    public ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(ApplicationLatestVersionQuery query) {
        return applicationRpcService.applicationLatestVersionQuery(query);
    }
}