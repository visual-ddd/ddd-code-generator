package com.wakedt.visual.domain.organization.organization.organizationmanagerunbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

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