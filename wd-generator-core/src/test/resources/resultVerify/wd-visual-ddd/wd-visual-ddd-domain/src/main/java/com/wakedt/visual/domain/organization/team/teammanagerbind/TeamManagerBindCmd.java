package com.wakedt.visual.domain.organization.team.teammanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 绑定团队管理员-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamManagerBindCmd {

    /** 团队 ID */
    private Long id;

    /** 团队管理员 */
    private Long teamManagerId;

}