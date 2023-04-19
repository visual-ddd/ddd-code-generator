package com.wakedt.visual.domain.organization.organization.organizationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
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

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationManagerId;

}