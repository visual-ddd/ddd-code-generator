package com.wakedt.visual.client.businessservice.organizationmanagement;

import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 组织管理场景-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/organization-management")
@Api(tags = "[RPC] 组织管理场景")
public interface OrganizationManagementRpcService {

}