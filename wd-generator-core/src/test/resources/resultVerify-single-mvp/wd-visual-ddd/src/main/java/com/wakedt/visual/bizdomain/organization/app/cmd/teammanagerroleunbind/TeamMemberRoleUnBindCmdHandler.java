package com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerroleunbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.teammember.*;

/**
 * 解绑团队成员职位-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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