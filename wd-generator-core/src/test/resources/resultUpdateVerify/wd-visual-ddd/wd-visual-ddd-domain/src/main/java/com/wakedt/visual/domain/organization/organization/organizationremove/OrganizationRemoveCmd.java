package com.wakedt.visual.domain.organization.organization.organizationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除组织-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationRemoveCmd {

    /** 组织 ID */
    private Long id;

}