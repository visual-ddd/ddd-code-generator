package com.wakedt.visual.organization.app.cmd.teamremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.team.*;

/**
 * 删除团队-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamRemoveCmd {

    /** 团队 ID */
    private Long id;

}