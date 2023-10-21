package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberRemoveCmd {

    /** 团队成员ID */
    private Long id;

}