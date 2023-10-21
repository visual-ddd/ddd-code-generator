package com.wakedt.visual.adapter.businessservice.organizationmanagement.app;

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
import com.wakedt.visual.client.businessservice.organizationmanagement.OrganizationManagementRpcService;

/**
 * 组织管理场景-C端
 *
 * @author shimmer
 * @since 1.0
 */
@RestController
@RequestMapping("/app/organization-management")
@Api(value = "/app/organization-management", tags = "组织管理场景-C端")
public class OrganizationManagementAppController {

    @Resource
    private OrganizationManagementRpcService organizationManagementRpcService;
}