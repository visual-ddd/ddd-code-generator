package com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.organization.domain.organization.*;

/**
 * 绑定组织管理员-指令
 *
 * @author visual-ddd
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