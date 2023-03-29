
package com.wakedt.visual.adapter.universallanguage.app;

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
import com.wakedt.visual.client.universallanguage.UniversalLanguageRpcService;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguagePageQuery;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;

/**
 * 统一语言域-C端
 */
@RestController
@RequestMapping("/app/universal-language")
@Api(value = "/app/universal-language", tags = "统一语言域-C端")
public class UniversalLanguageAppController {

    @Resource
    private UniversalLanguageRpcService universalLanguageRpcService;

    @ApiOperation("新增统一语言")
    @PostMapping("/create")
    public ResultDTO<Long> create(@RequestBody @Valid UniversalLanguageCreateDTO dto) {
        return universalLanguageRpcService.create(dto);
    }

    @ApiOperation("编辑统一语言")
    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody @Valid UniversalLanguageModifyDTO dto) {
        return universalLanguageRpcService.modify(dto);
    }

    @ApiOperation("删除统一语言")
    @PostMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestBody @Valid UniversalLanguageRemoveDTO dto) {
        return universalLanguageRpcService.remove(dto);
    }

    @ApiOperation("查询统一语言详情")
    @GetMapping("/universal-language-query")
    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(UniversalLanguageQuery query) {
        return universalLanguageRpcService.universalLanguageQuery(query);
    }

    @ApiOperation("分页查询统一语言")
    @GetMapping("/universal-language-page-query")
    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(UniversalLanguagePageQuery pageQuery) {
        return universalLanguageRpcService.universalLanguagePageQuery(pageQuery);
    }
}