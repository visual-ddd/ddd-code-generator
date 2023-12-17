package com.wakedt.visual.domain.organization.teammember.teammemberadd;

import com.wakedt.visual.domain.organization.teammember.MemberType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 添加团队成员-指令
 *
 * @author shimmer
 * @since 1.0
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