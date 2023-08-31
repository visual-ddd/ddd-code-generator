package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令处理器
 *
 * @author shimmer
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