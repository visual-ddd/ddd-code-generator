package com.wakedt.visual.adapter.businessservice.organizationmanagement.web;

import com.wakedt.visual.client.businessservice.organizationmanagement.OrganizationManagementRpcService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 组织管理场景-B端
 */
@RestController
@RequestMapping("/web/organization-management")
@Api(value = "/web/organization-management", tags = "组织管理场景-B端")
public class OrganizationManagementWebController {

    @Resource
    private OrganizationManagementRpcService organizationManagementRpcService;
}