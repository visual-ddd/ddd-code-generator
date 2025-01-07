package com.wakedt.visual.bizdomain.application.adapter;

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
import com.wakedt.visual.bizdomain.application.app.ApplicationApplication;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationListQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationLatestVersionQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationCreateDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationModifyDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationRemoveDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionCreateDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionModifyDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionRemoveDTO;
import com.wakedt.visual.bizdomain.application.client.request.BusinessSceneVersionBindDTO;
import com.wakedt.visual.bizdomain.application.client.request.DomainDesignVersionBindDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPublishDTO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionForkDTO;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationDTO;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;

/**
 * [WEB] 应用域
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/web/application")
@Api(value = "/web/application", tags = "[WEB] 应用域")
public class ApplicationWebController {

    @Resource
    private ApplicationApplication applicationApplication;

    @ApiOperation("新增应用")
    @PostMapping("/application-create")
    public ResultDTO<Long> applicationCreate(@RequestBody @Valid ApplicationCreateDTO dto) {
        return applicationApplication.applicationCreate(dto);
    }

    @ApiOperation("编辑应用")
    @PostMapping("/application-modify")
    public ResultDTO<Boolean> applicationModify(@RequestBody @Valid ApplicationModifyDTO dto) {
        return applicationApplication.applicationModify(dto);
    }

    @ApiOperation("删除应用")
    @PostMapping("/application-remove")
    public ResultDTO<Boolean> applicationRemove(@RequestBody @Valid ApplicationRemoveDTO dto) {
        return applicationApplication.applicationRemove(dto);
    }

    @ApiOperation("新增应用版本")
    @PostMapping("/application-version-create")
    public ResultDTO<Long> applicationVersionCreate(@RequestBody @Valid ApplicationVersionCreateDTO dto) {
        return applicationApplication.applicationVersionCreate(dto);
    }

    @ApiOperation("删除应用版本")
    @PostMapping("/application-version-remove")
    public ResultDTO<Boolean> applicationVersionRemove(@RequestBody @Valid ApplicationVersionRemoveDTO dto) {
        return applicationApplication.applicationVersionRemove(dto);
    }

    @ApiOperation("关联业务场景版本")
    @PostMapping("/business-scene-version-bind")
    public ResultDTO<Boolean> businessSceneVersionBind(@RequestBody @Valid BusinessSceneVersionBindDTO dto) {
        return applicationApplication.businessSceneVersionBind(dto);
    }

    @ApiOperation("关联业务域版本")
    @PostMapping("/domain-design-version-bind")
    public ResultDTO<Boolean> domainDesignVersionBind(@RequestBody @Valid DomainDesignVersionBindDTO dto) {
        return applicationApplication.domainDesignVersionBind(dto);
    }

    @ApiOperation("发布应用版本")
    @PostMapping("/application-version-publish")
    public ResultDTO<Boolean> applicationVersionPublish(@RequestBody @Valid ApplicationVersionPublishDTO dto) {
        return applicationApplication.applicationVersionPublish(dto);
    }

    @ApiOperation("Fork应用版本")
    @PostMapping("/application-version-fork")
    public ResultDTO<Long> applicationVersionFork(@RequestBody @Valid ApplicationVersionForkDTO dto) {
        return applicationApplication.applicationVersionFork(dto);
    }

    @ApiOperation("应用详情查询对象")
    @PostMapping("/application-query")
    public ResultDTO<ApplicationDTO> applicationQuery(@RequestBody @Valid ApplicationQuery query) {
        return applicationApplication.applicationQuery(query);
    }

    @ApiOperation("应用分页查询对象")
    @PostMapping("/application-page-query")
    public PageResultDTO<List<ApplicationDTO>> applicationPageQuery(@RequestBody @Valid ApplicationPageQuery pageQuery) {
        return applicationApplication.applicationPageQuery(pageQuery);
    }

    @ApiOperation("应用版本详情查询对象")
    @PostMapping("/application-version-query")
    public ResultDTO<ApplicationVersionDTO> applicationVersionQuery(@RequestBody @Valid ApplicationVersionQuery query) {
        return applicationApplication.applicationVersionQuery(query);
    }

    @ApiOperation("应用版本分页查询对象")
    @PostMapping("/application-version-page-query")
    public PageResultDTO<List<ApplicationVersionDTO>> applicationVersionPageQuery(@RequestBody @Valid ApplicationVersionPageQuery pageQuery) {
        return applicationApplication.applicationVersionPageQuery(pageQuery);
    }

    @ApiOperation("应用列表查询对象")
    @PostMapping("/application-list-query")
    public PageResultDTO<List<ApplicationDTO>> applicationListQuery(@RequestBody @Valid ApplicationListQuery pageQuery) {
        return applicationApplication.applicationListQuery(pageQuery);
    }

    @ApiOperation("应用最新版本查询对象")
    @PostMapping("/application-latest-version-query")
    public ResultDTO<ApplicationVersionDTO> applicationLatestVersionQuery(@RequestBody @Valid ApplicationLatestVersionQuery query) {
        return applicationApplication.applicationLatestVersionQuery(query);
    }
}