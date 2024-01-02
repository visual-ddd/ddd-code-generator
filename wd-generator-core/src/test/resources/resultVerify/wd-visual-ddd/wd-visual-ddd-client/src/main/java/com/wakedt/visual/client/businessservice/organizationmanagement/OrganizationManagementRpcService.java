package com.wakedt.visual.client.businessservice.organizationmanagement;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;

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