package com.wakedt.visual.bizdomain.organization.app.cmd.teammemberremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.organization.domain.teammember.*;

/**
 * 删除团队成员-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberRemoveCmd {

    /** 团队成员ID */
    private Long id;

}