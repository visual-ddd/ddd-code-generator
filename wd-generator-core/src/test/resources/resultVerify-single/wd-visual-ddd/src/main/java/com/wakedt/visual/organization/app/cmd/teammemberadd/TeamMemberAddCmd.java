package com.wakedt.visual.organization.app.cmd.teammemberadd;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.teammember.*;

/**
 * 添加团队成员-指令
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberAddCmd {

    /** 成员账号ID */
    private Long accountId;

    /** 团队ID */
    private Long teamId;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;

}