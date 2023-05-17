package com.wakedt.visual.adapter.businessservice.versionpublish.web;

import com.wakedt.visual.client.businessservice.versionpublish.VersionPublishRpcService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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