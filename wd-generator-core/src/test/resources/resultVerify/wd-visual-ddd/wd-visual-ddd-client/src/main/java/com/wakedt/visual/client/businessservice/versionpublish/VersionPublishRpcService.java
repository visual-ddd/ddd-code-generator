package com.wakedt.visual.client.businessservice.versionpublish;

import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 版本发布场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/version-publish")
@Api(tags = "[RPC] 版本发布场景")
public interface VersionPublishRpcService {

}