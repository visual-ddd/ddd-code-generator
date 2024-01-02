package com.wakedt.visual.adapter.domaindesign.web;

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
import com.wakedt.visual.client.domaindesign.DomainDesignRpcService;
import com.wakedt.visual.client.domaindesign.query.DomainDesignQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignPageQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionPageQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignLatestVersionQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignListQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignCreateDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignModifyDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignRemoveDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionCreateDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionModifyDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignDslUpdateDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionPublishDTO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionForkDTO;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;

/**
 * 业务域-B端
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/web/domain-design")
@Api(value = "/web/domain-design", tags = "[WEB] 业务域")
public class DomainDesignWebController {

    @Resource
    private DomainDesignRpcService domainDesignRpcService;

    @ApiOperation("新增业务域")
    @PostMapping("/domain-design-create")
    public ResultDTO<Long> domainDesignCreate(@RequestBody @Valid DomainDesignCreateDTO dto) {
        return domainDesignRpcService.domainDesignCreate(dto);
    }

    @ApiOperation("编辑业务域")
    @PostMapping("/domain-design-modify")
    public ResultDTO<Boolean> domainDesignModify(@RequestBody @Valid DomainDesignModifyDTO dto) {
        return domainDesignRpcService.domainDesignModify(dto);
    }

    @ApiOperation("删除业务域")
    @PostMapping("/domain-design-remove")
    public ResultDTO<Boolean> domainDesignRemove(@RequestBody @Valid DomainDesignRemoveDTO dto) {
        return domainDesignRpcService.domainDesignRemove(dto);
    }

    @ApiOperation("新增业务域版本")
    @PostMapping("/domain-design-version-create")
    public ResultDTO<Long> domainDesignVersionCreate(@RequestBody @Valid DomainDesignVersionCreateDTO dto) {
        return domainDesignRpcService.domainDesignVersionCreate(dto);
    }

    @ApiOperation("编辑业务域版本")
    @PostMapping("/domain-design-version-modify")
    public ResultDTO<Boolean> domainDesignVersionModify(@RequestBody @Valid DomainDesignVersionModifyDTO dto) {
        return domainDesignRpcService.domainDesignVersionModify(dto);
    }

    @ApiOperation("删除业务域版本")
    @PostMapping("/domain-design-version-remove")
    public ResultDTO<Boolean> domainDesignVersionRemove(@RequestBody @Valid DomainDesignVersionRemoveDTO dto) {
        return domainDesignRpcService.domainDesignVersionRemove(dto);
    }

    @ApiOperation("更新业务域DSL")
    @PostMapping("/domain-design-dsl-update")
    public ResultDTO<Boolean> domainDesignDslUpdate(@RequestBody @Valid DomainDesignDslUpdateDTO dto) {
        return domainDesignRpcService.domainDesignDslUpdate(dto);
    }

    @ApiOperation("发布业务域版本")
    @PostMapping("/domain-design-version-publish")
    public ResultDTO<Boolean> domainDesignVersionPublish(@RequestBody @Valid DomainDesignVersionPublishDTO dto) {
        return domainDesignRpcService.domainDesignVersionPublish(dto);
    }

    @ApiOperation("Fork业务域版本")
    @PostMapping("/domain-design-version-fork")
    public ResultDTO<Long> domainDesignVersionFork(@RequestBody @Valid DomainDesignVersionForkDTO dto) {
        return domainDesignRpcService.domainDesignVersionFork(dto);
    }

    @ApiOperation("业务域详情查询对象")
    @PostMapping("/domain-design-query")
    public ResultDTO<DomainDesignDTO> domainDesignQuery(@RequestBody @Valid DomainDesignQuery query) {
        return domainDesignRpcService.domainDesignQuery(query);
    }

    @ApiOperation("业务域分页查询对象")
    @PostMapping("/domain-design-page-query")
    public PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(@RequestBody @Valid DomainDesignPageQuery pageQuery) {
        return domainDesignRpcService.domainDesignPageQuery(pageQuery);
    }

    @ApiOperation("业务域版本详情查询对象")
    @PostMapping("/domain-design-version-query")
    public ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(@RequestBody @Valid DomainDesignVersionQuery query) {
        return domainDesignRpcService.domainDesignVersionQuery(query);
    }

    @ApiOperation("业务域版本分页查询对象")
    @PostMapping("/domain-design-version-page-query")
    public PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(@RequestBody @Valid DomainDesignVersionPageQuery pageQuery) {
        return domainDesignRpcService.domainDesignVersionPageQuery(pageQuery);
    }

    @ApiOperation("业务域最新版本查询对象")
    @PostMapping("/domain-design-latest-version-query")
    public ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(@RequestBody @Valid DomainDesignLatestVersionQuery query) {
        return domainDesignRpcService.domainDesignLatestVersionQuery(query);
    }

    @ApiOperation("业务域列表查询对象")
    @PostMapping("/domain-design-list-query")
    public PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(@RequestBody @Valid DomainDesignListQuery pageQuery) {
        return domainDesignRpcService.domainDesignListQuery(pageQuery);
    }
}