package com.wakedt.visual.bizdomain.universallanguage.adapter;

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
import com.wakedt.visual.bizdomain.universallanguage.app.UniversalLanguageApplication;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguagePageQuery;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageCreateDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageModifyDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageRemoveDTO;
import com.wakedt.visual.bizdomain.universallanguage.client.response.UniversalLanguageDTO;

/**
 * [WEB] 统一语言域
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/web/universal-language")
@Api(value = "/web/universal-language", tags = "[WEB] 统一语言域")
public class UniversalLanguageWebController {

    @Resource
    private UniversalLanguageApplication universalLanguageApplication;

    @ApiOperation("新增统一语言")
    @PostMapping("/create")
    public ResultDTO<Long> create(@RequestBody @Valid UniversalLanguageCreateDTO dto) {
        return universalLanguageApplication.create(dto);
    }

    @ApiOperation("编辑统一语言")
    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody @Valid UniversalLanguageModifyDTO dto) {
        return universalLanguageApplication.modify(dto);
    }

    @ApiOperation("删除统一语言")
    @PostMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestBody @Valid UniversalLanguageRemoveDTO dto) {
        return universalLanguageApplication.remove(dto);
    }

    @ApiOperation("统一语言详情查询对象")
    @PostMapping("/universal-language-query")
    public ResultDTO<UniversalLanguageDTO> universalLanguageQuery(@RequestBody @Valid UniversalLanguageQuery query) {
        return universalLanguageApplication.universalLanguageQuery(query);
    }

    @ApiOperation("统一语言分页查询对象")
    @PostMapping("/universal-language-page-query")
    public PageResultDTO<List<UniversalLanguageDTO>> universalLanguagePageQuery(@RequestBody @Valid UniversalLanguagePageQuery pageQuery) {
        return universalLanguageApplication.universalLanguagePageQuery(pageQuery);
    }
}