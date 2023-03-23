package com.wakedt.visual.domain.organization.organization.organizationmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 编辑组织-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationModifyCmd {

    /** 组织 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationManagerId;

}