package com.wakedt.visual.adapter.businessservice.versionpublish.app;

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
 * 版本发布场景-C端
 */
@RestController
@RequestMapping("/app/version-publish")
@Api(value = "/app/version-publish", tags = "版本发布场景-C端")
public class VersionPublishAppController {

    @Resource
    private VersionPublishRpcService versionPublishRpcService;
}