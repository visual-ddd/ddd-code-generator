package com.wakedt.visual.organization.app.cmd.organizationmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.organization.*;

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

    /** 组织管理员 */
    private Long organizationManagerId;

}