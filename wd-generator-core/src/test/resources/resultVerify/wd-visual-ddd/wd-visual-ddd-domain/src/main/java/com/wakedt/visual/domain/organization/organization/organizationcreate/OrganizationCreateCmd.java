package com.wakedt.visual.domain.organization.organization.organizationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 新增组织-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCreateCmd {

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;

}