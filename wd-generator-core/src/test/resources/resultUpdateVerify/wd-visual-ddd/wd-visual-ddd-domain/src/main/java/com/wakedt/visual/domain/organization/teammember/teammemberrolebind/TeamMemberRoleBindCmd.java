package com.wakedt.visual.domain.organization.teammember.teammemberrolebind;

import com.wakedt.visual.domain.organization.teammember.MemberType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 绑定团队成员职位-指令
 *
 * @author shimmer
 * @since 1.0
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