package com.wakedt.visual.bizdomain.domaindesign.adapter;

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
import com.wakedt.visual.bizdomain.domaindesign.app.DomainDesignApplication;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignLatestVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignListQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignDslUpdateDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPublishDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionForkDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignVersionDTO;

/**
 * [APP] 业务域
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/app/domain-design")
@Api(value = "/app/domain-design", tags = "[APP] 业务域")
public class DomainDesignAppController {

    @Resource
    private DomainDesignApplication domainDesignApplication;

    @ApiOperation("新增业务域")
    @PostMapping("/domain-design-create")
    public ResultDTO<Long> domainDesignCreate(@RequestBody @Valid DomainDesignCreateDTO dto) {
        return domainDesignApplication.domainDesignCreate(dto);
    }

    @ApiOperation("编辑业务域")
    @PostMapping("/domain-design-modify")
    public ResultDTO<Boolean> domainDesignModify(@RequestBody @Valid DomainDesignModifyDTO dto) {
        return domainDesignApplication.domainDesignModify(dto);
    }

    @ApiOperation("删除业务域")
    @PostMapping("/domain-design-remove")
    public ResultDTO<Boolean> domainDesignRemove(@RequestBody @Valid DomainDesignRemoveDTO dto) {
        return domainDesignApplication.domainDesignRemove(dto);
    }

    @ApiOperation("新增业务域版本")
    @PostMapping("/domain-design-version-create")
    public ResultDTO<Long> domainDesignVersionCreate(@RequestBody @Valid DomainDesignVersionCreateDTO dto) {
        return domainDesignApplication.domainDesignVersionCreate(dto);
    }

    @ApiOperation("编辑业务域版本")
    @PostMapping("/domain-design-version-modify")
    public ResultDTO<Boolean> domainDesignVersionModify(@RequestBody @Valid DomainDesignVersionModifyDTO dto) {
        return domainDesignApplication.domainDesignVersionModify(dto);
    }

    @ApiOperation("删除业务域版本")
    @PostMapping("/domain-design-version-remove")
    public ResultDTO<Boolean> domainDesignVersionRemove(@RequestBody @Valid DomainDesignVersionRemoveDTO dto) {
        return domainDesignApplication.domainDesignVersionRemove(dto);
    }

    @ApiOperation("更新业务域DSL")
    @PostMapping("/domain-design-dsl-update")
    public ResultDTO<Boolean> domainDesignDslUpdate(@RequestBody @Valid DomainDesignDslUpdateDTO dto) {
        return domainDesignApplication.domainDesignDslUpdate(dto);
    }

    @ApiOperation("发布业务域版本")
    @PostMapping("/domain-design-version-publish")
    public ResultDTO<Boolean> domainDesignVersionPublish(@RequestBody @Valid DomainDesignVersionPublishDTO dto) {
        return domainDesignApplication.domainDesignVersionPublish(dto);
    }

    @ApiOperation("Fork业务域版本")
    @PostMapping("/domain-design-version-fork")
    public ResultDTO<Long> domainDesignVersionFork(@RequestBody @Valid DomainDesignVersionForkDTO dto) {
        return domainDesignApplication.domainDesignVersionFork(dto);
    }

    @ApiOperation("业务域详情查询对象")
    @PostMapping("/domain-design-query")
    public ResultDTO<DomainDesignDTO> domainDesignQuery(@RequestBody @Valid DomainDesignQuery query) {
        return domainDesignApplication.domainDesignQuery(query);
    }

    @ApiOperation("业务域分页查询对象")
    @PostMapping("/domain-design-page-query")
    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(@RequestBody @Valid DomainDesignPageQuery pageQuery) {
        return domainDesignApplication.domainDesignPageQuery(pageQuery);
    }

    @ApiOperation("业务域版本详情查询对象")
    @PostMapping("/domain-design-version-query")
    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(@RequestBody @Valid DomainDesignVersionQuery query) {
        return domainDesignApplication.domainDesignVersionQuery(query);
    }

    @ApiOperation("业务域版本分页查询对象")
    @PostMapping("/domain-design-version-page-query")
    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(@RequestBody @Valid DomainDesignVersionPageQuery pageQuery) {
        return domainDesignApplication.domainDesignVersionPageQuery(pageQuery);
    }

    @ApiOperation("业务域最新版本查询对象")
    @PostMapping("/domain-design-latest-version-query")
    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(@RequestBody @Valid DomainDesignLatestVersionQuery query) {
        return domainDesignApplication.domainDesignLatestVersionQuery(query);
    }

    @ApiOperation("业务域列表查询对象")
    @PostMapping("/domain-design-list-query")
    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(@RequestBody @Valid DomainDesignListQuery pageQuery) {
        return domainDesignApplication.domainDesignListQuery(pageQuery);
    }
}