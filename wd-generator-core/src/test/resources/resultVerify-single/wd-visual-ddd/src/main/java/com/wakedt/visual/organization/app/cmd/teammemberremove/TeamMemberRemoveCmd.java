package com.wakedt.visual.organization.app.cmd.teammemberremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.teammember.*;

/**
 * 删除团队成员-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberRemoveCmd {

    /** 团队成员ID */
    private Long id;

}