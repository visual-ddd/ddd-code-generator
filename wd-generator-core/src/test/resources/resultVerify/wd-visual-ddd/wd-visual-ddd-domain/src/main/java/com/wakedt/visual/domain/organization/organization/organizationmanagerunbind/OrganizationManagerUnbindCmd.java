package com.wakedt.visual.domain.organization.organization.organizationmanagerunbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 解绑组织管理员-指令
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationManagerUnbindCmd {

    /** 组织 ID */
    private Long id;

}