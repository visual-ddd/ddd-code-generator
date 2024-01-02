package com.wakedt.visual.client.universallanguage;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
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
 * 统一语言域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/universal-language")
@Api(tags = "[RPC] 统一语言域")
public interface UniversalLanguageRpcService {

    @ApiOperation("新增统一语言")
    @PostMapping("/create")
    ResultDTO<Long> create(@RequestBody @Valid UniversalLanguageCreateDTO dto);

    @ApiOperation("编辑统一语言")
    @PostMapping("/modify")
    ResultDTO<Boolean> modify(@RequestBody @Valid UniversalLanguageModifyDTO dto);

    @ApiOperation("删除统一语言")
    @PostMapping("/remove")
    ResultDTO<Boolean> remove(@RequestBody @Valid UniversalLanguageRemoveDTO dto);

    @ApiOperation("统一语言详情查询对象")
    @PostMapping("/universal-language-query")
    ResultDTO<UniversalLanguageDTO> universalLanguageQuery(@RequestBody @Valid UniversalLanguageQuery query);

    @ApiOperation("统一语言分页查询对象")
    @PostMapping("/universal-language-page-query")
    PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(@RequestBody @Valid UniversalLanguagePageQuery pageQuery);

}