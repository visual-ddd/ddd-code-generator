package com.wakedt.visual.organization.app.cmd.teammemberrolebind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.teammember.*;

/**
 * 绑定团队成员职位-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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