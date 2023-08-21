package com.wakedt.visual.organization.app.cmd.teammanagerroleunbind;

import com.wakedt.visual.organization.domain.teammember.TeamMember;
import com.wakedt.visual.organization.domain.teammember.TeamMemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 解绑团队成员职位-指令处理器
 */
@Component
public class TeamMemberRoleUnBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleUnBindCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamManagerRoleUnbind(updateCmd);

        repository.update(teamMember);
    }
}