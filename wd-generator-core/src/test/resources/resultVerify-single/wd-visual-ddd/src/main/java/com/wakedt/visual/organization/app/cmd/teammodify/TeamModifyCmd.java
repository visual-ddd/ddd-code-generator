package com.wakedt.visual.organization.app.cmd.teammodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.team.*;

/**
 * 编辑团队-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamModifyCmd {

    /** 团队 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;

}