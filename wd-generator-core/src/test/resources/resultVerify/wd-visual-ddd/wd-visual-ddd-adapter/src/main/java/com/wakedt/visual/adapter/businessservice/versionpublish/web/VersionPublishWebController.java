package com.wakedt.visual.adapter.businessservice.versionpublish.web;

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
import com.wakedt.visual.client.businessservice.versionpublish.VersionPublishRpcService;

/**
 * 版本发布场景-B端
 */
@RestController
@RequestMapping("/web/version-publish")
@Api(value = "/web/version-publish", tags = "版本发布场景-B端")
public class VersionPublishWebController {

    @Resource
    private VersionPublishRpcService versionPublishRpcService;
}