package com.wakedt.visual.domain.organization.teammember.teammemberrolebind;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 绑定团队成员职位-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamMemberRoleBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleBindCmd updateCmd) {
        log.info("绑定团队成员职位-指令处理器:{}", updateCmd);

        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamMemberRoleBind(updateCmd);

        repository.update(teamMember);

    }
}