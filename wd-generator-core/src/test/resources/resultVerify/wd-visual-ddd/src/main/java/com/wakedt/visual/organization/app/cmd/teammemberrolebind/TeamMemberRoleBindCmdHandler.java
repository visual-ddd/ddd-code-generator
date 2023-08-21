package com.wakedt.visual.organization.app.cmd.teammemberrolebind;

import com.wakedt.visual.organization.domain.teammember.TeamMember;
import com.wakedt.visual.organization.domain.teammember.TeamMemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 绑定团队成员职位-指令处理器
 */
@Component
public class TeamMemberRoleBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleBindCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamMemberRoleBind(updateCmd);

        repository.update(teamMember);
    }
}