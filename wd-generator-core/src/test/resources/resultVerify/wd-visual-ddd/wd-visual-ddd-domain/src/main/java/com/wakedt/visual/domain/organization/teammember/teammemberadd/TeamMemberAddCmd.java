package com.wakedt.visual.domain.organization.teammember.teammemberadd;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 添加团队成员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberAddCmd {

    /** 团队成员的账号唯一标识 */
    private Long accountId;

    /** 团队唯一标识 */
    private Long teamId;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;

}