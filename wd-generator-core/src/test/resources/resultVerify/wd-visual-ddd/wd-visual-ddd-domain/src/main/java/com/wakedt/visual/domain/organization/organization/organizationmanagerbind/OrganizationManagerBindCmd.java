package com.wakedt.visual.domain.organization.organization.organizationmanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 绑定组织管理员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationManagerBindCmd {

    /** 组织 ID */
    private Long id;

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationManagerId;

}