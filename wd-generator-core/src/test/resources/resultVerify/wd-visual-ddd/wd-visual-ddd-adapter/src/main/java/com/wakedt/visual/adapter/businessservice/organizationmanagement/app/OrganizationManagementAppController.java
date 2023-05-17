package com.wakedt.visual.adapter.businessservice.organizationmanagement.app;

import com.wakedt.visual.client.businessservice.organizationmanagement.OrganizationManagementRpcService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 组织管理场景-C端
 */
@RestController
@RequestMapping("/app/organization-management")
@Api(value = "/app/organization-management", tags = "组织管理场景-C端")
public class OrganizationManagementAppController {

    @Resource
    private OrganizationManagementRpcService organizationManagementRpcService;
}