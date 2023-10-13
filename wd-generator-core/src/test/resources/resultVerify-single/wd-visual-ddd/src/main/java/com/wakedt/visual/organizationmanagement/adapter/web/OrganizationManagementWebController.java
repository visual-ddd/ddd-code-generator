package com.wakedt.visual.organizationmanagement.adapter.web;

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
import com.wakedt.visual.organizationmanagement.client.OrganizationManagementRpcService;

/**
 * 组织管理场景-B端
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@RestController
@RequestMapping("/web/organization-management")
@Api(value = "/web/organization-management", tags = "组织管理场景-B端")
public class OrganizationManagementWebController {

    @Resource
    private OrganizationManagementRpcService organizationManagementRpcService;
}