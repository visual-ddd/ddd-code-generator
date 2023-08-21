package com.wakedt.visual.organization.app.cmd.organizationmanagerunbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 解绑组织管理员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationManagerUnbindCmd {

    /** 组织 ID */
    private Long id;

}