package com.wakedt.visual.organization.app.cmd.teammemberrolebind;

import com.wakedt.visual.organization.domain.teammember.MemberType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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