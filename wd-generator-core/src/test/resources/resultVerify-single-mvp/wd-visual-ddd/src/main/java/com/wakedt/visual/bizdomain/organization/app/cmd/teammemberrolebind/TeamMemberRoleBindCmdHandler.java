package com.wakedt.visual.bizdomain.organization.app.cmd.teammemberrolebind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.teammember.*;

/**
 * 绑定团队成员职位-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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