package com.wakedt.visual.bizdomain.organization.app.cmd.teamremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.bizdomain.organization.domain.team.*;

/**
 * 删除团队-指令
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamRemoveCmd {

    /** 团队 ID */
    private Long id;

}