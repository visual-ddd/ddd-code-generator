package com.wakedt.visual.bizdomain.organization.app.cmd.teammemberremove;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.teammember.*;

/**
 * 删除团队成员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class TeamMemberRemoveCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRemoveCmd removeCmd) {
        TeamMember teamMember = repository.find(removeCmd.getId());
        teamMember.teamMemberRemove(removeCmd);

        repository.remove(teamMember);
    }
}