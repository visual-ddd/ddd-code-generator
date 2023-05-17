package com.wakedt.visual.adapter.businessservice.versionpublish.app;

import com.wakedt.visual.client.businessservice.versionpublish.VersionPublishRpcService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 版本发布场景-C端
 */
@RestController
@RequestMapping("/app/version-publish")
@Api(value = "/app/version-publish", tags = "版本发布场景-C端")
public class VersionPublishAppController {

    @Resource
    private VersionPublishRpcService versionPublishRpcService;
}