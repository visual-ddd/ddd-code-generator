package com.wakedt.visual.organization.app.cmd.teammemberrolebind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import com.wakedt.visual.organization.domain.teammember.*;

/**
 * 绑定团队成员职位-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberRoleBindCmd {

    /** 团队成员ID */
    private Long id;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;

}