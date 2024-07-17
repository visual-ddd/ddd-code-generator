package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamMemberRemoveCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRemoveCmd removeCmd) {
        log.info("删除团队成员-指令处理器:{}", removeCmd);

        TeamMember teamMember = repository.find(removeCmd.getId());
        teamMember.teamMemberRemove(removeCmd);

        repository.remove(teamMember);

    }
}