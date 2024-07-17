package com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 解绑团队成员职位-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamMemberRoleUnBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleUnBindCmd updateCmd) {
        log.info("解绑团队成员职位-指令处理器:{}", updateCmd);

        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamManagerRoleUnbind(updateCmd);

        repository.update(teamMember);

    }
}