package com.wakedt.visual.domain.organization.organization.organizationmanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 绑定组织管理员-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationManagerBindCmd {

    /** 组织 ID */
    private Long id;

    /** 组织管理员 */
    private Long organizationManagerId;

}