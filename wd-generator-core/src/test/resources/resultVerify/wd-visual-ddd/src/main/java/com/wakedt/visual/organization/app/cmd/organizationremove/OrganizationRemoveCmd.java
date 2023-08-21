package com.wakedt.visual.organization.app.cmd.organizationremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除组织-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationRemoveCmd {

    /** 组织 ID */
    private Long id;

}