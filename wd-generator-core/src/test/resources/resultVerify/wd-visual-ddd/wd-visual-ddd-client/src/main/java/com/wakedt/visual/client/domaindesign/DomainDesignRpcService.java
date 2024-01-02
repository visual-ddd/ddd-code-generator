package com.wakedt.visual.client.domaindesign;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
 * 业务域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/domain-design")
@Api(tags = "[RPC] 业务域")
public interface DomainDesignRpcService {

    @ApiOperation("新增业务域")
    @PostMapping("/domain-design-create")
    ResultDTO<Long> domainDesignCreate(@RequestBody @Valid DomainDesignCreateDTO dto);

    @ApiOperation("编辑业务域")
    @PostMapping("/domain-design-modify")
    ResultDTO<Boolean> domainDesignModify(@RequestBody @Valid DomainDesignModifyDTO dto);

    @ApiOperation("删除业务域")
    @PostMapping("/domain-design-remove")
    ResultDTO<Boolean> domainDesignRemove(@RequestBody @Valid DomainDesignRemoveDTO dto);

    @ApiOperation("新增业务域版本")
    @PostMapping("/domain-design-version-create")
    ResultDTO<Long> domainDesignVersionCreate(@RequestBody @Valid DomainDesignVersionCreateDTO dto);

    @ApiOperation("编辑业务域版本")
    @PostMapping("/domain-design-version-modify")
    ResultDTO<Boolean> domainDesignVersionModify(@RequestBody @Valid DomainDesignVersionModifyDTO dto);

    @ApiOperation("删除业务域版本")
    @PostMapping("/domain-design-version-remove")
    ResultDTO<Boolean> domainDesignVersionRemove(@RequestBody @Valid DomainDesignVersionRemoveDTO dto);

    @ApiOperation("更新业务域DSL")
    @PostMapping("/domain-design-dsl-update")
    ResultDTO<Boolean> domainDesignDslUpdate(@RequestBody @Valid DomainDesignDslUpdateDTO dto);

    @ApiOperation("发布业务域版本")
    @PostMapping("/domain-design-version-publish")
    ResultDTO<Boolean> domainDesignVersionPublish(@RequestBody @Valid DomainDesignVersionPublishDTO dto);

    @ApiOperation("Fork业务域版本")
    @PostMapping("/domain-design-version-fork")
    ResultDTO<Long> domainDesignVersionFork(@RequestBody @Valid DomainDesignVersionForkDTO dto);

    @ApiOperation("业务域详情查询对象")
    @PostMapping("/domain-design-query")
    ResultDTO<DomainDesignDTO> domainDesignQuery(@RequestBody @Valid DomainDesignQuery query);

    @ApiOperation("业务域分页查询对象")
    @PostMapping("/domain-design-page-query")
    PageResultDTO<List<DomainDesignDTO>> domainDesignPageQuery(@RequestBody @Valid DomainDesignPageQuery pageQuery);

    @ApiOperation("业务域版本详情查询对象")
    @PostMapping("/domain-design-version-query")
    ResultDTO<DomainDesignVersionDTO> domainDesignVersionQuery(@RequestBody @Valid DomainDesignVersionQuery query);

    @ApiOperation("业务域版本分页查询对象")
    @PostMapping("/domain-design-version-page-query")
    PageResultDTO<List<DomainDesignVersionDTO>> domainDesignVersionPageQuery(@RequestBody @Valid DomainDesignVersionPageQuery pageQuery);

    @ApiOperation("业务域最新版本查询对象")
    @PostMapping("/domain-design-latest-version-query")
    ResultDTO<DomainDesignVersionDTO> domainDesignLatestVersionQuery(@RequestBody @Valid DomainDesignLatestVersionQuery query);

    @ApiOperation("业务域列表查询对象")
    @PostMapping("/domain-design-list-query")
    PageResultDTO<List<DomainDesignDTO>> domainDesignListQuery(@RequestBody @Valid DomainDesignListQuery pageQuery);

}