package com.wakedt.visual.versionpublish.adapter.web;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;import java.time.LocalDateTime;
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
import com.wakedt.visual.versionpublish.client.VersionPublishRpcService;

/**
 * 版本发布场景-B端
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@RestController
@RequestMapping("/web/version-publish")
@Api(value = "/web/version-publish", tags = "版本发布场景-B端")
public class VersionPublishWebController {

    @Resource
    private VersionPublishRpcService versionPublishRpcService;
}